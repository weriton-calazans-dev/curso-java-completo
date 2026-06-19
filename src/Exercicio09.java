import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-Vindo! A lanchonete programação");
        System.out.println();
        System.out.println("Digite [1] para   ( Cachorro Quente )    (preço: R$ 4.00)");
        System.out.println("Digite [2] para   ( X-Salada )           (preço: R$ 4.50)");
        System.out.println("Digite [3] para   ( X-Bacon )            (preço: R$ 5.00)");

        int opcao = sc.nextInt();
        System.out.println("Digite a quantidade desejada?");

        int quantidade = sc.nextInt();
        double total = quantidade;

        switch (opcao) {
            case 1:
                total *=  4.00;
                System.out.println("Pedido do ( Cachorro Quente ) recebido com sucesso.");
                break;
            case 2:
                total *= 4.50;
                System.out.println("Pedido do ( X-Salada ) recebido com sucesso.");
                break;
            case 3:
                total *= 5.00;
                System.out.println("Pedido do ( X-Bacon ) recebido com sucesso.");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        if(total > 0.0){
            System.out.printf("Valor total do pedido é: R$ %.2f%n",total);
            System.out.println("Obrigado e volte sempre!");
        }
        sc.close();
    }
}
