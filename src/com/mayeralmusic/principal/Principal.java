import com.mayeralmusic.calculos.MeGusta;
import com.mayeralmusic.modelos.Audio;
import com.mayeralmusic.modelos.Cancion;
import com.mayeralmusic.modelos.Podcast;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("La Gasolina");
        miCancion.setDuracion(4);
        miCancion.setTotalDeReproducciones(1000);
        miCancion.setArtista("Daddy Yankee");
        miCancion.setAlbum("El Segundo");
        miCancion.muestraFichaTecnica();
        System.out.println("Cantante: " + miCancion.getArtista() + " con su album: " + miCancion.getAlbum());

        Podcast podcast = new Podcast();
        podcast.setTitulo("Ya casi Venezuela! ");
        podcast.setPresentador("Jayme Baily ");
        podcast.setDescripcion("Venezuela libre, Erick prince se dirige hacia maduro. ");
        podcast.setDuracion(20);
        podcast.setTotalDeReproducciones(100);
        podcast.muestraFichaTecnica();
        System.out.println();


    }
}
