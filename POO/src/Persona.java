
public class Persona {

	String nombre;
	int edad;
	//m�todos
	
	//m�todo constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre es:" +nombre);
		System.out.println("La edad es:" +edad);
		
	}
}
