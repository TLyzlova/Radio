package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int currentVolume,
                 int currentStation) {
        this.currentVolume = currentVolume;
        this.currentStation = currentStation;

    }

    public Radio() {
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        }
        else {
            this.currentStation = currentStation + 1;
        }

    }

    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        }
        else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void getMaxVolume () {
        if (currentVolume >= maxVolume) {
            return;
        }
        else currentVolume = currentVolume + 1;
    }


    public void getMinVolume () {
        if (currentVolume <= minVolume) {
            return;
        } else currentVolume = currentVolume - 1;
    }


    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }
}
