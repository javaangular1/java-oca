package w2.farm;

public class Chicken {

    private String name;        // name can be reached only from this class. Added getter method to use it from Farmer Class
    public static int count=0;

    public Chicken(String pName) {
        this.name = pName;
        count++;

        if (pName==null){
            this.name= "Chicken " + count;
        }
    }

    public Chicken() {
        
    }

    public String getName() {          // Getter method to use private name variable
        return this.name;
    }
}
