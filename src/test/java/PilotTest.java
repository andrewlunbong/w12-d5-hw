import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Jeff", Rank.CAPTAIN, "12345");
    }

    @Test
    public void hasName(){
        assertEquals("Jeff", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("12345", pilot.getLicenseNumber());
    }


    @Test
    public void pilotCanFly(){
        assertEquals("I believe I can fly", pilot.canFly());
    }

}
