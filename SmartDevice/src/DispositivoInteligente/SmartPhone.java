
package DispositivoInteligente;

public class SmartPhone extends SmartDevice{
    boolean radioFM;
    String tipoPuerto;
    private int tama�oMicroSD;

    public SmartPhone() {
    }

    public SmartPhone(boolean radioFM, String tipoPuerto, int tama�oMicroSD) {
        this.radioFM = radioFM;
        this.tipoPuerto = tipoPuerto;
        this.tama�oMicroSD = tama�oMicroSD;
    }

    public SmartPhone(boolean radioFM, String tipoPuerto, int tama�oMicroSD, String tipoPantalla, int autonomia, boolean gps, double velocidadProcesador, int ram) {
        super(tipoPantalla, autonomia, gps, velocidadProcesador, ram);
        this.radioFM = radioFM;
        this.tipoPuerto = tipoPuerto;
        this.tama�oMicroSD = tama�oMicroSD;
    }

    public int getTama�oMicroSD() {
        return tama�oMicroSD;
    }

    public void setTama�oMicroSD(int tama�oMicroSD) {
        this.tama�oMicroSD = tama�oMicroSD;
    }
    
    
}
