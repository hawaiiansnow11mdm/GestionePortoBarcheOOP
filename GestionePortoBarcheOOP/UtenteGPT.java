
package Astratte1;

public class UtenteGPT {
    
    private String idUtente;
    private String nomeUtente;
    private String cognomeUtente;
    private BarcaGPT barcaNoleggiata;
    
    public UtenteGPT(String id, String nome, String cognome){
        
        this.idUtente= id;
        this.nomeUtente=nome;
        this.cognomeUtente=cognome;
        
    }

    public String getIdUtente() {
        return idUtente;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getCognomeUtente() {
        return cognomeUtente;
    }

    public BarcaGPT getBarcaNoleggiata() {
        return barcaNoleggiata;
    }

    public void setIdUtente(String idUtente) {
        this.idUtente = idUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public void setCognomeUtente(String cognomeUtente) {
        this.cognomeUtente = cognomeUtente;
    }

    public void setBarcaNoleggiata(BarcaGPT barcaNoleggiata) {
        this.barcaNoleggiata = barcaNoleggiata;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null || (!(o instanceof UtenteGPT))){
            return false;
        }
        UtenteGPT oUtenteGPT = (UtenteGPT) o;
        return this.idUtente.equals(oUtenteGPT.idUtente);
    }
}
