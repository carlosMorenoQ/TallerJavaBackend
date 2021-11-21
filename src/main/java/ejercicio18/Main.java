package ejercicio18;

import ejercicio18.codigo.Serie;
import ejercicio18.codigo.Videojuego;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        //Creacion de series
        series[0] = new Serie();
        series[1] = new Serie("Fin del mundo", "carlox");
        series[2] = new Serie("Los huesos", "terror", "carloy", 5, false);
        series[3] = new Serie("Los huesos2", "suspenso", "carlow", 40, false);
        series[4] = new Serie("Los huesos3", "comedia", "carlov", 4, false);

        //Creacion de videojuegos
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego();
        videojuegos[2] = new Videojuego("halo", 200);
        videojuegos[3] = new Videojuego("soccer", 130);
        videojuegos[4] = new Videojuego("tiempos de guerra", 310);

        //setear entregas
        series[1].entregar();
        series[2].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();

        datosEntregados(
                Arrays.stream(series).filter(Serie::isEntregado).toList(),
                Arrays.stream(videojuegos).filter(Videojuego::isEntregado).toList());

        videojuegoConMasHoras(videojuegos);
        serieConMasTemporadas(series);
    }

    private static void datosEntregados(List<Serie> series, List<Videojuego> videojuegos) {
        System.out.println("Cantidad series entregadas= " + series.size() + "");
        series.forEach(System.out::println);

        System.out.println("\nCantidad videojuegos entregados= " + videojuegos.size() + "");
        videojuegos.forEach(System.out::println);
    }

    private static void videojuegoConMasHoras(Videojuego[] videojuegos) {
        List<Videojuego> videojuegos2 = new ArrayList<>(Arrays.asList(videojuegos));
        Collections.sort(videojuegos2);
        System.out.println("\nVideojuego con mas horas: \n" +
                videojuegos2.get(0) + "");
    }

    private static void serieConMasTemporadas(Serie[] series) {
        List<Serie> series2 = new ArrayList<>(Arrays.asList(series));
        Collections.sort(series2);
        System.out.println("\nSerie con mas temporadas: \n" +
                series2.get(0) + "");
    }


}
