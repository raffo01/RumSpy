import java.io.*;
class Scrittura 
{
	/**
	 * Autore:Raffaele Lucci Data:11/10/2018
	 */
	public static void main(String[] args) 
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(input);
		FileOutputStream f=null;
		ObjectOutputStream fOUT=null;
		String citta,provincia;
		int numeroabitanti=0,numero_citta = 0;
		Citta p=null;
		try
		{
			f=new FileOutputStream("Citta.dat",true);
			fOUT=new ObjectOutputStream(f);
		}
		catch(IOException e){System.out.println("Apertura canali file anadata male");}
		/*System.out.println("Quante citta devi inserire? ");
		try
		{
			String val=tastiera.readLine();
			numero_citta=Integer.parseInt(val);
		}*/
		catch(Exception e){}
				try
				{
					System.out.println("Inserisci citta");
					citta=tastiera.readLine();
					System.out.println("Inserisci provinicia");
					provincia=tastiera.readLine();
					System.out.println("Inserisci abitanti di "+citta);
					String val=tastiera.readLine();
					numeroabitanti=Integer.parseInt(val);
					fOUT.writeObject(p);
					fOUT.flush();
					p=new Citta(provincia,citta,numeroabitanti);
				}
				catch(IOException e)
				{
					System.out.println("Scrittura andata male");
				}
				try //Chiusura del file
				{ 
					f.close(); 
				}
				catch(Exception e){}
	}//Chiusura main
}//Chiusura classe
