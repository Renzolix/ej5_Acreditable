public class CursoExtension implements Acreditable {
    private String nombre;
    private int duracionSemanas;

    public CursoExtension(String nombre, int duracionSemanas) {
        this.nombre = nombre;
        this.duracionSemanas = duracionSemanas;
    }

    @Override
    public int obtenerHorasAcreditadas() {
        return duracionSemanas * 5; // 5 horas semanales
    }
}