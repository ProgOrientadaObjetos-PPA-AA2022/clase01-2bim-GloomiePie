/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import java.util.Scanner;
import Herencia1.EstudianteDistancia;
import java.util.Locale;
import Herencia1.EstudiantePresencial;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        EstudianteDistancia e1 = new EstudianteDistancia();
        EstudiantePresencial e2 = new EstudiantePresencial();

        System.out.println("Elija una opcion: ");
        System.out.println("1) Estudiante a distancia: ");
        System.out.println("2) Estudiante presencial: ");
        int n = sc.nextInt();

        if (n > 2 || n < 1) {
            System.out.println("opcion fuera de rango fuera de rango");

        } else {
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese la identificacion: ");
            String ced = sc.nextLine();
            System.out.println("Ingrese la edad: ");
            int edad = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Ingrese numero de asignaturas: ");
                    int asig = sc.nextInt();

                    System.out.println("Ingrese el costo de asignatura: ");
                    double costo = sc.nextDouble();

                    e1.establecerNumeroAsginaturas(asig);
                    e1.establecerCostoAsignatura(costo);
                    e1.calcularMatriculaDistancia();
                    e1.establecerNombresEstudiante(nombre);
                    e1.establecerApellidoEstudiante(apellido);
                    e1.establecerIdentificacionEstudiante(ced);
                    e1.establecerEdadEstudiante(edad);

                    System.out.printf("%s\n", e1);

                    break;
                case 2:
                    System.out.println("Ingrese numero de creditos: ");
                    int creditos = sc.nextInt();

                    System.out.println("Ingrese el costo de creditos: ");
                    costo = sc.nextDouble();

                    e2.establecerNumeroCreditos(creditos);
                    e2.establecerCostoCredito(costo);
                    e2.calcularMatriculaPresencial();
                    e2.establecerNombresEstudiante(nombre);
                    e2.establecerApellidoEstudiante(apellido);
                    e2.establecerIdentificacionEstudiante(ced);
                    e2.establecerEdadEstudiante(edad);

                    System.out.printf("%s\n", e2);

                    break;
            }
        }

    }

}
