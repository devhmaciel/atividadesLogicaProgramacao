package aps_logica_programacao;

public class Exer73_2023125073 {
  public static void main(String[] args) {
    double alturaAnacleto = 1.50;
    double alturaFelisberto = 1.10;
    int anos = 0;

    while (alturaFelisberto <= alturaAnacleto) {
      alturaAnacleto += 0.02; // anacleto cresce 2 cm por ano (0.02 metros)
      alturaFelisberto += 0.03;// Felisberto cresce 3 cm por ano (0.03 metros)
      anos++;
    }

    System.out.println("Serão necessários: " + anos + " anos para Felisberto ser maior que anacleto.");
  }
}
