/*
 * Faça um programa para calcular a área de um triangulo. Esse programa não pode permitir a entrada de dados
inválidos, ou seja, medidas menores ou iguais a 0.  (bh)/2
 */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        int b;
        int h;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza a base do triângulo:");
        b = sc.nextInt();

        System.out.println("Introduza a altura do triângulo:");
        h = sc.nextInt();



        if (b <= 0 || h <= 0) {
            System.out.println("Erro. Você introduziu um número igual a 0 ou menor!");
        } else{
            int area = (b*h)/2; //Dúvida aqui, porque tem que ser declarado aqui e não junto com as outras variáveis em cima?!!
            System.out.println("A área do triângulo é: " + area);
        }
        sc.close();
    }
}
