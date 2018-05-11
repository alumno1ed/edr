/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author Lorenzo
 */
public class Film {
    String title;
    String director;
    String summary;
    int copies;
    private int rented;

    //constructor por defecto
    public Film() {
    }

    //constructor con parámetros
    public Film(String title, String director, String summary, int copies, int rented) {
        this.title = title;
        this.director = director;
        this.summary = summary;
        this.copies = copies;
        this.rented = rented;
    }

    public int getRented() {
        return rented;
    }


    //método para alquilar una película
    public boolean rent() {
        boolean success = true;
        if (rented < copies) {
            rented++;
        } else {
            success = false;
        }
        return success;
    }

    //método para realizar la devolución de una película
    public boolean giveBack() {
        boolean success = true;
        if (rented == 0) {
            success = false;
        } else {
            rented--;
        }
        return success;
    }

    //método toString sobrescrito para mostrar los datos de la clase Film
    @Override
    public String toString() {
        return "Titulo: " + title + "\nResumen: " + summary +
                  "\nCopias : " + copies + "\nPrestadas: " + rented;
    }
   
}   
