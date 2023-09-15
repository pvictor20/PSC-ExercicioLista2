import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalJogadores = 5 * 11; 
        int jogadoresMenorDe18 = 0;
        float somaAlturasCampeonato = 0;
        int jogadoresComMaisDe80Quilos = 0;

        for (int time = 1; time <= 5; time++) {
            float mediaAlturasTime = 0;

            for (int jogador = 1; jogador <= 11; jogador++) {
                System.out.println("Informe a idade do jogador " + jogador + " do time " + time + ": ");
                int idade = sc.nextInt();
                System.out.println("Informe a altura (em metros) do jogador " + jogador + " do time " + time + ": ");
                float altura = sc.nextFloat();
                System.out.println("Informe o peso (em quilos) do jogador " + jogador + " do time " + time + ": ");
                float peso = sc.nextFloat();

                if (idade < 18) {
                    jogadoresMenorDe18++;
                }

                if (peso > 80) {
                    jogadoresComMaisDe80Quilos++;
                }

                mediaAlturasTime += altura;
            }

            float mediaAlturasTimeFinal = mediaAlturasTime / 11;
            System.out.println("Média das alturas do time " + time + ": " + mediaAlturasTimeFinal);
            somaAlturasCampeonato += mediaAlturasTimeFinal;
        }

        float mediaAlturasCampeonato = somaAlturasCampeonato / 5;
        System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlturasCampeonato);
        float percentagemMaisDe80Quilos = (float) (jogadoresComMaisDe80Quilos * 100) / totalJogadores;
        System.out.println("Percentagem de jogadores com mais de 80 quilos: " + percentagemMaisDe80Quilos + "%");
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenorDe18);

        sc.close();
    }
}
