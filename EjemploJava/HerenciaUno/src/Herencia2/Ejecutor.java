/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import Herencia1.EstudiantePresencial;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args){
        
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("Pablo");
        e1.establecerApellidoEstudiante("Reyes Mosquera");
        e1.establecerIdentificacionEstudiante("1105964694");
        e1.establecerEdadEstudiante(18);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        
        System.out.printf("Nombre: %s\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de creditos: %d\n"
                + "Costo de creditos: %.2f\n"
                + "Costo total: %.2f\n", e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(), e1.obtenerIdentificacionEstudiante(),
                e1.obtenerEdadEstudiante(), e1.obtenerNumeroCreditos(), e1.obtenerCostoCredito(),
                e1.obtenerMatriculaPresencial());
        
    }
    
}
