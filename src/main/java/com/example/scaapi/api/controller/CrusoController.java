package com.example.scaapi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scaapi.model.entity.Curso;
import com.example.scaapi.service.CursoService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1/cursos")
@RequiredArgsConstructor
public class CrusoController {

	
		private CursoService service;
		
		
		@GetMapping()
		public ResponseEntity get() {
			List<Curso> cursos = this.service.getCursos();
			return ResponseEntity.ok(cursos);
			
		}
		
		@GetMapping("/{id}")
		public ResponseEntity get (@PathVariable("id") Long id) {
			Optional<Curso> curso = this.service.getCursoById(id);
			return ResponseEntity.ok(curso);
			
		}
}
