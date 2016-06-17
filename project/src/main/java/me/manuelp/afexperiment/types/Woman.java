package me.manuelp.afexperiment.types;

public class Woman extends Nameable {
  private Woman(String name) {
    super(name);
  }

  public static Woman woman(String name) {
    return new Woman(name);
  }

}
