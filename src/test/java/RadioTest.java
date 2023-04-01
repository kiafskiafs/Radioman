import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentStation_InvalidNumber_LowerBound() {
        Radio radio = new Radio(5, 5);
        radio.setCurrentStation(-1);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation_InvalidNumber_UpperBound() {
        Radio radio = new Radio(5, 5);
        radio.setCurrentStation(10);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation_ValidNumber() {
        Radio radio = new Radio(5, 5);
        radio.setCurrentStation(2);
        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void setVolume_InvalidVolume_LowerBound() {
        Radio radio = new Radio(5, 5);
        radio.setVolume(-1);
        Assertions.assertEquals(5, radio.getVolume());
    }

    @Test
    public void setVolume_InvalidVolume_UpperBound() {
        Radio radio = new Radio(5, 5);
        radio.setVolume(11);
        Assertions.assertEquals(5, radio.getVolume());
    }

    @Test
    public void setVolume_ValidVolume() {
        Radio radio = new Radio(5, 5);
        radio.setVolume(7);
        Assertions.assertEquals(7, radio.getVolume());
    }

    @Test
    public void next_CurrentStationIs9() {
        Radio radio = new Radio(9, 5);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void next_CurrentStationIsNot9() {
        Radio radio = new Radio(5, 5);
        radio.next();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prev_CurrentStationIs0() {
        Radio radio = new Radio(0, 5);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prev_CurrentStationIsNot0() {
        Radio radio = new Radio(5, 5);
        radio.prev();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void increaseVolume_VolumeIs10() {
        Radio radio = new Radio(5, 10);
        radio.increaseVolume();
        Assertions.assertEquals(10, radio.getVolume());
    }

    @Test
    public void increaseVolume_VolumeIsNot10() {
        Radio radio = new Radio(5, 5);
        radio.increaseVolume();
        Assertions.assertEquals(6, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeIs0() {
        Radio radio = new Radio(5, 0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeIsNot0() {
        Radio radio = new Radio(5, 5);
        radio.decreaseVolume();
        Assertions.assertEquals(4, radio.getVolume());
    }

}
