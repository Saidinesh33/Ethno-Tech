interface Transaction {
    void UPI();
}

interface Transaction1 {
    void cash();
}

class Money implements Transaction, Transaction1 {

    @Override
    public void UPI() {
        System.out.println("UPI Transaction Success");
    }

    @Override
    public void cash() {
        System.out.println("Cash Transaction Success");
    }

    public void send() {
        System.out.println("Sending money to acc");
    }

    public void withdraw() {
        System.out.println("Withdraw success");
    }
}

public class Polimorphism {
    public static void main(String args[]) {

        Money mymoney = new Money();

        mymoney.UPI();
        mymoney.cash();
        mymoney.send();
        mymoney.withdraw();
    }
}