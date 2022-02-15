package Taller_Java;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Programa que permite consultar la fecha y hora actual en formato (AAAA-MM-DD HH:MM:SS)
 */
public class _13FechaYhora {
    public void comprobar() {

        LocalDateTime ldt = LocalDateTime.now();
        LocalTime lt = LocalTime.now();
        System.out.println("Fecha y hora actual en formato Formato (AAAA-MM-DD HH:MM:SS) es:");
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ldt) + " " + DateTimeFormatter.ofPattern("HH:mm:ss").format(ldt));

    }
}
