public class Node {
    public boolean answer;
    public String name;

    public boolean isConnected;

    public Node (String name,boolean answer) {
        isConnected = false;
        this.name = name;
        this.answer = answer;
    }

    public Node (String name, int answer_int) {
        this.name = name;
        isConnected = false;
        if (answer_int == 1 || answer_int == 0) {
            this.answer = (answer_int==1);
        }else {
            throw new IllegalArgumentException("Error: Invalid input (You should enter either 1 or 0)");
        }
    }
    public Node (String name) {
        this.name = name;
        isConnected = false;
    }

    public boolean GetAnswer() {
        return answer;
    }

    public boolean GetisConnected() {
        return isConnected;
    }

    public void setIsConnected(boolean connected) {
        isConnected = connected;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
