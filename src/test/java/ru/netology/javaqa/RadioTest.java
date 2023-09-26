package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldSetCurrentRadioStationAboveLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNext() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNext2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationPrev() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationPrev2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(7);
        vol.increaseVolume();
        int expected = 8;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.increaseVolume();
        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(7);
        vol.decreaseVolume();
        int expected = 6;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.decreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultNumberOfRadioStations() {
        Radio rad = new Radio();

        rad.getNumbersOfRadioStations();
        int actual = rad.getNumbersOfRadioStations();

        Assertions.assertEquals(10, actual);

    }

    @Test
    public void changeNumbersOfRadioStations() {
        Radio rad = new Radio(12);

        int actual = rad.getNumbersOfRadioStations();
        Assertions.assertEquals(12, actual);

    }

    @Test
    public void RadioStationNewChange() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(9);
        rad.next();
        int expected = 10;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}