package bai10;

public class main2 {
	public static void main(String[] args) {
		Employee[]em= new Employee[5];
		em[0]=new NewEmployee("HUONG");
		em[1]=new NormalEmployee("NGUYEN");
		em[2]=new NewEmployee("HA");
		em[3]=new NormalEmployee("KIEU");
		em[4]=new PartTimeWorker("LINH",220);
		dispSalary(em);}

	public static void dispSalary(Employee[]em){
		for(int i=0;i<5;i++) {
			if(em[i] instanceof PartTimeWorker)
			{
			System.out.println(((EmployeeName) em[i]).getName()+"さんの給料\\"+((PartTimeWorker) em[i]).paypartTimeWages()+"ボーナスは\\"+em[i].payBonus());
			}
			else
			System.out.println(((EmployeeName) em[i]).getName()+"さんの給料\\"+em[i].paySalary()+"ボーナスは\\"+em[i].payBonus());}

	}

	}


