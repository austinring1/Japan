public class Main {
    public static void main(String[] args){
        Japan japan = new Japan(125800000);
        System.out.println("Japan's current population is " + japan.getPopulation());
        System.out.println("In 20 years, Japan's population will be roughly " + japan.populationOverTime(20));
        System.out.println("Sapporo is a " + japan.getCitySize("Sapporo") + " city.");
        System.out.println("Was Yokohama a capital of Japan?: " + japan.capitalStatus("Yokohama"));
        System.out.println("Was Kyoto a capital of Japan?: " + japan.capitalStatus("Kyoto"));
    }
}
