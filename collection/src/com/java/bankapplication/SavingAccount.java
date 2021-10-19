package com.java.bankapplication;
import java.lang.Math;

public class SavingAccount extends AbastratAccount{
    private  int safetyDepositBox;
   private int  accesscode;

    public SavingAccount(String name,String ssN,double balance){
        super(name,ssN,balance);

        AccontNumber = "1" + AccontNumber;
       setSafetyDepositBox();
       //setAccesscode();
       // int afetyDepositBox;
      //  int accesscode;

    }
    @Override
    public void printBalance(){
        //System.out.println("" + balance);
    }
    @Override
    public void  setRate(){

       rate = getBaseRate()-25;
    }
    public void setSafetyDepositBox(){
         this. safetyDepositBox =  (int)(Math.random()*Math.pow(10,3));

        //System.out.println(safetyDepositBox);
        //System.out.println(accesscode);


    }

    public void setAccesscode() {
        this.accesscode =  (int) (Math.random()*Math.pow(10,4));;
    }

    public int getSafetyDepositBox() {
        return safetyDepositBox;
    }

    public int getAccesscode() {
        return accesscode;
    }

    @Override
    public void showInfo(){

        System.out.println( "name" +name + "\nbalance" + balance  +
                "\nAccount Type:" + "Checking Account"+ "\nsafety deposit box" + getSafetyDepositBox() +
                "\naccess code" + getAccesscode());}

}
