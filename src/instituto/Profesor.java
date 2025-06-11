package instituto;

import java.util.ArrayList;


public class Profesor {
	private String dni;
	private String nombre;
	private String departamento;
	private int numMaxHorasLectivas;
	private ArrayList<Modulo> modulos;
		
	public Profesor(String dni,
			String nombre, 
			String departamento,
			int numMaxHorasLectivas) {
		this.dni=dni;
		this.nombre=nombre;
		this.departamento=departamento;
		this.numMaxHorasLectivas=numMaxHorasLectivas;
		modulos=new ArrayList<>();
	}
	
	
	public int horasAsignadas() {
		//TODO PREGUNTA 2
		return 0;
	}
	
	public void altaModulo(Modulo modulo) {
		if (horasAsignadas()+modulo.getHoras()<=numMaxHorasLectivas) {
			modulos.add(modulo);
		}
		else {
			System.out.println("El profesor se pasa de las permitidas");
		}
	}
	
	public void borrarModulo(int codigo) {
		//TODO PREGUNTA 3		
	}

	public int getNumMaxHorasLectivas() {
		return numMaxHorasLectivas;
	}

	public void setNumMaxHorasLectivas(int numMaxHorasLectivas) {
		this.numMaxHorasLectivas = numMaxHorasLectivas;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", departamento=" + departamento
				+ ", numMaxHorasLectivas=" + numMaxHorasLectivas + ", modulos=" + modulos + "]";
	}
	
	
	
}
