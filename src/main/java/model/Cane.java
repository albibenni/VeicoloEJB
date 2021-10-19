package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cane")
public class Cane implements Serializable{ //
	//Eclipse:(1) Select: 
	//(Your Project) -> Properties -> JPA;
	// (2) Look for "Persistent class management" and select the option "Discover annotated classes automatically"; 
	//(3) Press "Apply".

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cane_id")
	private int caneId;
	
	@Column(name = "nome")
	private String nome;
	
	private String razza;
	
	@ManyToOne
	@JoinColumn(name = "padrone_id")
	private Padrone padrone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRazza() {
		return razza;
	}
	public void setRazza(String razza) {
		this.razza = razza;
	}
}
