
package DispositivoInteligente;


public class SmartWatch extends SmartDevice{
    
    String forma;
    private String tipoCorrea;
    boolean sensorFCardica;

    public SmartWatch() {
    }

    public SmartWatch(String forma, String tipoCorrea, boolean sensorFCardica) {
        this.forma = forma;
        this.tipoCorrea = tipoCorrea;
        this.sensorFCardica = sensorFCardica;
    }

    public SmartWatch(String forma, String tipoCorrea, boolean sensorFCardica, String tipoPantalla, int autonomia, boolean gps, double velocidadProcesador, int ram) {
        super(tipoPantalla, autonomia, gps, velocidadProcesador, ram);
        this.forma = forma;
        this.tipoCorrea = tipoCorrea;
        this.sensorFCardica = sensorFCardica;
    }

    public String getTipoCorrea() {
        return tipoCorrea;
    }

    public void setTipoCorrea(String tipoCorrea) {
        this.tipoCorrea = tipoCorrea;
    }

    

    
    
    
    
    
    
    
}
