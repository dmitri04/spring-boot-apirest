package com.praxis.springboot.apirest.models.services;

import java.util.List;

import com.praxis.springboot.apirest.models.entity.Persona;

public interface IPersonaService {
	
	public List<Persona> findAll();
	
	public void save(Persona persona);
	
	public Persona findById(Long id);
	
	public void delete(Persona persona);

}

