package model;

public class Cliente extends Persona {

    private String tipoTour;
    private int cantidadViajeros;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String telefono, String correo, Direccion direccion,
                   String tipoTour, int cantidadViajeros) {
        super(rut, nombre, telefono, correo, direccion);
        this.tipoTour = tipoTour;
        this.cantidadViajeros = cantidadViajeros;
    }

    public String getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    public int getCantidadViajeros() {
        return cantidadViajeros;
    }

    public void setCantidadViajeros(int cantidadViajeros) {
        this.cantidadViajeros = cantidadViajeros;
    }

    @Override
    public String toString() {
        return "CLIENTE" +
                "\n" + super.toString() +
                "\nTipo de tour: " + tipoTour +
                "\nCantidad de viajeros: " + cantidadViajeros;
    }
}