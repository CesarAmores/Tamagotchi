package it.unibs.tamagotchi;

import it.unibs.fp.mylib.MyMenu;

public class TamagotchiMain 
{ 
	  private static String[] MENU = { "dare biscotti", "dare carezze"};
	  private static String SALUTO = "Ciao crea un tamagotchi\n"; 
	 private final static int HUNDRED = 100; 
	  
  
	 
	
	public static void main(String[] args) 
	{
		
		System.out.print(SALUTO);
        MyMenu menu = new MyMenu("Tamagotchi",MENU);
		
		 Tamagotchi cavia = Utility.creaTamagotchi();
		
		 int scelta = -1;
		// menu.stampaMenu();
		do
		 {
			scelta = menu.scegli();
			switch (scelta) 
			{
			   case(1):
				   {
				    Utility.dareBiscotti(cavia);
				    System.out.println(cavia.toString());
				    
				    break;
				    }
			   
			   
			   case(2):
				   {
				    Utility.dareCarezze(cavia);
				    System.out.println(cavia.toString());
				    break;
				   }
			   
			   case(0) : cavia.setSazieta(HUNDRED);
			             break;
			}
         }while(cavia.sonoMorto()== false);
    }
}

