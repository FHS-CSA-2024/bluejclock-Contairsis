package src.main.java;


public class ClockDisplaySeconds
{
    //Extend ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }
    
    public ClockDisplaySeconds(int hVal,int mVal, int sVal){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hVal, mVal, sVal);
        updateDisplay();
    }
    
    public void timeTick(){
        seconds.increment();
        if (seconds.getValue() == 0){
            minutes.increment();
        }
        if (minutes.getValue() == 0){
            hours.increment();
        }
        updateDisplay();
    }
    
    public void setTime(int hour, int minute, int second){
        minutes.setValue(minute);
        hours.setValue(hour);
        seconds.setValue(second);
        updateDisplay();
    }
    
    public String getTime(){
       return display; 
    }
    
    public void updateDisplay(){
        String output = "";
        output = hours.getDisplayValue()+":"+minutes.getDisplayValue()+":"+seconds.getDisplayValue();
        /*output += ":";
        output += minutes.getDisplayValue();
        output += ":";
        output += seconds.getDisplayValue();*/
        display = output+seconds.getValue();
    }
}
