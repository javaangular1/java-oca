package w2.farmer;

import w2.farm.Chicken;
import w2.farm.Cow;

public class Farmer {

    public static void main(String[] args) {
        // Generate objects from Chicken and Cow classes
        Chicken chicken1 = new Chicken("chicken1");
        Chicken chicken2 = new Chicken("chicken2");
        Cow cow1 = new Cow("cow1");
        Cow cow2 = new Cow("cow2");
        // Print chicken and cow numbers and names
        System.out.println("Cow count: " + Cow.count);
        System.out.println("Chicken count: " + Chicken.count);
        System.out.println("Chicken name :" + chicken1.getName());
        System.out.println("Chicken name :" + chicken2.getName());
        System.out.println("Cow name :" + cow1.getName());
        System.out.println("Cow name :" + cow2.getName());
    }
}
