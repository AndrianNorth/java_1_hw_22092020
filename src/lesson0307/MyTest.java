package lesson0307;

public class MyTest {

    @Test(priority = 1)
    public static void test1(){
        System.out.println("тест 1");
    }

    @Test(priority = 2)
    public static void test2(){
        System.out.println("тест 2");
    }

    @Test
    public static void test3(){
        System.out.println("тест 3");
    }
}
