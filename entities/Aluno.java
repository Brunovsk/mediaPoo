package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private Double media;
	List <Aluno> alunos = new ArrayList<>();
	
	public Aluno(String nome,Double media) {
		this.nome = nome;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);	
	}
	
	public void mostraMedia() {

		for (Aluno aluno : alunos) {
			System.out.println("A nota do aluno "+aluno.getNome()+" é "+aluno.getMedia()+"!");
		}
	}
	

	
	
	
	
	
}
