package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain1() {
        int amount = 850;
        int expected = 150;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain2() {
        int amount = 999;
        int expected = 1;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain3() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain4() {
        int amount = 1001;
        int expected = 999;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemain5() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}