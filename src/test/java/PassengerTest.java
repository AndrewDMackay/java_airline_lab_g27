
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp(){
        passenger1 = new Passenger("name1", 1);
        passenger2 = new Passenger("name2", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("name1", passenger1.getPassengerName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(1, passenger1.getNumberOfBags());
    }
}
