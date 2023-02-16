package ordination.ordination;

import java.time.LocalDate;
import java.util.ArrayList;

public class PN extends Ordination{

    private double antalEnheder;

    private ArrayList<LocalDate> datoer;

    public PN(LocalDate startDen, LocalDate slutDen, double antalEnheder, Patient patient) {
        super(startDen, slutDen, patient);
        this.antalEnheder = antalEnheder;
        datoer = new ArrayList<>();
    }

    /**
     * Registrerer at der er givet en dosis paa dagen givesDen
     * Returnerer true hvis givesDen er inden for ordinationens gyldighedsperiode og datoen huskes
     * Retrurner false ellers og datoen givesDen ignoreres
     * @param givesDen
     * @return
     */
    public boolean givDosis(LocalDate givesDen) {
        LocalDate startDen = super.getStartDen().minusDays(1);
        LocalDate slutDen = super.getSlutDen().plusDays(1);

        if (givesDen.isAfter(startDen) && givesDen.isBefore(slutDen)) {
            datoer.add(givesDen);
            return true;
        } else {
            throw new IllegalArgumentException("Ugyldig dato");
        }
    }

    //(antal gange ordinationen er anvendt * antal enheder)
    // /
    // (antal dage mellem første og sidste givning)
    public double doegnDosis() {
        return (getAntalGangeGivet() * antalEnheder) / (super.antalDage());
    }

    @Override
    public String getType() {
        return "PN";
    }


    public double samletDosis() {
        return doegnDosis() * antalDage();
    }

    /**
     * Returnerer antal gange ordinationen er anvendt
     * @return
     */
    public int getAntalGangeGivet() {
        // TODO
        int antalGangeGivet = 0;
        for (int i = 0; i < datoer.size(); i++) {
            antalGangeGivet += 1;
        }
        return antalGangeGivet;
    }

    public double getAntalEnheder() {
        return antalEnheder;
    }

    public ArrayList<LocalDate> getDatoer() {
        return datoer;
    }

}
