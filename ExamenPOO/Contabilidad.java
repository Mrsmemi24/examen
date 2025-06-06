public class Contabilidad extends Empleado {
    private String contrato;
    
    public Contabilidad(String nombre, int idEmpleado, double sueldo, String contrato) {
        super(nombre, idEmpleado, sueldo);
        this.contrato = contrato;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String turno) {
        this.contrato = contrato;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" | Area: CONTABILIDAD | Contrato: " + contrato);
    }
}
