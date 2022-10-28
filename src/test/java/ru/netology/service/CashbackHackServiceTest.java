package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void testRemain() {
        int actual = cashbackHackService.remain(500);
        int expected = 400;

        assertEquals(actual, expected);
    }
}