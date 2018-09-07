package mtp2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios {
	public static void main (String [] args) {
		Scanner digite = new Scanner (System.in);
		Pessoa pessoas = new Pessoa ();
		ArrayList <Pessoa> pessoa = new ArrayList ();
		int opcao, idade, i = 0;
		String nome , endereco ;
		
		do {
			System.out.println("Informe a opcão que deseja executar:\n");
			System.out.println ("1 = Leitura");
			System.out.println ("2 = Gravação");
			System.out.println ("3 = Atualização");
			System.out.println ("4 = Exclusão");
			System.out.println ("0 = Sair");
			System.out.println ("Informe o numero da opcao:\n");
			opcao=digite.nextInt();
		
			switch (opcao){
				case 1:
					
					if(pessoa.size()<=0) {
						System.out.println("Não contem dados salvos!");
					}else{ 
						for (i=0; i<pessoa.size();i++) {
							System.out.println ("NOME:" +pessoa.get(i).getNome() + "\nENDERÇO:" + pessoa.get(i).getEndereco()+ "\nIDADE:"  +pessoa.get(i).getIdade() );
						}
					}
					
				break;	
				
				case 2:
					Pessoa pess= new Pessoa();
					System.out.println("Opção desejada foi a de gravação!");
					
					System.out.println("Informe nome:");
					nome=digite.next();
					pess.setNome(nome);
					
					System.out.println("Informe o endereço:");
					endereco=digite.next();
					pess.setEndereco(endereco);
					
					System.out.println("Informe idade:");
					idade=digite.nextInt();
					while(idade<0) {
						System.out.println("Por favor digite a idade correta!!");
						idade=digite.nextInt();
					}
					pess.setIdade(idade);
					pessoa.add (i,pess);
			
				break;	
			
				case 3:
					System.out.println("Opção desejada foi a de atualização!");
					System.out.println("Digite a posição que deseja atualizar!");
					i=digite.nextInt();
					while (i<0) {
						System.out.println("Por favor digite uma posição correta!!");
						i=digite.nextInt();
					}
					
					for (i=0; i<pessoa.size();i+=2) {
					System.out.println("Informe nome:");
					nome=digite.next();
					pessoas.setNome(nome);
					
					System.out.println("Informe o endereço:");
					endereco=digite.next();
					pessoas.setEndereco(endereco);
					
					System.out.println("Informe idade:");
					idade=digite.nextInt();
					pessoas.setIdade(idade);
					while(idade<0) {
						System.out.println("Por favor digite a idade correta!!");
						idade=digite.nextInt();
					}
					pessoa.set(i,pessoas);
					
					}
				
				break;
				
				case 4:
					
					System.out.println("Opção desejada foi a de excluir");
					System.out.println("Digite a posição que deseja excluir");
					i=digite.nextInt();
					pessoa.remove(i);
					System.out.println("Posição excluida");
				break;
			
			default:
			case 5:
				System.out.println("Programa terminado com sucesso!!");
			}	
			
				
			
			}while(opcao!=0);
		
		
		
		
		
		}
		
	
	
}
	


