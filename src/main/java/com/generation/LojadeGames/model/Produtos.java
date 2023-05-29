package com.generation.LojadeGames.model;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
    import jakarta.persistence.ManyToOne;
    import jakarta.persistence.Table;
	import jakarta.validation.constraints.NotNull;

	@Entity
	@Table(name = "tb_produtos")
	public class Produtos {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull(message = "Este campo NOME é de preenchimento obrigatório")
		private String nome;
		
		@NotNull(message = "Este campo é de preenchimento obrigatório")
		private String plataforma;
		
		@NotNull(message = "Este campo NOME é de preenchimento obrigatório")
		private String classificacao;
		
		public Long getId() {
			return id;
		}




		public void setId(Long id) {
			this.id = id;
		}




		public String getNome() {
			return nome;
		}




		public void setNome(String nome) {
			this.nome = nome;
		}




		public String getPlataforma() {
			return plataforma;
		}




		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}




		public String getClassificacao() {
			return classificacao;
		}




		public void setClassificacao(String classificacao) {
			this.classificacao = classificacao;
		}




		public Categoria getCategoria() {
			return categoria;
		}




		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}




		@ManyToOne 
		@JsonIgnoreProperties("produtos")
		private Categoria categoria;
		
		@ManyToOne
		@JsonIgnoreProperties("produtos")
		private Usuario usuario;

		public Usuario getUsuario() {
			return usuario;
		}




		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		

}
