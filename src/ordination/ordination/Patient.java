package ordination.ordination;

import java.util.ArrayList;

public class Patient {
    private String cprnr;
    private String navn;
    private double vaegt;

    // TODO: Link til Ordination
    private ArrayList<Ordination> ordinationer;

    public Patient(String cprnr, String navn, double vaegt) {
        this.cprnr = cprnr;
        this.navn = navn;
        this.vaegt = vaegt;
        ordinationer = new ArrayList<>();
    }

    public String getCprnr() {
        return cprnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getVaegt(){
        return vaegt;
    }

    public void setVaegt(double vaegt){
        this.vaegt = vaegt;
    }

    //TODO: Metoder (med specifikation) til at vedligeholde link til Ordination

    /**
     * Tilføjer ordanination til patients liste med ordinationer.
     * pre: ordination er ikke null
     * @param ordination
     */
    public void addOrdination(Ordination ordination) {
        if (!ordinationer.contains(ordination)) {
            ordinationer.add(ordination);
        }
    }

    public ArrayList<Ordination> getOrdinationer() {
        return ordinationer;
    }

    @Override
    public String toString(){
        return navn + "  " + cprnr;
    }

}
