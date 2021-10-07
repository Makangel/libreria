package com.libreria.angeles.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.angeles.entidades.Autor;
import com.libreria.angeles.repositorios.AutorRepositorio;

@Service
public class AutorServicio {
	private final AutorRepositorio autorRepositorio;
	
	@Autowired
	public AutorServicio(AutorRepositorio autorRepositorio) {
		this.autorRepositorio=autorRepositorio;
	}
	
	
	public List<Autor> getAutor(){
		return autorRepositorio.findAll();
		
	}
	
	//https://www.youtube.com/watch?v=9SGDpanrc8U amigoscode
	//https://www.youtube.com/watch?v=_ChY9yAieSA 34
	//https://www.youtube.com/watch?v=gCuaWpGMG4w&list=PLgwlfcqa5h3x8HAea7s3DXv5CvjEfR4uG&index=4 egg

}
