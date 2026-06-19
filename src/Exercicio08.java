import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro número inteiro");
        int numero2 = sc.nextInt();
        System.out.println("Digite mais um número inteiro");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número digitado é: " + numero1);
        }
        else if(numero2 > numero3){
            System.out.println("O maior número digitado é: " + numero2);
        }
        else{
            System.out.println("O maior número digitado é: " + numero3);
        }

        sc.close();
    }
}
