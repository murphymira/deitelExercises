package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    public void turnOnTest(){
        AirConditioner user = new AirConditioner();
        user.turnOn();
        assertEquals(true, user.getOn());
    }

    @Test
    public void turnOffTest(){
        AirConditioner user = new AirConditioner();
        user.turnOn();
        user.turnOn();
        assertEquals(false, user.getOn());

    }
}



/**public class ChristmasSong {
07

        08
    public static void main(String[] args) {
        09
        // TODO Auto-generated method stub
        10
        int number;
        11
        String prize = "";
        12
        String day = "";
        13
        String song = "";
        14
        System.out.print("");
        15
        number = 12;
        16
        System.out.println();
        17

        18
        for (int j = 1; j <= number; j++)
            19
        {
            20
            switch (j)
            21
            {
                22
                case 1:
                    23
                    day = "First";
                    24
                    prize = "A Partridge in a Pear Tree \n ";
                    25
                    break;
                26

                27
                case 2:
                    28
                    day = "Second";
                    29
                    prize = "\nTwo turtle doves, \nAnd " + prize;
                    30
                    break;
                31

                32
                case 3:
                    33
                    day = "Third";
                    34
                    prize = "\nThree French Hens," + prize;
                    35
                    break;
                36

                37
                case 4:
                    38
                    day = "Four";
                    39
                    prize = "\nFour Calling Birds," + prize;
                    40
                    break;
                41

                42
                case 5:
                    43
                    day = "Five";
                    44
                    prize = "\nFive Golden Rings," + prize;
                    45
                    break;
                46

                47
                case 6:
                    48
                    day = "Six";
                    49
                    prize = "\nSix Geese a Laying," + prize;
                    50
                    break;
                51

                52
                case 7:
                    53
                    day = "Seven";
                    54
                    prize = "\nSeven Swans a Swimming," + prize;
                    55
                    break;
                56

                57
                case 8:
                    58
                    day = "Eight";
                    59
                    prize = "\nEight Maids a Milking," + prize;
                    60
                    break;
                61

                62
                case 9:
                    63
                    day = "Nine";
                    64
                    prize = "\nNine Ladies Dancing," + prize;
                    65
                    break;
                66

                67
                case 10:
                    68
                    day = "Ten";
                    69
                    prize = "\nTen Lords a Leaping," + prize;
                    70
                    break;
                71

                72
                case 11:
                    73
                    day = "Eleven";
                    74
                    prize = "\nEleven Pipers Piping," + prize;
                    75
                    break;
                76

                77
                case 12:
                    78
                    day = "Twelve";
                    79
                    prize = "\n12 Drummers Drumming," + prize;
                    80
                    break;
                81
            }
            82

            83
            song +="\nOn the " + day + " day of Christmas \nmy true love sent to me: " + prize;
            84
        }
        85
        System.out.println(song);
        86
    }
87

        88

        89

        90
}**/


//
//public class MultiplicationTable {
//
//    public static void main(String[] args) {
//
//        int num = 2;
//        for(int i = 1; i <= 10; ++i)
//        {
//            System.out.printf("%d * %d = %d \n", num, i, num * i);
//        }
//    }
//}