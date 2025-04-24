package Astratte1;

public class BarcaVelaGPT extends BarcaGPT {

    private int numeroVele;

    public BarcaVelaGPT(String idBarca, String tipoBarca, double lunghezzaBarca, int numeroVele) {

        super(idBarca, tipoBarca, lunghezzaBarca);

        this.numeroVele = numeroVele;
    }

    @Override
    public String descrizioneBarca() {

        return "Barca a vela [ id Barca : " + idBarca + " ,tipo " + tipoBarca + "lunghezza " + lunghezzaBarca + " numero vele " + numeroVele + "]";
    }

    public int getNumeroVele() {
        return numeroVele;
    }

    public void setNumeroVele(int numeroVele) {
        this.numeroVele = numeroVele;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || (!(o instanceof BarcaVelaGPT))) {
            return false;
        }
        BarcaVelaGPT oBarcaVelaGPT = (BarcaVelaGPT) o;

        return this.idBarca.equals(oBarcaVelaGPT.idBarca);
    }
}
