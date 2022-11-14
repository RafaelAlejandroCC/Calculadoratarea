/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoratarea;

/**
 *
 * @author Rafael Alejandro
 */
public class ProyectoCalculadora {
    
    public static void main(String[] args){
        
        Calculadora miCalculadora = new Calculadora(10,2);
        
        int suma = miCalculadora.sumar();
        System.out.println("La suma es: " + suma);
        
        herenciacientifica CalculadoraC = new Cientifica(4,2);
        int resta = Cientifica.resta();
        System.out.println("La suma es: " + resta);
    }
    
}
