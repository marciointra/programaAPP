/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetomediamarcio;

import java.util.Scanner;

/**
 *
 * @author m.intra
 */
public class ProjetoMediaMarcio {

    public static void main(String[] args) {
        int [] notas = new int[3]; int media = 0;
        int [] frequencia = new int[3]; int mediaFrequencia = 0;
        Scanner ler = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
        System.out.print("Digite a "+(i+1)+"ª nota: ");
        int nota = ler.nextInt();
        System.out.print("Digite a "+(i+1)+"ª frequencia: ");
        frequencia[i] = ler.nextInt();
        
        notas[i] = nota;
        frequencia[i] = mediaFrequencia;
        }
        media = (notas[0]+notas[1]+notas[2])/3;
        mediaFrequencia = (frequencia[0]+frequencia[1]+frequencia[2])/3;
                
        if (media >= 7){
            System.out.println("A media do aluno foi: "+media+" aluno Aprovado");       
        }
        else if(media <= 5 && media < 7){
            System.out.println("A media do aluno foi: "+media+" aluno recuperação");
        }else{
            System.out.println("A media do aluno foi: "+media+" aluno reprovado");
        }
    }
}
