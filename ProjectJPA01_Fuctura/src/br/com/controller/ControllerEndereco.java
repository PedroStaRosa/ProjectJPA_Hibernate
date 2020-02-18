package br.com.controller;

import java.sql.SQLException;

import br.com.dao.EnderecoDAO;
import br.com.model.Endereco;


public class ControllerEndereco {

	//FUNCTION
		public Endereco insertEndereco (Endereco endereco) {
			
			EnderecoDAO endDAO;
			Endereco enderecoRetorno = new Endereco();
			endDAO = new EnderecoDAO();	
			enderecoRetorno.setIdEndereco(endDAO.insertEnderecoDAO(endereco).getIdEndereco());			
			return enderecoRetorno;
			
		}	
	
}
