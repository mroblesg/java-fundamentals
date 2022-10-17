class CustomException extends Exception {
    private int detail;
    CustomException(int a) {
        detail = a;
    }
    public String toString() {
        return "MyException[" + detail + "]";
    }
}
class ExceptionDemo {
    static void compute(int a) throws CustomException {
        System.out.println("Called compute(" + a + ")");
        if(a > 10)
            throw new CustomException(a);
        System.out.println("Normal exit");
    }
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (CustomException e) {
            System.out.println("Caught " + e);
        }
    }
}