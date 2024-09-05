package projetoSenai;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) throws IOException {
      Scanner ler = new Scanner(System.in);

      System.out.println("Digite a quantidade de elementos do seu vetor: ");
      int tamanhoVetor = ler.nextInt();

      int[] vetor = new int[tamanhoVetor];
      for (int i = 0; i < tamanhoVetor; i++) {
         System.out.println("Digite o " + (i + 1) + "º valor do elemento: ");
         vetor[i] = ler.nextInt();
      }

      System.out.println("Vetor[Índice] = Valor");
      for (int i = 0; i < vetor.length; i++) {
         System.out.println("Posição[" + i + "] = " + vetor[i]);
      }

      System.out.println("Escolha o operador aritmético (+, -, *, /):");
      String operador = ler.next();

      System.out.println("Escolha o primeiro índice do vetor:");
      int indice1 = ler.nextInt();

      System.out.println("Escolha o segundo índice do vetor:");
      int indice2 = ler.nextInt();

      try {
         int valor1 = vetor[indice1];
         int valor2 = vetor[indice2];

         int resultado = 0;
         switch (operador) {
            case "+":
               resultado = valor1 + valor2;
               break;
            case "-":
               resultado = valor1 - valor2;
               break;
            case "*":
               resultado = valor1 * valor2;
               break;
            case "/":
               if (valor1 != 0 && valor2 != 0) {
                  resultado = valor1 / valor2;
               } else {
                  System.out.println("Erro: Divisão por zero!");
                  return;
               }
               break;
            default:
               System.out.println("Operador inválido!");
               return;
         }

         System.out.println("Resultado da operação: " + resultado);

         // Armazenando o resultado em um segundo vetor
         int[] resultados = new int[tamanhoVetor];
         resultados[indice1] = resultado;
         System.out.println("Resultado armazenado na posição[" + indice1 + "] do vetor 'resultados'.");

         System.out.println("\nResultados[Índice] = Valor");
         for (int i = 0; i < resultados.length; i++) {
            System.out.println("Posição[" + i + "] = " + resultados[i]);
         }

      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Erro: Índices inválidos! Digite valores entre 0 e " + (vetor.length - 1) + " \n\t  " +e.getMessage());
      } catch (InputMismatchException e) {
         System.out.println("Erro: Entrada inválida! Digite um número inteiro." + e.getMessage());
      } catch (ArithmeticException e) {
         System.out.println("Erro: Você tentou realizar uma divisão usando 0 de um dos elementos do vetor! " +e.getMessage());
      }
   }
}
