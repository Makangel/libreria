package com.libreria.angeles.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.libreria.angeles.entidades.Libro;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {

	
	@Query("SELECT c FROM Libro c WHERE c.ISBN= :isbn;")
	public Libro buscarPorIsbn(@Param("isbn")long isb);
	
}
