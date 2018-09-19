package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado [] misEmpleados = new Empleado[6];
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2001, 2, 1);
		
		jefe_RRHH.estableceIncentivo(2750);
		
		misEmpleados[0] = new Empleado("Ana", 30000, 2000, 7, 07);
		misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 5, 15);
		misEmpleados[2] = new Empleado("Paco", 25000, 1998, 9, 21);
		misEmpleados[3] = new Empleado("Antonio", 47000, 2004, 4, 8);
		misEmpleados[4] = jefe_RRHH;
		misEmpleados[5] = new Jefatura("Maria", 45000, 2005, 4, 19);
		
		Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];
		jefa_finanzas.estableceIncentivo(2000);
		
		//USAMOS EL METODO TOMARDECISIONES DE LA INTERFAZ JEFES
		System.out.println(jefa_finanzas.tomarDecisiones("Dar más dias de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_finanzas.dameNombre()
			+ " tiene un bonus de " + jefa_finanzas.estableceBonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de " 
				+ misEmpleados[3].estableceBonus(200));
		
		for (Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}
		
		//METODO DE LA INTERFAZ COMPARABLE PARA ORDENAR ARRAYS DE OBJETOS
		Arrays.sort(misEmpleados);
		
		
		for(Empleado e:misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " 
						+ e.dameSueldo() + " Fecha alta: " 
						+ e.dameFechaContrato());
		}
	}
}

//IMPLEMENTAMOS LA INTERFAZ COMPARABLE PARA PODER USAR ARRAYS.SORT
//TAMBIEN IMPLEMENTAMOS LA INTERFAZ TRABAJADORES PARA ESTABLECERLES UN BONUS
class Empleado implements Comparable,Trabajadores { 
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private short id;
	private static short idSiguiente;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes,dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id=idSiguiente;
	}
	
	public Empleado(String nom) {
		
		this(nom,30000,2000,1,1);
	}
	
	public String dameNombre() {
		return nombre + " Id :" + id;
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
	
	//IMPLEMENTAMOS EL METODO QUE NOS OBLIGA LA INTERFAZ TRABAJADORES
	public double estableceBonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	//METODO COMPARE TO QUE TENEMOS QUE CREAR POR OBLIGACION
	//AL IMPLEMENTAR LA INTERFAZ COMPARABLE EN LA CLASE EMPLEADO
	public int compareTo(Object miObjeto) { 
		
		Empleado otroEmpleado = (Empleado) miObjeto; //CASTEAMOS EL OBJETO RECIBIDO POR PARAMETRO A TIPO EMPLEADO
		
		if(this.id<otroEmpleado.id) {
			
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;		
	}
}

//IMPLEMENTAMOS LA INTERFAZ JEFES PARA OBLIGAR A CONSTRUIR EL METODO TOMAR DECISIONES
class Jefatura extends Empleado implements Jefes{
	
	double incentivo;
	
	
	public Jefatura(String nom, int sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe+incentivo;
	}
	
	//METODO QUE TENEMOS QUE DESARROLLAR POR IMPLEMENTAR LA INTERFAZ JEFES
	public String tomarDecisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decision de:  "  + decision;
	}
	
	//METODO QUE TENEMOS QUE DESARROLLAR PORQUE LA INTERFAZ JEFES EXTIENDE DE TRABAJADORES
	//QUE TIENE EL METODO ESTABLECE BONUS
	public double estableceBonus(double gratificacion) {
		
		double prima = 2000;
		return Trabajadores.bonus_base+prima+gratificacion;
	}
}
