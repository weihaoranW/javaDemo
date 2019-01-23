package p01;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo1 {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
		Demo_annonation obj = new Demo_annonation();
		// 获取AnnotationTest2的Class实例,
		// 以下三种方法均可
		// 1--- Class<Demo_annonation> c = Demo_annonation.class;
		// 2--- Class<?> c = Demo_annonation.class;
		// 3--- 寻找名称的类文件，加载进内存 产生class对象
		// String classname = "com.Person";
		// Class c = Class.forName(classname);
		Class<?> c = obj.getClass();
		// 获取需要处理的方法Method实例
		Method method = c.getMethod("test_methods");
		// 判断该方法是否包含MyAnnotation注解
		if (method.isAnnotationPresent(TestAnnonationA.class)) {
			// 获取该方法的myAnnotation注解实例
			TestAnnonationA myAn = method.getAnnotation(TestAnnonationA.class);
			// 执行该方法
			// method.invoke(obj, new Object[] {});
			// 获取myAnnotation
			String value1 = myAn.value1();
			debug(value1);
		} // 获取方法上的所有注解
		Annotation[] annotations = method.getAnnotations();
		for (Annotation annotation : annotations) {
			debug(annotation);
		}
	}

	static void debug(Object o) {
		if (o != null) {
			System.out.println(o.toString());
		}
	}

}
