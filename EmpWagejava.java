public class EmpWagejava
{
	public static void main(String[] args)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Employee wage computation program");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int empCheck = (int)(Math.random() * 2);
		int Full_Time = 1;
		int Wage_per_hour = 20;
		int WorkingHours = 0;

	    if ( empCheck == 1 )
	    {
		System.out.println("Employee Present");
		WorkingHours = 8;
	    }
	    else
	    {
		System.out.println("Employee Absent");
	    }
	int dailyEmpWage = WorkingHours * Wage_per_hour;
		System.out.println("Daily Employee wage is " +dailyEmpWage);
	}
}
