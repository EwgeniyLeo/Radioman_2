package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio userRadio = new Radio();

    @Test
    void getCurrentRadioStation() {
        userRadio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getMoreThanMaxRadioStation() {
        userRadio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getLessThanMinRadioStation() {
        userRadio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStation() {
        userRadio.setCurrentRadioStation(8);
        userRadio.Next();
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseMaxRadioStation() {
        userRadio.setCurrentRadioStation(9);
        userRadio.Next();
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseRadioStation() {
        userRadio.setCurrentRadioStation(1);
        userRadio.Prev();
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseLessThanMinRadioStation() {
        userRadio.setCurrentRadioStation(0);
        userRadio.Prev();
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioVolume() {
        userRadio.setCurrentSoundVolume(98);
        int expected = 98;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getMoreThanMaxRadioVolume() {
        userRadio.setCurrentSoundVolume(101);
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getLessThanMinSoundVolume() {
        userRadio.setCurrentSoundVolume(-1);
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseRadioVolume() {
        userRadio.setCurrentSoundVolume(10);
        userRadio.NextSoundVolume();
        int expected = 11;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseMoreThanMaxRadioVolume() {
        userRadio.setCurrentSoundVolume(100);
        userRadio.NextSoundVolume();
        int expected = 100;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseRadioVolume() {
        userRadio.setCurrentSoundVolume(1);
        userRadio.PrevSoundVolume();
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseLessThanMinRadioVolume() {
        userRadio.setCurrentSoundVolume(0);
        userRadio.PrevSoundVolume();
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getMaxRadioStation() {
        Radio userRadio = new Radio(30);
        int expected = 29;
        int actual = userRadio.getMaxRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getMoreThanMaxRadioStation1() {
        Radio userRadio = new Radio(30);
        userRadio.setCurrentRadioStation(30);
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseMaxRadioStation1() {
        Radio userRadio = new Radio(30);
        userRadio.setCurrentRadioStation(29);
        userRadio.Next();
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}
