package me.manuelp.afexperiment;

import static fj.data.List.list;
import static me.manuelp.afexperiment.types.Man.man;
import static me.manuelp.afexperiment.types.Woman.woman;

import fj.data.List;
import me.manuelp.afexperiment.types.Child;
import me.manuelp.afexperiment.types.Man;
import me.manuelp.afexperiment.types.Woman;

public class Main {
  public static void main(String[] args) {
    List<Man> men = list(man("Jack"), man("John"), man("Bob"), man("Manuel"));
    List<Woman> women = list(woman("Shirley"), woman("Arianna"), woman("Natasha"));
    incrementPopulation(men, women).zipIndex().foreachDoEffect(p -> System.out.println(p._2() + " : " + p._1()));
    // Should generate 24 childs
  }

  private static List<Child> incrementPopulation(List<Man> men, List<Woman> women) {
    throw new RuntimeException("Not implemented");
  }
}
