package bai10;

public class Main {
public static void main(String[] args) {
	NewEmployee a= new NewEmployee("海野");
	NormalEmployee b= new NormalEmployee("初野");

	System.out.println(a.name+"さんの給料"+a.paySalary());
	System.out.println(b.name+"さんの給料"+b.paySalary());


}
}
