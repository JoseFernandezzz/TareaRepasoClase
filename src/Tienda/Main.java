package Tienda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    TiendaMascotas tiendaMascotas = new TiendaMascotas();

    tiendaMascotas.agregarMascota("Marta",20,"Perro");
    tiendaMascotas.agregarMascota("Juan",12,"Zorro");
    tiendaMascotas.agregarMascota("Paco",23,"Toro");

    tiendaMascotas.venderMascota("Juan");

    tiendaMascotas.mostrarMascotas();


    }
}
