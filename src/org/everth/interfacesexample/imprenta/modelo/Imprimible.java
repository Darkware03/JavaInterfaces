package org.everth.interfacesexample.imprenta.modelo;

//un metodo de interfaz siempre tiene que ser publico o default ya que debe ser utilizada por las demas clases
public interface Imprimible {
    //obliga a implementar
    public String imprimir();
    /* no obliga e imprime por defecto ya que no es necesario sobreescribirlo o hacer implementacion propia porque no es obligacion
    default String imprimir(){
      return "imprimiendo valor por defecto";
      }
     */
}
