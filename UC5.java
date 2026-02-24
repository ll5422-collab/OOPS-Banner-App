public class OOPSBannerUC5 {
    public static void main(String[] args) {

        // Inline array declaration and initialization using String.join()
        String[] banner = {
            String.join("", " OOOO   ", "  OOOO   ", " PPPP   ", " PPPP   ", " SSSS  "),
            String.join("", "O    O   ", "O    O   ", "P   P   ", "P   P   ", "S      "),
            String.join("", "O    O   ", "O    O   ", "PPPP   ", " PPPP   ", " SSSS  "),
            String.join("", "O    O   ", "O    O   ", "P      ", " P         ", "  S "),
            String.join("", " OOOO   ", "  OOOO   ", " P      ", " P      ", " SSSS  ")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}