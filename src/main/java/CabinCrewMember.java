public class CabinCrewMember extends CrewMember {

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String canRelayMessages(){
        return "Sit down and let's fly people";
    }
}
