import java.util.ArrayList;

public class Component {
    public String name;
    public ArrayList<Node> inputs;
    public Output_Node output;


    public Component(String name,Node in1,Node in2) {
        this.name = name;
        inputs = new ArrayList<Node>();
        inputs.add(in1);inputs.add(in2);
    }

    public Component (String name, ArrayList<Node> inputs) {
        this.name = name;
        if (inputs.size() == 2) {
            this.inputs = inputs;
        }else {
            throw new IllegalArgumentException("Error: ArrayList size too big");
        }

    }

    public Component (String name,Node[] inputs) {
        this.name = name;
        this.inputs = new ArrayList<Node>();
        if (inputs.length == 2) {
            this.inputs.add(inputs[0]);
            this.inputs.add(inputs[1]);
        }else {
            throw new IllegalArgumentException("Error: Node array is too big");
        }

    }

    public Component() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Node> getInputs() {
        return inputs;
    }

    public void setInputs(ArrayList<Node> inputs) {
        if (inputs.size() == 2) {
            this.inputs = inputs;
        }else {
            throw new IllegalArgumentException("Error: ArrayList size too big");
        }
    }

    public void setInputs(Node in1, Node in2) {
        this.inputs.add(in1);this.inputs.add(in2);
    }
    public void setInputs(Node[] inputs) {
        if (inputs.length == 2) {
            this.inputs.add(inputs[0]);
            this.inputs.add(inputs[1]);
        }else {
            throw new IllegalArgumentException("Error: Node array too big");
        }
    }

    public Output_Node getOutput() {
        return output;
    }

    public void setOutput(Output_Node output) {
        this.output = output;
    }

}
