package it.unibs.tamagotchi;
import it.unibs.fp.mylib.InputDati;

public class Utility 
{
   private static String NUOVIBISCOTTI = "inserisci il numero di biscotti";
   private static String NUOVOFELICITA = "inserisci le carezze che vuoi dare";
   private static String NOMETAMAGOTCHI = "Inserisci un nome";
   
   private static String FAMETAMAGOTCHI = "Inserisci livello fame";
   private static String FELICITATAMAGOTCHI = "Inserisci livello felicita";
   private static int MIN_START = 0;
   private static int MAX_START = 20;
//   private int ripetizioniBiscotti=-1;
   
   //metodo crea tamagotchi
   public static Tamagotchi creaTamagotchi ()
   {
			 String nome ;
			 int fameIniziale;
			 int felicitaIniziale;
			 
			 nome = InputDati.leggiStringa(NOMETAMAGOTCHI);
			 
			 fameIniziale = InputDati.leggiIntero(FAMETAMAGOTCHI , MIN_START , MAX_START );
			 felicitaIniziale = InputDati.leggiIntero(FELICITATAMAGOTCHI, MIN_START , MAX_START);
			 
			  Tamagotchi newCavia = new Tamagotchi(nome, fameIniziale, felicitaIniziale);
			  
			  return newCavia;
    } 
  
   // aggiungi carezze 
   public static void dareCarezze(Tamagotchi cavia )
  {
	  cavia.riceviCarezze(InputDati.leggiIntero(NUOVOFELICITA));
	  
  }
    
  // aggiungi biscotti 
  public static void dareBiscotti(Tamagotchi cavia)
  {
	  cavia.riceviBiscotti(InputDati.leggiIntero(NUOVIBISCOTTI));
	  
  }
}
