public class ConditionStatements {
    public static int task1(int n) {
        if (n > 0) {
            return (int) Math.pow(n, 2);
        } else if (n < 0) {
            return Math.abs(n);
        } else return 0;
    }

    public static void main(String[] args) {
        System.out.println(task1(10));
    }
}