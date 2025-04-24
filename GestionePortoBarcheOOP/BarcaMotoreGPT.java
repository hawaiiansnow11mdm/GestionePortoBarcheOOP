
package Astratte1;

public class BarcaMotoreGPT extends BarcaGPT {
    
    private double potenzaMotore;
    
    public BarcaMotoreGPT(String idBarca, String tipoBarca, double lunghezzaBarca, double potenza){
        
        super(idBarca, tipoBarca, lunghezzaBarca);
        this.potenzaMotore= potenza;
        
        
    }
    
    @Override
    public String descrizioneBarca() {

        return "Barca a motore [ id Barca : " + idBarca + " ,tipo " + tipoBarca + "lunghezza " + lunghezzaBarca + " numero vele " + potenzaMotore + "]";
    }

    public double getPotenzaMotore() {
        return potenzaMotore;
    }

    public void setPotenzaMotore(double potenzaMotore) {
        this.potenzaMotore = potenzaMotore;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null || (!(o instanceof BarcaMotoreGPT))){
            return false;
        }
         BarcaMotoreGPT oBarcaMotoreGPT = (BarcaMotoreGPT) o;
         return this.idBarca.equals(oBarcaMotoreGPT.idBarca);
    }
    
}
