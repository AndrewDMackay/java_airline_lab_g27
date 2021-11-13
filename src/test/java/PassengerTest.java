
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
        assertEquals("name1", passenger1.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(1, passenger1.getNumberOfBags());
    }
}

//          Assumptions..

//          Each passenger bag weighs the same..

//          Planes reserve half of their total weight for passenger bags..

//          The weight of bag per person is the weight reserved for passenger bags divided by the capacity..

//          Passengers exist for a single flight only..
