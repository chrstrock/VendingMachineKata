package com.tddkatas.vendingmachine.tests;

import com.tddkatas.vendingmachine.models.Coin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTests {

    @Test
    public void PennyTest() {
        // Arrange
        Coin coin = Coin.PENNY;

        // Act
        int result = coin.getValue();
        // Assert
        assertEquals(1, result);
    }

    @Test
    public void NickelTest() {
        // Arrange
        Coin coin = Coin.NICKEL;

        // Act
        int result = coin.getValue();
        // Assert
        assertEquals(5, result);
    }

    @Test
    public void DimeTest() {
        // Arrange
        Coin coin = Coin.DIME;

        // Act
        int result = coin.getValue();
        // Assert
        assertEquals(10, result);
    }

    @Test
    public void QuarterTest() {
        // Arrange
        Coin coin = Coin.QUARTER;

        // Act
        int result = coin.getValue();
        // Assert
        assertEquals(25, result);
    }
}
