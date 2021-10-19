package com.java.bankapplication;

public abstract class AbastratAccount implements IbaseRate{
    String name;
    String AccontNumber;
    double balance;
    double initialDeposit;
    String ssN;
    double rate;
    private static int index=1000;
    //transfer
    // withdraw
    //show inf

    public AbastratAccount(String name,String ssN ,double initialDeposit){

        this.name= name;
        this.ssN = ssN;
        this.balance = initialDeposit;
        this.AccontNumber = setAccountNumber();
        //System.out.println("NEW AACOUNT" );
       System.out.println("name:" + name+ "\n"+ "social security number:" + ssN +"\n" + "balance" +
                balance);
        index++;
        showInfo();
        //transfer();
       // withdraw();
        setRate();
       printBalance();

    }

    protected abstract void printBalance();

    public abstract void setRate();
    public void transfer(double amount){
        balance = balance-amount;
    }
    public void deposit(double amount){
        balance = balance-amount;
    }
    public void withdraw(double amount){
        balance = balance-amount;
    }
    public void compoundInterest(){

        double accuredInterest =balance*(rate/100);
        balance = balance +accuredInterest;
        printBalance();
    }
    public abstract void showInfo();//{System.out.println("NAME:" +name + "\nAccount Number:"+ AccontNumber + "\nBalance" + balance);


    private String setAccountNumber(){
        String lastTwoOfssN = ssN.substring(ssN.length()-2,ssN.length());
        int uniqueId = index;
        int randomNumber = (int) (Math.random()*Math.pow(10,3));
        return lastTwoOfssN + uniqueId +randomNumber;


    }

}
