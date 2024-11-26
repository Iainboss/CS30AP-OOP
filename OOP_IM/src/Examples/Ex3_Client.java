package Examples;

public class Ex3_Client {


    private String name;
    private String address;
    private int lawnSize;
    private boolean hasDog;
    private double outstandingFees;


    //constructor method
    public Ex3_Client(String n, String a, int l, boolean b){
        name = n;
        address = a;
        lawnSize= l;
        hasDog = b;
        outstandingFees=0;



    }//constructor



    public Ex3_Client(String n, String a, int l, boolean b, double f){
        name = n;
        address = a;
        lawnSize= l;
        hasDog = b;
        outstandingFees=f;


    }//constructor

    public String toString(){
        return name + "   " + address + "   " + lawnSize + "   " + hasDog + "   " + outstandingFees;
    }//toString

    public void printMe(){
        System.out.println();
        System.out.println();
    }// printMe

    public void mowLawn(){
double baseFee=30;

if(lawnSize>200){
    baseFee+=0.1*lawnSize;
}
if(hasDog){
    baseFee+=50;
}

        outstandingFees+=baseFee;
//        System.out.println(name + " your lawn was mowed today for a charge of $" +baseFee );
//        System.out.println("Your outstanding fees are $" + outstandingFees);

    }//mowLawn function

    public void setHasDog(boolean hasDog) {
        this.hasDog = hasDog;
    }

    public void processPayment(double dollars){
        outstandingFees-=dollars;
        System.out.println(name + " you currently owe $" + outstandingFees);
    }


    public String getName() {
        return name;
    }



    public void delinquent(){
        double interest = 5+ outstandingFees *.1;
        System.out.println(name + " your payment is overdue, you have been charged interest of " + interest);
        outstandingFees += interest;
        if(outstandingFees>500 && hasDog){
            hasDog = false;

        }
    }

    public String getAddress() {
        return address;
    }

    public int getLawnSize() {
        return lawnSize;
    }


    //When you auto generate booleans, they often change to is, instead of getHasDog it changed to isHasDog. This can be changed.
    public boolean getHasDog() {
        return hasDog;
    }

    public double getOutstandingFees() {
        return outstandingFees;
    }
}//Ex3_Client Class

