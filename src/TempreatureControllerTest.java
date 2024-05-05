import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TempreatureControllerTest {

    @Test
    void pessaner1() {
        RangeInput pessanger1 = new RangeInput(54, 64);
        pessanger1.up();
        pessanger1.up();
        pessanger1.up();
        pessanger1.up();
        assertEquals(63, pessanger1.getCurrentTempreature());
        pessanger1.up();
        pessanger1.up();
        assertEquals(64, pessanger1.getCurrentTempreature());
    }


    @Test
    void pessaner2() {
        RangeInput pessanger2 = new RangeInput(55, 75);
        pessanger2.down();
        pessanger2.down();
        pessanger2.down();
        pessanger2.up();
        assertEquals(63, pessanger2.getCurrentTempreature());
        pessanger2.up();
        pessanger2.up();
        pessanger2.up();
        pessanger2.up();
        assertEquals(67, pessanger2.getCurrentTempreature());
    }
    @Test
    void driver() {
        RangeInput driver = new RangeInput();
        driver.up();
        driver.down();
        driver.down();
        driver.up();
        assertEquals(70, driver.getCurrentTempreature());
        driver.up();
        driver.down();
        driver.up();
        driver.up();
        assertEquals(72, driver.getCurrentTempreature());
    }

}