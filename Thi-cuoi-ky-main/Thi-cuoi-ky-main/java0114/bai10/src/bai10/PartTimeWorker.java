package bai10;

public class PartTimeWorker extends NewEmployee implements PartTimer {

	int workHour;
	public PartTimeWorker(String name, int workHour) {
		super(name);
		this.workHour = workHour;
	}

	@Override
	public int paypartTimeWages() {

		return  workHour*BASE_WAGE;
	}
	public int payBonus() {

		return  0;
	}



}
