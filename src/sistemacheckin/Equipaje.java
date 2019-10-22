
package sistemacheckin;


public class Equipaje {
    private int pesoEstimado; 
    private boolean mascota;
    private boolean especial;

    public Equipaje(int pesoEstimado, boolean mascota, boolean especial) {
        this.pesoEstimado = pesoEstimado;
        this.mascota = mascota;
        this.especial = especial;
    }

    public int getPesoEstimado() {
        return pesoEstimado;
    }

    public void setPesoEstimado(int pesoEstimado) {
        this.pesoEstimado = pesoEstimado;
    }

    public boolean isMascota() {
        return mascota;
    }

    public void setMascota(boolean mascota) {
        this.mascota = mascota;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    @Override
    public String toString() {
        return "Equipaje{" + "pesoEstimado=" + pesoEstimado + ", mascota=" + mascota + ", especial=" + especial + '}';
    }
    
}
