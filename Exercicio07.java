/*
 * Faça um programa que monte os oito primeiros termos da sequência de Fibonacci.
0 – 1 – 1 – 2 – 3 – 5 – 8 – 13 – 21 – 34 – 55 - ...
 */



public class Exercicio07 {
    public static void main(String[] args) {
        int n = 10; 
        int primeiroFibonacci = 0;
        int segundoFibonacci = 1;
        
        System.out.print("Os " + n + " primeiros termos da sequência de Fibonacci são: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(primeiroFibonacci + " ");
            int proximo = primeiroFibonacci + segundoFibonacci;
            primeiroFibonacci = segundoFibonacci;
            segundoFibonacci = proximo;
       
        }
    }
}
