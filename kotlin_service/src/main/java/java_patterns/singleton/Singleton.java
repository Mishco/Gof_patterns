package java_patterns.singleton;

class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        // empty private constructor
    }

    public static Singleton getInstance() {
        return instance;
    }
}
