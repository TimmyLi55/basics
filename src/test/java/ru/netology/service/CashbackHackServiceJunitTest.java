package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceJunitTest {


    CashbackHackService service = new CashbackHackService();

    @Test
    public void CheckAmountLessThanTest() {

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void CheckingMultipleValueTest() {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void CheckAmountMoreThan1000Test() {

        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected,actual);
    }



}
