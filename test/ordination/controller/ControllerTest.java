package ordination.controller;


import ordination.ordination.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

class ControllerTest {

    @Test
    void tc6_opretDagligFastOrdination() {
        //Arrange
        Patient patient = new Patient("121256-0512", "Jane Jensen", 63.4);
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Controller controller = Controller.getController();

        //Act
        controller.opretDagligFastOrdination(LocalDate.of(2023, 02, 10), LocalDate.of(2023, 02, 20), patient, laegemiddel, 1, 2, 0, 2);

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
        double forventetAnbefaletDosisPrDoegn = 13.0;
        assertEquals(forventetAnbefaletDosisPrDoegn,faktiskAnbefaletDosisPrDoegn);
    }
}