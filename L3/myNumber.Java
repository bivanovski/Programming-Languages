   
class myNumber {
	private int num=0;
	public int num2=0;
	
	public myNumber() {
		
	}
	
	public myNumber(int num, int num2) {
		this.num=num;
		this.num2=num2;
	}
	
	int getNum() {
		return num;
	}
	
	void setNum(int i) {
		num=i;
		num2=10*i;
	}
	
	int getNum2() {
		return num2;
	}
	
	void description() {
		System.out.println("Number 1: " + num + " Number 2: " + num2 );
	}
	
	float average() {
		return (num+num2)/2;
	}
	
	public static void main(String[] args) {
		myNumber A = new myNumber(13,10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
		A.description();
		System.out.println("Average is " + A.average());
	}

}
