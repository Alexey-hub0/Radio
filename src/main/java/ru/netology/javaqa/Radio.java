package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numbersOfRadioStations;

    public Radio() {
        numbersOfRadioStations = 10;
    }

    public Radio(int numbersOfRadioStations) {
        this.numbersOfRadioStations = numbersOfRadioStations;
    }

    public int getNumbersOfRadioStations() {
        return numbersOfRadioStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation > numbersOfRadioStations - 1) {
            return;
        }
        if (CurrentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation == numbersOfRadioStations - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void deincreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}
