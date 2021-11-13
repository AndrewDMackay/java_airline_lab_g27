
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;

    @Before
    public void setUp(){
        pilot1 = new Pilot("name1", CabinCrewMemberType.CAPTAIN, "111111");
        pilot2 = new Pilot("name2", CabinCrewMemberType.FIRSTOFFICER, "222222");
    }

    @Test
    public void pilotHasName(){
        assertEquals("name1", pilot1.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals("captain", pilot1.getRank());
    }

    @Test
    public void pilotHasType(){
        assertEquals(CabinCrewMemberType.CAPTAIN, pilot1.getType());
    }

    @Test
    public void pilotHasPilotLicenceNumber(){
        assertEquals("111111", pilot1.getPilotLicenceNumber());
    }
}
