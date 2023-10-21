
public class Salary {

	public static void main(String[] args) {

		int gross_salary = 20000;
		String name = "Peter Medison";
		double net_salary = 0;
		double state_taxes = Math.round((gross_salary * 28.4) / 100);
		double personal_tax = 0;

		if ((gross_salary - state_taxes - 7000) > 0) {
			personal_tax = Math.round(((gross_salary - state_taxes - 7000) * 10) / 100);
		} else {
			personal_tax = 0;
		}

		net_salary = Math.round(gross_salary - state_taxes - personal_tax);

		System.out.println(name + " with gross salary of " + gross_salary + " MKD." + " will get NET salary: " + net_salary);

		System.out.println("State taxes are: " + state_taxes + " MKD.");

		System.out.println("Personal tax is: " + personal_tax + " MKD.");
				

	}

}
