package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void checkMaxStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void checkMinusStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        assertEquals(4, radio.getCurrentStation());
        radio.setCurrentStation(-5);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void checkNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void checkLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void checkPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void checkLimitMinStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void checkMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void checkMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-8);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void checkIncreseCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.getMaxVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void checkLimitMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.getMaxVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void checkDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        assertEquals(9, radio.getCurrentVolume());
        radio.getMinVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void checkLimitMinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.getMinVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}