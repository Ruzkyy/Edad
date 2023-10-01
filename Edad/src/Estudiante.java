import java.util.Date;

public class Estudiante {
    private String nombre;
    private Date fechaNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;
    public Estudiante(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public double getNotaMateria1() {
        return notaMateria1;
    }
    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }
    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }
    public double getNotaMateria3() {
        return notaMateria3;
    }
    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        Date fechaActual = new Date();
        long diferencia = fechaActual.getTime() - fechaNacimiento.getTime();
        long edadEnMillis = 31536000000L;
        return (int) (diferencia / edadEnMillis);
    }
    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
    }
}
//El código tiene una complejidad temporal constante, O(1).