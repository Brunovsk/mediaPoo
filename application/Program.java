package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	List <Double> mediaAluno = new ArrayList<>();
	List <String> nomeAluno = new ArrayList<>();
	
	
	System.out.println("Digite o numero de alunos:");
	int numAluno = sc.nextInt();
	System.out.println("Digite o numero de notas:");
	int numNota = sc.nextInt();
	
	
	double nota;
	for (int i =0;i<numAluno;i++) {
		System.out.println("Digite o nome do aluno:");
		 String nome1 = sc.next();
		 nomeAluno.add(nome1);
		 double soma = 0;
		 for(int j =0; j<numNota;j++) {	 
			 System.out.println("Digite a #"+(j+1)+" nota:");
			  nota = sc.nextDouble();
			  soma = soma +nota;	
		}
		 double media1 = soma/numNota;
		 mediaAluno.add(media1);
	   }
	for (int i =0; i < mediaAluno.size();i++) {
		String nome = nomeAluno.get(i);
		Double media = mediaAluno.get(i);
		Aluno aluno = new Aluno (nome,media);
		aluno.addAluno(aluno);
		aluno.mostraMedia();
	}
	
	
	sc.close();

	}

}