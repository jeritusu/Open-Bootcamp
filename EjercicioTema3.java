
//package ejerciciotema3;

//import jdk.security.jarsigner.JarSignerException;


public class EjercicioTema3 {

   
    public static void main(String[] args) {
        String[] nombre = {"Jairo", "Alberto", "Usuay", "Noguera"};
        
        String nombreCompleto = "";
        
        for (int i = 0; i < nombre.length; i++) {
            nombreCompleto+=nombre[i];
            
        }
        //Ejecucion en MAIN
        System.out.println("Todo el nombre es: "+nombreCompleto);
        //Llamado a funcion para imprimir array nombre
        System.out.println("Nombre completo-1 es: "+concatenaNombre(nombre));
        System.out.println("Nombre completo-2 es: "+concatenaNombre2(nombre));
        
    }
    //Funcion 1
    static String concatenaNombre(String nombre[]){
        String nombreCompleto = "";
        //Uso de ciclo forEach
        for (String i : nombre) {
            nombreCompleto+=i;
        }
        return nombreCompleto;
                
    }
    //Funcion 2
    static String concatenaNombre2(String nombre[]){
        String nombreCompleto = "";
        //Uso de ciclo for        
        for (int i = 0; i < nombre.length; i++) {
            nombreCompleto+=nombre[i];
        
        }
        return nombreCompleto; 
    }
    }

