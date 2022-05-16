public class Japan{
    
    private int population;
    //The total overall population of Japan, as set by the constructor.
    
    private City Sapporo = new City("Sapporo", 1952000, false);
    private City Tokyo = new City("Tokyo", 13960000, true);
    private City Yokohama = new City("Yokohama",3725000, false);
    private City Nagoya = new City("Nagoya", 2296000, false);
    private City Kyoto = new City("Kyoto", 1475000, true);
    private City Nara = new City("Nara",360000, true);
    private City Osaka = new City("Osaka",2961000, true);
    private City Kobe = new City("Kobe",1537000, false);
    private City Hiroshima = new City("Hiroshima",1194000, false);
    private City Okinawa = new City("Okinawa",1340000, false);
    //Instantiates the City variables with their required information.

    private City[] cities = {Sapporo, Tokyo, Yokohama, Nagoya, Kyoto, Nara, Osaka, Kobe, Hiroshima, Okinawa};
    //Array of cities.

    private final String language = "Japanese";
    //The language will always be Japanese.
    
    public Japan(){
        population = 125800000;
    }
    //No argument contstructor will set the population to the current estimate.
    
    public Japan(int p){
        population = p;
    }
    //Sets the population to whatever value is specified by the user.

    public int getPopulation(){
        return population;
    }
    //Returns the population.

    public String getLanguage(){
        return language;
    }
    //Returns the language; always Japanese.

    /*
    Returns a string which specifies the city's size into 3 categories: small, medium, or large. This is in 
    comparison with other Japanese cities, so a large city in Japan would probably be considered medium in the US.
    */
    public String getCitySize(String city){
        String size = "";
        for (int i = 0; i < cities.length; i++){
            if (cities[i].getName().equals(city)){
                if (cities[i].getPopulation() > 1750000){
                    size = "large";
                }else if(cities[i].getPopulation() < 1749999 && cities[i].getPopulation() > 1250000){
                    size = "medium";
                }else if(cities[i].getPopulation() < 1250000){
                    size = "small";
                }
            }
        }
        return size; 
    }


    /*
    Returns a boolean which specifies whether or not the city is or has ever been the Japanese capital. The capital
    was moved around a lot during imperial times, so a lot of cities have been the capital in the past.
    */
    public boolean capitalStatus(String city){
        boolean capital = false;
        for (int i = 0; i < cities.length; i++){
            if (cities[i].getName().equals(city)){
                if (cities[i].wasCapital() == true){
                    capital = true;
                }
            }
        }
        return capital;
    }


//Returns an estimate of the population over time. Usually falls within a few years of Google's estimate.
    public int populationOverTime(int years){
        int pop = 0;
        int end = 0;
        for (int i = 0; i <= years; i++){
        pop = ((int) (population * 0.047));
        end = population - pop;
    }
        
        return end;
    }




}