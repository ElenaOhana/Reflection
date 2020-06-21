public class MetaClass { // Как бы мы могли описать какой то класс? Из каких элементов состоит класс? Характеристики класса будут являються полями класса.
    private String classModifier;
    private String className;
    MetaMethod[] methods;
    MetaConstructor[] constructors;
    MetaField[] fields;
}
