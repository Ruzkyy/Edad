import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


        Date fechaNacimiento = dateFormat.parse("10/05/2000");


        Estudiante estudiante = new Estudiante("Juan Perez", fechaNacimiento);


        estudiante.setNotaMateria1(8.5);
        estudiante.setNotaMateria2(7.0);
        estudiante.setNotaMateria3(9.2);

        // Obtener la edad y el promedio
        int edad = estudiante.getEdad();
        double promedio = estudiante.getPromedio();

        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Edad del estudiante: " + edad + " años");
        System.out.println("Promedio de notas: " + promedio);
    }
}
    //El código tiene una complejidad temporal constante, O(1).