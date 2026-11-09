public class MainEjercicio5 {
    public static void main(String[] args) {
        Acreditable curso = new CursoExtension("Taller de Spring Boot", 8);
        Acreditable proyecto = new ProyectoInvestigacion("INV-UNCUYO-2026", 120);

        System.out.println("Horas acreditadas por Curso de Extensión: " + curso.obtenerHorasAcreditadas() + " hs.");
        System.out.println("Horas acreditadas por Proyecto de Investigación: " + proyecto.obtenerHorasAcreditadas() + " hs.");
    }
}