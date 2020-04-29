package com.praxis.springboot.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.praxis.springboot.apirest.models.entity.Persona;

public interface IPersonaDao extends  CrudRepository<Persona, Long>{

}
