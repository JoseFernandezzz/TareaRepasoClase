package Tienda;

public class Mascota {
    private String nombre;
    private int edad;
    private String tipoDeAnimal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }
    public Mascota(String nombre, int edad, String tipoDeMascota){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDeAnimal = tipoDeMascota;
    }
}
