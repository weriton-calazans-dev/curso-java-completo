import java.util.Scanner;

public class Execicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enfome o nome do fucionário?");
        String nome = sc.next();
        System.out.printf("O fucionário %s trabalhou quantas horas este mês? %n",nome);
        int horas = sc.nextInt();
        System.out.printf("O valor pago por hora trabalhada do funcionário %s é de quanto R$: %n",nome);
        double valorPorHoras = sc.nextDouble();

        double salario = horas * valorPorHoras;

        System.out.printf("O fucionário %s vai receber a quantia de: R$ %.2f este mês.",nome,salario);

        sc.close();
    }
}
