package ejercicio13;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");

        JOptionPane.showMessageDialog(null,
                "Fecha y hora en formato (AAAA/MM/DD) (HH:MM:SS):\n" +
                        String.valueOf(formateador.format(fecha)));
    }
}
