    public class LumberTable {
    private static final int[] LENGTHS = {24, 6, 8, 10};
    private static final int[] WIDTHS = {2, 4, 6, 8, 10, 12};
    
    public static void main(String[] args) {
        System.out.println("Lumber Table");
        System.out.println("Dimensions are in inches");
        System.out.println();
        System.out.printf("%10s%10s%15s%20s%20s%n", "Length", "Width", "Cross-sectional", "Moment of inertia", "Section modulus");
        System.out.printf("%10s%10s%15s%20s%20s%n", "", "", "area", "", "");
        System.out.println("---------------------------------------------------------------");

        for (int length : LENGTHS) {
            for (int width : WIDTHS) {
                double crossSectionalArea = width * length;
                double momentOfInertia = width * Math.pow(length, 3) / 12;
                double sectionModulus = width * Math.pow(length, 2) / 6;

                System.out.printf("%10d%10d%15.2f%20.2f%20.2f%n", length, width, crossSectionalArea, momentOfInertia, sectionModulus);
            }
        }
    }
}
