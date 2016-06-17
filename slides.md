% An Experiment
% Manuel Paccagnella
% 2016-06-17

# Problem

```haskell
incrementPopulation :: [Man] -> [Woman] -> [Child]
reproduce :: Man -> Woman -> [Child]
```

# Rules

* Java (8+ is better)
* Can use [Functional Java](http://www.functionaljava.org/)
* `Man`, `Woman` and `Child` are defined by their names
    ```haskell
	data Man = Man String deriving (Eq, Show)
	data Woman = Woman String deriving (Eq, Show)
	data Child = Child String deriving (Eq, Show)
	```
* Names can be random [UUIDs](https://en.wikipedia.org/wiki/Universally_unique_identifier)
* The number of children for every `reproduce` call is a random number between 0 and 6
	```java
	new Random().nextInt(6);
	```
* Code should compile

# Solution

```java
private static List<Child> incrementPopulation(List<Man> men, List<Woman> women) {
  List<F<Woman, List<Child>>> fertileMen = men.map(reproduce());
  return List.join(women.apply(fertileMen));
}

private static F<Man, F<Woman, List<Child>>> reproduce() {
  return man -> woman -> 
    range(0, randomNumberBetween(0, 6))+1).map(n -> UUID.randomUUID()).map(UUID::toString);    
}
```