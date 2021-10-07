package com.libreria.angeles.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Prestamo {

	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid2")
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@Temporal(TemporalType.TIMESTAMP)
	private Date devolucion;
	private double multa;

	// RELACIONES
	@ManyToOne
	private Libro libro;
	@ManyToOne
	private Cliente cliente;

	public Prestamo(String id, Date fecha, Date devolucion, double multa) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.devolucion = devolucion;
		this.multa = multa;
	}

	public Prestamo() {
		super();
		this.id = "";
		this.fecha = null;
		this.devolucion = null;
		this.multa = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getDevolucion() {
		return devolucion;
	}

	public void setDevolucion(Date devolucion) {
		this.devolucion = devolucion;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", fecha=" + fecha + ", devolucion=" + devolucion + ", multa=" + multa + "]";
	}

}
