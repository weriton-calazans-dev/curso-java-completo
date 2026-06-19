import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da tabuada que você gostaria de saber:");
        int numero = sc.nextInt();

        int resultado;

        for (int i = 1; i <=10; i++) {
            resultado = i * numero;
            System.out.printf("%d X %d = %d%n",i , numero, resultado);
        }
        sc.close();
    }
}
