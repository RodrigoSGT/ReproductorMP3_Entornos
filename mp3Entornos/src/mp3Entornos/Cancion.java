package mp3Entornos;

public class Cancion {

	/**
	 * @author Rodrigo Sorando García de la Torre
	 * @version 1.0
	 */

	private int duracion;
	private String titulo;
	private String artista;
	private int fecha;

	public Cancion() {

	}

	public Cancion(int duracion, String titulo, String artista, int fecha) {

		this.duracion = duracion;
		this.titulo = titulo;
		this.artista = artista;
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Cancion [duracion=" + duracion + ", titulo=" + titulo + ", artista=" + artista + ", fecha=" + fecha
				+ "]";
	}

	/**
	 * Metodo para comenzar a reproducir la cancion
	 * 
	 * @return titulo de la cancion
	 */
	public String play() {

		System.out.println("Reproduciendo la canción: " + titulo);

		return titulo; // Solicitud de Antino Otero
	}

	/**
	 * Metodo para detener la reproducion
	 */
	public void stop() {

		System.out.println("Deteniendo la canción: " + titulo);
	}

	/**
	 * Metodo para ir a un segundo concreto de la cancion
	 * 
	 * @deprecated
	 * @param segundo
	 */
	public void irA(int segundo) {

	}

}