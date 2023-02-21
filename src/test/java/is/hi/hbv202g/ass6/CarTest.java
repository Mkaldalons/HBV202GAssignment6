package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;

    @Test
    public void getNameOfCar() {
        car = new Car("Beetle");
        assertEquals("Beetle", car.getNameOfCar());
    }

}
