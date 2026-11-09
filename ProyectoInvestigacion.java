public class ProyectoInvestigacion implements Acreditable {
    private String codigo;
    private int horasAsignadas;

    public ProyectoInvestigacion(String codigo, int horasAsignadas) {
        this.codigo = codigo;
        this.horasAsignadas = horasAsignadas;
    }

    @Override
    public int obtenerHorasAcreditadas() {
        return horasAsignadas;
    }
}