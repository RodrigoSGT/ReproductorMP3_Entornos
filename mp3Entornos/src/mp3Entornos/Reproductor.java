package mp3Entornos;

import java.util.ArrayList;

public class Reproductor {

	/**
	 * @author Rodrigo Sorando García de la Torre
	 * @version 1.0
	 */

	private String nombrePropietario;
	private String marca;
	private String modelo;
	private String fechaFabricacion;
	private ArrayList<ListaReproduccion> listas = new ArrayList<ListaReproduccion>();

	public Reproductor() {

	}

	public Reproductor(String nombrePropietario, String marca, String modelo, String fechaFabricacion) {

		this.nombrePropietario = nombrePropietario;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public ArrayList<ListaReproduccion> getListas() {
		return listas;
	}

	public void setListas(ArrayList<ListaReproduccion> listas) {
		this.listas = listas;
	}

	@Override
	public String toString() {
		return "Reproductor [nombrePropietario=" + nombrePropietario + ", marca=" + marca + ", modelo=" + modelo
				+ ", fechaFabricacion=" + fechaFabricacion + ", listas=" + listas + "]";
	}

	/**
	 * Metodo para imprimir por pantalla los nombres de las listas
	 */
	public void nombreListas() {

		System.out.println("Listas");

		for (int i = 0; i < listas.size(); i++) {
			System.out.println(listas.get(i).getNombre());
		}
	}

	/**
	 * Metodo para obtener el numero de listas que tenemos en el reproductor
	 * 
	 * @return tamaño de la lista
	 */
	public int numeroListas() {

		return listas.size();
	}

	/**
	 * Metodo para añadir listas de reproduccion al reproductor
	 * 
	 * @param lista
	 */
	public void addLista(ListaReproduccion lista) {

		listas.add(lista);

	}

	/**
	 * Metodo para simular la reproduccion
	 */
	public void playListas() {
		System.out.println("Reprodución en curso ");
	}
}
