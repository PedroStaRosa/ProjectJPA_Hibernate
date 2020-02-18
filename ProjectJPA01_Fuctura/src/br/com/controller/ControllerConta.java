package br.com.controller;

import java.sql.SQLException;

import br.com.dao.ContaDAO;
import br.com.model.Conta;


public class ControllerConta {


	// FUNCTION
	public void insertConta (Conta conta) throws SQLException {
		
		ContaDAO ctDAO = new ContaDAO();
		conta.setSaldo(0);
		ctDAO.insertContaDAO(conta);
		
	}
	
}
