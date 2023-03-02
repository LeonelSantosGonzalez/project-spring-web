/**
 * 
 */
package com.leonel.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.leonel.projectspringweb.dao.EmpleadoDAO;

/**
 * @author Leonel
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		
		return "Leonel Santos Gonzalez";
	}
	

}
