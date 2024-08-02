import java.util.ArrayList;
//0 - AND, 1 - OR, 2 - NOT, 3 - XOR
public class Combinational_Circuit {
    public ArrayList<Node> INPUTS;
    public ArrayList<Output_Node> Final_Outputs;
    public ArrayList<Component>[] Component_List;

    String[] Strings = {"AND","OR","NOT","XOR"};

    public Combinational_Circuit(ArrayList<Node> INPUTS) {
        this.INPUTS = INPUTS;
        Final_Outputs = new ArrayList<Output_Node>();
        Component_List = new ArrayList[4];
        //0 - AND, 1 - OR, 2 - NOT, 3 - XOR
        for (int i = 0;i<Component_List.length;i++) {
            Component_List[i] = new ArrayList<Component>();
        }
    }

    public void add_component(Component x) {
        if (x instanceof AND) {
            Component_List[0].add((AND)x);
        }else if (x instanceof OR) {
            Component_List[1].add((OR)x);
        }else if (x instanceof NOT) {
            Component_List[2].add((NOT)x);
        }else if (x instanceof XOR) {
            Component_List[3].add((XOR)x);
        }
    }

    public String BooleanExpression() {
        StringBuilder answer = new StringBuilder();
        boolean finalisconnected = false;
        for (Node x: INPUTS) {
            finalisconnected = x.GetisConnected();
        }
        if (finalisconnected) {
            if (!Final_Outputs.isEmpty()) {
                for (Output_Node x: Final_Outputs) {
                    answer.append("F(").append(Final_Outputs.indexOf(x)).append(") = ").append(x.getName()).append("\n");
                }
                return answer.toString();
            }else {
                return "Component list is empty";
            }
        }else {
            System.out.println("All inputs are not connected");
        }

        return answer.toString();


    }

    public String Output() {
        StringBuilder answer = new StringBuilder();
        if (!Final_Outputs.isEmpty()) {
            for (Output_Node x: Final_Outputs) {
                answer.append("F(").append(Final_Outputs.indexOf(x)).append(") = ").append(x.GetAnswer()).append("\n");
            }
            return answer.toString();
        } else {
            return "Component list is empty";
        }
    }


    public void display_inputs() {
        for (Node x: INPUTS) {
            System.out.println(INPUTS.indexOf(x) + x.getName());
        }
    }

    public void display_components() {
        int characternumber = 65;

        for (int i = 0; i < Component_List.length;i++) {
            if (!Component_List[i].isEmpty()) {
                System.out.println(Strings[i]);
                characternumber+=i;
                char Char = (char)characternumber;
                for (Component x: Component_List[i]) {
                    System.out.println(Char+""+Component_List[i].indexOf(x)+". "+x.getName());
                }
                System.out.println("");
                characternumber = 65;

            }
        }
    }

    public void AddFinalOutput(Component x) {
        if (x.getOutput().GetisFinal() && !x.getOutput().GetisConnected()) {
            Final_Outputs.add(x.getOutput());
        }else {
            System.out.println("Output is not the final output");
        }

    }

    public static void main(String[] args) {
        System.out.println("Combinational circuit: Half Adder\n\n");
        ArrayList<Node> in = new ArrayList<>();
        in.add(new Node("A",0));
        in.add(new Node("B",0));
        Combinational_Circuit c1 = new Combinational_Circuit(in);
        XOR g1 = new XOR("XOR1",in);
        AND g2 = new AND("AND1",in);
        for (int i = 0;i<2;i++) {
            g1.getInputs().get(i).setIsConnected(true);
            g2.getInputs().get(i).setIsConnected(true);
        }
        c1.add_component(g1);c1.add_component(g2);
        g1.getOutput().setAsFinalOutput();
        g2.getOutput().setAsFinalOutput();
        c1.AddFinalOutput(g1);c1.AddFinalOutput(g2);
        System.out.println(c1.BooleanExpression());
        System.out.println(c1.Output());

        c1.display_components();


    }

}
