package ordination.ordination;

import ordination.controller.Controller;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PNTest {

    @Test
    void tc9_givDosis() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("121256-0512", "Jane Jensen", 63.4);
        PN pn = new PN(LocalDate.of(2021, 01, 01), LocalDate.of(2021, 01, 12), 2, patient);

        //Act
        boolean givDosis = pn.givDosis(LocalDate.of(2021, 01, 10));

        //Assert
        boolean actualBoolean = pn.getDatoer().contains(LocalDate.of(2021, 01, 10));

        assertTrue(actualBoolean);
    }

    @Test
    void tc10_givDosis() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("121256-0512", "Jane Jensen", 63.4);
        PN pn = new PN(LocalDate.of(2021, 01, 01), LocalDate.of(2021, 01, 01), 2, patient);

        //Act
        boolean givDosis = pn.givDosis(LocalDate.of(2021, 01, 01));

        //Assert
        boolean actualBoolean = pn.getDatoer().contains(LocalDate.of(2021, 01, 01));

        assertTrue(actualBoolean);
    }

    @Test
    void tc11_givDosis() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("121256-0512", "Jane Jensen", 63.4);
        PN pn = new PN(LocalDate.of(2021, 01, 01), LocalDate.of(2021, 01, 02), 2, patient);

        //Act
        boolean givDosis = pn.givDosis(LocalDate.of(2021, 01, 01));

        //Assert
        boolean actualBoolean = pn.getDatoer().contains(LocalDate.of(2021, 01, 01));

        assertTrue(actualBoolean);
    }

    @Test
    void tc12_givDosis() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("121256-0512", "Jane Jensen", 63.4);
        PN pn = new PN(LocalDate.of(2021, 01, 10), LocalDate.of(2021, 01, 01), 2, patient);

        //Act
        //Assert
        Exception forventet = assertThrows(RuntimeException.class, () -> {
            pn.givDosis(LocalDate.of(2021, 01, 02));
        });
        assertEquals("Ugyldig dato", forventet.getMessage());
    }
}