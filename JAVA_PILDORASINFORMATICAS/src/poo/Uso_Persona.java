package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Persona misPersonas[] = new Persona[2];
			misPersonas[0] = new Empleado2("Luis Conde", 50000, 1999, 2, 15);
			misPersonas[1] = new Alumno("Antonio García", "Filosofía");
			
			for(Persona p:misPersonas) {
				System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
			
			}
		}
}

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nom) {
		
		nombre=nom;		
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
}

class Empleado2 extends Persona {
		
		
		private double sueldo;
		private Date altaContrato;
		private short id;
		private static short idSiguiente;
		
		public Empleado2(String nom, double sue, int agno, int mes, int dia) {
			
			super(nom);//LLAMAMOS AL CONSTRUCTOR DE LA CLASE PADRE O SUPERCLASE
			sueldo=sue;
			GregorianCalendar calendario = new GregorianCalendar(agno,mes,dia);
			altaContrato = calendario.getTime();
			++idSiguiente;
			id=idSiguiente;
		}
		
		public String dameDescripcion() {
			return "Este empleado tiene un id= " + id + " con un sueldo = " + sueldo;
		}
		
		public double dameSueldo() {
			return sueldo;
		}
		
		public Date dameFechaContrato() {
			return altaContrato;
		}
		
		public void subeSueldo(double porcentaje) {
			
			double aumento = sueldo*porcentaje/100;
			sueldo+=aumento;
		}	
	}

class Alumno extends Persona{
	
	private String carrera;
	
	public  Alumno(String nombre, String carrera) {
		
		super(nombre);
		this.carrera=carrera;
	}
	
	public String dameDescripcion() {
		return "Este alumno estudia la carrera de " + carrera; 
	}
	
}


