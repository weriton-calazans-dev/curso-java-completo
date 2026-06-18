import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para a soma:");
        int numero1 = sc.nextInt();
        System.out.println("Digite mais um número para a soma");
        int numero2 = sc.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("A soma dos números é: " + resultado);

        sc.close();
    }
}
