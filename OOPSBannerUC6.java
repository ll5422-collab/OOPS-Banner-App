public class OOPSBannerUC6 {

    // Static method to build O pattern
    static String[] buildO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method to build P pattern
    static String[] buildP() {
        return new String[] {
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

    // Static method to build S pattern
    static String[] buildS() {
        return new String[] {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        // Call helper methods
        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Loop to print banner O O P S
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}