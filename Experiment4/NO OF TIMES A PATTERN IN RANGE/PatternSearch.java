import java.util.Scanner;

public class PatternSearch {
    public static int countPatternOccurrences(int start, int end, String pattern) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            String numStr = Integer.toString(i);
            
            int index = numStr.indexOf(pattern);
            while (index != -1) {
                count++;
                index = numStr.indexOf(pattern, index + 1); 
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range (start and end): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Enter pattern to search: ");
        String pattern = scanner.next();

        int result = countPatternOccurrences(a, b, pattern);

        System.out.println("The pattern " + pattern + " occurred " + result + " times between " + a + " and " + b + ".");

        scanner.close();
    }
}
