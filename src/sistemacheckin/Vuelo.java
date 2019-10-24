
package sistemacheckin;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Vuelo {
    private String numVuelo;
    private String numPuerta;
    private Ciudad origen;
    private Ciudad destino;
    private Date horaSalida;
    private Modelo modelo;
    private Estado estado;
    private ArrayList<Boolean> asientos;

    public Vuelo(String numVuelo, String numPuerta, Ciudad origen, Ciudad destino, Date horaSalida, Modelo modelo,Estado estado) {
        this.numVuelo = numVuelo;
        this.numPuerta = numPuerta;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.modelo = modelo;
        this.estado = estado;
        this.asientos = new ArrayList<>();
        Random rd = new Random();
        //Agregar Asientos
        for (int i = 0; i < 20; i++) {
            asientos.add(rd.nextBoolean());
        }
    }

    public String getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(String numPuerta) {
        this.numPuerta = numPuerta;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    

    public ArrayList<Boolean> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Boolean> asientos) {
        this.asientos = asientos;
    }
    @Override
    public String toString() {
        return "Vuelo{" + "numVuelo=" + numVuelo + ", numPuerta=" + numPuerta + ", origen=" + origen + ", destino=" + destino + ", horaSalida=" + horaSalida + ", estado=" + estado + '}';
    }
    
    
}
