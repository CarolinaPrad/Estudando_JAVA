package aula_2807;

public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Hello, world!"); // saida no console
        System.out.print(1); // não quebra linha
        System.out.print(2);
        System.out.println(); // quebra linha
        System.out.println("Oi\nEu sou Java!");
        System.err.println("Ops! Houve um erro"); // serr -> atalho

        int n1 = 7;
        int n2 = 9;
        int soma = n1 + n2;

        System.out.printf("A soma de %d e %d é igual a %d.\n", n1, n2, soma);
        // %d -> mapeia um numero inteiro

        String nome = "Carolina";
        System.out.printf("Bem vindo, %s!\n", nome);
        // %s -> mapeia um texto

        double nu1 = 3.4;
        double nu2 = 12.5;
        double div = nu2 / nu1;
        System.out.printf("A divisão de %.2f e %.2f é igual a %.2f.\n", nu1, nu2, div);
        // %f -> mapeia um numero flutuante - %.2f - determina quantas casas decimais


    }
}
