package org.everth.interfacesexample.imprenta.modelo;

import java.util.List;

//interfaces, un libro no es una hoja pero contiene hoja, entonces creamos la clase pagina para libro
public class Libro {

    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Hoja pag:this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
