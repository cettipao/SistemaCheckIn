/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacheckin;

import java.util.ArrayList;

/**
 *-internacional: boolean
-business: boolean
-numAsiento: String
-equipajes: Equipaje[]
-asistencia: boolean

 * @author cetti
 */
public class CheckIn {
    private Pasajero pasajero;
    private boolean internacional;
    private boolean business;
    private String numAsiento;
    private ArrayList<Equipaje> equipajes;
    private boolean asistencia;
    private String tipoAsistencia;

    public CheckIn(Pasajero p) {
        this.pasajero = p;
        this.equipajes = new ArrayList<>();
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    public String getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(String numAsiento) {
        this.numAsiento = numAsiento;
    }
    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public ArrayList<Equipaje> getEquipajes() {
        return equipajes;
    }

    public void addEquipaje(int peso, boolean mascota, boolean especial){
        this.equipajes.add(new Equipaje(peso,mascota,especial));
    }
    
    public void setEquipajes(ArrayList<Equipaje> equipajes) {
        this.equipajes = equipajes;
    }

    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(String tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    
    
    @Override
    public String toString() {
        return "CheckIn{" + "internacional=" + internacional + ", business=" + business + ", numAsiento=" + numAsiento + ", equipajes=" + equipajes + ", asistencia=" + asistencia + '}';
    }
    
}

