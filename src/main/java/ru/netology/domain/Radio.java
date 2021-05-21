package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;


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

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

//    public void increaseVolume() {
//        if (currentVolume < 10) {
//            currentVolume = currentVolume + 1;
//        }
//    }
//
//    public void decreaseVolume() {
//        if (currentVolume == 10) {
//            currentVolume = currentVolume - 1;
//        }
//    }
//
//    public void nextStation() {
//
//        if (currentStation < 9) {
//            currentStation++;
//        }
//    }
//
//    public void prevStation() {
//        if (currentStation > 0) {
//            currentStation = currentStation - 1;
//        }
//    }

}






