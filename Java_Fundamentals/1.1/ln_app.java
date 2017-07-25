class in_app {
    public static void main(String[] args) {
        for(i = 1; i <= 10; i++) {
            System.out.println("log_fact(" + i + "): " + log_fact(i));
        }
    }

    public static double log_fact(int i) {
        if(i == 1) {
            return 0;
        } else {
            return log_fact(i - 1) + Math.log(i);
        }

    }
}