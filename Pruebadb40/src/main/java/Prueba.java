import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Prueba {

	static String DBPer = "DBPERsonas.yap";
	
	public static void main(String[] args) {
		
	
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DBPer);
		
		Persona p1 = new Persona ("Jose", "Hidalgo", "Hombre");
		Persona p2 = new Persona ("Carlota", "Martinez", "Mujer");
		Persona p3 = new Persona ("Carlos", "Fernandez", "Hombre");
		Persona p4 = new Persona ("Juana", "LaLoca", "Indefinido");
		
		db.store(p1);
		db.store(p2);
		db.store(p3);
		db.store(p4);
		
		db.close();
	}

}
