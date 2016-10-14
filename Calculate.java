public class Calculate {
    
    private int myCarsPerDay;
    private int myNumberofLanes;
    private int myNumberOfTurns;
    
    public Calculate(int cars, int lanes, int turns) {
        myCarsPerDay = cars;
        myNumberOfLanes = lanes;
        myNumberOfTurns = turns;
    }
    
    public double calcInstalationCost() {
        double tileArea = 3.216;
        double tileCost = 122.23;
        double intersectionArea = 12.96 * myLanes;
        double numberOfTiles = (int)(intersectionArea / tileArea);
        return tileCost * numberOfTiles;
    }
    
    
    public double[] calcProfits() {
        int[] profits = new int[3];
        int energyPerTileCompress = TODO;
        int installationCost = calcInstallationCost;
        int yearlyEnergyProduction = myCarsPerDay * energyPerCompress * 
        for (int i = 0; i < profits.length; i++) {
            profits[i] = 
    }
    
    
        
