package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Padrone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int padrone_id;
	private String nome;
	private String cognome;
	private Date data_nascita;
	
	@OneToMany(mappedBy="padrone") //nome che mappa l'entita'
	private List<Cane> cani;
	
	public Date getDataNascita() {
		return data_nascita;
	}
	public void setDataNascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Persona [id=" + padrone_id + ", nome=" + nome + ", cognome=" + cognome +", data di nascita=" + data_nascita +"]";
	}

}
