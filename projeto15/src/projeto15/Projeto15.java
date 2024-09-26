/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author m.intra
 */
public class Projeto15 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        String arquivo = "tabuada";
        Date data = new Date();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero para a posicao " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        FileWriter arquivar = new FileWriter("C:\\Users\\m.intra\\Documents\\Marcio\\" + arquivo + ".txt");
        PrintWriter gravar = new PrintWriter(arquivar);

        for (int i = 0; i < numeros.length; i++) {
            gravar.print("Tabuada do " + numeros[i] + " | " + data + "\n");

            for (int j = 1; j <= 10; j++) {
                gravar.print(numeros[i] + " x " + j + " = " + (numeros[i] * j) + "\n");
            }
            gravar.print("Tabuada do " + numeros[i] + " salva no arquivo " + arquivo + "\n");
        }
        gravar.close();
        scanner.close();
    }
}
