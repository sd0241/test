package ch14;

public class Bus {
	int busNumber;
	int passangerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money += money;
		passangerCount++;
	}
	
	public void showBuwInfo() {
		System.out.println(busNumber+"번의 승객 수는 "+passangerCount+"명 이고, 수입은 " + money+"원 입니다. ");
	}
}
