public class Passenger{
    private String name;
    private int numberOfBag;

    public Passenger(String name, int numberOfBag){
        this.name = name;
        this.numberOfBag = numberOfBag;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfBag(){
        return numberOfBag;
    }
}
