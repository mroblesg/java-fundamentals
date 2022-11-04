// A situation that creates a bridge method.
// To see a bridge method it's needed to use javap after compiling the source file
class Generic<T> {
    T ob; // declare an object of type T
    // Pass the constructor a reference to
    // an object of type T.
    Generic(T o) {
        ob = o;
    }
    // Return ob.
    T getOb() {
        return ob;
    }
}
// A subclass of Generic.
class Generic2 extends Generic<String> {
    Generic2(String o) {
        super(o);
    }
    // A String-specific override of getOb().
    String getOb() {
        System.out.print("You called String getOb(): ");
        return ob;
    }
}
// Demonstrate a situation that requires a bridge method.
class ErasureBridgeDemo {
    public static void main(String[] args) {
        // Create a Generic2 object for Strings.
        Generic2 strOb2 = new Generic2("Genericerics Test");
        System.out.println(strOb2.getOb());
    }
}