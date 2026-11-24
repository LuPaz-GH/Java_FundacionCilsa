package Clase6.Desafio11;

public class Piloto {
    private String nombre;
    private int numero;
    private String equipo;
    private String pais;

    public Piloto(String nombre, int numero, String equipo, String pais) {
        this.nombre = nombre;
        this.numero = numero;
        this.equipo = equipo;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void mostrarInformacion() {
        System.out.println("===== PILOTO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero: " + numero);
        System.out.println("Equipo: " + equipo);
        System.out.println("Pais: " + pais);
    }
}
