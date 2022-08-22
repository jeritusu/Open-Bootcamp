
package DispositivoInteligente;


public class Main {
    public static void main(String[] args) {
        
        
        SmartWatch reloj1 = new SmartWatch("Redondo", "Plastica", true, "OLED", 12, true, 1.1, 1);
        
        SmartPhone celPhone1 = new SmartPhone(true, "tipoC", 1000, "Super Amoled", 24, true, 1000.8, 12);
        
        System.out.println("El tipo de pantala del reloj es: "+reloj1.tipoPantalla);
        System.out.println("La autonomia de bateria del reloj es: "+reloj1.autonomia+" Horas");
        System.out.println("El tipo de pantalla del celular es: "+celPhone1.tipoPantalla);
        System.out.println("El tamaño de la microSD del celular es: "+celPhone1.getTamañoMicroSD()+ " GB");
        System.out.println("La velocidad del procesador delcelular es: "+celPhone1.velocidadProcesador+ " Mhz");
        System.out.println("La correa del reloj es: "+reloj1.getTipoCorrea());


    }
    
}
