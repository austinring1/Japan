public class City {
    
    private int population;
    //The population of the city.
    
    private String name;
    //The name of the city.

    private boolean capitalStatus;
    //Was/is the city capital of Japan?


    public City(String n, int p, boolean cs){
        name = n;
        population = p;
        capitalStatus = cs;
    }
    //Constructor.


    public int getPopulation(){
        return population;
    }
    //Returns the population of the city.

    public String getName(){
        return name;
    }
    //Returns the name of the city.

    public boolean wasCapital(){
        return capitalStatus;
    }
    //Returns the capital status of the city.    
}
