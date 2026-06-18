import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2.0);

        System.out.printf("Á área do círculo é: %.4f%n",area);

        sc.close();
    }
}
