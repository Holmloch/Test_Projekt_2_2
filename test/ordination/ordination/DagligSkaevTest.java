package ordination.ordination;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DagligSkaevTest {

    @Test
    void t15_opretDosis() {

        Patient patient = new Patient("59841720", "Bingo Dorte", 78);
        LocalTime[] kl = { LocalTime.of(12, 0), LocalTime.of(12, 40), LocalTime.of(16, 0), LocalTime.of(18, 45) };
        double[] an = { 0.5, 1, 2.5, 3 };

        DagligSkaev dagligSkaev = new DagligSkaev(LocalDate.of(2022, 2, 3), LocalDate.of(2022, 2, 9), patient, kl, an);
        Dosis dosis = dagligSkaev.opretDosis(LocalTime.of(10, 30), 4);

        boolean actualBool = dagligSkaev.getDoser().contains(dosis);
        assertTrue(actualBool);
    }
}