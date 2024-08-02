
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Combinational_Circuit c;
        ArrayList<Node> official_inputs = new ArrayList<>();
        boolean loop = true;
        while (loop) {
            Scanner answer  = new Scanner(System.in);
            System.out.println("--- COMBINATIONAL CIRCUIT BUILDER ---");
            System.out.println("Choose an option\n1.Build a Circuit\nPress any number to quit");
            if (answer.hasNextInt()) {
                int ans = answer.nextInt();
                if (ans == 1){
                    Scanner inp = new Scanner(System.in);
                    System.out.println("How many inputs?");
                    int inpanswer = answer.nextInt();
                    System.out.println("Type the names of those inputs:");
                    for (int i = 0;i<inpanswer;i++) {
                        String in = inp.nextLine();
                        official_inputs.add(new Node(in));
                    }
                    System.out.println("Inputs added");
                    c = new Combinational_Circuit(official_inputs);
                    UI u = new UI(c);
                    u.Subloop();




                }else {
                    System.out.println("Thank you for using me :D");
                    loop = false;
                }
            }else {
                System.out.println("Invalid input. Please try again\n\n");
            }
        }
    }
}
