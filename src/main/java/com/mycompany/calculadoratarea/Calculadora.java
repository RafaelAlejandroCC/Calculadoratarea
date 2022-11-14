/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadoratarea;

/**
 *
 * @author Rafael Alejandro
 */
public class Calculadora {
    private int operando1;
    private int operando2;
    
    public Calculadora(){
    
}
public Calculadora(int operando1, int operando2){
    this.operando1 = operando1;
    this.operando2= operando2;
}
    
    public int sumar(){
        int suma = this.operando1 + this.operando2;
        return suma;
    }
    
    public int restar(){
        int resta = this.operando1 - this.operando2;
        return resta;
    }
    
    public int multiplicar(){
        int multiplicacion = this.operando1 * this.operando2;
        return multiplicacion;
    }
    
    public double dividir(){
        double division = (double)this.operando1 / (double)this.operando2;
        return division;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    int resta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int multiplicacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double division() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
