import java.util.Scanner;

/**
 * Created by hyunchoi on 1/7/17.
 */
public class dateDifference {
    public static void calculateDifference(Date firstDate, Date secondDate) {
        /* difference can be easily found by subtracting the smaller number
         * from larger to get the difference in days, months, and years
        */

        int diffYears, diffMonths, diffDays;

        if (firstDate.getYear() >= secondDate.getYear()) {
            diffYears = firstDate.getYear() - secondDate.getYear();

            if (firstDate.getMonth() >= secondDate.getMonth()) {
                // System.out.println("SHOULD NOT COME HERE");

                diffMonths = firstDate.getMonth() - secondDate.getMonth();

                if (firstDate.getDay() >= secondDate.getDay()) {
                    diffDays = firstDate.getDay() - secondDate.getDay();

                }
                else {
                    // System.out.println("ENTER");
                    diffMonths -= 1;

                    if (diffMonths < 0)  {
                        diffMonths = 0;
                    }

                    diffDays = firstDate.getDay() + (secondDate.getNumDays() - secondDate.getDay());
                }

            }
            else {

                // System.out.println("TESTING");
                diffYears -= 1;

                if (diffYears < 0) {
                    diffYears = 0;
                }

                diffMonths = firstDate.getMonth() + (12 - secondDate.getMonth());

                if (diffYears == 0) {
                    diffMonths = secondDate.getMonth() - firstDate.getMonth();
                }

                if (firstDate.getDay() >= secondDate.getDay()) {
                    diffDays = firstDate.getDay() - secondDate.getDay();
                }
                else {
                    diffMonths -= 1;

                    if (diffMonths < 0)  {
                        diffMonths = 0;
                    }

                    diffDays = firstDate.getDay() + (secondDate.getNumDays() - secondDate.getDay());
                }
            }
        }
        else {
            diffYears = secondDate.getYear() - firstDate.getYear();

            if (firstDate.getMonth() >= secondDate.getMonth()) {
                diffYears -= 1;

                if (diffYears < 0) {
                    diffYears = 0;
                }

                diffMonths = secondDate.getMonth() + (12 - firstDate.getMonth());


                if (firstDate.getDay() >= secondDate.getDay()) {
                    diffMonths -= 1;

                    if (diffMonths < 0) {
                        diffMonths = 0;
                    }

                    diffDays = secondDate.getDay() + (firstDate.getNumDays() - firstDate.getDay());
                }
                else {
                    diffDays = secondDate.getDay() - firstDate.getDay();
                }
            }
            else {
                diffMonths = secondDate.getMonth() - firstDate.getMonth();

                if (firstDate.getDay() >= secondDate.getDay()) {
                    diffMonths -= 1;

                    if (diffMonths < 0) {
                        diffMonths = 0;
                    }
                    diffDays = secondDate.getDay() + (firstDate.getNumDays() - firstDate.getDay());

                }
                else {
                    diffDays = secondDate.getDay() - firstDate.getDay();
                }
            }
        }

        System.out.println("The first date you chose is " + firstDate.getMonth() + "/" + firstDate.getDay() + "/" + firstDate.getYear() +
                " & the second date you chose is " + secondDate.getMonth() + "/" +  secondDate.getDay() + "/" + secondDate.getYear());

        System.out.println("The difference between these two dates is " + diffDays + " days, " + diffMonths +
                " months, & " + diffYears + " years.");
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstYear, firstMonth, firstDay, secondYear, secondMonth, secondDay;
        Date firstDate, secondDate;

        System.out.print("Please enter the first YEAR in integers(YYYY): " );
        firstYear = sc.nextInt();
        System.out.println("");

        System.out.print("Please enter the first MONTH in integers(MM): " );
        firstMonth = sc.nextInt();
        System.out.println("");

        System.out.print("Please enter the first DAY in integers(DD): " );
        firstDay = sc.nextInt();
        System.out.println("");

        firstDate = new Date(firstYear, firstMonth, firstDay);

        System.out.print("Please enter the second YEAR in integers(YYYY): " );
        secondYear = sc.nextInt();
        System.out.println("");

        System.out.print("Please enter the second MONTH in integers(MM): " );
        secondMonth = sc.nextInt();
        System.out.println("");

        System.out.print("Please enter the second DAY in integers(DD): " );
        secondDay = sc.nextInt();
        System.out.println("");

        secondDate = new Date(secondYear, secondMonth, secondDay);

        calculateDifference(firstDate, secondDate);
   }
}
