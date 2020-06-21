public class MetaClass { // Как бы мы могли описать какой то класс? Из каких элементов состоит класс? Характеристики класса будут являються полями класса.
    private String classModifier;
    private String className;
    MetaMethod[] methods; // Has a name, access modifiers, param => Has be a class
    MetaConstructor[] constructors;
    MetaField[] fields;
}
