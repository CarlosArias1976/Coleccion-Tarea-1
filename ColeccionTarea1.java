/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciontarea1;
import java.util.ArrayList;
import java.util.Collection;


/**
 *
 * @author carlo
 */
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("ESPE");
        System.out.println("SEDE LATACUNGA");
        System.out.println("PROGRAMACION");
        System.out.println("DOCENTE: ING LUIS GUERRA");
        System.out.println("ALUMNO: CARLOS ARIAS");
    Collection listadoElementosProyecto = new ArrayList<String>();// EL tipo de lista 
    //elementos utilizados en el proyecto0
    listadoElementosProyecto.add("Leds");
    listadoElementosProyecto.add("bateria 9V");
    listadoElementosProyecto.add("Potenciometro");
    listadoElementosProyecto.add("Resistencia1 350 ohms");
    listadoElementosProyecto.add("Resistencia2 450 ohms");
    listadoElementosProyecto.add("comparador");
    listadoElementosProyecto.add("manometro");
    listadoElementosProyecto.add("Sensor presion");
    listadoElementosProyecto.add("Protoboard");
    listadoElementosProyecto.add("cables de conexion protoboard");
System.out.println("Numero de elementos antes de ser eliminados:" + listadoElementosProyecto.size());
System.out.println("LOS ELEMENTOS DEL PROYECTO SON: ");
System.out.println(listadoElementosProyecto.toString());
    listadoElementosProyecto.remove("Leds");
    listadoElementosProyecto.remove("bateria 9V");
    listadoElementosProyecto.remove("Potenciometro");
    listadoElementosProyecto.remove("Resistencia 350 ohms");
    listadoElementosProyecto.remove("resistencia2 450 ohms");
    listadoElementosProyecto.remove("comparador");
       
System.out.println("Numero de elementos despues de ser eliminados Led, Ventilador, Potenciometro, Transistor, Resistencia, "
        + "\n Amplificador Operacional, Bateria, Sensor presion:"+ listadoElementosProyecto.size());
System.out.println("LOS ELEMENTOS DEL PROYECTO QUE NOS QUEDAN SON: ");
System.out.println(listadoElementosProyecto.toString());
 

    }
    
}
