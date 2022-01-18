package Cursos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import informacoes.Cliente;
import informacoes.Cursos;

public class Plataforma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double soma=0;

		List<Cursos> cursos = new ArrayList<>();
		List<Cursos> cursosQueridos = new ArrayList<>();

		Cursos c1 = new Cursos("Tecnologia da Informação", 1500.0);
		Cursos c2 = new Cursos("Recursos Humanos", 900.0);
		Cursos c3 = new Cursos("Arquitetura de Redes", 2600.0);
		Cursos c4 = new Cursos("Introdução ao Python", 2000.0);
		cursos.addAll(Arrays.asList(c1, c2, c3, c4));

		int contador = 1;
		for (Cursos curso : cursos) {
			curso.setId(contador);
			contador++;
		}

		System.out.println("Bem vindo a plataforma de cursos ! ");
		System.out.println();
		for (Cursos curso : cursos) {
			System.out.println(curso);

		}
		
		System.out.println("-------------------------");
		System.out.println("Cadastro!!!");
		System.out.print("Nome : ");
		String nome = sc.nextLine();
		System.out.print("Email :  ");
		String email = sc.nextLine();
		System.out.print("Cpf : ");
		String cpf = sc.nextLine();
		Cliente cliente = new Cliente(nome,email,cpf);
		System.out.println("-------------------------");
		
		System.out.println("Cursos !");
		System.out.print("Quantos cursos deseja comprar ? : ");
		int qntdCursos = sc.nextInt();
		if(qntdCursos>4 || qntdCursos<1) {
			System.out.println("Quantidade de cursos indisponiveis");
		}else{ 		
			for(int i=0 ;i<qntdCursos;i++) {
				System.out.print("Digite o ID do curso : ");
				int idCurso = sc.nextInt();
				for(int j=0;j<cursos.size();j++) {
					if(idCurso==cursos.get(j).getId()) {
						soma = soma+cursos.get(j).getValor();
						cursosQueridos.add(cursos.get(j));
					} 
				}			
			}
			System.out.println();	
			System.out.println("-----Nota Fiscal-----");
			System.out.println("Nome : "+cliente.getNome());
			System.out.println("Email : "+cliente.getEmail());
			System.out.println("Cpf : "+cliente.getCpf());
			System.out.println("------COMPRAS REALIZADAS------");
			for(int m=0;m<cursosQueridos.size();m++) {
				System.out.println("Curso ID ("+(m+1) + ") = " + cursosQueridos.get(m).getName());
				//System.out.println(cursosQueridos.get(i).getName());
			}
		}
		System.out.println();		
		System.out.println("Valor total : "+soma);
		System.out.println();
		System.out.println("Programa Finalizado");
		System.out.println();
		sc.close();
	}
}
