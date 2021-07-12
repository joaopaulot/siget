package model;

import javax.*;

@Entity
public class Tarefa{
	
	@Id
	private int id;
	
	@Column
	private String titulo;
	
	@Column 
	private String descricao;
	
	@Column
	private String deadline;
	
	@ManyToOne
	private int responsavel_id;
	
	@ManyToOne
	private int situacao_id;
	
	@ManyToOne
	private int prioridade_id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public int getResponsavel_id() {
		return responsavel_id;
	}

	public void setResponsavel_id(int responsavel_id) {
		this.responsavel_id = responsavel_id;
	}

	public int getSituacao_id() {
		return situacao_id;
	}

	public void setSituacao_id(int situacao_id) {
		this.situacao_id = situacao_id;
	}

	public int getPrioridade_id() {
		return prioridade_id;
	}

	public void setPrioridade_id(int prioridade_id) {
		this.prioridade_id = prioridade_id;
	}
	
}