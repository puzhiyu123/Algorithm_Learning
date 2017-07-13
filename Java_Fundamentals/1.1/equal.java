class equal {
    public static void main(String[], args) {
        // parsrInt allow users to input an integer
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b & b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal.")
        }
    }
}