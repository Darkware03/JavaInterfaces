package org.everth.interfacesexample.imprenta.modelo;

import java.util.List;

// un libro puede obtener bastantes paginas y una pagina es una hoja
public class Pagina extends Hoja implements Imprimible{



    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
