/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacheckin;

/**
 *
 * @author cetti
 */
public class Ciudad {
    private String ciudad;

    public Ciudad(String origen) {
        this.ciudad = origen;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "ciudad=" + ciudad + '}';
    }
    
    
}
