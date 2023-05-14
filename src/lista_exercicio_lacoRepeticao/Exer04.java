package lista_exercicio_lacoRepeticao;

import java.util.Scanner;

public class Exer04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um numéro para ver sua tabuada: ");
    int numero = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      int resultado = numero * i;
      System.out.println(numero + " x " + i + " = " + resultado);
    }
    input.close();
  }
}
