package qi.Atividade_Integradora;

import jakarta.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id", "nome", "email", "ciclo", "turma"})
public class Aluno {
	
	//VARIAVEIS DO ALUNO
	private int id;
	private String nome;
	private String email;
	private int ciclo;
	private int turma;
	
	//CONSTRUTOR DE ALUNO
	public Aluno(int id, String nome, String email, int ciclo, int turma) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.ciclo = ciclo;
		this.turma = turma;
	}

	//METODOS GET E SET DO ALUNO
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}
	
	
	
	
	

}
