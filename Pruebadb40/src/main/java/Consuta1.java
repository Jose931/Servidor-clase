import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;


public class Consuta1 {
	
	static String DBPer = "DBPersonas.yap";
	
	public static void main(String [] args) {
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DBPer);
		
		Persona per = new Persona(null, null, null);
		
		ObjectSet<Persona> result = db.queryByExample(per);
		
		if(result.size() == 0) {
			System.out.println("No existe ningun registro personas...");
		}else {
			System.out.printf("Numero de registros: %d %n", result.size());
			
			while(result.hasNext()) {
				Persona p = result.next();
				System.out.printf(" Nombre: %s, Apellido: %s, Sexo: %s", p.getNombre(), p.getApellido(), p.getSexo());
			}
		}
		
		Persona per1 = new Persona("Jose", null, null);
		
		ObjectSet<Persona> result1 = db.queryByExample(per1);
		
		if(result.size() == 0) {
			System.out.println("No existe ningun registro personas...");
		}else {
			Persona existe = (Persona) result1.next();
			existe.setApellido("Aresti");
			db.store(existe);
			
			result1= db.queryByExample(new Persona("Jose", null, null));
			existe = (Persona) result1.next();
			System.out.printf("Nombre: %s, Nuevo Apellido: %s, Sexo:  %s ", existe.getNombre(), existe.getApellido(), existe.getSexo());
		}
		
		db.close();
		
	}
	
}
