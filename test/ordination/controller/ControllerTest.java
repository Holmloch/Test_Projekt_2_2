package ordination.controller;


import ordination.ordination.Laegemiddel;
import ordination.ordination.Patient;
import org.junit.jupiter.api.Test;

class ControllerTest {

    @Test
    void tc6_opretDagligFastOrdination() {
        //Arrange
        Patient patient = new Patient("121256-0512", "Jane Jensen", 63.4);
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");

        //Act

        //Assert

    }

    @Test
    void anbefaletDosisPrDoegn() {

    }

}