import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main2 { // temporarily throw an error to the main method todo - handle errors.
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
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

        method.invoke(new Test());//Object #new Test() will saved in #this param of Test.

        //Field field = manager.getField("field"); // non-private fields => returns #java.lang.NoSuchFieldException: field
        Field field = manager.getDeclaredField("field"); // We have access to the private variable now.
        field.setAccessible(true);
        field.set(test1, 42); // If a field has private modifier and without #field.setAccessible(true);, than java.lang.IllegalAccessException is thrown.

        System.out.println(test1);
    }
}
