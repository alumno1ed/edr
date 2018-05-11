/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.util.Scanner;

/**
 *
 * @author Loren
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, resumen;
        int copias;

        //se crea el objeto peli1 utilizando el constructor con parámetros
        Film peli1 = new Film("Star Wars", "George Lucas","En una galaxia muy muy lejana...", 1, 0);
        //se crea el objeto peli2 utilizando el constructor por defecto
        Film peli2 = new Film();

        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce el resumen: ");
        resumen = sc.nextLine();
        System.out.print("Numero de copias totales: ");
        copias = sc.nextInt();

        //se asigna a peli2 los datos pedidos por teclado.
        
        peli2.title=titulo;
        peli2.summary=resumen;
        peli2.copies=copias;

        //se muestran por pantalla los datos del objeto peli1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Película 1:");
        System.out.println("Titulo: " + peli1.title);
        System.out.println("Resumen: " + peli1.summary);
        System.out.println("Copias: " + peli1.copies);
        System.out.println("Prestadas: " + peli1.getRented());
        System.out.println();

        //se realiza un alquiler de peli1. El método devuelve true si se ha podido
        //realizar el alquiler y false en caso contrario
        if (peli1.rent()) {
            System.out.println("Se ha alquilado la película " + peli1.title);
        } else {
            System.out.println("No quedan copias de la película " + peli1.title + " para alquilar");
        }

        //se realiza una devolución de peli1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (peli1.giveBack()) {
            System.out.println("Se ha devuelto la película " + peli1.title);
        } else {
            System.out.println("No hay copias de la película " + peli1.title+ " alquiladas");
        }

        //se realiza otro alquiler de peli1
        if (peli1.rent()) {
            System.out.println("Se ha alquilado la película " + peli1.title);
        } else {
            System.out.println("No quedan copias de la película " + peli1.title + " para alquilar");
        }

        //se realiza otro alquiler de peli1. En este caso no se podrá realizar ya que
        //solo hay una copia de esta película y ya está alquilada. Se mostrará por
        //pantalla el mensaje No quedan copias de la película…
        if (peli1.rent()) {
            System.out.println("Se ha alquilado la película " + peli1.title);
        } else {
            System.out.println("No quedan copias de la película " + peli1.title + " para alquilar");
        }
        //mostrar los datos del objeto peli1
        System.out.println("Película 1:");
        System.out.println("Titulo: " + peli1.title);
        System.out.println("Resumen: " + peli1.summary);
        System.out.println("Copias: " + peli1.copies);
        System.out.println("Alquiladas: " + peli1.getRented());
        System.out.println();

        //mostrar los datos del objeto peli2
        System.out.println("Película 2:");
        System.out.println("Titulo: " + peli2.title);
        System.out.println("Resumen: " + peli2.summary);
        System.out.println("Copias: " + peli2.copies);
        System.out.println("Alquiladas: " + peli2.getRented());
        System.out.println();
    }
    
}
