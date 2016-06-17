package me.manuelp.afexperiment.types;

public class Child extends Nameable {
  private Child(String name) {
    super(name);
  }

  public static Child child(String name) {
    return new Child(name);
  }

}
