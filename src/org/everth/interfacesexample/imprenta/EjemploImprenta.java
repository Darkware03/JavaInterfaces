package org.everth.interfacesexample.imprenta;

import org.everth.interfacesexample.imprenta.modelo.*;
import static org.everth.interfacesexample.imprenta.modelo.Genero.*;
public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Jhon Doe", "Ing. Sistemas","Resumen laboral...");
        cv.addExpericencia("Java");
        cv.addExpericencia("MySQL");
        cv.addExpericencia("Spring Framework");
        cv.addExpericencia("Full Stack Dev");
        cv.addExpericencia("Angular");

        Libro libro = new Libro("Erich Gamma", "Patrones de sinseños: Elem. Resuables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Fascade"));

        Informe informe = new Informe("Martin Flower","James","Estudio sobre microservices");
        imprimir(cv);
        imprimir(informe);
        //da error al inicio ya que no aplica la herencia porque libro posee hojas mas no es una hoja, la solucion seria impelementar interfaces
        imprimir(libro);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
