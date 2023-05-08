import java.util.ArrayList;

public class MyFarm {
    //DECLARATION SECTION
    ArrayList<Plot> row;


    public static void main(String[] args) {
        // System.out.println("this is my farm");
        MyFarm NewMcdonald = new MyFarm();
    }

    public MyFarm() {
        //construct objects
        row = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            row.add(new Plot());

        }

        //test object by using the printPlotInfo method
        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();
        }

//MyFarm is the constructor for method
    plantWithMinNumber();
    plantWithMaxNumber();
    }


    public void totalPlants() {

        int total = 0;
        System.out.println("**********TOTAL PLANTS**********");
        for (int s = 0; s < row.size(); s++) {
            total = total + row.get(s).numberOfPlants;
        }
        System.out.println("total plants in row: " + total);
    }

    public void printPlantNames() {

        System.out.println("**********TOTAL PLANTS**********");
        for (int i = 0; i < row.size(); i++) {
            System.out.print(i + ": " + row.get(i).plantName + ", ");

        }
        System.out.println();
    }

    public void addLettuce() {
        System.out.println("*********ADD LETTUCE********");
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;

    }

    public void printRowInfo() {
        //put this in a for loop
        //row.get(k).printPlotInfo()
        for (int k = 0; k < row.size(); k = k + 2) {
            row.get(k).printPlotInfo();
            // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        }
    }


        public void totalCarrots () {

            System.out.println("*** # OF PLOTS OF CARROTS ***");
            int total = 0;
            for (int k = 0; k < row.size(); k++) {
                if (row.get(k).plantName.equals("carrot ")) {
                    total = total + row.get(k).numberOfPlants;
                }
            }

            System.out.println("# Carrots = " + total);
            System.out.println();
            // how many total carrot plants are there?
        }


        public void averageNumberOfPlants () {
            // what is the average number of plants across the whole row?
            System.out.println("*** AVERAGE NUMBER OF PLANTS ***");
            int total = 0;
            int avg;
            for (int k = 0; k < row.size(); k++) {
                total = total + row.get(k).numberOfPlants;
            }
            avg = total / 10;

            System.out.println("average # of plants " + avg);
        }


        public void number0fCarrotplots () {
            System.out.println("*** # OF PLOTS OF CARROTS ***");
            int total = 0;
            for (int k = 0; k < row.size(); k++) {
                if (row.get(k).plantName.equals("carrot ")) {
                    total++;
                }
            }

            System.out.println("# Carrots = " + total);
            System.out.println();
        }


        public void number0fEmptyPlots () {
            System.out.println("********** # EMPTY PLOTS **********");
            int total = 0;
            for (int i = 0; i < row.size(); i++) {
                if (row.get(i).plantName == "'empty ") {
                    total++;
                }
            }
            System.out.println("" + total);
            System.out.println();

        }
        public void everyOtherNeedsWater () {
            System.out.println("*** EVERY OTHER NEEDS WATER ***");
            for (int k = 0; k < row.size(); k = k + 2) {
                row.get(k).needsWater = true;
            }
            System.out.println();

            // change the value of needsWater to be true for every other plot
        }
        public void greaterThan10 () {
            // how many plots have more than 10 plants in the plot?

        }


    public void plantWithMinNumber() {
        System.out.println("**********PLANT WITH MINIMUM NUMBER*************");
        int totalCarrots=0;
        int totalTomatoes = 0;
        int totalTulips = 0;
        int totalLettuce = 0;
        //step 1 add up the total carrots. total tomatoes, total tulips, and total lettuce
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                totalCarrots = totalCarrots + row.get(k).numberOfPlants;
            }
            if (row.get(k).plantName.equals("tomato")) {
                totalTomatoes = totalTomatoes + row.get(k).numberOfPlants;
            }
            if (row.get(k).plantName.equals("tulip")) {
                totalTulips = totalTulips + row.get(k).numberOfPlants;
            }
            if (row.get(k).plantName.equals("lettuce")) {
                totalLettuce = totalLettuce + row.get(k).numberOfPlants;
            }


        }
        //step 2 compare each individual plant total to find the smallest (greater than 0)
        int currentMin = 1;
        String plantType = "empty";

        if (totalCarrots < totalTomatoes && totalCarrots > 0) {
            currentMin = totalCarrots;
            plantType = "carrot";
        } else if (totalCarrots < totalTomatoes) {
            currentMin = totalTomatoes;
            plantType = "tomato";
        }
        if (totalTulips < currentMin && totalTulips > 0) {
            currentMin = totalTulips;
            plantType = "tulip";

        }
        if (totalLettuce<currentMin && totalLettuce>0){
            currentMin=totalLettuce;
            plantType="lettuce";
        }
        System.out.println("the min plant type is " + plantType+ " with " + currentMin + " plants");
    }

    public void plantWithMaxNumber()
    {System.out.println("**********PLANT WITH MAXIMUM NUMBER*************");
        int totalCarrots=0;
        int totalTomatoes = 0;
        int totalTulips = 0;
        int totalLettuce = 0;
        //step 1 add up the total carrots. total tomatoes, total tulips, and total lettuce
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                totalCarrots = totalCarrots + row.get(k).numberOfPlants;
            }
            if (row.get(k).plantName.equals("tomato")) {
                totalTomatoes = totalTomatoes + row.get(k).numberOfPlants;
            }
            if (row.get(k).plantName.equals("tulip")) {
                totalTulips = totalTulips + row.get(k).numberOfPlants;
            }
            if (row.get(k).plantName.equals("lettuce")) {
                totalLettuce = totalLettuce + row.get(k).numberOfPlants;
            }


        }
        //step 2 compare each individual plant total to find the smallest (greater than 0)
        int currentMax = 1;
        String plantType = "empty";

        if (totalCarrots > totalTomatoes) {
            currentMax = totalCarrots;
            plantType = "carrot";
        } else if (totalCarrots < totalTomatoes) {
            currentMax = totalTomatoes;
            plantType = "tomato";
        }
        if (totalTulips > currentMax && totalTulips > 0) {
            currentMax = totalTulips;
            plantType = "tulip";

        }
        if (totalLettuce>currentMax ){
            currentMax=totalLettuce;
            plantType="lettuce";
        }
        System.out.println("the max plant type is " + plantType+ " with " + currentMax + " plants");
    }
    }

