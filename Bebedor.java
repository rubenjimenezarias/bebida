
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
    //limite muerte
    private int muerte;
    // muerto o no.
    private boolean muerto;
    //rechazo
    private boolean rechazo;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(int limite)
    {
        // initialise instance variables
        this.limite = limite;
        nivel = 0;
        rechazo = true;
    }
    
    /**
     * Constructor for objects of class Bebedor Borracho
     * NO RECHAZA LAS COPAS
     */
    public Bebedor(int limite, int muerte)
    {
        // initialise instance variables
        this.limite = limite;
        nivel = 0;
        this.muerte = muerte;
        rechazo = false;
    }

    /**
     * Tomar una bebida
     */
    public void beber(Cubata copa)
    {
        // incrementa el nivel al tomar la copa
        if (rechazo == true){
            if (limite > nivel)
            {
                nivel = nivel + copa.cantidadAlcohol();
            }
            else
            {
                System.out.println("No quiero mas copas estoy ya borracho");
            }
        }
        else {
            nivel = nivel + copa.cantidadAlcohol();
            if ( nivel > muerte && muerto==false ){
                muerto = true;
                System.out.println("ESTA PERSONA ACABA DE MORIR");
            }
            else {
                estaMuerto();
            }
        }
    }
    
    /**
     * Comprobar nivel de alcohol
     */
    public void nivelAlcohol()
    {
        if (muerto){
            estaMuerto();
        }
        else {    
            if (nivel > 0) 
            {
                System.out.println("Estoy bebido " + nivel);
            }
            else 
            { 
                System.out.println("No he bebido nada");
            }
        }
    }
    
     /**
     * Pregunta
     */
    public void pregunta(String pregunta)
    {
        if (muerto){
            estaMuerto();
        }
        else {
            if (nivel > limite)
            {
                System.out.println("Te grito " + pregunta.toUpperCase() + " ,ehh pero te estoy gritando!!");
            }
            else
            {
                if ((pregunta.length()%2) == 0)
                {  
                    System.out.println("Si");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }
    }
    /**
     * Metodo para revivir a la persona.
     */
    public void revivir()
    {
        muerto = false;
        System.out.println("OHH MILAGRO esta persona vuelve a respirar");
    }
    
    /**
     * Metodo para comprobar si esta muerto.
     */
    private void estaMuerto()
    {
        if (muerto){
            System.out.println("ESTA PERSONA ESTA MUERTA");
        }
    }
}
