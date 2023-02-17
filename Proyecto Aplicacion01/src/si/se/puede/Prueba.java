package si.se.puede;

public class Prueba {

    public static void main(String[] args) {
        //Declarando un objeto llamado miAuto de tipo Auto
        Auto miAuto;
        
        //instanciamos (creamos) el objeeto miAuto
        
        miAuto = new Auto("12234", "Toyota", 16500.5f);
        
        String cadena=miAuto.verDatos();
        
        System.out.println("Los datos de mi auto son : " + cadena);
        
        
        

    
    
    }
    
}
