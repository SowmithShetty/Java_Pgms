enum weekdays{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public boolean isweekend(){
        return this == SATURDAY || this == SUNDAY;

    }

}
public class enum_example{
    public static void main(String[] args){
        for(weekdays day : weekdays.values()){
            if(day.isweekend()){
                System.out.println(day + " is a weekend");
            }else 
            { 
                System.out.println(day + " is a weekday");
            }
            
    }
        weekdays today= weekdays.valueOf("SATURDAY");
        System.out.println("\nToday is " + today);
    }
}