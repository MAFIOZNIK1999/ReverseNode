public class ReverseNode {
    static class Node {
        public int data;
        public Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
