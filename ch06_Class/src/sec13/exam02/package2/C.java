package sec13.exam02.package2;

import sec13.exam02.package1.A;

public class C {
	public C() {
		//객체 생성 
		A a = new A();
		
		//필드값 변경 
		a.field1 = 1; 	// (o)
		//a.field2 = 1; 	// (x)
		//a.field3 = 1; 	// (x)

		//메소드 호출 
		a.method1(); 	// (o)
		//a.method2(); 	// (x)
		//a.method3(); 	// (x)
	}
}
