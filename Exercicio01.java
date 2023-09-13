/*
 * Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
a) esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00;
b) em 2006 recebeu aumento de 1,5% sobre o salário inicial;
c) a partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
Faça um programa que determine o salário atual desse funcionário.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        double salario = 1000; 
        double salario_2006 = salario * 1.015;

        for (int ano = 2006; ano <= 2023; ano++ ){
            salario = salario + (salario * (salario_2006 / 100));  
            salario_2006 *= 2;
            System.out.println("Ano " + ano + " salário " + salario +" percentual do ano seguinte "  + salario_2006);
        }
        System.out.println(salario);
    }
    
}
