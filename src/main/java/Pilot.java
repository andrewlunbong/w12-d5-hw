public class Pilot extends CrewMember {

    private String licenseNumber;

    public Pilot (String name, Rank rank, String licenseNumber){
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }


    public String getLicenseNumber(){
        return licenseNumber;
    }

    public String canFly(){
        return "I believe I can fly";
    }
}
