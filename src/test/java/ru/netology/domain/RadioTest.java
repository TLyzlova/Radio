package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCreate(){
        Radio radio = new Radio();

    }

    @Test
    public void changeCurrentStation(){
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());


}
    @Test
    public void changeCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test

    public void checkMaxStation(){
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxStation());
        radio.setMaxStation(9);
        assertEquals(9, radio.getMaxStation());
    }

    @Test

    public void checkMinStation(){
        Radio radio = new Radio();
        assertEquals(0, radio.getMinStation());
        radio.setMinStation(0);
        assertEquals(0, radio.getMinStation());
    }

    @Test

    public void checkMaxVolume(){
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxVolume());
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test

    public void checkMinVolume(){
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test

    public void checkNextStation(){
        Radio radio = new Radio();
        assertEquals(0, radio.getNextStation());
        radio.setNextStation(0);
        assertEquals(0, radio.getNextStation());
    }


}
