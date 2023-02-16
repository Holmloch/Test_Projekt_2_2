package ordination.controller;


import ordination.ordination.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

class ControllerTest {

    @Test
    void tc6_opretDagligFastOrdination() {
        //Arrange 1
        Patient patient = new Patient("121256-0512", "Jane Jensen", 63.4);
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Controller controller = Controller.getController();

        //Act
        DagligFast dagligFast = controller.opretDagligFastOrdination(LocalDate.of(2023, 02, 10), LocalDate.of(2023, 02, 20), patient, laegemiddel, 1, 2, 0, 2);

        //Assert
        boolean actualBoolean = patient.getOrdinationer().contains(dagligFast);
        assertTrue(actualBoolean);
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

    @Test
    void tc2_anbefaletDosisPrDoegn() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("123234-4937", "Børge Børgesen", 24);
        //Act
        double faktiskAnbefaletDosisPrDoegn = Controller.getTestController().anbefaletDosisPrDoegn(patient, laegemiddel);

        //Assert
        double forventetAnbefaletDosisPrDoegn = 24.0;
        assertEquals(forventetAnbefaletDosisPrDoegn,faktiskAnbefaletDosisPrDoegn);
    }

    @Test
    void tc3_anbefaletDosisPrDoegn() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("123234-4937", "Jane Jensen", 63.4);
        //Act
        double faktiskAnbefaletDosisPrDoegn = Controller.getTestController().anbefaletDosisPrDoegn(patient, laegemiddel);

        //Assert
        double forventetAnbefaletDosisPrDoegn = 95.1;
        assertEquals(forventetAnbefaletDosisPrDoegn,faktiskAnbefaletDosisPrDoegn);

    }

    @Test
    void tc4_anbefaletDosisPrDoegn() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("123234-4937", "Børge Børgesen", 120);
        //Act
        double faktiskAnbefaletDosisPrDoegn = Controller.getTestController().anbefaletDosisPrDoegn(patient, laegemiddel);

        //Assert
        double forventetAnbefaletDosisPrDoegn = 180.0;
        assertEquals(forventetAnbefaletDosisPrDoegn,faktiskAnbefaletDosisPrDoegn);
    }

    @Test
    void tc5_anbefaletDosisPrDoegn() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
        Patient patient = new Patient("123234-4937", "Børge Børgesen", 126);
        //Act
        double faktiskAnbefaletDosisPrDoegn = Controller.getTestController().anbefaletDosisPrDoegn(patient, laegemiddel);

        //Assert
        double forventetAnbefaletDosisPrDoegn = 252.0;
        assertEquals(forventetAnbefaletDosisPrDoegn,faktiskAnbefaletDosisPrDoegn);
    }
}