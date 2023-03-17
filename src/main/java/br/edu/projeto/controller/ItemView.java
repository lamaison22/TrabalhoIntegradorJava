package br.edu.projeto.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.FilterMeta;

import br.edu.projeto.dao.ItemDAO;
import br.edu.projeto.model.Item;


@Named("dtItemView")
@ViewScoped
public class ItemView implements Serializable{
	private List<Item> ItemesTabela;
    private Item ItemSelecionado ;
    private List<Item> ItemesSelecionados =new ArrayList<Item>();
    @Inject
    private ItemDAO ItemDAO;
    
    private List<FilterMeta> filterBy;
    
    private double valorFinal;
    
    
    
    
    @PostConstruct
    public void init() {
    	ItemesTabela = ItemDAO.listarTodos();
    	
    	
    	
//    	quantidade= 0d;
    }


	public List<Item> getItemesTabela() {
		return ItemesTabela;
	}


	public void setItemesTabela(List<Item> ItemesTabela) {
		this.ItemesTabela = ItemesTabela;
	}


	public Item getItemSelecionado() {
		return ItemSelecionado;
	}


	public void setItemSelecionado(Item ItemSelecionado) {
		this.ItemSelecionado = ItemSelecionado;
	}


	public List<Item> getItemesSelecionados() {
		return ItemesSelecionados;
	}


	public void setItemesSelecionados(List<Item> ItemesSelecionados) {
		this.ItemesSelecionados = ItemesSelecionados;
		
	}


	public ItemDAO getItemDAO() {
		return ItemDAO;
	}


	public void setItemDAO(ItemDAO ItemDAO) {
		this.ItemDAO = ItemDAO;
	}
	
	

	
	public void attQTD() {
		for (Item i : ItemesSelecionados) {
			
			this.valorFinal+=1;
			
		}
			
	}


	public double getValorFinal() {
		return valorFinal;
	}


	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}


	public List<FilterMeta> getFilterBy() {
		return filterBy;
	}


	public void setFilterBy(List<FilterMeta> filterBy) {
		this.filterBy = filterBy;
	}
    
}
