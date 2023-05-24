package lista_exercicio_lacoRepeticao;

import java.util.Scanner;

public class Exer41 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double altura, maiorAltura = 0, menorAltura = 0, somaAlturaMulheres = 0, mediaAlturaMulheres = 0;
    char sexo;
    int numeroHomens = 0;

    for (int pessoa = 1; pessoa <= 50; pessoa++) {
      System.out.println("informe a altura da pessoa" + pessoa);
      altura = input.nextDouble();

      System.out.println("informe o sexo da pessoa " + pessoa + "(M para masculino ou F para feminino)");
      sexo = input.next().charAt(0);

      if (pessoa == 1) {
        maiorAltura = altura;
        menorAltura = altura;
      } else {
        if (altura > maiorAltura) {
          maiorAltura = altura;
        }
        if (altura < menorAltura) {
          menorAltura = altura;
        }

      }

      if (sexo == 'f') {
        somaAlturaMulheres += altura;
      }

      if (sexo == 'M') {
        numeroHomens++;
      }

    }

    if (somaAlturaMulheres != 0) {
      mediaAlturaMulheres = somaAlturaMulheres / (50 - numeroHomens);
    }

    System.out.println("a maior altura do grupo é: " + maiorAltura);
    System.out.println("A menor altura do grupo é: " + menorAltura);
    System.out.println("A média de altura das mulheres é: " + mediaAlturaMulheres);
    System.out.println("O numero de homens é: " + numeroHomens);

    input.close();

  }
}
