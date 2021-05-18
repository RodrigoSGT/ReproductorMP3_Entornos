package mp3Entornos;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * @author Rodrigo Sorando García de la Torre
		 * @version 1.0
		 */

		Cancion cancion1 = new Cancion(225, "La macarena", "Los del Río", 1993);
		Cancion cancion2 = new Cancion(233, "Paquito el Chocolatero", "King África", 2005);
		Cancion cancion3 = new Cancion(401, "Tractores, cosechadoras, tres o cuatro empacadoras...", "Desconocido",
				2002);
		Cancion cancion4 = new Cancion(451, "Fiesta pagana", "Mago de Oz", 2000);
		Cancion cancion5 = new Cancion(440, "El vals del obrero", "Ska-P", 1996);

		ListaReproduccion fiestasPueblo = new ListaReproduccion("Fiestas pueblo", "Popular");
		ListaReproduccion fiestasPueblo2 = new ListaReproduccion("Fiestas pueblo mix", "Rock");

		fiestasPueblo.addCancion(cancion1);
		fiestasPueblo.addCancion(cancion2);
		fiestasPueblo.addCancion(cancion3);

		fiestasPueblo2.addCancion(cancion4);
		fiestasPueblo2.addCancion(cancion5);

		Reproductor miMp3 = new Reproductor("Jose", "Apple", "Nisu", "2002-04-25");

		miMp3.addLista(fiestasPueblo);
		miMp3.addLista(fiestasPueblo2);

		// Numero total de listas en el reproductor
		miMp3.numeroListas();

		// Numero de canciones en la lista
		fiestasPueblo.numeroCanciones();
		
		// Tiempo total de las canciones en una lista
		

		// Play (simulado, manda un Sysout por terminal)
		cancion1.play();

		// Stop (simulado, manda un Sysout por terminal)
		cancion2.stop();

		// Reproducir todas las canciones de una lista. (simulado, manda un Sysout por
		// terminal)
		fiestasPueblo2.playListas();

		// Reproducir canciones de todas las listas. (simulado, manda un Sysout por
		// terminal)
		miMp3.playListas();

		// Nombre de todas las listas que contiene el reproductor
		miMp3.nombreListas();

		// Nombre de todas las canciones que contiene una lista
		fiestasPueblo2.nombreCanciones();

	}

}
