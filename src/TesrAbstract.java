import java.io.Serializable;
import java.util.Arrays;

public class TesrAbstract extends Test implements Cloneable, Serializable {
    private  static int privateStaticField;
    private int field;
    private  String name;
    private String[] sells;

    public TesrAbstract() {
    }

    public TesrAbstract(int field, String name) {
        this.field = field;
        this.name = name;
    }

    public static int getPrivateStaticField() {
        return privateStaticField;
    }

    public static void setPrivateStaticField(int privateStaticField) {
        TesrAbstract.privateStaticField = privateStaticField;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSells() {
        return sells;
    }

    public void setSells(String[] sells) {
        this.sells = sells;
    }

    @Override
    public String toString() {
        return "TesrAbstract{" +
                "field=" + field +
                ", name='" + name + '\'' +
                ", sells=" + Arrays.toString(sells) +
                '}';
    }
}
