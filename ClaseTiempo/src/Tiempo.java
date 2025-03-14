public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public Tiempo(int hora, int minuto) {
        this(hora, minuto, 0);  // Llama al constructor principal
    }
    public Tiempo(int hora) {
        this(hora, 0, 0);  // Llama al constructor principal
    }


    public void setHora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Mostrar la hora
    public void mostrarTiempo() {
        System.out.println("Hora actual: " + hora + ":" + minuto + ":" + segundo);
    }

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(10, 30, 45);
        t1.mostrarTiempo();

        Tiempo t2 = new Tiempo(5, 15);
        t2.mostrarTiempo();

        Tiempo t3 = new Tiempo(2);
        t3.mostrarTiempo();
    }
}
