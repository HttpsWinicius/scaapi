package com.example.scaapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.scaapi.model.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
