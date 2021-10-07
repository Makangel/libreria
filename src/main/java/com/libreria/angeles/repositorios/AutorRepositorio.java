package com.libreria.angeles.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.angeles.entidades.Autor;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String>{

}
