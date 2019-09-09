import java.io.*;
class Lettura 
{
	/**
	 *Autore:Raffaele Lucci Data:11/10/2018
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		FileInputStream f=null;
		ObjectInputStream fIN=null;
		Citta p=null;
		try
		{
			f=new FileInputStream("Citta.dat");
			fIN=new ObjectInputStream(f);
		}
		catch(IOException e){}
		while(true)
		{
			try
			{
				p=(Citta) fIN.readObject();
				System.out.println("Citta: "+p.citta);
				System.out.println("Provincia: "+p.provincia);
				System.out.println("Numero abitanti: "+p.numeroabitanti);
				f.close();
			}
			catch(ClassNotFoundException e){}
		}
	}
}
