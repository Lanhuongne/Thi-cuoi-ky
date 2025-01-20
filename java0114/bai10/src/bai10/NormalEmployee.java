package bai10;

public class NormalEmployee extends EmployeeName implements Employee {
	String name;
	public NormalEmployee(String name) {
		super(name);
	}
	@Override
	public int paySalary() {
		return BASE_SALARY;
	}

	@Override
	public int payBonus() {

		return BASE_SALARY*BASE_BONUS_MONTH;
	}



}
