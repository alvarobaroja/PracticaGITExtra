package instituto;

public class Modulo {
	private int codigo;
	private String nombre;
	private String departamento;
	private int horas;
	
	//TODO PREGUNTA 1
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getCodigo() {
		return codigo;
	}
	
	@Override
	public String toString() {
		return "Modulo [codigo=" + codigo + ", nombre=" + nombre + ", departamento=" + departamento + ", horas=" + horas
				+ "]";
	}
	
	
	
	
}
