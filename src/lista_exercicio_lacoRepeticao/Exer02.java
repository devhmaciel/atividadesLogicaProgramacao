package lista_exercicio_lacoRepeticao;

import java.util.Scanner;

public class Exer02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;

    System.out.println("Digite um número: ");
    n = input.nextInt();

    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    input.close();
  }
}
