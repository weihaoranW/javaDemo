package p01;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Demo_annonation {

	public static void main(String[] args) {
		debug("Hello,weihaoran");
	}

	static void debug(Object o) {
		if (o != null) {
			System.out.println(o.toString());
		}
	}

	@TestAnnonationA(value1 = "good", values2 = "values2_test")
	public void test_methods() {
		debug("test");
	}

}
