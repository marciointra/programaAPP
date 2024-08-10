/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject_medalhas_marcio;

import java.util.Scanner;

/**
 *
 * @author m.intra
 */
public class Mavenproject_Medalhas_Marcio {

    public static void main(String[] args) {
       int somaMedalhas=0;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a quantidade de medalhas de ouro: ");
        int medalhaOuro = ler.nextInt();
        System.out.print("Digite a quantidade de medalhas de prata: ");
        int medalhaPrata = ler.nextInt();
        System.out.print("Digite a quantidade de medalhas de bronze: ");
        int medalhaBronze = ler.nextInt();
        
        if(medalhaOuro >= 10){
            System.out.println("Otimo desempenho");
        }
        else if(medalhaOuro >= 5 && medalhaOuro < 10){
            System.out.println("bom desempenho");
        }
        else if(medalhaOuro <= 5 || somaMedalhas < 20 && somaMedalhas < 30){
            System.out.println("Desempenho regular");
        }
        else if(medalhaOuro < 5 || somaMedalhas <= 30){
            System.out.println("Desempenho estraordinario");
        }
        else if(somaMedalhas < 20){
            System.out.println("Desempenho fraco");
        }
    }
}
