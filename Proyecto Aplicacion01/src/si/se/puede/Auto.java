package si.se.puede;

public class Auto {
    //atributos
    private String numSerie;
    private String marca;
    private float precio;
    
    //Constructor
    //Método que permite la inicialización de los atributos
    public Auto(String numSerie, String marca, float precio) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.precio = precio;
    }
    
    //getters y setters
    public String getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Lógica de Negocio
    public String verDatos(){
        String cad="";
        
        cad="\n Numero de Serie "+ numSerie+
                "\n Marca : " + marca+
                "\n Precio : "  + precio;
        
        return cad;       
    }
    
    
    
    
}
