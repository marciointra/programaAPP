package projeto_14_datainputstream;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        int[][] matriz = new int[5][5];

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(dis.readLine());
            }
        }

        // Exibir a matriz original
        System.out.println("Matriz original:");
        exibirMatriz(matriz);

        // Ordenar a matriz como vetor único
        int[] vetor = new int[25];
        int index = 0;
        for (int[] linha : matriz) {
            for (int num : linha) {
                vetor[index++] = num;
            }
        }
        Arrays.sort(vetor);
        index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = vetor[index++];
            }
        }
        System.out.println("Matriz ordenada:");
        exibirMatriz(matriz);

        // Calcular e exibir a soma de cada linha e coluna
        System.out.println("Soma de cada linha e coluna:");
        calcularSomas(matriz);

        // Encontrar e exibir números repetidos
        System.out.println("Números repetidos:");
        encontrarRepetidos(matriz);

        // Calcular e exibir a soma das diagonais
        System.out.println("Soma das diagonais:");
        calcularSomasDiagonais(matriz);

        // Substituir números primos por -1
        substituirPrimos(matriz);
        System.out.println("Matriz com primos substituídos por -1:");
        exibirMatriz(matriz);
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int num : linha) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void calcularSomas(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
            System.out.println("Coluna " + (i + 1) + ": " + somaColuna);
        }
    }

    public static void encontrarRepetidos(int[][] matriz) {
        Map<Integer, Integer> contagem = new HashMap<>();
        for (int[] linha : matriz) {
            for (int num : linha) {
                contagem.put(num, contagem.getOrDefault(num, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vezes");
            }
        }
    }

    public static void calcularSomasDiagonais(int[][] matriz) {
        int somaPrincipal = 0;
        int somaSecundaria = 0;
        for (int i = 0; i < 5; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][4 - i];
        }
        System.out.println("Diagonal principal: " + somaPrincipal);
        System.out.println("Diagonal secundária: " + somaSecundaria);
    }

    public static void substituirPrimos(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (ehPrimo(matriz[i][j])) {
                    matriz[i][j] = -1;
                }
            }
        }
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1){
        return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
            }
        }
        return true;
    }