public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        //MetaClass c;
        Class c; // name of variable #c or #clazz because of #class is the reserved word.
        c = test.getClass(); // The first technique
        c = Test.class; // The second technique

        System.out.println(c.getName()); // consists of the name of packet and self name.
        System.out.println(c.getSimpleName()); // Just a self name
        System.out.println(TestInterface.class); // interface TestInterface
        /*System.out.println(TestInterface.class.getSimpleName());
        System.out.println(Test.class);
        System.out.println(MetaClass.class);*/

        TestInterface testInterface = new TestInterface() {
        }; // anonymous inner class - doesn't has name => getClass().getName() returns only the name of class where is used.
        TestInterface testInterface2 = new TestInterface() {
        };
        System.out.println(testInterface.getClass().getName()); // Main$2 - after $ presents index number
    }
}
