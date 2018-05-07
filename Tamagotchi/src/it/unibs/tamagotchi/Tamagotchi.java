package it.unibs.tamagotchi;

public class Tamagotchi 
{
	   private final static int MAX_CAREZZE = 20;
	   private final static int MAX_BISCOTTI = 20; 
     
	   private final static int MAX_SAZIETA = 80;
	   private final static int MIN_SAZIETA = 30;
	   
	   
	   private final static int MIN_FELICITA = 30;
	   
       
	   private final static double MENO_CAREZZE = 0.5;
	   
	   private final static double MENO_BISCOTTI = 0.25;
	   private final static double PLUS_BISCOTTI = 10;
	   private final static double HUNDRED = 100.0;
	   private final static int ZERO = 0;
	   
	   
	   private final static String TAMADEAD = "Sono morto";
	   private final static String TAMATRISTE = "Sono Triste";
	   private static String TROPPECAREZZE= "troppe carezze, dammene di meno! ";
	   private static String TROPPOCIBO= "troppo cibo, dammene di meno! ";
	   
  private String nome;
  private int sazieta;
  private int felicita;
  
 public String getNome() 

 {
	return nome;
 }
 
 public void setNome(String name) 

 {
	this.nome = name;
 }
 
 public int getSazieta() 
 {
	return sazieta;
 }
 
 public void setSazieta(int sazieta) 
 {
	this.sazieta= sazieta;
 }

 public int getFelicita() 
 {
	return felicita;
 }
 
 public void setFelici(int felicita) 
 {
	this.felicita = felicita;
 }

 
 // costruttore
public Tamagotchi(String nome , int sazieta, int felicita)
{
	this.nome= nome;
	this.sazieta = sazieta;
	this.felicita = felicita;
}

/*
 * Se supera il massimo inserito richiede di inserire un nuovo valore idoneo
 * vero = dato coretto;
 * falso = data sbagliato;
 */

public boolean riceviBiscotti(int numBiscotti) 
{
	if (numBiscotti > MAX_BISCOTTI)
	{
		System.out.print(TROPPOCIBO);
		return false;
	}
	else
	{
	 double minus= (double)numBiscotti;
	 // diminuizione felicita
	 felicita = felicita -  (int)(((double)(numBiscotti)) * MENO_BISCOTTI );
	 //aummento sazieta
	 minus = (minus * PLUS_BISCOTTI) / HUNDRED;
	 sazieta = sazieta + (int)(minus) ;
     return true;		 
	}
	
}
/*
 * Se supera il massimo inserito richiede di inserire un nuovo valore idoneo
 * vero = dato coretto;
 * falso = data sbagliato;
 */
public boolean riceviCarezze(int numCarezze) 
{
	if(numCarezze > MAX_CAREZZE)
	 { 
	  System.out.print(TROPPECAREZZE);
	  return false;
	 }
	else 
	{
		if(felicita >= HUNDRED)return true; // blocco effetto aumento felicta se massimo
		else
		{
	     // doppio cast 1 lv double per poter fare la moltiplicazione -> int per la sottrazione -- minus sazieta
	     sazieta = sazieta - (int)(((double)(numCarezze)) * MENO_CAREZZE );
	     //aumento felicita
	     felicita = felicita + numCarezze;	
	     return true;
		}
	}
}

public boolean sonoMorto() 
{
	if(sazieta >= HUNDRED )// sazieta e maggiore di 100
	  {
		System.out.println(TAMADEAD);
	    return true;
	   }
	
	if(sazieta <= ZERO || felicita <= ZERO) // uno dei due e troppo basso
	{
	  System.out.println(TAMADEAD);
	  return true;
	}
	
	return false;
}

public boolean sonoTriste() 
{
	if (felicita < MIN_FELICITA)
	{
	  System.out.println(TAMATRISTE); 
	  return true;
	}
	
	if(sazieta < MIN_SAZIETA || sazieta > MAX_SAZIETA )
	{
	  System.out.println(TAMATRISTE); 
	  return true;
	}
 return false;
}



  public String toString()
   {
	return ( nome +":\nsazieta : "+ sazieta + "\nfelicita : " + felicita);
   }
}


