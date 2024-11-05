public class Person {

    // instance fields
    private String name;
    private int age;
    private String gender;
    private boolean isMarried;

    // static fields
    public static final String scientificName = "Homo Sapiens";
    private static int personCount = 0;

    // constructors
    // no-arg constructor
    // Explicitly declaring the no-arg constructor
    // This will not implicitly defined if we have already declared other
    // constructors
    public Person() {
        personCount++;

    };

    // Parameterized constructor / all-args constructor
    // this keyword refers to the current instance of the object
    public Person(String name, int age, String gender, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        personCount++;
    }

    public Person(String name, int age) {
        // this.name = name;
        // this.age = age;
        // this.gender = "unknown";
        // this.isMarried = false;
        this(name, age, "unknown", false);
    }

    // copy constructor
    public Person(Person person) {
        // this.name = person.name;
        // this.age = person.age;
        // this.gender = person.gender;
        // this.isMarried = person.isMarried;
        this(person.name, person.age, person.gender, person.isMarried);

    }

    // instance methods
    public void greet() {
        System.out.println("Hello World, I'm " + name + " and i am " + age + " year old " + gender + ".");
        System.out.println(isMarried ? "I am married" : "Not married");
    }

    public void eat(String meal) {
        System.out.println(name + " is currently eating " + meal + ".");
    }

    // gettters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    // override annotation is for java to check and confirm that the method name we
    // write indeed exist
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", isMarried=" + isMarried + "]";
    }

    // static method
    public static int getPersonCount() {
        return personCount;
    }

}
