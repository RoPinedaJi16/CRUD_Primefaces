package org.practica.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.practica.model.Report;

@SuppressWarnings("serial")
public class DaoReport implements Serializable {

	public void createReport(Report reporte) {
		Session session = config();
		try {
			session.beginTransaction();
			session.save(reporte);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public List<Report> allReports() {
		Session session = config();
		List<Report> list = null;
		try {
			session.beginTransaction();
			list = (List<Report>) session.createQuery("From Report order by id").list();
			session.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e.getMessage());
		}
		return list;

	}

	public void updateReport(Report reporte) {
		Session session = config();
		try {
			session.beginTransaction();
			session.update(reporte);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public void deleteReport(Report reporte) {
		Session session = config();
		try {
			session.beginTransaction();
			session.delete(reporte);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static Session config() {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		return sessionFactory.getCurrentSession();
	}

}
