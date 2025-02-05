package course1;

public class Test {
	public static void main(String[] args) {
//		// Calculable 구현 클래스 이용 덧셈
//		Calculable calcPlus = new CalculableImplPlus();
//		calcPlus.calculate(10, 20);
//		
//		// Calculable 구현 클래스 이용 뺄셈
//		Calculable calcMinus = new CalculableImplMinus();
//		calcMinus.calculate(10, 20);

		// Calculable 구현 익명 클래스 이용 덧셈
		Calculable calcPlusAnony = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println(x + y);
			}
			
		};
		calcPlusAnony.calculate(10, 20);
		
		// Calculable 구현 람다 이용 덧셈
		Calculable calcPlusLambda = (x, y) -> { 
			System.out.println( x + y );
		};
		calcPlusLambda.calculate(10, 20);
		
		
		// action method 의 파라미터에 functional interface
		
		// Calculable 파라미터를 가진 메소드 호출
		Calculable calcPlus = new CalculableImplPlus();
		action(calcPlus);
		
		// Calculable 파라미터를 가진 메소드 호출
		Calculable calcMinus = new CalculableImplMinus();
		action(calcMinus);
		
		// 익명 클래스 객체를 이용 덧셈
		action(new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println(x + y);
			}
			
		});
		// 익명 클래스 객체를 이용 뺄셈
		action(new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println(x - y);
			}
			
		});
		
		action( (x, y) -> { System.out.println(x + y); }   ); // 덧셈
		action( (x, y) -> { System.out.println(x - y); }   ); // 뺄셈
		// 람다는 FunctionalInterface 에만 사용
	}

	// Funcional Interface 타입의 파라미터
	public static void action(Calculable calculable) {
		// 하나의 메소드만 호출 가능
		calculable.calculate(10, 20);
	}
}
