package As1_Crops;
//TEST
public class As1_Crop {

    private String name;
    private double yield;
    private String units ;
    private double price ;
    private int acres ;


public As1_Crop(String n, double y, String u, double p){

    name = n;
    yield = y;
    units=u;
    price=p;
    acres = 0;


}//constructor

    public void setAcres(int acres) {
        this.acres = acres;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + "   " + yield + " " + units + " per acre to sell for $" +  +price +"/unit. There are currently " + acres + " acres of this crop planted";
    }//toString



    public double harvest(){
System.out.println(name + " is selling for $" + price +" per " +units  );
double soldFor = (price * yield *acres  );

System.out.println("You sold all your " + name +" for $" + soldFor );
acres=0;

return soldFor;
    }

    public void plantCrops(int numPlanting){
acres += numPlanting;
System.out.println(numPlanting + " acres of " + name + " were planted");

    }


}
