package miPrincipal;


public class Cadena  {
    private char cadena[] = new char[80];
    private int tamanio = 0;
    private final int TOPE=80;

    public Cadena(){
        tamanio=0;
    }
    public Cadena(char[] cadena) {
        int len = Math.min(cadena.length, TOPE);
        for (int i = 0; i < len; i++) {
            this.cadena[i] = cadena[i];
        }
        this.tamanio = len;
    }
    public void borrarInicio(){
         if (tamanio == 0) return;
        for (int i = 0; i < tamanio - 1; i++) {
            cadena[i] = cadena[i + 1];
        }
        cadena[tamanio - 1] = ' ';
        tamanio--;

    }
    public void agregarFinal(char c) throws PosicionIlegalException{
        if (tamanio>=TOPE)
        {
            throw new PosicionIlegalException(); 
        }
        boolean esLetraMinuscula = (c>='a' && c<='z');
        boolean esLeltraMayuscula = (c>='A' && c<='Z');
        boolean esDigito = (c>='0' && c<='9');
        
        if (!(esLetraMinuscula || esLeltraMayuscula || esDigito))
        {
            throw new PosicionIlegalException(); 
        }
        

        cadena[tamanio++]=c;
        
    }
    public boolean vacia(){
        return (tamanio==0);
    
    }
    public boolean llena(){
        return (tamanio==TOPE);
    }
    
    public Cadena invertir() throws PosicionIlegalException{
       Cadena invertida = new Cadena();
        for (int i = tamanio - 1; i >= 0; i--) {
            invertida.agregarFinal(cadena[i]);
        }
        return invertida;

    }
    

    public char[] getCadena() {
        char[] copia = new char[tamanio];
        System.arraycopy(cadena, 0, copia, 0, tamanio);
        return copia;
    }
    public int tamanio(){
       
        return tamanio;
    }
    
    @Override
    public String toString() {
        StringBuilder cadenita = new StringBuilder();
        for (int i = 0; i < tamanio; i++) {
            cadenita.append(cadena[i]);
        }
        return cadenita.toString();
        
    }
    
   
    
}
