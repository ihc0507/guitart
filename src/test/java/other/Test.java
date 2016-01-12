package other;

public class Test {
	private Long num ;
	
	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public static void main(String[] args) {
		Test test1=  new Test();
		test1.setNum(100l);
		long tem = 100l;
		System.out.println(tem==test1.getNum());
		System.out.println(Integer.MAX_VALUE);
	}
}
