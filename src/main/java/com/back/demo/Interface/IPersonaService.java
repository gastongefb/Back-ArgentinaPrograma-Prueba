/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.demo.Interface;

/**
 *
 * @author Usuario
 */


import com.back.demo.Entity.Persona;
import java.util.List;

//import com.prueba.demo.Entity.Persona;

public interface IPersonaService {
	
	//Traer Lista de Personas
	public List<Persona> getPersona();
	
	//Guardar un objeto de tipo persona
	public void savePersona(Persona persona);
	
	//Eliminar un objeto pero lo busco por id
	public void deletePersona(Long id);
	
	//Buscar una persona por id
	public Persona findPersona(Long id);

}
