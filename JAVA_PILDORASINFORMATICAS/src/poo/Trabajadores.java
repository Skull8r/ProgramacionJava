package poo;

public interface Trabajadores {
	
	//SON PUBLICAS,ESTATICAS Y FINAL POR DEFECTO, NO HACE FALTA PONERLO
	public static final double bonus_base = 1500;

	public abstract double estableceBonus(double gratificacion);
}
