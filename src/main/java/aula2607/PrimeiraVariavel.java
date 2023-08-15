package aula2607;

import javax.swing.*;

public class PrimeiraVariavel {
    //variável = conteiner de dados
    // tipagem forte = definir o tipo de cada variável
    public static void main(String[] args) {
        // para definir uma variável
        //<tipo> <nome> = <valor>;

        // Tipos primitivos (surgem com a linguagem): int, long, char, boolean, double, float
        // Tipos não-primitivos (foram implementados depois): String, list

        //Como declarar variáveis?
        int estoque = 150; //até 2 bilhões
        // L = sufixo para representar long
        long populacaoTerra = 7900000000L; // até na casa dos quintilhões
        double salarioDev = 5500.99; // até 15 casas de precisão
        // F = sufixo para representar float
        float nota = 7.5F; //até 7 casas de precisão
        boolean ativo = true; // true, false
        String nome = "Carolina Prado"; // usamos aspas dulpas sempre e letra maiuscula (S)
        char letra = 'R'; // Char: representa um único caractere

        //Tipagem forte
        int a = 1000;
        a = 2000; //reatribuição/atualização
        // a  = "batata"; // impossível atribuir outro tipo

        System.out.println("Estoque: " + estoque);
        System.out.println("Pupulação da terra: " + populacaoTerra);
        System.out.println("Salário Dev " + salarioDev);
    }
}
