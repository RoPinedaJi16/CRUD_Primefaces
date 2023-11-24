package org.practica.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.practica.dao.DaoReport;
import org.practica.model.Report;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ControllerReport implements Serializable {
	
	private List<Report> reportes;
	private Report reporte;
	
	
	public ControllerReport() {
		reporte = new Report();
	}

	
	public List<Report> getReportes() {
		DaoReport dao = new DaoReport();
		reportes = dao.allReports();
		return reportes;
	}

	public void setReportes(List<Report> reportes) {
		this.reportes = reportes;
	}

	public Report getReporte() {
		return reporte;
	}

	public void setReporte(Report reporte) {
		this.reporte = reporte;
	}
	
	public void limpiarReport() {
		reporte = new Report();
	}

	public String addReport() {
		DaoReport dao = new DaoReport();
		dao.createReport(reporte);
		return "/index.xhtml?faces-redirect=true";
	}
	
	public String modificarReport() {
		DaoReport dao = new DaoReport();
		dao.updateReport(reporte);
		return "/index.xhtml?faces-redirect=true";
	}
	
	public String deleteReport() {
		DaoReport dao = new DaoReport();
		dao.deleteReport(reporte);
		return "/index.xhtml?faces-redirect=true";
	}

	

}
