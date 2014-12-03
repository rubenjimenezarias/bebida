
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // limite de alcohol
    private int limite;
    // nivel alcohol
    private int nivel;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(int limite)
    {
        // initialise instance variables
        this.limite = limite;
        nivel = 0;
    }

    /**
     * Tomar una bebida
     */
    public void beber(Cubata copa)
    {
        // incrementa el nivel al tomar la copa
        if (limite > nivel + copa.cantidadAlcohol())
        {
            nivel = nivel + copa.cantidadAlcohol();
        }
        else
        {
            System.out.println("No quiero mas copas estoy ya borracho");
        }
    }
    
    /**
     * Comprobar nivel de alcohol
     */
    public void nivelAlcohol()
    {
         System.out.println("Estoy bebido " + nivel);
    }
    
     /**
     * Pregunta
     */
    public void pregunta(String pregunta)
    {
        if(pregunta.length()%2 == 0)
        {  
            System.out.println("Si");
        }
        else
        {
            System.out.println("Si");
        }
            
    }
}
