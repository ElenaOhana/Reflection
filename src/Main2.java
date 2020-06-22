import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Test> manager = Test.class;
        /*Test test;
        test = new Test();
        test.foo();*/
        Test test1;
        test1 = manager.newInstance(); // Another way to create an object of a class.
        test1.foo();

        Method method = manager.getMethod("foo"); // getMethod() receives the name of method foo() as a String./ Does't refers to any Object/Instance.
        //Method method1 = manager.getMethod("foo2");// returns java.lang.NoSuchMethodException: Test.foo2()

        System.out.println(method.getName()); //Returns the name of the method represented by this {@code Method} object, as a {@code String}. // #foo
        System.out.println(method.toString());// returns:  #public void Test.foo()

        method.invoke(new Test());//Object #new Test() will saved in this param of Test.
    }
}
