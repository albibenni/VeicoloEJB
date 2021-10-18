package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cane implements Serializable{ //
	//Eclipse:(1) Select: 
	//(Your Project) -> Properties -> JPA;
	// (2) Look for "Persistent class management" and select the option "Discover annotated classes automatically"; 
	//(3) Press "Apply".

	private static final long serialVersionUID = 1L;
	@Id
	private int cane_id;
	private String nome;
	private String razza;
	private int padrone_id;
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
	public int getPadrone_id() {
		return padrone_id;
	}
	public void setPadrone_id(int padrone_id) {
		this.padrone_id = padrone_id;
	}
}
