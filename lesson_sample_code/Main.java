package lesson_sample_code;
// A package is used to tell Java that the classes are related to each other.

public class Main {
  public static void main(String args[]) {
    Person person1 = new Person("John Smith", 35, "M", false);
    // To create a new instance of the object, the "new" keyword is used.
    // Syntax:
    // Class variable = new Class(values);

    // To access the object's attributes, the dot notation is used together with the
    // getter method.
    System.out.println("Person 1's age is :" + person1.getAge());

    // To change the value of an attribute, the setter method is used
    person1.setIsMarried(true);

    // To use the methods on an object, use the dot notation.
    person1.eat("Burrito");
    person1.greet();

    // To use a static method, the class itself is called instead of the object
    // instance.
    Person.printObject();
  }
}
