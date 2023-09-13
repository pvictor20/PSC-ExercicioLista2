/*
 * Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de E, conforme a fórmula a seguir:
E = 1 + 1/1! + 1⁄2! + 1/3! + ... + 1/N!
 */
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        double n = sc.nextDouble();
        // E = 1 + 1/1! + 1⁄2! + 1/3! + ... + 1/N!
        double e = 1;
        for (int i = 1; i <= n; i++) {
            double fatorial = 1;
            for (int j = 2; j <= i; j++) {
                fatorial *= j;
            }
            e = e + (1 / fatorial);
        }
        System.out.println(e);


        sc.close();
    }
}