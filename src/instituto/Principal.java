package instituto;

import java.util.Scanner;

public class Principal {
	
	private static Instituto instituto=new Instituto();
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String menu="1-Rellenar horario de profesor\n"+
				"2-Reasignar módulo a un profesor\n"+
				"3-Ordenar profesores\n"+
				"-1-Salir\n";
		int opcion=0;
		String dni="";
		int codigo=0;
		do {
			System.out.println(menu);
			System.out.println("Introduzca opcion:");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduce dni profesor:");
				dni=sc.next();
				System.out.println("Introduce codigo modulo");
				codigo=sc.nextInt();
				rellenarHorarioProfesor(dni,codigo);
				break;
			case 2:
				System.out.println("Introduce dni profesor:");
				dni=sc.next();
				System.out.println("Introduce codigo modulo");
				codigo=sc.nextInt();
				reasignarModulo(dni,codigo);
				break;
			case 3:
				ordenarProfesores();
				break;
			case -1:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
		} while(opcion!=-1);	
		sc.close();
	}
	
	private static void rellenarHorarioProfesor(String dni, int codigo) {
		Profesor profesor=instituto.buscarProfesor(dni);
		Modulo modulo=instituto.buscarModulo(codigo);
		profesor.altaModulo(modulo);
		
	}
	
	private static void reasignarModulo(String dni, int codigo) {
		// TODO PREGUNTA 10
	}
	
	private static void ordenarProfesores() {
		instituto.ordenarProfesores();
	}

}

