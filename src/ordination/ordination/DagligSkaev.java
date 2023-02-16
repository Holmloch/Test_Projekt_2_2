package ordination.ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class DagligSkaev extends Ordination{
    private ArrayList<Dosis> dosisAL;

    public DagligSkaev(LocalDate startDen, LocalDate slutDen, Patient patient, LocalTime[] klokkeslet, double[] antalEnheder) {
        super(startDen, slutDen, patient);
        dosisAL = new ArrayList<>();
        for (int i = 0; i < klokkeslet.length; i++) {
            opretDosis(klokkeslet[i], antalEnheder[i]);
        }
    }


    public Dosis opretDosis(LocalTime tid, double antal) {
        // TODO
        Dosis dosis = new Dosis(tid, antal);
        dosisAL.add(dosis);
        return dosis;
    }

    public ArrayList<Dosis> getDoser() {
        return dosisAL;
    }


    @Override
    public double samletDosis() {
        return doegnDosis() * antalDage();
    }

    @Override
    public double doegnDosis() {
        double doegnDosis = 0;
        for (Dosis dosis : dosisAL) {
            doegnDosis += dosis.getAntal();
        }
        return doegnDosis;
    }

    @Override
    public String getType() {
        return "Daglig skæv";
    }
}
