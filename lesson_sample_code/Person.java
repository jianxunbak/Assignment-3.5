package lesson_sample_code;

public class Person {
    //Classes and objects are the building blocks in OOP.
    //An object is a concept that has attributes (their properties) and methods (their actions).
    //Imagine a person, a person has attributes like name, age, gender and a person can perform actions like eat, sleep, run, etc. Each person is a unique object with their own properties and methods.
    //A class is a blueprint to create objects. It is where attributes and methods are defined.

    //In Java, to create a class, create a file with the extension .java (Ex. Person.java)
    //And inside, the class name should match the file name.

    //Attributes
    //Attributes are variables that are common to all objects from the same class.
    private String name;
    private int age;
    private String gender;
    private boolean isMarried;

    //Methods
    //Methods are functions that an objects can perform.
    public void greet(){
        System.out.println("Hello world, I'm " + this.name);
    }

    public void eat(String meal){
        System.out.println("I am currently eating " + meal);
    }

    //Constructors are special method that are called when an object is instantiated (when the "new" keyword is used). The purpose of a constructor is to initialize values for the newly created object.

    //An empty constructor can be used to create an object without any values for its attributes
    public Person(){}

    //A constructor methods with parameters can be used to create objects with initial values for its attributes.
    public Person(String name, int age, String gender, boolean isMarried){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
    } 

    //Encapsulation
    /*
        Encapsulation describes the bundling data and methods that work on that data within one unit, like a class in Java. This concept is also often used to hide the internal representation, or state of an object from the outside. This is called information hiding.
    */
    //The keyword private is an access control keyword that is used to hide attributes from being directly accessed.
    //In order to access the values, accessor and mutator methods are used. These are more commmonly known as getters and setters respectively.

    //Getters - allows the retrieval of values
    //Syntax: 
    /*
    public <data_type> getVariable(){
        return this.variable
    }
    */
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    public boolean getIsMarried(){
        return this.isMarried;
    }

    //The keyword "this" refers to the instance of the object. "This" can be used to refer to the attributes and methods of the object.

    //Setters are used to change the values of the attributes
    /* Syntax:
    public void setVariable(type variable){
        this.variable = variable;
    }
    */
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setIsMarried(boolean isMarried){
        this.isMarried = isMarried;
    }

    //Static keyword is used to mark the variable or method available at the class level. In other words, there is no need to create an instance of the class to access it.
    public static void printObject(){
        System.out.println("I am a Person Object");
    }

}