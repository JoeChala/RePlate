package com.replate;

public class App {

  public String getMessage() {
    return "RePlate is running!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getMessage());
  }
}
