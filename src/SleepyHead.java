//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
  isWeekday=  JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", 0);
  isVacation= JOptionPane.showConfirmDialog(null, "Are you on vacation?", "", 0);


        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
   if (isWeekday==0 && isVacation==0) {
	System.out.println("Sleep in");
}
   else if (isWeekday==1 && isVacation==1) {
	System.out.println("Sleep in");
}
   else if (isWeekday==0 && isVacation==1) {
	System.out.println("Get up lazybones!");
}
   else {
	System.out.println("Sleep in");
}
  
	}
    }

