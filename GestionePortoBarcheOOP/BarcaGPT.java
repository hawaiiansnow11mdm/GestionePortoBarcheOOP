
package Astratte1;

public abstract class BarcaGPT {
    
    protected String idBarca;
    protected String tipoBarca;
    protected double lunghezzaBarca;
    protected String statoBarca;
    
    
    public BarcaGPT(String idBarca,String tipoBarca, double lunghezzaBarca){
        this.idBarca= idBarca;
        this.tipoBarca= tipoBarca;
        this.lunghezzaBarca= lunghezzaBarca;
        this.statoBarca= "Disponibile";
        
    }
    
    public abstract String descrizioneBarca();

    public String getIdBarca() {
        return idBarca;
    }

    public String getTipoBarca() {
        return tipoBarca;
    }

    public double getLunghezzaBarca() {
        return lunghezzaBarca;
    }

    public String getStatoBarca() {
        return statoBarca;
    }

    public void setIdBarca(String idBarca) {
        this.idBarca = idBarca;
    }

    public void setTipoBarca(String tipoBarca) {
        this.tipoBarca = tipoBarca;
    }

    public void setLunghezzaBarca(double lunghezzaBarca) {
        this.lunghezzaBarca = lunghezzaBarca;
    }

    public void setStatoBarca(String statoBarca) {
        this.statoBarca = statoBarca;
    }
    
    
}
