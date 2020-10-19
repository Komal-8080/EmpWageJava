public class EmpWagejava
{
		public static final int Full_Time = 2;
                public static final int Part_Time = 1;
                public static final int Wage_per_hour = 20;
		public static final int numOfWorkingDaysInMonth = 20;


	public static void main(String[] args)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Employee wage computation program");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int WorkingHours = 0;
		int dailyEmpWage = 0;
		int totalEmpWageForMonth = 0;
	  for (int i=0; i<numOfWorkingDaysInMonth; i++)
	  {
	  int empCheck = (int)(Math.random() * 3);

	    switch  (empCheck)
	    {
	    case Full_Time:
		System.out.println("Employee Present");
		WorkingHours = 8;
	    break;
	    case Part_Time:
		System.out.println("Employee Present");
		WorkingHours = 4;
	    break;
	    default:
		System.out.println("Employee Absent");
		WorkingHours = 0;
	    }
	        dailyEmpWage = WorkingHours * Wage_per_hour;
	  	totalEmpWageForMonth += dailyEmpWage;
		System.out.println("Today's Earings :  " +dailyEmpWage);
	  }
		System.out.println("Total Employee wage for month is " +totalEmpWageForMonth);
	}
}
