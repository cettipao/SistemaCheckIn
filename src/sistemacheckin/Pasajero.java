
package sistemacheckin;


public class Pasajero {
    private String nombre;
    private String apellido;
    private String dni;
    private Vuelo vuelo;

    public Pasajero(String nombre, String apellido, String dni, Vuelo vuelo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.vuelo = vuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", vuelo=" + vuelo + '}';
    }
    
    
}
