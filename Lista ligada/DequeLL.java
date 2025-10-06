public class DequeLL{
    private Node head
    private int size;
    private Node tail;
    
        private static class Node{
            Object value;
            Node next;

            Node(Object value){
                this.value = value;
                this.next = null;
            }
        }
        public DequeLL() {
            head = null;
            tail = null;
            size = 0;
        }   
        private void aumenta_deque(){
            if(tail == size){

            }
        }
        public void InserirInicio(Object value){
            new Node current = new Node(value);
            aumenta_deque()
            if(head == null){
                head = current;
                tail = current;
            }
            else{
                current.next = head;
                head = current;
                
            }
            size++;
        }

        public int size(){
            return size;
        }
        public boolean isEmpty(){
            if (head == null){
                return false;
            }
            return true;
        }
    }


