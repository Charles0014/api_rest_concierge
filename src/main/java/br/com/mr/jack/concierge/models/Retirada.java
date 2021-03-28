package br.com.mr.jack.concierge.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_RETIRADA")
public class Retirada {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private TipoRetira tipoRetirada;
	private String descricao;
	
	
	//Foreing Key
    @OneToOne
    @JoinColumn(name = "morado_id",nullable = false)
	private Morador morador;
	
	private StatusRetirada status;
	private Boolean envioMensagem;
	private LocalDateTime dataCriacao ;
	private String recebidoPor;
	private LocalDateTime dataRetirada;
	private String retiraPor;
	private String codigoRetirada;
 
	public Retirada() {
	}
	
	public Retirada(TipoRetira tipoRetirada, String descricao, Morador morador, StatusRetirada status, Boolean envioMensagem,
			LocalDateTime dataCriacao, String recebidoPor, LocalDateTime dataRetirada, String retiraPor,
			String codigoRetirada) {
		super();
		this.tipoRetirada = tipoRetirada;
		this.descricao = descricao;
		this.morador = morador;
		this.status = status;
		this.envioMensagem = envioMensagem;
		this.dataCriacao = dataCriacao;
		this.recebidoPor = recebidoPor;
		this.dataRetirada = dataRetirada;
		this.retiraPor = retiraPor;
		this.codigoRetirada = codigoRetirada;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TipoRetira getTipoRetirada() {
		return tipoRetirada;
	}

	public void setTipoRetirada(TipoRetira tipoRetirada) {
		this.tipoRetirada = tipoRetirada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}

	public StatusRetirada getStatus() {
		return status;
	}

	public void setStatus(StatusRetirada status) {
		this.status = status;
	}

	public Boolean getEnvioMensagem() {
		return envioMensagem;
	}

	public void setEnvioMensagem(Boolean envioMensagem) {
		this.envioMensagem = envioMensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(LocalDateTime dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public String getRecebidoPor() {
		return recebidoPor;
	}

	public void setRecebidoPor(String recebidoPor) {
		this.recebidoPor = recebidoPor;
	}

	public String getRetiraPor() {
		return retiraPor;
	}

	public void setRetiraPor(String retiraPor) {
		this.retiraPor = retiraPor;
	}

	public String getCodigoRetirada() {
		return codigoRetirada;
	}

	public void setCodigoRetirada(String codigoRetirada) {
		this.codigoRetirada = codigoRetirada;
	}
	
}
