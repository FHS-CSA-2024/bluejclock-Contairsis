package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3, 45);
        String test2Output = test2.getTime();
        System.out.println("2 Arg. Con. Test - " + test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        System.out.println("Tick Test 1 PreTick - " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("Tick Test 1 PostTick - " + tickTest1.getTime());
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds testS1 = new ClockDisplaySeconds();
        String testS1Output = testS1.getTime();
        System.out.println("Empty Con. Sec. Test - " + test1Output);
        
        ClockDisplaySeconds testS2 = new ClockDisplaySeconds(3, 45, 23);
        String testS2Output = testS2.getTime();
        System.out.println("2 Arg. Con. Sec. Test - " + testS2Output);
        
        ClockDisplaySeconds tickTestS1 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Sec. Tick Test 1 PreTick - " + tickTestS1.getTime());
        tickTestS1.timeTick();
        System.out.println("Sec. Tick Test 1 PostTick - " + tickTestS1.getTime());
        
        ClockDisplaySeconds tickTestS2 = new ClockDisplaySeconds(1, 0, 59);
        System.out.println("Sec. Tick Test 2 PreTick - " + tickTestS2.getTime());
        tickTestS2.timeTick();
        System.out.println("Sec. Tick Test 2 PostTick - " + tickTestS2.getTime());
        
        ClockDisplaySeconds tickTestS3 = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Sec. Tick Test 3 PreTick - " + tickTestS3.getTime());
        tickTestS3.timeTick();
        System.out.println("Sec. Tick Test 2 PostTick - " + tickTestS3.getTime());
        
        ClockDisplaySeconds tickTestS4 = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Sec. Tick Test 2 PreTick - " + tickTestS4.getTime());
        tickTestS4.timeTick();
        System.out.println("Sec. Tick Test 2 PostTick - " + tickTestS4.getTime());
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
