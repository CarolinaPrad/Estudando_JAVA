package aula_0108;

import java.time.LocalDate;
import java.util.Scanner;
public class Atividade010823 {
    public static void main(String[] args) {
                // Cria um scanner para ler a entrada do usuário
                Scanner scanner = new Scanner(System.in);

                // Cria uma lista para armazenar os números do usuário
                int[] numeros = new int[5];

                // Lê 5 números do usuário
                for (int i = 0; i < 5; i++) {
                    System.out.println("Digite um número: ");
                    numeros[i] = scanner.nextInt();
                }

                // Encontra o maior e o menor número da lista
                int maior = numeros[0];
                int menor = numeros[0];
                for (int i = 1; i < 5; i++) {
                    if (numeros[i] > maior) {
                        maior = numeros[i];
                    }
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                    }
                }
                // Exibe o maior e o menor número da lista
                System.out.println("O maior número é " + maior);
                System.out.println("O menor número é " + menor);

        // Obtém a data atual
        LocalDate hoje = LocalDate.now();

        // Calcula a data daqui a três semanas
        LocalDate dataFutura = hoje.plusWeeks(3);

        // Exibe a data futura
        System.out.println("A data daqui a três semanas é: " + dataFutura);


            }
        }




