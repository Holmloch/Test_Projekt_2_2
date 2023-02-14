package ordination.ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class DagligSkaev extends Ordination{
    private ArrayList<Dosis> dosisAL;

    public DagligSkaev(LocalDate startDen, LocalDate slutDen, Patient patient) {
        super(startDen, slutDen, patient);
        dosisAL = new ArrayList<>();
    }


    public void opretDosis(LocalTime tid, double antal) {
        // TODO
        Dosis dosis = new Dosis(tid, antal);
        dosisAL.add(dosis);
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
        for (int i = 0; i < dosisAL.size(); i++) {
            doegnDosis += dosisAL.get(i).getAntal();
        }
        return doegnDosis;
    }

    @Override
    public String getType() {
        return "Daglig skæv";
    }
}
