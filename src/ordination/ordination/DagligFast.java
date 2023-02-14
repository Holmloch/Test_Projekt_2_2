package ordination.ordination;

import java.time.LocalDate;
import java.time.LocalTime;

public class DagligFast extends Ordination {
    private Dosis[] doser;
    public DagligFast(LocalDate startDen, LocalDate slutDen, int morgenAntal, int middagsAntal, int aftenAntal, int natAntal) {
        super(startDen, slutDen);
        doser = new Dosis[4];
        doser[0] = new Dosis(LocalTime.of(6,0),morgenAntal);
        doser[1] = new Dosis(LocalTime.of(12,0),middagsAntal);
        doser[2] = new Dosis(LocalTime.of(18,0),aftenAntal);
        doser[3] = new Dosis(LocalTime.of(23, 59), natAntal);

    }

    @Override
    public double samletDosis() {
        return 0;
    }

    @Override
    public double doegnDosis() {
        double result = 0.0;
        for (int i = 0; i <= 4; i++ ) {
            result += doser[i].getAntal();
        }
        return result;
    }

    @Override
    public String getType() {
        return "Daglig fast";
    }
    // TODO
}
