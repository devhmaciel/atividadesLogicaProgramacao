package atividade_exer38;

import java.util.Scanner;

public class IluminacaoResidencial {
  public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    int totalLampadas = 0;
    double totalPotencia = 0.0;

    // Laço para leitura dos dados dos cômodos até que o usuário deseje sair
    while (true) {
      // Leitura do nome do cômodo
      System.out.println("Digite o cômodo da residência (ou 'sair' para encerar)");
      String comodo = entrada.nextLine();
      // e o usuário digitar "SAIR", encerra o programa
      if (comodo.equalsIgnoreCase("sair")) {
        break;
      }
      // leitura da classe iluninação do cômodo
      System.out.println("Digite a clase de iluminação do cômodo: ");
      int claseIluminacao = entrada.nextInt();

      // Leitura das dimensões do cômodo
      System.out.println("Digite a largura do comodo (em metros): ");
      double largura = entrada.nextDouble();

      System.out.println("Digite o comprimento do cômodo (em metros): ");
      double comprimento = entrada.nextDouble();

      // Cálculo da área do cômodo
      double area = largura * comprimento;
      // Cálculo da potência de iluminação do cômodo
      double potenciaIluminacao = area * claseIluminacao;

      // Cálculo do número de lâmpadas necessárias
      int numLampadas = (int) Math.ceil(potenciaIluminacao / 60.0);

      // Acumula o total de lâmpadas e o total de potência
      double potenciaTotal = numLampadas * 60.0;

      // Imprime as informações do cômodo
      System.out.println("\nCômodo: " + comodo);
      System.out.println("potencia de iluminação: " + potenciaIluminacao + " W");
      System.out.println("Número de lâmpadas necessárias: " + numLampadas);

      totalLampadas += numLampadas;
      totalPotencia += potenciaTotal;

      entrada.nextLine();

    }
    // imprime as informações totais da residência
    System.out.println("\nTotal de lâmpadas: " + totalLampadas);
    System.out.println("Total de potência: " + totalPotencia + "W");

    // fecha o objeto Scanner
    entrada.close();
  }
}