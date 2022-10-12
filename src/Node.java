public class Node {

    int number;
    Node next;

    public Node(){

    }

    public Node(int number){
        this.number = number;
        this.next = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Node{ number=" + number + ", next=" + next + " } ";
    }
}
