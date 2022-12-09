
public class FooCorporation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// assign data to variables for each employee
		double Employee1Pay = 7.50;
		int Employee1Hrs = 35;

		double Employee2Pay = 8.20;
		int Employee2Hrs = 47;

		double Employee3Pay = 10.00;
		int Employee3Hrs = 73;
		
		//calling method with parameters
		payment(Employee1Pay, Employee1Hrs);
		payment(Employee2Pay, Employee2Hrs);
		payment(Employee3Pay, Employee3Hrs);

		
	}
	
	public static void payment(double EmployeePay, int EmployeeHrs) {
		
		// int variable to save total payment
		double totalPay = 0;
		//int variable to store overtime payment rate
		double overtimeRate = EmployeePay * 1.5;
		
		if (EmployeePay < 8.0) {
			System.out.println("Error, you must at least be payed $8.00 per hour");
		}
		//if number of hrs is greater than 60 print error message
		else if (EmployeeHrs > 60) {
			System.out.println("Error, employee can not work more than 60 hours per week.");
		}
		else if(EmployeeHrs <= 40) {
			totalPay = EmployeePay * EmployeeHrs;
			System.out.println("Total payment is: " + totalPay);
		}
		else{
			totalPay = EmployeePay*(40);
			totalPay += overtimeRate*(EmployeeHrs-40);
			System.out.println("Total payment is: " + totalPay);
			
		}
	}

}
