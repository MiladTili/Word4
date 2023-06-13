public class MainGradeAnalyzer {
    public static void main(String[] args) {
        int[] grades = {63, 75, 72, 72, 78, 67, 80, 63, 75, 90, 89, 43, 59, 99, 82, 12, 100};

        GradeAnalyzer analyzer = new GradeAnalyzer(grades);

        analyzer.printGradeCategories();
        System.out.println("Average grade: " + analyzer.calculateAverageGrade());
        System.out.println("Minimum grade: " + analyzer.findMinimumGrade());
        System.out.println("Maximum grade: " + analyzer.findMaximumGrade());
    }
}
