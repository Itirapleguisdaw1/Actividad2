package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String args[])
    {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean finDeJuego=false;  
        Integer Rondasjugadas = 0;    // Número de rondas jugadas
        Integer Exitosj1=p1.exitos;
        Integer ExitosJ2=p2.exitos;
        Integer empates = 0;
        String opcionJ1;
        String opcionJ2;
        final String Mensaje2 = "Jugador 1 GANA";
        final String Mensaje1 = "Jugador 2 GANA";
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas + " *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            opcionJ1=p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcionJ1 + "\t Jugador 1 - Partidas ganadas: " + Exitosj1);
            opcionJ2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionJ2 + "\t Jugador 2 - Partidas ganadas: " + Exitosj2);
            
            
			if((opcionJ1.equals("piedra")) && (opcionJ2.equals("papel")))
            {
				ExitosJ2 = ++p2.exitos;
            	System.out.println(Mensaje1);
                
            } else {
				
				if((opcionJ1.equals("papel")) && (opcionJ2.equals("piedra")))
				{
					Exitosj1 = ++p1.exitos;
				    System.out.println(Mensaje2);
				}
				else if((opcionJ1.equals("piedra")) && (opcionJ2.equals("tijeras")))
				{
					Exitosj1 = ++p1.exitos;
				    System.out.println(Mensaje2);
				}
				else if((opcionJ1.equals("tijeras")) && (opcionJ2.equals("piedra")))
				{
					ExitosJ2 = ++p2.exitos;
				    System.out.println(Mensaje1);
				}
				else if((opcionJ1.equals("tijeras")) && (opcionJ2.equals("papel")))
				{
					Exitosj1 = ++p1.exitos;
				    System.out.println(Mensaje2);
				}
				else if((opcionJ1.equals("papel")) && (opcionJ2.equals("tijeras")))
				{
					ExitosJ2 = ++p2.exitos;
				    System.out.println(Mensaje1);
				}
			}
            if(opcionJ1 == opcionJ2)
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            if((p1.exitos>=3)||(p2.exitos>=3))
            {
            	finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finDeJuego != true);
    }
}
/**
 *
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion = "";
        Integer c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion = ("piedra");
                break;
            case 1:
            	opcion = ("papel");
                break;
            case 2:
            	opcion = ("tijeras");
            default:
            	break;
        }
        return opcion;
    }
    public void setExitos() 
    {
        exitos++;
    }
    public int getExitos() 
    {
        return exitos;
    }
    
    int exitos;      // número de partidas ganadas
    int winTotal;
}
