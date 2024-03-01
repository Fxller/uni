import java.util.Scanner;
public class automa {
    
    enum stati {
        q1,
        q2,
        q3
    }
    
    public static void main(String[] args) {
        stati last = stati.q2;
        stati current = stati.q1;
        System.out.println("Insert a string of a's and b's:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (current == stati.q1) {
                if (input.charAt(i) == 'a') {
                    current = stati.q1;
                } else {
                    current = stati.q2;
                }
            } else if (current == stati.q2) {
                if (input.charAt(i) == 'a') {
                    current = stati.q3;
                } else {
                    current = stati.q2;
                }
            } else if (current == stati.q3) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'b') {
                    current = stati.q2;
                }
            }
        }
        if (current == stati.q2) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        } 
    }

}