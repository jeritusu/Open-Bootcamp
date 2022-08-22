
package DispositivoInteligente;

public class SmartPhone extends SmartDevice{
    boolean radioFM;
    String tipoPuerto;
    private int tamañoMicroSD;

    public SmartPhone() {
    }

    public SmartPhone(boolean radioFM, String tipoPuerto, int tamañoMicroSD) {
        this.radioFM = radioFM;
        this.tipoPuerto = tipoPuerto;
        this.tamañoMicroSD = tamañoMicroSD;
    }

    public SmartPhone(boolean radioFM, String tipoPuerto, int tamañoMicroSD, String tipoPantalla, int autonomia, boolean gps, double velocidadProcesador, int ram) {
        super(tipoPantalla, autonomia, gps, velocidadProcesador, ram);
        this.radioFM = radioFM;
        this.tipoPuerto = tipoPuerto;
        this.tamañoMicroSD = tamañoMicroSD;
    }

    public int getTamañoMicroSD() {
        return tamañoMicroSD;
    }

    public void setTamañoMicroSD(int tamañoMicroSD) {
        this.tamañoMicroSD = tamañoMicroSD;
    }
    
    
}
