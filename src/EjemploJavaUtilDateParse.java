import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");

        try {
            Date fecha = format.parse("2022-01-07");
            System.out.println("fecha = "+ fecha);
            System.out.println("fecha = "+ format.format(fecha));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
