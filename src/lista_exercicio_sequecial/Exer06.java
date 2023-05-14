package lista_exercicio_sequecial;

import java.util.Scanner;

public class Exer06 {
  /**
   * 
   */
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Digite um numero inteiro: ");
      int numero = input.nextInt();

      System.out.println("Digite outro numero inteiro: ");
      int numero2 = input.nextInt();

      System.out.println("Os numeros digitados foram: " + numero + " e 8" + numero2);
    }

  }
}
