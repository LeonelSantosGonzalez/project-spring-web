/**
 * 
 */
package com.leonel.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonel.projectspringweb.dao.EmpleadoDAO;
import com.leonel.projectspringweb.services.SpringService;

/**
 * @author Leonel
 *
 */
@Service
public class SpringServiceImpl implements SpringService {

	@Autowired
	private EmpleadoDAO empleadoDAOImpl;
	
	@Override
	public String mostrarNombreEmpresa() {
		
		return "Anotaciones con Spring y JSF";
	}

	@Override
	public String mostarNombreEmpleado() {
		
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}
}
