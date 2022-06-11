/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;
import java.util.Scanner;
import Herencia1.EstudianteDistancia;
import java.util.Locale;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        EstudianteDistancia e1 = new EstudianteDistancia();
        
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la identificacion: ");
        String ced = sc.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese numero de asignaturas: ");
        int asig = sc.nextInt();
        System.out.println("Ingrese el costo de asignatura: ");
        double costo = sc.nextDouble();
        
        e1.establecerNombresEstudiante(nombre);
        e1.establecerApellidoEstudiante(apellido);
        e1.establecerIdentificacionEstudiante(ced);
        e1.establecerEdadEstudiante(edad);
        e1.establecerNumeroAsginaturas(asig);
        e1.establecerCostoAsignatura(costo);
        e1.calcularMatriculaDistancia();
        
        System.out.printf("%s\n" , e1);
    }
    
}
