public class countingLegs
{
    public static void main(String args[]) {
        int legs = countLegs(3, 4, 10);
        System.out.print("Leg count = " + legs);
    }

    public static int countLegs(int chickens, int cows, int pigs){
        int total = (chickens * 2) + ((cows + pigs) * 4);
        return total;
    }
}