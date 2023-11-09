package biologia;
public abstract class serVivo {

    private int tipo;

    // Constructor
    public serVivo(int tipo) {
        this.tipo = tipo;
    }

    // Métodos abstractos (sin implementación)
    public abstract void respirar();
    public abstract void alimentacion();
    public abstract void reproduccion();
    public abstract void morir();
}