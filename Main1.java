class Bank {
    void displaybank() {
        System.out.println("Bank : SBI");
    }
}

class Customer extends Bank {
    void displaycust() {
        System.out.println("Acc no : 29691A28D4");
        System.out.println("Customer : Sai Dinesh");

    }
}

class Balance extends Customer {
    void checkbal(){
        System.out.println("Balance : 33000/-");
    }
}

class Customer2 extends Bank {
    void displaycust() {
        System.out.println("Acc no : 123456789098765432");
        System.out.println("Customer : Ganesh");
    }

    void checkbal() {
        System.out.println("Balance : 23000/-");
    }

    void deposit() {
        System.out.println("Deposit : 100000/-");
    }

    void withdraw() {
        System.out.println("Withdraw : 50000/-");
    }
}

class Transaction extends Balance {
    void deposit() {
        System.out.println("Deposit : 10000/-");
    }
    void withdraw() {
        System.out.println("Woithdraw : 20000/-");
    }
}

class Main1 {
    public static void main(String[] args) {
        Transaction t=new Transaction();
        t.displaybank();
        t.displaycust();
        t.checkbal();
        t.deposit();
        t.withdraw();

        System.out.println();

        Customer2 c2=new Customer2();
        c2.displaybank();
        c2.displaycust();
        c2.checkbal();
        c2.deposit();
        c2.withdraw();
    }
}