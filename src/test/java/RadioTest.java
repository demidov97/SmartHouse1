import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNumberStation() {
        Radio radio = new Radio();

        radio.setNumberStation(6);//change for:20;-3;0;9;1;8;10;-1

        int expected = 6;//change for:20;0;0;9;1;8;0;0
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberStationInStart() {
        Radio radio = new Radio();

        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberStationInEnd() {
        Radio radio = new Radio();

        radio.setNumberStation(15);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext() {
        Radio radio = new Radio();

        radio.setNumberStation(0);//change for:1;8;5

        radio.next();

        int expected = 1;//change for:2;9;6
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxNext() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrev() {
        Radio radio = new Radio();

        radio.setNumberStation(9);//change for:1;8;5

        radio.prev();

        int expected = 8;//change for:0;7;4
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinPrev() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);//change for:-1;1;99;101;50

        int expected = 0;//change for:0;1;99;0;50
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeInMin() {
        Radio radio = new Radio();

        radio.setVolume(-10);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeInMax() {
        Radio radio = new Radio();

        radio.setVolume(110);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);//change for:1;99,50

        radio.increaseVolume();

        int expected = 1;//change for:2;100;51
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseMaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(1);//change for:99;100,50;

        radio.decreaseVolume();

        int expected = 0;//change for:98,99,49
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseMinVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}

