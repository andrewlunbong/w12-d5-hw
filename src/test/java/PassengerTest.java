import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Shristi", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Shristi", passenger.getName());
    }

    @Test
    public void hasNumberOfBag(){
        assertEquals(10, passenger.getNumberOfBag());
    }
}
