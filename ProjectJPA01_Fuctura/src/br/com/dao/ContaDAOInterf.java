package br.com.dao;

import java.util.List;

import br.com.model.Conta;

public interface ContaDAOInterf {

	public void salvar(Conta conta);
	public void alterar(Conta conta);
	public void remover(int numero);
	public List<Conta> listarTodos();
	public Conta pesquisar(double numero);
	
}
