
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    // Nombre del cubata
    private String nombre;
    // nivel de alchol
    private int cantidadAlcohol;

    /**
     * Constructor for objects of class Cubata
     */
    public Cubata(String nombre, int cantidadAlcohol)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.cantidadAlcohol = cantidadAlcohol;
    }

     /**
     * Devuelve el nombre del cubata
     */
    public String nombre()
    {
        return nombre;
    }
    
      /**
     * Devuelve la cantidad de alcohol del cubata
     */
    public int cantidadAlcohol()
    {
        return cantidadAlcohol;
    }
}
