/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacheckin;

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
    private Equipaje equipajes;
    private boolean asistencia;

    public CheckIn(Pasajero p) {
        this.pasajero = p;
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

    public Equipaje getEquipajes() {
        return equipajes;
    }

    public void setEquipajes(Equipaje equipajes) {
        this.equipajes = equipajes;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "CheckIn{" + "internacional=" + internacional + ", business=" + business + ", numAsiento=" + numAsiento + ", equipajes=" + equipajes + ", asistencia=" + asistencia + '}';
    }
    
}

