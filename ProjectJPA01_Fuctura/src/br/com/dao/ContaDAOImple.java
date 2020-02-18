package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.model.Conta;
import br.com.model.util.JpaUtil;

public class ContaDAOImple implements ContaDAOInterf{

	private EntityManager em;
	private EntityTransaction et;
	
	@Override
	public void salvar(Conta conta) {
		
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(conta);
			et.commit();
			
		} catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}
		} /*finally {
			if(em.isOpen()) {
				em.close();
			}
		}*/
		
	}

	@Override
	public void alterar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Conta> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conta pesquisar(double numero) {
		// TODO Auto-generated method stub
		return null;
	}

}
