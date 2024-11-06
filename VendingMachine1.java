import java.util.ArrayList;

public class VendingMachine1 {
    enum Drink {
        COKE("Coca-Cola", 1.5),
        SPRITE("Sprite", 1.5),
        FANTA("Fanta Orange", 1.2),
        WATER("Mineral Water", 0.8);

        public final String displayName;
        public final double cost;

        Drink(String displayName, double cost) {
            this.displayName = displayName;
            this.cost = cost;
        }
    }

    private record TransactionsRecord(String drink, double amt) {
    }

    private String location;
    private double earnings;
    private double balance;
    private ArrayList<TransactionsRecord> allTransactions = new ArrayList<>();

    public VendingMachine1(String location) {
        this.location = location;
        this.earnings = 0;
        this.balance = 0;
    }

    public String insertCoin() {
        Boolean isInserting = true;
        while (isInserting) {
            try {
                String input = System.console().readLine("Please insert coins: $").toUpperCase();
                if (input.equals("PRINT EARNINGS")) {
                    printEarnings();
                } else if (input.equals("PRINT TRANSACTIONS")) {
                    printTransactions();
                } else if (input.equals("EXIT")) {
                    return "EXIT";
                } else {
                    double amt = Double.parseDouble(input);
                    if (amt <= 0) {
                        System.out.println("\nInvalid. Please insert coins");
                    } else {
                        this.balance += amt;
                        getPrice();
                        isInserting = false;
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("\nInvalid. Please insert coins");
            }
        }
        // Ensure a return value when the loop ends
        // This could be a placeholder value depending on your use case
        return "ERROR"; // Default return value if the loop exits (should never be reached if loop
                        // continues properly)

    }

    private void getPrice() {
        System.out.println("1. " + Drink.COKE.displayName + " : $" + Drink.COKE.cost);
        System.out.println("2. " + Drink.SPRITE.displayName + " : $" + Drink.SPRITE.cost);
        System.out.println("3. " + Drink.FANTA.displayName + " : $" + Drink.FANTA.cost);
        System.out.println("4. " + Drink.WATER.displayName + " : $" + Drink.WATER.cost);
        selectDrink();

    }

    private void selectDrink() {
        Boolean isSelecting = true;
        while (isSelecting) {
            try {
                int selection = Integer.parseInt(System.console().readLine("Please select your drink: "));
                switch (selection) {
                    case 1 -> dispenseDrink(Drink.COKE.displayName, Drink.COKE.cost);
                    case 2 -> dispenseDrink(Drink.SPRITE.displayName, Drink.SPRITE.cost);
                    case 3 -> dispenseDrink(Drink.FANTA.displayName, Drink.FANTA.cost);
                    case 4 -> dispenseDrink(Drink.WATER.displayName, Drink.WATER.cost);
                    default -> System.out.println("\nNo such selection. Please try again");
                }
                isSelecting = false;
            } catch (NumberFormatException e) {
                System.out.println("\nNo such selection. Please try again");
            }
        }

    }

    private void dispenseDrink(String drink, double cost) {
        if (this.balance < cost) {
            double shortage = cost - this.balance;
            System.out.printf("\ninsufficient coins. Please insert $%.2f more\n", Math.abs(shortage));
            insertCoin();
        } else if (this.balance > cost) {
            double change = this.balance - cost;
            System.out.println("\nDrink dispensed. Enjoy your drink");
            System.out.printf("Please take your change of $%.2f\n", change);
            this.balance = 0;
            this.earnings += cost;
            this.allTransactions.add(new TransactionsRecord(drink, cost));
        } else {
            System.out.println("\nDrink dispensed. Enjoy your drink\n");
            this.balance = 0;
            this.earnings += cost;
            this.allTransactions.add(new TransactionsRecord(drink, cost));
        }
    }

    private void printEarnings() {
        System.out.printf("\nTotal Earnings: $%.2f\n", this.earnings);
    }

    private void printTransactions() {
        int index = 0;
        System.out.println("\nTransactions: ");
        for (TransactionsRecord transaction : this.allTransactions) {
            index++;
            System.out.println("Transaction " + index + "." + transaction.drink + " : $" + transaction.amt);
        }

    }

}
