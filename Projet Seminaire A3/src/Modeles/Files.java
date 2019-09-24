package Modeles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Files {
<<<<<<< HEAD
	public String getData(String path) {
		return path;
	}
	
	 public void setData(String path) {
		
	}
=======
	 	
	 	public String getData(String path) throws Exception
	 	{
	 		InputStream stream;
	 		stream = new FileInputStream(path);
	         StringBuilder reponse;
	         
	         reponse = new StringBuilder();
	 	
	 		for(int a = stream.read();a!=-1;a=stream.read())
	 		{
	 			reponse.append((char)a);
	 		}
	 		
	 		stream.close();
	 		return reponse.toString();
	 	}
	 	
	 	public void setData(String path, String texte) throws IOException
	 	{
	 		
	 		OutputStream stream;
	 		
	 		stream = new FileOutputStream(path);
	 		byte[] buffer = texte.getBytes();
	 		stream.write(buffer);
	 		stream.close();
	 		
	 	}

	 
>>>>>>> branch 'master' of https://github.com/Hakamate/ProjetSeminaire.git
}
