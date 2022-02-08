import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        calendario.set(2020, 11, 7, 19, 20, 10); //año, mes, dia, hora, minuto, segundo
        Date fecha = calendario.getTime();
        System.out.println("Calendario = "+ fecha);
    }
}
