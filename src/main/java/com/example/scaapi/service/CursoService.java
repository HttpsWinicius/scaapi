package com.example.scaapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.scaapi.model.entity.Curso;
import com.example.scaapi.model.repository.CursoRepository;

@Service
public class CursoService {
	
	private CursoRepository repository;
	
	public CursoService (CursoRepository repository) {
		this.repository = repository;
	}
	
	public List<Curso> getCursos() {
		return repository.findAll();
	}
	
	public Optional<Curso> getCursoById (Long id) {
		return repository.findById(id);
	}

}
