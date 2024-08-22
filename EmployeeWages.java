
import java.util.Random;

public class EmployeeWages {

    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wages Computation Problem");

        final int WAGE_PER_HR =20;
        final int FULL_DAY_HR = 8;

        int  dailyWage ;
        int attendence ;

        Random random = new Random();

        attendence = random.nextInt(9)%2;

        if(attendence == 0){
            
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HR * FULL_DAY_HR;
            System.out.println("DailyWage ="+dailyWage);
            
        }else{
            
            System.out.println("Employee is Absent");
        }
    }
}
