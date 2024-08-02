import java.util.ArrayList;

public class AND extends Component{

    public AND(String name, Node in1, Node in2) {
        super(name, in1, in2);
        boolean a = in1.GetAnswer();
        boolean b = in2.GetAnswer();
        this.output = new Output_Node("(" + this.inputs.get(0).getName() + " AND " + this.inputs.get(1).getName() + ")",(a && b),false);
    }

    public AND(String name, ArrayList<Node> inputs) {
        super(name, inputs);
        boolean a = inputs.get(0).GetAnswer();
        boolean b = inputs.get(1).GetAnswer();
        this.output = new Output_Node("(" + this.inputs.get(0).getName() + " AND " + this.inputs.get(1).getName() + ")",(a && b),false);


    }

    public AND(String name, Node[] inputs) {
        super(name, inputs);
        boolean a = inputs[0].GetAnswer();
        boolean b = inputs[1].GetAnswer();
        this.output = new Output_Node("(" + this.inputs.get(0).getName() + " AND " + this.inputs.get(1).getName() + ")",(a && b),false);
    }




}
