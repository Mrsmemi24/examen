public class Main {
    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos("Jorge", 150, 3500, "Alto");
        Produccion prod = new Produccion("Ivan", 152, 7560, "Matutino");
        Contabilidad cont = new Contabilidad("Pancho", 153, 5000, "Intermedio");
        SoporteTecnico soporte = new SoporteTecnico("Tizoc", 155, 10000, "Nivel 5");

        rh.mostrarDatos();
        prod.mostrarDatos();
        cont.mostrarDatos();
        soporte.mostrarDatos();
    }
}
