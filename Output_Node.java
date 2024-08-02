public class Output_Node extends Node{
    public boolean isFinal;

    public Output_Node(String name, boolean answer, boolean isFinal) {
        super(name, answer);
        this.isFinal = isFinal;
    }

    public boolean GetisFinal() {
        return isFinal;
    }

    public void setAsFinalOutput() {
        isFinal = true;
    }
}
