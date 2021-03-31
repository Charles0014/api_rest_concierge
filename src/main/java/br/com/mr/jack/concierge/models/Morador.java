package br.com.mr.jack.concierge.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_MORADOR")
public class Morador implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	private String bloco;
	private String apartamento;
	private String telefone;
	private String celular;
	private TipoMorador tipoMorador;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAtualizacao;
	
	public Morador() {
		
	}

	public Morador(String nome, String bloco, String apartamento, String telefone, String celular, TipoMorador tipoMorador) {
		super();
		this.nome = nome;
		this.bloco = bloco;
		this.apartamento = apartamento;
		this.telefone = telefone;
		this.celular = celular;
		this.tipoMorador = tipoMorador;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public TipoMorador getTipoMorador() {
		return tipoMorador;
	}

	public void setTipoMorador(TipoMorador tipoMorador) {
		this.tipoMorador = tipoMorador;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
}
