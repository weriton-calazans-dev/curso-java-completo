import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        boolean erro = false;

        while (erro == false){

            System.out.println("Digite sua senha de 4 digitos:");
            int senhaUsuario = sc.nextInt();

            if (senha == senhaUsuario){
                System.out.println("Acesso Permitido");
                erro = true;
            }
            else {
                System.out.println("Senha Inválida!");
            }
        }
        sc.close();
    }
}
