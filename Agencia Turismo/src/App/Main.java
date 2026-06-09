package app;

import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion direccionCliente1 = new Direccion(
                "Calle Los Volcanes",
                "125",
                "Llanquihue",
                "Región de Los Lagos"
        );

        Direccion direccionCliente2 = new Direccion(
                "Avenida Costanera",
                "450",
                "Puerto Varas",
                "Región de Los Lagos"
        );

        Direccion direccionGuia1 = new Direccion(
                "Camino al Lago",
                "88",
                "Frutillar",
                "Región de Los Lagos"
        );

        Cliente cliente1 = new Cliente(
                "12.345.678-9",
                "María González",
                "+56 9 1111 2222",
                "maria.gonzalez@email.com",
                direccionCliente1,
                "Ruta gastronómica",
                4
        );

        Cliente cliente2 = new Cliente(
                "15.987.654-3",
                "Carlos Muñoz",
                "+56 9 3333 4444",
                "carlos.munoz@email.com",
                direccionCliente2,
                "Paseo lacustre",
                2
        );

        GuiaTuristico guia1 = new GuiaTuristico(
                "10.222.333-4",
                "Ana Soto",
                "+56 9 5555 6666",
                "ana.soto@agenciaturismo.cl",
                direccionGuia1,
                "Excursiones culturales",
                8
        );

        System.out.println("=== SISTEMA AGENCIA TURISMO ===\n");

        System.out.println(cliente1);
        System.out.println("------------------------------");

        System.out.println(cliente2);
        System.out.println("------------------------------");

        System.out.println(guia1);
        System.out.println("------------------------------");
    }
}