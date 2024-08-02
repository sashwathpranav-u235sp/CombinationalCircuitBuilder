import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public Combinational_Circuit c;


    public UI(Combinational_Circuit c) {
        this.c = c;

    }

    private void addinginputs(Component X, String name) {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to connect to an:\n1.Input\n2.Output");
        int answer = s.nextInt();
        if (answer==1) {
            this.c.display_inputs();
            if (X instanceof NOT) {
                System.out.println("Choose an input");
                String input  = s.nextLine();
                for (Node x : c.INPUTS) {
                    if (x.getName().equals(input)) {
                        x.setIsConnected(true);
                        X = new NOT (name,x);
                        break;
                    }else {
                        System.out.println("Input doesnt exist.");
                    }
                }

            }else {
                System.out.println("Choose your inputs");
                ArrayList<Node> newinputs = new ArrayList<>();
                boolean loop = true;
                int i=0;
                while (loop) {

                    String input = s.nextLine();
                    for (Node x: c.INPUTS) {
                        if (x.getName().equals(input)) {
                            newinputs.add(x);
                            i++;
                        }else {
                            System.out.println("Input doesnt exist");
                        }
                    }

                    if (i==2) {
                        loop = false;
                    }
                }
                for (Node x: newinputs) {
                    x.setIsConnected(true);
                }

                if (X instanceof AND) {
                    X = new AND(name,newinputs);
                }else if (X instanceof OR) {
                    X = new OR(name,newinputs);

                }else if (X instanceof XOR) {
                    X = new XOR(name,newinputs);
                }
            }

            c.add_component(X);
        }else {
            //connecting outputs goes here
            System.out.println("Output goes here");
        }

    }

    private void addAComponent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Select a gate\n1.AND\n2.OR\n3.NOT\n4.XOR");
        int answer = s.nextInt();
        System.out.println("Name your component");
        String name = s.nextLine();
        if (answer == 1) {
            AND gate = null;


        }else if (answer == 2) {
            OR gate = null;


        }else if (answer == 3) {
            NOT gate = null;


        }else if (answer == 4) {
            XOR gate = null;

        }else {
            System.out.println("Error: Invalid input");
        }
    }

    public void Subloop() {
        boolean loop = true;
        Scanner s = new Scanner(System.in);

        while (loop) {
            System.out.println("Choose an option\n1.Add Component\n2.Check results\n3.Choose Final Output\n4.Exit");
            int answer = s.nextInt();
            switch (answer) {
                case 1:
                    this.addAComponent();

                case 2:

                case 3:

                default:
                    loop = false;

            }

        }
    }



    public Combinational_Circuit getC() {
        return c;
    }

    public void setC(Combinational_Circuit c) {
        this.c = c;
    }
}
