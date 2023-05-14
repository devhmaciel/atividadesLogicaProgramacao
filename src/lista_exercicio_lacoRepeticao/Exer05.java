package lista_exercicio_lacoRepeticao;

import java.util.Scanner;

public class Exer05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int numero = input.nextInt();

    for (int i = 0; i <= numero; i++) {
      if (i % 4 == 0) {
        System.out.println(i);
      }
    }
    input.close();
  }
}
