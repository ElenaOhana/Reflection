public class Main3 {
    public static void main(String[] args) {
        Class<TestAbstract> manager = TestAbstract.class;

        Package aPackage = manager.getPackage(); // NullPointerException because of the aPackage:null. TestAbstract class doesn't have an inner package.
        System.out.printf("package %s;%n", aPackage.getName());
    }
}
