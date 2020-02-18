package br.com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ENDERECO")
public class Endereco {
	
	@Id
	@Column( name = "IDENDERECO")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idEndereco;
	
	private String rua, complemento;
	private int numero;
	
	public Endereco(int idEndereco, String rua, String complemento, int numero) {
		super();
		this.idEndereco = idEndereco;
		this.rua = rua;
		this.complemento = complemento;
		this.numero = numero;
	}
	public Endereco() {
		super();
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
