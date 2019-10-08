/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacheckin;

import java.util.Date;

/**
 *-numVuelo: String
-numPuerta: String
-origen: String
-destino: String
-horaSalida: Date
-estado: String
-modeloAvion: String
 * @author cetti
 */
public class Vuelo {
    private String numVuelo;
    private String numPuerta;
    private String origen;
    private String destino;
    private Date horaSalida;
    private String modelo;
    private Estado estado;

    public Vuelo(String numVuelo, String numPuerta, String origen, String destino, Date horaSalida, String modelo,Estado estado) {
        this.numVuelo = numVuelo;
        this.numPuerta = numPuerta;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.modelo = modelo;
        this.estado = estado;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "numVuelo=" + numVuelo + ", numPuerta=" + numPuerta + ", origen=" + origen + ", destino=" + destino + ", horaSalida=" + horaSalida + ", estado=" + estado + '}';
    }
    
    
}
