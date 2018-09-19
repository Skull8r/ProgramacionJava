package poo;

public interface Jefes extends Trabajadores{
	
	//NO ES NECESARIO USAR EL MODIFICADOR PUBLIC Y ABSTRACT,UN METODO DE INTERFAZ SIEMPRE ES AMBAS COSAS
	public abstract String tomarDecisiones(String decision);

}
