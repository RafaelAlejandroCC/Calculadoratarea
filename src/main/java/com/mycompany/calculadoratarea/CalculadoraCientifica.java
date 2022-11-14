/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoratarea;

/**
 *
 * @author Rafael Alejandro
 */
public class CalculadoraCientifica {
  private int operando1;
    private int operando2;
    
    public CalculadoraCientifica(){
    
}
public CalculadoraCientifica(int operando1, int operando2){
    this.operando1 = operando1;
    this.operando2= operando2;
}
    
    public int RaizCuadrada(){
        int Raiz = this.operando1 ^ this.operando2;
        return Raiz;
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
    
    
}