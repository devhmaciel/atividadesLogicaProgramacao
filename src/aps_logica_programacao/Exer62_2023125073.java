package aps_logica_programacao;

import java.util.Scanner;
// Função auxiliar para calcular os pontos com base no tempo delta

public class Exer62_2023125073 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Ler os tempos-padrão das três fases de competição
    System.out.println("Digite os tempos-padrão para cada fase (em minutos decimais):");
    double tempoPadrao1 = input.nextDouble();
    double tempoPadrao2 = input.nextDouble();
    double tempoPadrao3 = input.nextDouble();

    // Declarar as variáveis
    int equipeVencedora = 0;
    int pontosVencedor = 0;

    // Ler os dados das equipes
    System.out.println("Digite o número de inscrição da equipe e os tempos nas três fases (9999 para encerrar):");

    int numeroInscricao = input.nextInt();
    int equipeIndex = 0; // Índice da equipe atual

    while (numeroInscricao != 9999) {
      // Ler os tempos da equipe
      double tempo1 = input.nextDouble();
      double tempo2 = input.nextDouble();
      double tempo3 = input.nextDouble();

      // Calcular os pontos para a equipe atual
      int pontosTotal = 0;
      double delta;

      // Calcular pontos para a primeira fase
      delta = Math.abs(tempoPadrao1 - tempo1);
      if (delta <= 0.1) {
        pontosTotal += 100;
      } else if (delta <= 0.3) {
        pontosTotal += 80;
      } else if (delta <= 0.5) {
        pontosTotal += 60;
      } else if (delta <= 0.7) {
        pontosTotal += 40;
      } else if (delta <= 1.0) {
        pontosTotal += 20;
      }

      // Calcular pontos para a segunda fase
      delta = Math.abs(tempoPadrao2 - tempo2);
      if (delta <= 0.1) {
        pontosTotal += 100;
      } else if (delta <= 0.3) {
        pontosTotal += 80;
      } else if (delta <= 0.5) {
        pontosTotal += 60;
      } else if (delta <= 0.7) {
        pontosTotal += 40;
      } else if (delta <= 1.0) {
        pontosTotal += 20;
      }

      // Calcular pontos para a terceira fase
      delta = Math.abs(tempoPadrao3 - tempo3);
      if (delta <= 0.1) {
        pontosTotal += 100;
      } else if (delta <= 0.3) {
        pontosTotal += 80;
      } else if (delta <= 0.5) {
        pontosTotal += 60;
      } else if (delta <= 0.7) {
        pontosTotal += 40;
      } else if (delta <= 1.0) {
        pontosTotal += 20;
      }

      // Verificar se a equipe é a vencedora
      if (pontosTotal > pontosVencedor) {
        equipeVencedora = equipeIndex;
        pontosVencedor = pontosTotal;
      }

      equipeIndex++;

      // Ler o número de inscrição da próxima equipe
      numeroInscricao = input.nextInt();
    }

    // Imprimir os resultados para cada equipe
    System.out.println("Equipe vencedora:");
    System.out.println("Número de inscrição: " + equipeVencedora);
    System.out.println("Pontos totais: " + pontosVencedor);

    input.close();
  }

}