package sec01;

public class Child extends Parent {
	public Child() {
		//super(); 없으면 default 생성자를 컴파일러가 자동으로 추가
		super(1);
	}
	int n = 20;
	
	public void m() {
		System.out.println(n);
		System.out.println(this.n);
		System.out.println(super.n);
	}
}
