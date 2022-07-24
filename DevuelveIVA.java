
package devuelveiva;


public class DevuelveIVA {

    //Funcion principal
    public static void main(String[] args) {
        double precio = 5000;
        System.out.println("El precio es "+precio+" y si le adicionamos el IVA es de, "+calcularPrecioIVA(precio));
    }
    
    //Funcion para calcular precio con IVA
    static double calcularPrecioIVA(double precio){
        return precio * 1.19;// Se calcula un IVA del 19%
    }
    
}
