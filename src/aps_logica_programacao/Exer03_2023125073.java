package aps_logica_programacao;

import java.util.Scanner;

public class Exer03_2023125073 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    int num = input.nextInt();

    int soma = 0;
    for (int i = 1; i <= num; i++) {
      soma += i;
    }
    System.out.println("A soma dos números até: " + num + " é: " + soma);

    input.close();
  }
}
