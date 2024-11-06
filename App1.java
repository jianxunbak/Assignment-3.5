public class App1 {
    public static void main(String[] args) {
        VendingMachine1 vMachine = new VendingMachine1("Bukit Batok");
        Boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nWelcome to the vending machine\n");
            if (vMachine.insertCoin().equals("EXIT")) {
                isRunning = false;
            } else if (vMachine.insertCoin().equals("ERROR")) {
                System.out.println("There is an error");
                isRunning = false;
            } else
                vMachine.insertCoin();

        }
    }

}
