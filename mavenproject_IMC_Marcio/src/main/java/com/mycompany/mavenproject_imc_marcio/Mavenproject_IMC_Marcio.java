/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject_imc_marcio;

import java.util.Scanner;

/**
 *
 * @author m.intra
 */
public class Mavenproject_IMC_Marcio {

    public static void main(String[] args) {
        float imc;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o peso: ");
        float peso = ler.nextFloat();
        System.out.print("Digite a altura: ");
        float altura = ler.nextFloat();
        
        imc = peso/(altura*altura);
        
        if(imc < 18.8){
            System.out.println("Abaixo do peso");
        }
        else if(imc > 18.8 && imc <= 24.9){
            System.out.println("Peso normal");
        }
        else if(imc > 25.0 && imc <= 29.9){
            System.out.println("Excesso de peso");
        }
        else if(imc > 30.8 && imc <= 34.9){
            System.out.println("Obesidade classe I");
        }
        else if(imc > 35.0 && imc < 39.9){
            System.out.println("Obesidade classe II");
        }else{
            System.out.println("Obesidade classe III");
        }
    }
}
