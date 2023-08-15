package aula_2807;

import java.util.Arrays;
import java.util.Scanner;

public class EstudoVetores {
    public static void main(String[] args) {
       int[] nums = {1, 2, 3, 4, 5}; // vetor de numeros inteiros
       double[] notas = new double[60]; // declara um vetor double vazio com 60 posições

        notas[59] = 5.6;
        System.out.println(notas[59]);

      System.out.println(nums[4]);
        nums[4] = 8;
        System.out.println(nums[4]);

        String[] nomes = {"Fernando", "Felipe"}; // válido
        String nomes2[] = {"João", "Maria"}; // válido

        // iterar sob os vetores
        for(int i = 0; i < nums.length; i++) { // interar sobre o vetor
            System.out.print(nums[i]);
        }
        System.out.println(); // quebra de linha
        for(int num : nums) { // for each do java
            System.out.print(num);
        }
        System.out.println(); // quebra de linha

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o números de notas");
        int nNotas = scanner.nextInt();
        double[] batata = new double[nNotas];
        for (int i = 0; i < nNotas; i++) {
            System.out.println("Digite a nota: ");
            notas[i] = scanner.nextDouble(); // guardar as notas no vetor
        }
        double media = 0.0;
        for(double nota : notas) media += nota; // somar todos os valores
        media /= nNotas; // calculo da media com base no numeros de notas
        System.out.printf("A média é igual a %.2f", media);

        ///Crie um programa que recebe um email e uma senha do usuário. Valide se o email é do domínio
//        @soulcode.com e a senha tem comprimento maior que 8. Exiba uma mensagem caso email e senha não
//        sejam válidos.

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Digite o e-mail:");
        String email = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        if(email.contains("@soulcode.com")) {
            System.out.println("E-mail válido!");
        }
        else {
            System.out.println("E-mail inválido!");
        }

        if(senha.length() > 8) {
            System.out.println("Senha válido!");
        }
        else {
            System.out.println("Senha inválido!");
        }

//        Crie um programa que define 2 vetores de tamanho igual. Em seguida, crie um terceiro vetor de mesmo
//        tamanho onde o valor em cada posição do terceiro é resultado da soma dos valores nos vetores 1 e 2
//        na mesma posição.

        float[] vetor1 = {1.2F, 3.5F, 7.8F, 9.0F};
        float[] vetor2 = {6.8F, 9.5F, 5.2F, 1.0F};
        float[] vetor3 = new float[4];

        for(int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.println(vetor3[i]);
        }
    }
}

