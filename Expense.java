public class Expense {
    private String name;
    private int amount;

    public Expense() {

    }

    public Expense(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Expense [name=" + name + ", amount=" + amount + "]";
    }

}
