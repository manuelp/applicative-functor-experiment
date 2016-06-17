package me.manuelp.afexperiment.types;

public class Man extends Nameable {
  private Man(String name) {
    super(name);
  }

  public static Man man(String name) {
    return new Man(name);
  }

}
