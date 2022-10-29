package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {


    CashbackHackService service = new CashbackHackService();

    @Test
    public void CheckAmountLessThanTest() {

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void CheckingMultipleValueTest() {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void CheckAmountMoreThan1000Test() {

        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

}