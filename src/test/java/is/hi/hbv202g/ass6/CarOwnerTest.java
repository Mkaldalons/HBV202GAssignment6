package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    private Car car;
    private CarOwner carOwner;

    @Before
    public void setUp() throws Exception {
        carOwner = new CarOwner("John Doe", car);
    }

    @Test
    public void getName() {
        car = new Car("Beetle");
        assertEquals("John Doe", carOwner.getName());
    }

}