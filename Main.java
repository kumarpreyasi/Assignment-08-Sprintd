public class Main {

    public static double totaleffort;

    public static void main(String[] args) {

        totaleffort = 0;
        addWorkEffort(100);
        addWorkEffort(50);
        addWorkEffort(20);
        addWorkEffort(360);
        addWorkEffort(80);
        addWorkEffort(160);
        addWorkEffort(500);
        addWorkEffort(240);
        addWorkEffort(40);
        addWorkEffort(40);

//        System.out.println("The total work effort is " +totaleffort+ " hours.");

        calcCapacity(8, 3, 40);
        calcCapacity(9, 3, 40);
        calcCapacity(10, 3, 40);
        calcCapacity(11, 3, 40);
        calcCapacity(8, 4, 40);
        calcCapacity(8, 5, 40);
        calcCapacity(8, 6, 40);

        calcCapacity(8, 3, 35);
        calcCapacity(9, 3, 35);
        calcCapacity(10, 3, 35);
        calcCapacity(11, 3, 35);
        calcCapacity(8, 4, 35);
        calcCapacity(8, 5, 35);
        calcCapacity(8, 6, 35);

        calcCapacity(8, 3, 30);
        calcCapacity(9, 3, 30);
        calcCapacity(10, 3, 30);
        calcCapacity(11, 3, 30);
        calcCapacity(8, 4, 30);
        calcCapacity(8, 5, 30);
        calcCapacity(8, 6, 30);

    }

    public static void addWorkEffort(double effort){

        totaleffort = totaleffort + effort;

    }

    public static void calcCapacity(int eng, int weeks, int workweek){

        double capacity = (totaleffort/(eng*weeks*workweek))*100;

        System.out.println("With " + eng + " devs working a " + weeks + " week sprint, for " + workweek + " hrs/wk, we would be at " + (int) capacity + "% of capacity.");

    }
}
