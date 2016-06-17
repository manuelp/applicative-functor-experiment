package me.manuelp.afexperiment.types;

import java.util.Objects;

public abstract class Nameable {
  private final String name;

  protected Nameable(String name) {
    if (name == null)
      throw new IllegalArgumentException("Name cannot be null!");
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Nameable nameable = (Nameable) o;
    return Objects.equals(getName(), nameable.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "{" + "name='" + name + '\'' + '}';
  }
}
