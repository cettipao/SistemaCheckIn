
package sistemacheckin;

import java.util.ArrayList;
import java.util.Date;


public class Terminal {
    private ArrayList<Pasajero> pasajeros;
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Estado> estados;
    private ArrayList<CheckIn> checkins;
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Modelo> modelos;
    

    public Terminal() {
        pasajeros = new ArrayList<>();
        vuelos = new ArrayList<>();
        estados = new ArrayList<>();
        checkins = new ArrayList<>();
        ciudades = new ArrayList<>();
        modelos = new ArrayList<>();
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
    
    public void removePasajero(Pasajero p){
        this.pasajeros.remove(p);
    }
    
    public void addPasajero(String nombre, String apellido, String dni, Vuelo vuelo){
        pasajeros.add(new Pasajero(nombre,apellido,dni,vuelo));
    }
    
    public void addVuelo(String numVuelo, String numPuerta, Ciudad origen, Ciudad destino, Date horaSalida, Modelo modelo,Estado estado){
        vuelos.add(new Vuelo(numVuelo,numPuerta,origen,destino,horaSalida,modelo,estado));
    }
    
    public void addCheckIn(Pasajero p){
        this.checkins.add(new CheckIn(p));
    }
    
    public void addCiudad(String name){
        this.ciudades.add(new Ciudad(name));
    }
    
    public void removeCiudad(Ciudad ciudad){
        this.ciudades.remove(ciudad);
    }
    
    public Ciudad getCiudadByName(String name){
        for (Ciudad c: this.ciudades){
            if(c.getCiudad().equalsIgnoreCase(name))
                return c;
        }
        return null;
    }
    
    
    public Modelo getModeloByName(String name){
        for (Modelo m: this.modelos){
            if(m.getModelo().equalsIgnoreCase(name))
                return m;
        }
        return null;
    }
    
    public Pasajero getPasajeroByDni(String dni){
        for (Pasajero p: this.pasajeros){
            if(p.getDni().equalsIgnoreCase(dni)){
                return p;
            }
        }
        return null;
    }

    public void addModelo(String name){
        this.modelos.add(new Modelo(name));
    }
    public void removeModelo(Modelo m){
        this.modelos.remove(m);
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

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public ArrayList<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(ArrayList<Modelo> modelos) {
        this.modelos = modelos;
    }

   
    
    
    
    
    
    
    
}
