import java.util.*;


class Foods {

    private String name;
    private String flavor;
    private int foodgroup;		// Logical errors-- no semicolons
    private int calorie;

    public Foods(String name, String flavor, int foodgroup, int calorie) {		// Mismatched parameters foodgroup and calorie. Logical error. Can simply swap calorie and foodgroup in the parameters here.
        this.name = name;
        this.flavor = flavor;
        this.foodgroup = foodgroup;
        this.calorie = calorie;

    }
    String readName() {
        return this.name;
    }
    String readFlavor() {
        return this.flavor;
    }
    int readfoodgroup() {
        return this.foodgroup;
    }
    int readCalorie() {
        return this.calorie;
    }

    @Override
    public String toString() {
        return ("name: " + name + "\nflavor: " + flavor + "\nfoodgroup: " + foodgroup + "\ncalorie: " + calorie);
    }

}

public class JavaPracticeQuizTest {
    public static void main(String[] args) {
        ArrayList<Foods> foodDatabase = new ArrayList<Foods>();
        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        String input1;
        String input2;
        int input3;
        int input4;
        int x = 3;        // fixes runtime error of dividing by 0
        while (true) {
            System.out.println("Enter the name of the food and what about it tastes good.");
            input1 = text.nextLine();        // input1 is a String and this is a compiler error
            input2 = text.nextLine();
            System.out.println("To which foodgroup does it belong?\n1-Dairy\t2-Protein\t3-Carbohydrate\t4-Vegetable\t5-Fruit\t6-Bacon");
            input3 = number.nextInt();
            System.out.println("How many calories does a serving contain?");
            input4 = number.nextInt();
            foodDatabase.add(new Foods(input1, input2, input3, input4));
            System.out.println("Thank you for informing Skynet of this human food. The information must flow.\n");
            System.out.println("Divided across " + x + " portions, this would amount to" + input4 / x + " calories ea");
        }
    }
}
