public class BadJavaClass {

    // 1. Missing access modifier
    String name;

    // 2. Unused import statement
    import java.util.ArrayList;

    // 3. Unused variable
    int age;

    // 4. Redundant null check
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    // 5. Unused method parameter
    public void setAge(int age) {
        // 6. Assignment instead of comparison
        if (age = 18) {
            this.age = age;
        }
    }

    // 7. Missing @Override annotation
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    // 8. Empty catch block
    public void doSomething() {
        try {
            // Code that may throw an exception
        } catch (Exception e) {
            // Empty catch block
    }

    // 9. Resource leak - unclosed resource
    public void openFile() {
        FileInputStream fis = new FileInputStream("example.txt");
        // File input stream is not closed
    }

    // 10. Infinite loop
    public void countToTen() {
        int i = 1;
        while (i <= 10) {
            // Missing increment statement
        }
    }
}
