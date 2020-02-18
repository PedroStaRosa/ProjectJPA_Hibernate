package br.com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pessoa {

	@Id
	private String cpf;
	
	private String nome;
	private int idade;
	private String sexo;
	
	@OneToOne ( cascade = CascadeType.ALL)
	@JoinColumn( name = "ID_ENDERECO", referencedColumnName = "IDENDERECO")
	private Endereco endereco;
	
	@OneToOne ( cascade = CascadeType.ALL)
	@JoinColumn( name = "NUMERO_CONTA", referencedColumnName = "IDCONTA")
	private Conta conta;
	
	public Pessoa(String cpf, String nome, int idade, String sexo, Endereco endereco, Conta conta) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
		this.conta = conta;
	}
	public Pessoa() {
		super();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
	
}
