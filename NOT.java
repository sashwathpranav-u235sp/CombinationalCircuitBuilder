public class NOT extends Component {
    public Node input;
    public String name;
    public Output_Node output;

    public NOT(String name, Node in1) {
        this.name = name;
        input = in1;
        output = new Output_Node("NOT "+ input.getName() + "",!input.GetAnswer(),false);
    }

    public Node getInput() {
        return input;
    }

    public void setInput(Node input) {
        this.input = input;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Output_Node getOutput() {
        return output;
    }

    @Override
    public void setOutput(Output_Node output) {
        this.output = output;
    }
}
