import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
      String genero;

    Scanner generoRecebido = new Scanner(System.in);
    System.out.println("Digite seu genero");
    System.out.println("F M NB");
    genero = generoRecebido.next();
    if (genero.equals("F")) {
      System.out.println("Feminino");
    }

    if (genero.equals("M")){
      System.out.println("Masculino");
    }

    if (genero.equals("NB")) {
      System.out.println("Não binario");
    }

    if (!genero.equals("F") && !genero.equals("M") && !genero.equals("NB")){
      System.out.println("Digite um genero válido");
    }
    }
}