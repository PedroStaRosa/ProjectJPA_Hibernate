package br.com.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory factoty;
	
	static {
		factoty = Persistence.createEntityManagerFactory("meuPU");
	}
	
	/**
	 * Metodo responsavel por retornar um entityManager
	 * @return EntityManager
	 * */
	
	public static EntityManager getEntityManager() {
		return factoty.createEntityManager();
	}
	public static void closeEntityManager() {
		factoty.close();
	}
}
