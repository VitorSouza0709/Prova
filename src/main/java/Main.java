import java.util.Scanner;
  

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite seu nome:");
    String nome = sc.nextLine();
    System.out.println("digite seu sobrenome");
     String sobrenome = sc.nextLine();  
      System.out.println("digite sua idade");
    int idade = sc.nextInt();
     System.out.println("digite sua altura");
      double altura = sc.nextDouble();
      System.out.println(" Digite 1 para masculino ou 2 para feminino");
  

    if (sc.nextInt() ==1);
      System.out.println("seu peso ideal é:");
      System.out.printf("%.2f", (72.7 * altura) - 58);
      System.out.println("");
      System.out.println("obrigado por usar nosso programa");

    if (sc.nextInt() ==2);
      System.out.println("seu peso ideal é:");
      System.out.printf("%.2f", (62.1 * altura) - 44.7);
    System.out.println("obrigado por usar nosso programa");

    sc.close();
  }


}