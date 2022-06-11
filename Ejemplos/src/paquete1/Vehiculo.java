/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo (String tip, String ma, double val) {
        tipo = tip;
        matricula = ma;
        valor = val;
    }
    
    public void establecerTipo(String n) {
        tipo = n;
    }
    
    public void establecerMatricula(String n) {
        matricula = n;
    }
    
    public void establecerValor(double n) {
        valor = n;
    }
    
   public String obtenerTipo() {
       return tipo;
   }
   
   public String obtenerMatricula() {
       return matricula;
   }
   
   public double obtenerValor() {
       return valor;
   }
   
   @Override
    public String toString() {
       String cadena = String.format("Tipo de Vehiculo: %s\n"
               + "Matricula del Vehiculo: %s\n"
               + "Valor del Vehiculo: %.2f", tipo, matricula, valor);

       return cadena;
    }
}
