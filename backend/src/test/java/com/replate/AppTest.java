package com.replate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void shouldReturnRePlateMessage() {
        App app = new App();

        assertEquals("RePlate is running!", app.getMessage());
    }
}
