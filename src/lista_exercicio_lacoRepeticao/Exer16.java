package lista_exercicio_lacoRepeticao;

import java.util.Scanner;

public class Exer16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int contMasculino = 0;
    int contFemenino = 0;
    int sexo = 0;

    System.out.println("Digite o sexo (M para  masculunino ou F para femenino)das pessoas (digite 'S' para sair): ");

    while (sexo != 3) {
      sexo = input.nextInt();

      if (sexo == 1) {
        contMasculino++;
      } else if (sexo == 2) {
        contFemenino++;
      }

    }

    System.out.println("O número de pessoas do sexo masculino é: " + contMasculino);

    System.out.println(contFemenino);

    input.close();
  }

}
