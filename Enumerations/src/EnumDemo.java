// An enumeration of apple varieties.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        // Output an enum value.
        System.out.println("Value of ap: " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        // Compare two enum values.
        if (ap == Apple.GoldenDel) System.out.println("ap contains GoldenDel.\n");
        // Use an enum to control a switch statement.

        ap = Apple.Jonathan;
        System.out.println(ap);

        switch (ap) {
            case Jonathan -> System.out.println("Jonathan is red.");
            case GoldenDel -> System.out.println("Golden Delicious is yellow.");
            case RedDel -> System.out.println("Red Delicious is red.");
            case Winesap -> System.out.println("Winesap is red.");
            case Cortland -> System.out.println("Cortland is red.");
        }
    }
}