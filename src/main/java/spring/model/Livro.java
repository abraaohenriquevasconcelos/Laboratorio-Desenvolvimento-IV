package spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel
@Entity
@Table(name = "livro")
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_livro")
	private Long id;
	@NotNull
	@Column(name="titulo")
	private String titulo;
	@NotNull
	private String editor;
	@NotNull
	private String edicao;
	@NotNull
	private String autor;
	@NotNull
	@Column(name="nr_paginas")
	private Long nrPaginas;
}
