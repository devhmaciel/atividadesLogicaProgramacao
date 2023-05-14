package lista_exercicio_sequecial;

import java.util.Scanner;

public class Exer07 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite um número inteiro: ");
      int numero = input.nextInt();

      int antecessor = numero - 1;
      int sucessor = numero + 1;

      System.out.println("O antecessor de" + numero + " é: " + antecessor);

      System.out.println("O sucessor de " + numero + " é " + sucessor);
    }
  }
}
