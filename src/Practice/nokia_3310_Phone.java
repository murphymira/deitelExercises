package Practice;

import java.util.Scanner;

public class nokia_3310_Phone {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1 -> Phone book
                    2 -> Message
                    3 -> chat
                    4 -> call register
                    5 -> tone
                    6 -> setting
                    7 -> call divert
                    8 -> game
                    9 -> calculator
                    10 -> reminder
                    11 -> clock
                    12 -> profile
                    13 -> sim services^3
                    """);

            System.out.println("enter digit ");
            int funtion = scanner.nextInt();


            switch (funtion) {
                case 1:
                    System.out.println("""
                            1. Search
                            2. service  nos
                            3. add name
                            4. erase
                            5. edit
                            6. assign tone
                            7. send b' card
                            8. option
                            9. speed dials
                            10.voice tag
                            """);
                case 8:
                    System.out.println("""
                            1.types of view
                            2.memories status
                            """);


                    break;


                case 2:
                    System.out.println("""
                            1. write message
                            2. inbox
                            3. outbox
                            4.picture message
                            5.template
                            6.smileys
                            7.message setting
                            8.info services
                            9. voice mailbox number
                            10 service command editor
                                                        
                              
                                                        
                                                        
                                                        
                                                        
                            """);
                    System.out.println("enter digit ");
                    int msg = scanner.nextInt();


                case 7:
                    System.out.println("""
                               1.set 1^2
                               2.common ^3
                            """);
                    System.out.println("enter digit ");
                    int msgSet = scanner.nextInt();
                    switch (msgSet) {

                        case 1:
                            System.out.println("""
                                    1. message centre number
                                    2. message sent as
                                    3. message validity
                                                                        
                                                                        
                                    """);
                            System.out.println(" enter digit'");
                            int msgCommon = scanner.nextInt();

                        case 2:
                            System.out.println("""
                                    1. delivery reports
                                    2. reply via same center
                                    3. character support
                                                                            
                                    """);
                            System.out.println(" enter digit'");
                            int callRegister = scanner.nextInt();
                    }
                    break;

                case 3:
                    System.out.println("""
                            3. Chat
                            
                            """);
                    System.out.println(" enter digit'");
                    int callRegister = scanner.nextInt();

                case 4:
                    System.out.println("""
                            1.missed calls
                            2. Received calls
                            3. dialled numbers
                            4.erase recent call lists
                            5. Show call duration
                            6.show call costs
                            7.call cost limit
                            8.prepaid credit
                            """);


                    System.out.println(" enter digit ");
                    int callDuration = scanner.nextInt();
                    switch (callDuration) {

                        case 5:
                            System.out.println("""
                                    1.last call duration
                                    2.All calls' duration
                                    3. Receive calls' duration
                                    4.Dialled calls' duration
                                    5. Clear timers
                                                                          
                                    """);
                            System.out.println("enter digit");
                            int callCost = scanner.nextInt();

                        case 6:
                            System.out.println("""
                                    1.last call cost
                                    2. All call's cost
                                    3. clear counters
                                                                  
                                                                  
                                    """);
                            System.out.println("enter digit");
                            int callCostSet = scanner.nextInt();

                        case 7:
                            System.out.println("""
                                    1. call cost limit
                                    2. show costs in 
                                                                        
                                    """);
                            System.out.println("enter digit");
                            int prepareCredit = scanner.nextInt();

                    }
                    break;
            }

        }
    }


