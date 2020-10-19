public class EmpWagejava
{
		public static final int Full_Time = 2;
                public static final int Part_Time = 1;
                public static final int Wage_per_hour = 20;

	public static void main(String[] args)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Employee wage computation program");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int empCheck = (int)(Math.random() * 3);
		int WorkingHours = 0;

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
	    }
	int dailyEmpWage = WorkingHours * Wage_per_hour;
		System.out.println("Daily Employee wage is " +dailyEmpWage);
	}
}
