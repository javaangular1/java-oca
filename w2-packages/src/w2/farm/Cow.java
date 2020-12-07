package w2.farm;

public class Cow {

    private String name;
    public static int count=0;

    public Cow(String pName) {
        this.name = pName;
        count++;

        if (pName==null){
            this.name= "Cow " + count;
        }
    }

    public String getName() {
        return this.name;
    }
}