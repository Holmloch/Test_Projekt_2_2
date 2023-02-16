package ordination.ordination;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrdinationTest {

    @Test
    void tc13_antalDage() {
        //Arrange
        Patient patient = new Patient("123234-4937", "Børge Børgesen", 24);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,1,23), LocalDate.of(2021, 1, 24),1,2,1,1,patient);

        //Act
        int faktiskAntalDage = dagligFast.antalDage();

        //Assert
        int forventetAntalDage = 2;
        assertEquals(forventetAntalDage, faktiskAntalDage);
    }

    @Test
    void tc14_antalDage() {
        //Arrange
        Patient patient = new Patient("123234-4937", "Børge Børgesen", 24);
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,1,23), LocalDate.of(2021, 1, 23),1,2,1,1,patient);

        //Act
        int faktiskAntalDage = dagligFast.antalDage();

        //Assert
        int forventetAntalDage = 1;
        assertEquals(forventetAntalDage, faktiskAntalDage);
    }
}