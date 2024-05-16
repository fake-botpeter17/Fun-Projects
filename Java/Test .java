class Test {
    public static void main(String[] args) {
        for (int c = 1; c <= 50; c++) {
            for (int a = 1; a <= c; a++) {
                int b = (int) Math.sqrt(c * c - a * a);
                if (b > 0 && a * a + b * b == c * c) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }
}