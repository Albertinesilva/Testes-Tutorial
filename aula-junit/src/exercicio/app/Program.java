package exercicio.app;

import exercicio.entities.Financing;

public class Program {

  public static void main(String[] args) {

    limparTela();

    try {
      Financing f1 = new Financing(100000.0, 2000.0, 20);
      System.out.println("Dados do financiamento: 1");
      System.out.printf("Entrada: %.2f%n", f1.entry());
      System.out.printf("Prestação: %.2f%n", f1.quota());
      System.out.println("=====================================");

    } catch (IllegalArgumentException e) {
      System.out.println("Erro no financiamento: 1 " + e.getMessage());
    }

    try {
      Financing f2 = new Financing(100000.0, 2000.0, 80);
      System.out.println("Dados do financiamento: 2");
      System.out.printf("Entrada: %.2f%n", f2.entry());
      System.out.printf("Prestação: %.2f%n", f2.quota());
      System.out.println("=====================================");

    } catch (IllegalArgumentException e) {
      System.out.println("Erro no financiamento: 2" + e.getMessage());
    }
  }

  public static void limparTela() {
    try {
      final String os = System.getProperty("os.name");

      if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    } catch (final Exception e) {
      // Trata exceções (pode ser uma exceção de interrupção)
      e.printStackTrace();
    }
  }
}
