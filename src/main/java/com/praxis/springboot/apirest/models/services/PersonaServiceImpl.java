package com.praxis.springboot.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.praxis.springboot.apirest.models.dao.IPersonaDao;
import com.praxis.springboot.apirest.models.entity.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional
	public void save(Persona persona) {
		personaDao.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(Long id) {
		return personaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Persona persona) {
		personaDao.delete(persona);
		
	}

}
