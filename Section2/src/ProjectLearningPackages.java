import java.util.Scanner;

public class ProjectLearningPackages {
    public static void main(String[] args) {
        int packageCost = 0;
        int minCourses = 0;
        int additionalCoursePrice = 0;
        int additionalCourseCount = 0;

        System.out.println("Welcome to Learning Stars.");
        System.out.println();
        System.out.println("Please choose a learning package from the following options: ");
        System.out.println("Learning Package 1: £10/month, includes 2 courses per month. Each additional course is £6.");
        System.out.println("Learning Package 2: £12/month, includes 4 courses per month. Each additional course is £4.");
        System.out.println("Learning Package 3: £15/month, includes 6 courses per month. Each additional course is £3.");
        System.out.println();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter '1', '2' or '3' to select a learning package: ");
        int packageChoice = keyboard.nextInt();

        System.out.print("Enter the number of courses: ");
        int courseCount = keyboard.nextInt();

        if (packageChoice == 1) {
            packageCost = 10;
            minCourses = 2;
            additionalCoursePrice = 6;
        }
        else if (packageChoice == 2) {
            packageCost = 12;
            minCourses = 4;
            additionalCoursePrice = 4;
        }
        else if (packageChoice == 3) {
            packageCost = 15;
            minCourses = 6;
            additionalCoursePrice = 3;
        }

        if (courseCount > minCourses) {
            additionalCourseCount = courseCount - minCourses;
        }

        int totalCost = packageCost  + (additionalCourseCount * additionalCoursePrice);
        System.out.println("Total cost is £" + totalCost);
    } // end main
}
