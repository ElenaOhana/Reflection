public class Main2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<Test> manager = Test.class;

        Test test;
        test = new Test();
        test.foo();

        Test test1;
        test1 = manager.newInstance(); // Another way to create an object of a class.
        test1.foo();
    }
}
