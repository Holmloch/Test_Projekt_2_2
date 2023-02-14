package ordination.ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligSkaev extends Ordination{
    private ArrayList<Dosis> dosisAL;

    public DagligSkaev(LocalDate startDen, LocalDate slutDen) {
        super(startDen, slutDen);
        dosisAL = new ArrayList<>();
    }
    //hej


    public void opretDosis(LocalTime tid, double antal) {
        // TODO
        Dosis dosis = new Dosis(tid, antal);
        dosisAL.add(dosis);
    }


    @Override
    public double samletDosis() {
        return 0;
    }

    @Override
    public double doegnDosis() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
}
