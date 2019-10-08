/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacheckin;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cetti
 */
public class Terminal {
    private ArrayList<Pasajero> pasajeros;
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Estado> estados;
    private ArrayList<CheckIn> checkins;

    public Terminal() {
        pasajeros = new ArrayList<>();
        vuelos = new ArrayList<>();
        estados = new ArrayList<>();
        checkins = new ArrayList<>();
        createEstados();
        
    }
    private void createEstados(){
        estados.add(new Estado("En espera"));
        estados.add(new Estado("En Horario"));
        estados.add(new Estado("Demorado"));
        estados.add(new Estado("Reprogramado"));
    }
    public Estado getEnEspera(){
        return this.estados.get(0);
    }
    public Estado getEnHorario(){
        return this.estados.get(1);
    }
    public Estado getDemorado(){
        return this.estados.get(2);
    }
    public Estado getReprogramado(){
        return this.estados.get(3);
    }
    
    public void addPasajero(String nombre, String apellido, String dni, Vuelo vuelo){
        pasajeros.add(new Pasajero(nombre,apellido,dni,vuelo));
    }
    
    public void addVuelo(String numVuelo, String numPuerta, String origen, String destino, Date horaSalida, String modelo,Estado estado){
        vuelos.add(new Vuelo(numVuelo,numPuerta,origen,destino,horaSalida,modelo,estado));
    }
    
    public void addCheckIn(Pasajero p){
        this.checkins.add(new CheckIn(p));
    }
    public Pasajero getPasajeroByDni(String dni){
        for (Pasajero p: this.pasajeros){
            if(p.getDni().equalsIgnoreCase(dni)){
                return p;
            }
        }
        return null;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    public ArrayList<CheckIn> getCheckins() {
        return checkins;
    }

    public void setCheckins(ArrayList<CheckIn> checkins) {
        this.checkins = checkins;
    }
    
    
    
    
    
    
}
