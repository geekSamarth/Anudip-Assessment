class BankB extends Bank{
    //simple method for getting the balance
    int getBalance(int balance) { return balance; }
    
    @Override
    int getBalance() {
        
        return 0;
    }
    
    }