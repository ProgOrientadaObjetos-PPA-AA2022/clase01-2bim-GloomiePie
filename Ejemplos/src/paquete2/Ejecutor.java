/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);
        
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        Edificio edf3 = new Edificio("Edifico sur");
        edf3.establecerCostos(10000);
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        
        Edificio [] lista_edificios = {edf1, edf2, edf3, edf4};
        
        double c = lista_edificios[2].obtenerCosto();
        //System.out.println(c);
        
        Vehiculo ve1 = new Vehiculo("Auto", "lbb0011" ,10000);
        Vehiculo ve2 = new Vehiculo("Camioneta", "lcb0011" ,20000);
        Vehiculo ve3 = new Vehiculo("Auto", "lbd0012" ,6000);
        Vehiculo ve4 = new Vehiculo("Camioneta", "lcc0011" ,10000);
        Vehiculo ve5 = new Vehiculo("Camioneta", "ldb0011" ,25000);
        
        Vehiculo [] lista_vehiculos = {ve1, ve2, ve3, ve4, ve5};
        
        // Crear un objeto de tipo Empresa:
        Empresa miEmpresa = new Empresa();
        
        //  Nombre: Empresa de Hojas
        miEmpresa.establecerNombre("Empresa de Hojas");
        
        //  Lista de edificio: edf1, edf2, edf3, edf4
        miEmpresa.establecerEdificios(lista_edificios);
        miEmpresa.establecerCostoBienesInmuebles();
        
        miEmpresa.establecerVehiculos(lista_vehiculos);
        miEmpresa.establecerCostoVehiculos();
        miEmpresa.establecerCostoTotalInmuebles();
        // Imprimir el costo de los bienes inmuebles de la empresa
        //System.out.printf("Costo: %.2f", miEmpresa.obtenerCostoBienesInmuebles());
        
        System.out.printf("%s", miEmpresa);
        
    }
}
