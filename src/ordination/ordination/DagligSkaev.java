package ordination.ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class DagligSkaev extends Ordination{
    private ArrayList<Dosis> dosisAL;

    public DagligSkaev(LocalDate startDen, LocalDate slutDen) {
        super(startDen, slutDen);
        dosisAL = new ArrayList<>();
    }


    public void opretDosis(LocalTime tid, double antal) {
        // TODO
        Dosis dosis = new Dosis(tid, antal);
        dosisAL.add(dosis);
    }


    @Override
    public double samletDosis() {
        return doegnDosis() * DAYS.between(super.getStartDen(), super.getSlutDen());
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
