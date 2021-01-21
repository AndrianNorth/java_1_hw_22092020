package lesson0307;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStart {
    public static void main(Class c){
        List<Method> methods = new ArrayList<>();
        Method[] classMethods = c.getDeclaredMethods();
        for (Method m: classMethods) {
            if (m.isAnnotationPresent(Test.class)) {
                methods.add(m);
            }
        }

        methods.sort(Comparator.comparingInt((Method i) -> i.getAnnotation(Test.class).priority()));

        for (Method m: methods) {
            try {
                m.invoke(null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
