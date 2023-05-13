package lista_exercicio_sequecial;

import java.util.Scanner;

public class Exer05 {
  /**
   * 
   */
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite um numero inteiro: ");
      int numero = input.nextInt();

      System.out.println("O numero digitado foi: " + numero);
    }

  }
}
