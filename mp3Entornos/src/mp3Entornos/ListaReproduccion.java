package mp3Entornos;

import java.util.ArrayList;

public class ListaReproduccion {

	/**
	 * @author Rodrigo Sorando García de la Torre
	 * @version 1.0
	 */

	private String nombre;
	private String genero;
	private ArrayList<Cancion> canciones=new ArrayList<Cancion>();

	public ListaReproduccion() {

	}

	public ListaReproduccion(String nombre, String genero) {

		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	@Override
	public String toString() {
		return "ListaReproduccion [nombre=" + nombre + ", genero=" + genero + ", canciones=" + canciones + "]";
	}

	/**
	 * Metodo para devolver el numero de canciones de la lista de reproduccion
	 * 
	 * @return numero de canciones de la lista
	 */
	public int numeroCanciones() {

		return canciones.size();
	}

	/**
	 * Metodo para calcular el tiempo de duracion total en segundos de la lista de
	 * reproduccion
	 * 
	 * @return duracion total de la lista
	 */
	public int tiempoTotal() {
		int duracionTotal = 0;

		for (int i = 0; i < canciones.size(); i++) {

			duracionTotal = duracionTotal + canciones.get(i).getDuracion();
		}

		return duracionTotal;
	}

	/**
	 * Metodo para simular la reproduccion imprimiendo por pantalla el nombre de la
	 * lista de reproduccion
	 */
	public void playListas() {
		System.out.println("Reproduciendo la lista: " + nombre);
	}

	/**
	 * Metodo para imprimir por pantalla los nombres de las canciones de la lista
	 */
	public void nombreCanciones() {

		System.out.println("Canciones");

		for (int i = 0; i < canciones.size(); i++) {
			System.out.println(canciones.get(i).getTitulo());
		}
	}

	/**
	 * Metodo para añadir canciones a la lista de reproduccion
	 * 
	 * @param cancion
	 */
	public void addCancion(Cancion cancion) {

		canciones.add(cancion);

	}

}
