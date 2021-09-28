package ConvertAnonymousToInner_1;

public class Class {
    public SomeInterface method() {
        final int i = 0;
        return new SomeInterface() {
            public int publicMethod() {
            return i;
            }
        };
    }
}