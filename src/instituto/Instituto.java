package instituto;

public class Instituto {
	// TODO PREGUNTA 5
	private Modulo[] modulos;
		
	private Profesor[] profesores;
	
	public Modulo buscarModulo(int codigo) {
		// TODO PREGUNTA 6
		return null;
	}
	
	public Profesor buscarProfesor(String dni) {
		// TODO PREGUNTA 6
		return null;
	}
	
	public void asignarModulo(int codigo, String dni) {
		// TODO PREGUNTA 7
		
	}
	
	public void borrarModulo(int codigo, String dni) {
		Profesor profesor=buscarProfesor(dni);
		profesor.borrarModulo(codigo);		
	}
	
	
	public Profesor buscarProfesorMismoDepHorasLibres(String dni, int codigo) {
		//TODO PREGUNTA 8
		return null;		
	}
	
	public void ordenarProfesores() {
		//TODO PREGUNTA 9	
	}

	
}
