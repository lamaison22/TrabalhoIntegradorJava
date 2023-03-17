package br.edu.projeto.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.edu.projeto.model.Item;

public class ItemDAO implements Serializable{
	
	
	@Inject
	//Cria a conexão e controla a transação com o SGBD (usado pelo Hibernate)
    private EntityManager em;
	
	public Item encontrarId(String id) {
       // return em.find(Cliente.class, id);
		return em.find(Item.class, id);
        
    }
	
	//Query usando a API Criteria do Hibernate
	//Indicada para consultas complexas
//	public Boolean ehUsuarioUnico(String u) {
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Cliente> criteria = cb.createQuery(Cliente.class);
//        Root<Cliente> cliente = criteria.from(Cliente.class);
//        criteria.select(cliente);
//        criteria.where(cb.like(cliente.get("cliente"), u));
//        if (em.createQuery(criteria).getResultList().isEmpty())
//        	return true;
//        return false;
//    }
	
	//Query usando a linguagem HQL do Hibernate
	//Idnicada para consultas simples
	public List<Item> listarTodos() {
	    return em.createQuery("SELECT i FROM Item i ", Item.class).getResultList();      
	}

}
