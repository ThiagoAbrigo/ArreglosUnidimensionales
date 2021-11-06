/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Person;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class ControllerPerson {
    private ArrayList<Person> listaperson= new ArrayList<Person>();

    public void agregarperson(Person p){
        listaperson.add(p);
    }
    public int tamanio(){
        return listaperson.size();
    }
    public Person obtener(int ubicacion){
        return listaperson.get(ubicacion);
    }
    public ArrayList mostrar(){
        return listaperson;
    }
    public void guardarTxt(Person lista){
        try {
            FileWriter fw = new FileWriter("ListadoPersonas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print("\nNombre: "+lista.getName());
            pw.print("\nGenero: "+lista.getGenero());
            pw.print("\nEdad: "+lista.getFechaNacimiento());
            pw.print("\nEtapa: "+lista.getEdad());
            pw.print("\n===========================");
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public String etapasEdad(int edad){
        String years= null;
        if (edad <= 15) {
            years = "ninio";
        } if (edad > 15 && edad <= 20) {
            years = "Joven";
        }if (edad > 20 && edad <= 50) {
            years = "Adulto";
        }if (edad > 50 && edad <= 100) {
            years = "Tercera Edad";
        }
        return years;
    }
    public String alimentos(int edad){
        String years= null;
        if (edad <= 15) {
            years = "Esta es la siguiente Dieta: "
                    + " 1.Pan, arroz, papas y pasta."
                    + " 2.Frutas y verduras."
                    + " 3.Carne, pescado, huevos, frijoles."
                    + " 4.Leche, queso y yogurt.";
        } if (edad > 15 && edad <= 20) {
            years = "Esta es la siguiente Dieta: "
                    + " 1.Comer frutas y vegetales como bocadillos. "
                    + " 2.Disminuir el uso de manteca y salsas pesadas. "
                    + " 3.Comer más pollo y pescado.";
        }if (edad > 20 && edad <= 50) {
            years = "Esta es la siguiente Dieta: "
                    + " 1.Ensalada de verduras."
                    + " 2.Pescado o carne con papas y arroz."
                    + " 3.Fruta";
        }if (edad > 50 && edad <= 100) {
            years = "Esta es la siguiente Dieta: "
                    + " 1.Granos integrales, como avena."
                    + " 2.Pan integral y arroz integral. "
                    + " 3.Leche descremada y queso bajo en calorías. "
                    + " 4.Vitamina D y calcio.";
        }
        return years;
    }
}
