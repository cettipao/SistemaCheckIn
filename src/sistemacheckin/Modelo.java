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
public class Modelo {
    private String Modelo;

    public Modelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Modelo{" + "Modelo=" + Modelo + '}';
    }
    
    
}
