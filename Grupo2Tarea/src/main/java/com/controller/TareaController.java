package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Tarea;
import com.persistence.TareaRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("tareas")
public class TareaController {
	@Autowired
	private TareaRepository tareaRepository;

	@GetMapping("getAll")
    public List<Tarea> getAll(){
        List<Tarea> tareas = this.tareaRepository.findAll();
        return tareas;
    }
	
	@GetMapping("get")
    public Optional<Tarea> get(@RequestParam(name = "id") String id){
        Optional<Tarea> tarea = this.tareaRepository.findOneBy_id(id);

        return tarea;
    }
	
	@PostMapping("create")
    public Tarea create(@RequestParam(name = "id") String id, @RequestParam(name = "contenido") String contenido, @RequestParam(name = "completada") boolean completada){
        Tarea tarea = this.tareaRepository.insert(new Tarea(id, contenido, completada));

        return tarea;
    }
	
	@PutMapping("update")
    public boolean update(@RequestParam(name = "id") String id, @RequestParam(name = "contenido") String contenido, @RequestParam(name = "completada") boolean completada){
        if(this.tareaRepository.existsById(id)) {
        	this.tareaRepository.deleteById(id);
        	this.tareaRepository.insert(new Tarea(id, contenido, completada));
        	return true;
        }
        return false;
    }
	
	@PostMapping("delete")
    public boolean delete(@RequestParam(name = "id") String id){
        if(this.tareaRepository.existsById(id)) {
        	this.tareaRepository.deleteById(id);
        	return true;
        }
        return false;
    }
}
