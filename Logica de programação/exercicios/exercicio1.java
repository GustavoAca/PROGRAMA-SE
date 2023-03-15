import java.util.Scanner;

public class exercicio1 {

  public static void main(String[] args) {
    int valor1;
    int valor2;
    Scanner in = new Scanner(System.in);
    System.out.println("Insira valor 1:");
    valor1 = in.nextInt();

    System.out.println("Insira valor 2 :");
    valor2 = in.nextInt();

    if (valor1 > valor2) {
      System.out.println("O valor maior é: " + valor1);
    } else {
      System.out.println("O valor maior é: " + valor2);
    }
  }
}
