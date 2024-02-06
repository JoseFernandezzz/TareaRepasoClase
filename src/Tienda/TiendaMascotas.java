package Tienda;

public class TiendaMascotas {
    Mascota[] inventario;
    int numeroMascotas;
    public TiendaMascotas(){
        inventario = new  Mascota[100];
        numeroMascotas = 0;
    }

    public void agregarMascota(String nombre, int edad, String tipoDeMascota){

        Mascota mascota = new Mascota(nombre, edad, tipoDeMascota);
        inventario[numeroMascotas]= mascota;
        numeroMascotas++;
        System.out.println("La mascota " + nombre+ " se ha añadido correctamente");
    }

    public void venderMascota(String nombre){
        for (int i = 0; i < numeroMascotas; i++) {
            if (inventario[i].getNombre().equals(nombre)){
                System.out.println("La mascota "+inventario[i].getNombre()+" se a vendido");
                inventario[i] =null;
                for (int j = 0; j < numeroMascotas-1; j++) {
                    inventario[j]=inventario[j+1];
                }
                numeroMascotas--;
                return;
            };
            System.out.println("La mascota con nombre " + nombre + "no se encuentra disponible");

        }
    }
    public void mostrarMascotas(){
        for (int i = 0; i < numeroMascotas; i++) {
            System.out.println("Nombre:"+inventario[i].getNombre()+" Edad: "+inventario[i].getEdad()+" Animal: "+inventario[i].getTipoDeAnimal());

        }
    }
}
