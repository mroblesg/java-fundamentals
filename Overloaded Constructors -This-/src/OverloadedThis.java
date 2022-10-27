/*
Using overloaded constructors this way is slower on constructors that have very little lines of initialization,
so it might not be the best option on short constructors.
You cannot use this() and super() in the SAME constructor because both of them have to be the first thing to
execute on a costructor.
*/
class MyClass {
    int a;
    int b;

    // initialize a and b individually
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    // initialize a and b to the same value
    MyClass(int i) {
        this(i, i); // invokes MyClass(i, i)
    }

    // give a and b default values of 0
    MyClass() {
        this(0); // invokes MyClass(0)
    }
}