public class Radio {
    private int currentStation;
    private int volume;

    public Radio(int currentStation, int volume) {
        setCurrentStation(currentStation);
        setVolume(volume);
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation <= 9) {
            this.currentStation = currentStation;
        } else {
            System.out.println("Invalid station number.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Invalid volume level.");
        }
    }

    public void next() {
        if (currentStation == 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation == 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            setVolume(volume + 1);
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            setVolume(volume - 1);
        }
    }


}