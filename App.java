import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // String name1 = "Tony Stark";
        // int age1 = 35;
        // String gender1 = "male";
        // boolean isMarried1 = true;

        // String name2 = "Bruce Banner";
        // int age2 = 36;
        // String gender2 = "male";
        // boolean isMarried2 = false;

        // greet(name1, age1, gender1, isMarried1);
        // eat(name1, "burger");
        // greet(name2, age2, gender2, isMarried2);
        // eat(name2, "pizza");
        // Person personA = new Person();
        // personA.greet();
        // personA.eat("Burger");

        // all arg constructor
        Person tony = new Person("Tony Stark", 35, "Male", true);
        tony.greet();
        tony.eat("burger");

        // 2 arg constructor
        Person bruce = new Person("Bruce Banner", 40);
        bruce.greet();
        bruce.eat("Pizza");

        Person bruceClone = new Person(bruce);
        bruceClone.eat("Apple");
        System.out.println(tony.getName());
        System.out.println(tony.getGender());
        tony.setAge(50);
        tony.setMarried(false);
        ;
        System.out.println(Person.scientificName);

        Person peter = new Person();
        Person John = new Person();
        Person Allen = new Person();
        System.out.println("person count: " + Person.getPersonCount());
        System.out.println(tony.toString());

        // using the POJO
        ArrayList<Expense> expenses = new ArrayList<>();
        expenses.add(new Expense("food", 100));
        expenses.add(new Expense("transport", 500));
        System.out.println(expenses);

        // using record
        ArrayList<ExpenseR> expenses2 = new ArrayList<>();
        expenses2.add(new ExpenseR("food", 100));
        expenses2.add(new ExpenseR("transport", 500));
        System.out.println(expenses2);

        ExpenseR expenses3 = new ExpenseR("food", 10.5);
        expenses3.name();
        expenses3.amount();

        System.out.println("\nVending Machine");
        VendingMachine ntuVendingMachine = new VendingMachine("NTU");

        ntuVendingMachine.insertCoin(1);
        ntuVendingMachine.selectDrink(Drink.COKE); // should not dispense, insufficient payment
        ntuVendingMachine.insertCoin(0.5);
        ntuVendingMachine.selectDrink(Drink.COKE);

        ntuVendingMachine.insertCoin(0.5); // should not dispense, insufficient payment
        ntuVendingMachine.selectDrink(Drink.WATER);
        ntuVendingMachine.insertCoin(1);
        ntuVendingMachine.selectDrink(Drink.WATER);

        ntuVendingMachine.printEarnings();
        ntuVendingMachine.printTransactions();

    }

    public static void greet(String name, int age, String gender, boolean isMarried) {
        System.out.println("Hello World, I'm " + name + " and i am " + age + " year old" + gender + ".");

    }

    public static void eat(String name, String meal) {
        System.out.println(name + " is currently eating " + meal + ".");

    }
}