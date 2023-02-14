package ordination.ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligSkaev extends Ordination{
    private LocalDate startDen;
    private LocalDate slutDen;
    private ArrayList<Dosis> dosis;


    public void opretDosis(LocalTime tid, double antal) {
        // TODO
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
