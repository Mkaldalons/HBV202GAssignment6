package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    private Car car;
    private CarOwner carOwner;

    @Test
    public void getName() {
        car = new Car("Beetle");
        carOwner = new CarOwner("John Doe", car);
        assertEquals("John Doe", carOwner.getName());
    }

}