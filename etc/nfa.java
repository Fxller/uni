import java.util.*;

public class nfa {

  public enum State {
    q1,
    q2,
    q3,
    q4,
  }

  public static void main(String[] args) {
    State s = State.q1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string (0,1): ");
    String input = sc.nextLine();
    boolean accepted = false;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      switch (s) {
        case State.q1:
          {
            if (c == '1') {
              s = State.q2;
            }
            break;
          }
        case State.q2:
          {
            s = State.q3;
            break;
          }
        case State.q3:
          {
            s = State.q4;
            accepted = true;
            break;
          }
        case State.q4:
          {
            accepted = false;
            break;
          }
        default:
          {
            break;
          }
      }
    }
    if (accepted) {
        System.out.println("Accepted");
        } else {
        System.out.println("Rejected");
    }
  }
}
