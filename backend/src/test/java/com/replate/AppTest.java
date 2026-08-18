package com.replate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void shouldReturnRePlateMessage() {
    App app = new App();

    assertEquals("RePlate is running!", app.getMessage());
  }
}
