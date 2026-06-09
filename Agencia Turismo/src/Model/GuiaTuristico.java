package model;

public class GuiaTuristico extends Persona {

    private String especialidad;
    private int aniosExperiencia;

    public GuiaTuristico() {
    }

    public GuiaTuristico(String rut, String nombre, String telefono, String correo, Direccion direccion,
                         String especialidad, int aniosExperiencia) {
        super(rut, nombre, telefono, correo, direccion);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "GUÍA TURÍSTICO" +
                "\n" + super.toString() +
                "\nEspecialidad: " + especialidad +
                "\nAños de experiencia: " + aniosExperiencia;
    }
}