package com.java.bankapplication;

public class CheckingAccount extends AbastratAccount{
    private int debitCardNumber;
    private int debitCardPinNumber;
    public CheckingAccount(String name,String ssN,double balance ){
        super(name,ssN,balance);
        AccontNumber = "2" + AccontNumber;
        //System.out.println("Cheking account:" + this.AccontNumber);
        setDebitCardNumber();
    }
    public int setDebitCardNumber(){
        debitCardNumber = (int)(Math.random()*Math.pow(10,12));
        return debitCardNumber;

    }
public int seDebitCardPinNumber(){
    debitCardPinNumber = (int)(Math.random()*Math.pow(10,4));

    return debitCardPinNumber;

}
@Override
public void printBalance(){
        System.out.println("your balance is " + balance);
}
@Override
public void setRate(){

       rate = getBaseRate()*15;
}
public void showInfo(){
        //super.showInfo();
        System.out.println("Account type saving:" + AccontNumber + "debit card number:" + debitCardNumber +
                "debit card pin number:"+ debitCardPinNumber);
}
//string toString(){




}
