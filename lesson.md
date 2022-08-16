## Brief

### How to use the lesson sample code

There is one folder prepared for the lesson. 
- [Instructor's folder](./lesson=sample-code/)

Instructor to use the code provided for demonstration during the I DO segment. Learners will use the java file provided in the respective folder for practice during the WE DO segment.

### Any other announcements to instructors or learners

---

## Part 1 - Package creation

Create a working project folder and add two files, `Person.java` and `Main.java`.

In both files, add the line at the top

```java
package lesson_sample_code;
```

---

## Part 2 - Class attributes and methods

In `Person.java`, add the following code and discussion:

```java
public class Person {
  /* 
   * Classes and objects are the building blocks in OOP. An object is a concept 
   * that has attributes (their properties) and methods (their actions). Imagine 
   * a person, who has attributes like name, age, gender and who can  perform 
   * actions like eat, sleep, run, etc. Each person is a unique object with 
   * their own properties and methods.
   * 
   * A class is a blueprint to create objects. It is where attributes and methods
   * are defined.
   *
   * In Java, to create a class, create a file with the extension .java 
   * (E.g. * Person.java) In the file, the class name should match the filename.
   *
   * Attributes are variables that are common to all objects from the same class.
   */
  private String name;
  private int age;
  private String gender;
  private boolean isMarried;

  // Methods
  // Methods are functions that an objects can perform.
  public void greet() {
    System.out.println("Hello world, I'm " + this.name);
  }

  public void eat(String meal) {
    System.out.println("I am currently eating " + meal);
  }
```

---

## Part 3 - Class constructors

Continue coding in `Person.java` to add both the empty and parameterized constructors.

```java
  /*
   * Constructors are special method that are called when an object is 
   * instantiated (when the "new" keyword is used). The purpose of a 
   * constructor is to initialize values for the newly created object.
   *
   * An empty constructor can be used to create an object without any 
   * values for its attributes
   * 
   */
  public Person() {
  
  }

  // A constructor methods with parameters can be used to create objects with
  // initial values for its attributes.
  public Person(String name, int age, String gender, boolean isMarried) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.isMarried = isMarried;
  }
```

---

## Part 4 - Encapsulation, Accessor and Mutator Methods

Continue coding in Person.java to explain the concept of encapsulation and accessor and mutator methods.

```java
  /*
   * Encapsulation
   *
   * Encapsulation describes the bundling of data and methods that work on that 
   * one data unit, like a class in Java. This concept is also often used to
   * hide the internal representation, or state of an object from the outside.
   * This is called information hiding.
   * 
   * The keyword "private" is an access control keyword that is used to hide
   * attributes from being directly accessed. In order to access the values, 
   * accessor and mutator methods are used. These are more commmonly known as 
   * getters and setters respectively.
   
   * Getters - allows the retrieval of values
   *
   * Syntax:
   * public <data_type> getVariable() {
   *   return this.variable
   * }
   */
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String getGender() {
    return this.gender;
  }

  public boolean getIsMarried() {
    return this.isMarried;
  }

  // The keyword "this" refers to the instance of the object. "This" can be used
  // to refer to the attributes and methods of the object.

  /*
   * Setters are used to change the values of the attributes
   * 
   * Syntax:
   * public void setVariable(type variable) {
   *   this.variable = variable;
   * }
   */
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setIsMarried(boolean isMarried) {
    this.isMarried = isMarried;
  }
```

---

## Part 5 - Instantiation of objects

In `Main.java`, create a new object using the constructor

```java
public static void main(String args[]) {
  Person person1 = new Person("John Smith", 35, "M", false);
  // To create a new instance of the object, the "new" keyword is used.
  // Syntax:
  // Class variable = new Class(values);
}
```

---

## Part 5 - Accessing object' properties and methods

Add the following code to access the properties and methods of the object.

```java
  // To access the object's attributes, the dot notation is used together with the
  // getter method.
  System.out.println("Person 1's age is :" + person1.getAge());

  // To change the value of an attribute, the setter method is used
  person1.setIsMarried(true);

  // To use the methods on an object, use the dot notation.
  person1.eat("Burrito");
  person1.greet();
```

---

## Part 6 - Static keyword

In `Person.java`, add the following method:
```java
  /*
   * Static keyword is used to mark the variable or method available at the class
   * level. In other words, there is no need to create an instance of the class to
   * access it. 
   */
  public static void printObject() {
    System.out.println("I am a Person Object");
  }
```

In Main.java, add the following line:
```java
  // To use a static method, the class itself is called instead of the object
  // instance.
  Person.printObject();
```
