package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void turnBikeOn() {
        // given that
        Bike toyota = new Bike();
        //when
        toyota.setOn(true);
        //assert
        assertEquals(true,toyota.getIsOn());

    }
        @Test
    public void turnBikeOff() {
        //given that
            Bike toyota = new Bike();
            //when
            toyota.settOff(true);
            //assert
            assertEquals( true,toyota.getIsOff());

        }




}

