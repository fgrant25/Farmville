public class Plot {

    public boolean needsWater;
    public int numberOfPlants;
    public String plantName;

    public Plot(){
        numberOfPlants=(int)(Math.random()*90+10);
        int PlantID=(int)(Math.random() *5);

        if (PlantID==0){
            plantName= "tomato";
        }else if(PlantID==1){
            plantName= "carrot";
        }else if(PlantID==2) {
            plantName = "lettuce";
        }else if(PlantID==3) {
            plantName = "tulip";
        }else {
            plantName = "empty";
            numberOfPlants=0;
        }
        int waterID=(int)(Math.random() *2);
        if(waterID==0 && !plantName.equals("empty")==false){
            needsWater=true;

        }else {
            needsWater = true;
        }

    }
    public void printPlotInfo(){
        System.out.println("*********PLOT INFO*********");
        System.out.println("Plant Name: "+plantName);
        System.out.println("number of Plants: "+numberOfPlants);
        System.out.println("plant needs water = "+needsWater);




    }
}
