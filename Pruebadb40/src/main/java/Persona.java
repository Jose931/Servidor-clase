
public class Persona {
	private String nombre;
	private String apellido;
	private String sexo;
	public Persona(String noombre, String apellido, String sexo) {
		this.nombre = noombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String noombre) {
		this.nombre = noombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Persona [noombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + "]";
	}
	
	
	
	
}
