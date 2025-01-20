package bai10;

public class PartTimeWorker extends EmployeeName implements PartTimer,Employee {

	public PartTimeWorker(String name) {
		super(name);
	}
	@Override
	public int paypartTimeWages(int workHour) {
		// TODO 自動生成されたメソッド・スタブ
		return  workHour*BASE_WAGE;
	}

	@Override
	public int paySalary() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int payBonus() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}


}
