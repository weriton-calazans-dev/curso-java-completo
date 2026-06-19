import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se é ímpar ou par:");
        int numero = sc.nextInt();
        String resultado = (numero % 2 == 0) ? "par" : "ímpar" ;
        System.out.println("O número digitado é "+resultado);


        sc.close();
    }
}
