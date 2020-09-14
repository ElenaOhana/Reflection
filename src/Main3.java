import java.lang.reflect.Modifier;

public class Main3 {
    public static void main(String[] args) {
        Class<TestAbstract> manager = TestAbstract.class;

        /*Package aPackage = manager.getPackage(); // NullPointerException because of the aPackage:null. TestAbstract class doesn't have an inner package.
        System.out.printf("package %s;%n", aPackage.getName());*/

        int modifiers = manager.getModifiers(); // 101010101
  //      Modifier modifier
       // modifiers = 1; // 0x00000001 //(Modifier.isPublic(modifiers) return true
        modifiers = 2; // 00000010 // return false because of the last bit of 2(DEC) is 0. (public static final int PUBLIC = 0x00000001;)
        //modifiers = 3; // 00000011 // return true because of the last bit of 3(DEC) = 1: (public static final int PUBLIC = 0x00000001;)
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isPrivate(modifiers)); // public static final int PRIVATE = 0x00000002; => 00000010, and it equals to 2(DEC)= 00010(BIN)
        System.out.println(Modifier.isStatic(modifiers));
    }
}
