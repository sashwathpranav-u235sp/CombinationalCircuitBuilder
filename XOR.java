import java.util.ArrayList;

public class XOR extends Component{
    public XOR(String name, Node in1, Node in2) {
        super(name, in1, in2);
        boolean a = in1.GetAnswer();
        boolean b = in2.GetAnswer();
        this.output = new Output_Node("(" + this.inputs.get(0).getName() + " XOR " + this.inputs.get(1).getName() + ")",((!a && b) || (a && !b)),false);
    }

    public XOR(String name, ArrayList<Node> inputs) {
        super(name, inputs);
        boolean a = inputs.get(0).GetAnswer();
        boolean b = inputs.get(1).GetAnswer();
        this.output = new Output_Node("(" + this.inputs.get(0).getName() + " XOR " + this.inputs.get(1).getName() + ")",((!a && b) || (a && !b)),false);


    }

    public XOR(String name, Node[] inputs) {
        super(name, inputs);
        boolean a = inputs[0].GetAnswer();
        boolean b = inputs[1].GetAnswer();
        this.output = new Output_Node("(" + this.inputs.get(0).getName() + " XOR " + this.inputs.get(1).getName() + ")",((!a && b) || (a && !b)),false);
    }


}
