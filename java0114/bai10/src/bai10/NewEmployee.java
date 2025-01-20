package bai10;

public class NewEmployee extends EmployeeName implements Employee {

	public NewEmployee(String name) {
		super(name);
	}

	@Override
	public int paySalary() {
		return (int) (BASE_SALARY*0.8);
	}

	@Override
	public int payBonus() {

		return (int) (BASE_SALARY*(BASE_BONUS_MONTH-1.5));
	}

}
