package lista_exercicio_lacoRepeticao;

import java.util.Scanner;

public class Exer01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número inteiro: ");
    int n = input.nextInt();

    for (int i = 0; i <= n; i++) {
      System.out.println(i);
    }
    input.close();
  }
}
