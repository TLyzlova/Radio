package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();

    }

    @Test
    public void changeCurrentStation() {
        Radio radio = new Radio();
        int expected = 5;
        assertEquals (5, radio.getCurrentStation());
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());


    }

    @Test
    public void changeCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(1, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(1, radio.getCurrentVolume());
    }
}


