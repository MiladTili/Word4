import java.util.Arrays;

public class GradeAnalyzer {
     private int[] grades;

    public GradeAnalyzer(int[] grades) {
        this.grades = grades;
    }

    public int countOutstandingGrades() {
        int count = 0;
        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                count++;
            }
        }
        return count;
    }

    public int countPassingGrades() {
        int count = 0;
        for (int grade : grades) {
            if (grade >= 60 && grade <= 89) {
                count++;
            }
        }
        return count;
    }

    public int countUnsatisfactoryGrades() {
        int count = 0;
        for (int grade : grades) {
            if (grade >= 1 && grade <= 59) {
                count++;
            }
        }
        return count;
    }

    public void printGradeCategories() {
        int outstandingCount = countOutstandingGrades();
        int passingCount = countPassingGrades();
        int unsatisfactoryCount = countUnsatisfactoryGrades();

        System.out.println("Outstanding grades: " + outstandingCount);
        System.out.println("Passing grades: " + passingCount);
        System.out.println("Unsatisfactory grades: " + unsatisfactoryCount);
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int findMinimumGrade() {
        Arrays.sort(grades);
        return grades[0];
    }
    public int findMaximumGrade() {
        Arrays.sort(grades);
        return grades[grades.length - 1];
    }
}

