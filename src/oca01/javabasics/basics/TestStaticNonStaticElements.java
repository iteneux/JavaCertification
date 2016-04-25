package oca01.javabasics.basics;

class A {
	A(int i) {
		System.out.println("A" + i);
	}
}

class B {
	B(int i) {
		System.out.println("B" + i);
	}
}

class C {
	C(int i) {
		System.out.println("C" + i);
	}
}

public class TestStaticNonStaticElements {
	static B b1 = new B(1);
	static A a3 = new A(7);
	B b3 = new B(8);
	static C c2 = new C(6);

	public static void main(String args[]) {
		TestStaticNonStaticElements tc = new TestStaticNonStaticElements();

		System.out.println(tc);
	}

	public TestStaticNonStaticElements() {
		A a = new A(9);
		B b = new B(10);
		C c = new C(0);
	}

	A a1 = new A(4);
	B b2 = new B(2);
	static C c1 = new C(3);
	A a2 = new A(5);
}
