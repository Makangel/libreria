package com.libreria.angeles.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid2")
	private long documento;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String telefono;

	public Cliente(long documento, String nombre, String apellido, String domicilio, String telefono) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}

	public Cliente() {
		super();
		this.documento = 0;
		this.nombre = "";
		this.apellido = "";
		this.domicilio = "";
		this.telefono = "";
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio="
				+ domicilio + ", telefono=" + telefono + "]";
	}

}
