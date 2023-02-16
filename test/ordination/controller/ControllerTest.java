package ordination.controller;


import ordination.ordination.*;
import org.junit.jupiter.api.Test;

class ControllerTest {

    @Test
    void tc6_opretDagligFastOrdination() {
        //Arrange
        Patient patient = new Patient("121256-0512", "Jane Jensen", 63.4);
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Controller controller = Controller.getController();

        //Act

        //Assert

    }

    @Test
    void tc1_anbefaletDosisPrDoegn() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("123234-4937", "Børge Børgesen", 13);
        //Act
        double faktiskAnbefaletDosisPrDoegn = Controller.getTestController().anbefaletDosisPrDoegn(patient, laegemiddel);

        //Assert

    }
}