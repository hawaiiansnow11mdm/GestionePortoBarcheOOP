package Astratte1;

import java.util.ArrayList;

public class GestionePortoGPT {

    private ArrayList<BarcaGPT> elencoBarche;
    private ArrayList<UtenteGPT> elencoUtenti;

    public GestionePortoGPT() {

        elencoBarche = new ArrayList<BarcaGPT>();
        elencoUtenti = new ArrayList<UtenteGPT>();
    }

    public boolean aggiungiBarca(BarcaGPT barca) {
        for (BarcaGPT boat : elencoBarche) {
            if (boat.equals(barca)) {
                return false;
            }
        }
        elencoBarche.add(barca);
        return true;
    }

    public boolean aggiungiUtente(UtenteGPT utente) {
        for (UtenteGPT user : elencoUtenti) {
            if (user.equals(utente)) {
                return false;
            }
        }
        elencoUtenti.add(utente);
        return true;
    }

    public boolean noleggiaBarca(String idUtente, String idBarca) {
        BarcaGPT boat = null;
        for (BarcaGPT titanic : elencoBarche) {
            if (titanic.statoBarca.equalsIgnoreCase("Disponibile") && titanic.getIdBarca().equals(idBarca)) {
                boat = titanic;
                break;
            }
        }
        if (boat == null) {
            return false;
        }
        for (UtenteGPT user : elencoUtenti) {
            if (user.getIdUtente().equals(idUtente) && user.getBarcaNoleggiata()== null) {
                user.setBarcaNoleggiata(boat);
                boat.setStatoBarca("Noleggiata");
                return true;
            }
        }
        return false;
    }

    public boolean restituisciBarca(String idUtente, String idBarca) {
        BarcaGPT boat = null;
        for (BarcaGPT titanic : elencoBarche) {
            if (titanic.getIdBarca().equals(idBarca) && titanic.statoBarca.equalsIgnoreCase("Noleggiata")) {
                boat = titanic;
                break;
            }
        }
        if (boat == null) {
            return false;
        }
        for (UtenteGPT user : elencoUtenti) {
            if (user.getIdUtente().equals(idUtente) && user.getBarcaNoleggiata() != null) {
                if (user.getBarcaNoleggiata().getIdBarca().equals(idBarca)) {
                user.setBarcaNoleggiata(null);
                boat.setStatoBarca("Disponibile");
                return true;
                
                }
            }
        }
        return false;
    }

    public ArrayList<BarcaGPT> elencoBarcheDisponibili() {
        ArrayList<BarcaGPT> barcheDisponibili = new ArrayList<BarcaGPT>();
        for (BarcaGPT boat : elencoBarche) {
            if (boat.getStatoBarca().equalsIgnoreCase("Disponibile")) {
                barcheDisponibili.add(boat);
            }
        }
        return barcheDisponibili;
    }

    public ArrayList<BarcaGPT> elencoBarcheManutenzione() {
        ArrayList<BarcaGPT> barcheManutenzione = new ArrayList<BarcaGPT>();
        for (BarcaGPT boat : elencoBarche) {
            if (boat.getStatoBarca().equalsIgnoreCase("Manutenzione")) {
                barcheManutenzione.add(boat);
            }
        }
        return barcheManutenzione;
    }

    public BarcaGPT barcheNoleggiateCliente(String idUtente) {
        ArrayList<BarcaGPT> barcheNoleggiate = new ArrayList<BarcaGPT>();
        for (UtenteGPT user : elencoUtenti) {
            if (user.getIdUtente().equals(idUtente)) {
                return user.getBarcaNoleggiata();
            }
        }
        return null;
    }

}
