package Example1;

public class Func {
	public static double calculateSalary(int hours, int amount){
		double employeeGrossSalary=hours*amount;
		return employeeGrossSalary;
	}

	public static void main(String[] args) {
	double excludeVacation=	calculateSalary(40,100);
     double result=excludeVacation-5;
     System.out.println(result);
	}

}
