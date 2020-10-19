public class EmpWagejava
{
		public static final int Full_Time = 2;
                public static final int Part_Time = 1;
                public static final int Wage_per_hour = 20;
		public static final int numOfWorkingDaysInMonth = 20;
		public static final int maxHoursInMonth = 100;

	public static void main(String[] args)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Employee wage computation program");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int WorkingHours = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;

	  while(totalWorkingHours <= maxHoursInMonth && totalWorkingDays < numOfWorkingDaysInMonth)
	  {
		int empCheck = (int)(Math.random() * 3);
		totalWorkingDays++;

	    switch  (empCheck)
	    {
	    case Full_Time:
		System.out.println("Employee Present Full Time");
		WorkingHours = 8;
	    break;
	    case Part_Time:
		System.out.println("Employee Present Part Time");
		WorkingHours = 4;
	    break;
	    default:
		System.out.println("Employee Absent");
		WorkingHours = 0;
	    }
		totalWorkingHours += WorkingHours;

		System.out.println("DAY : "+totalWorkingDays+  " Employee Working Hours : " +WorkingHours);
		System.out.println( " ");
	  }
		int totalEmpWageForMonth = totalWorkingHours * Wage_per_hour;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Total Employee wage is " +totalEmpWageForMonth);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
