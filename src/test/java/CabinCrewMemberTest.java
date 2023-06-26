import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("Jenifer", Rank.FLIGHT_ATTENDANT);

    }

    @Test
    public void crewMemberHasName(){
        assertEquals("Jenifer", cabinCrewMember.getName());
    }

    @Test
    public void setCrewMemberHasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessages(){
        assertEquals("Sit down and let's fly people", cabinCrewMember.canRelayMessages());
    }
}
