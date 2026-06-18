public class Main{

    public static void main(String[]args){

        String nome = "weriton";
        int idade = 36;
        double altura = 1.75;
        double preco = 1000.00;
        boolean tem = true;

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade +" anos");
        System.out.printf("Atura fomatada: %.2f%n ", altura);
        System.out.printf("O celular custa: R$ %.3f%n ", preco);
        System.out.println("O celular esta disponivel: " + tem);
    }
}