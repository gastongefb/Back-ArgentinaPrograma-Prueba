/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.demo.Service;

/**
 *
 * @author Usuario
 */

import com.back.demo.Entity.Persona;
import com.back.demo.Interface.IPersonaService;
import com.back.demo.Repository.IPersonaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImpPersonaService implements IPersonaService{
	
	@Autowired IPersonaRepository ipersonaRepository;

	public List<Persona> getPersona() {
		List<Persona> persona = ipersonaRepository.findAll();
		return persona;
	}

	public void savePersona(Persona persona) {
		ipersonaRepository.save(persona);
		
	}

	public void deletePersona(Long id) {
		ipersonaRepository.deleteById(id);
		
	}

	public Persona findPersona(Long id) {
		Persona persona = ipersonaRepository.findById(id).orElse(null);
		return persona;
	}

}
