/*
* Faça um programa que receba duas notas de 6 alunos, calcule e mostre:

1

 a média aritmética das duas notas de cada aluno;
 a mensagem que está na tabela a seguir:
Média aritmética Mensagem
Até 3,0 Reprovado
Entre 3,0 e 7,0 Exame
Acima de 7,0 Aprovado
 o total de alunos aprovados;
 o total de alunos de exame;
 o total de alunos reprovados;
 a média da classe.
*/

import java.util.Scanner;

public class Exercicio09 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int aprovados = 0;
       int exame = 0;
       int reprovado = 0;
       int somaMedia = 0;

       for (int i = 1; i <= 6; i++) { 
           System.out.println("Digite as notas do aluno " + i + ":");
           int nota1 = sc.nextInt();
           int nota2 = sc.nextInt();

           sc.close();

         while (nota1 > 10 && nota2 > 10) {
           System.out.println("Erro! Nota inválida.");
           return;
         }

           int media = (nota1 + nota2) / 2;
           somaMedia += media;

           System.out.println("Média do aluno " + i + ": " + media);

           if (media <= 3) {
               System.out.println("Reprovado");
               reprovado++;
           } else if (media <= 7) {
               System.out.println("Exame");
               exame++;
           } else {
               System.out.println("Aprovado!");
               aprovados++;
           }
       }
       

       int mediaClasse = somaMedia / 6;

       System.out.println("Aprovados: " + aprovados);
       System.out.println("Exame: " + exame);
       System.out.println("Reprovado: " + reprovado);
       System.out.println("Média da classe: " + mediaClasse); 
          
   }
} 