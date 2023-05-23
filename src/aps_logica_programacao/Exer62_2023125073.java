package aps_logica_programacao;

import java.util.Scanner;

public class Exer62_2023125073 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ler os tempos-padrão das três fases de competição
    System.out.println("Digite os tempos-padrão para cada fase (em minutos decimais):");
    double[] temposPadrao = new double[3]; // Array para armazenar os tempos-padrão das fases

    for (int i = 0; i < temposPadrao.length; i++) {
      temposPadrao[i] = input.nextDouble();
    }

    // Declarar as variáveis
    int equipeVencedora = 0;
    int pontosVencedor = 0;

    // Ler os dados das equipes
    System.out.println("Digite o número de inscrição da equipe e os tempos nas três fases (9999 para encerrar):");

    int numeroInscricao = input.nextInt();
    double[][] temposEquipes = new double[0][3]; // Matriz para armazenar os tempos das equipes

    int[] pontosEquipes = new int[0];

    while (numeroInscricao != 9999) {

      // Calcular os pontos para cada equipe e o total de pontos
      pontosEquipes = new int[temposEquipes.length]; // Inicialização da variável pontosEquipes

    }

    // Imprimir os resultados para cada equipe
    System.out.println("Resultados:");
    for (int i = 0; i < temposEquipes.length; i++) {
      System.out.println("Equipe " + i + ": Pontos = " + pontosEquipes[i]);
    }

    // Exibir a equipe vencedora
    System.out.println("Equipe vencedora:");
    System.out.println("Equipe " + equipeVencedora + ": Pontos = " + pontosVencedor);

    input.close();
  }

  // Função auxiliar para calcular os pontos com base no tempo delta
  public static int calcularPontos(double delta) {
    if (delta <= 0.1) {
      return 100;
    } else if (delta <= 0.3) {
      return 80;
    } else if (delta <= 0.5) {
      return 60;
    } else if (delta <= 0.7) {
      return 40;
    } else if (delta <= 1.0) {
      return 20;
    } else {
      return 0;
    }

  }

}
