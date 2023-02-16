package ordination.ordination;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DagligFastTest {

    @Test
    void tc8_doegnDosis() {
        //arrange
        Patient patient = new Patient("1235679", "John Dillermand", 80);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2012, 12, 12), LocalDate.of(2012, 12, 12), 2, 0, 1, 0, patient);
        //act
        double faktiskDaglig = dagligFast.doegnDosis();
        //assert
        double forventetDaglig = 3.0;
        assertEquals(forventetDaglig, faktiskDaglig);
    }
}