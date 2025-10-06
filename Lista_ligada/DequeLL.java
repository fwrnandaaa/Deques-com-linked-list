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
        
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            if (head == null){
                return false;
            }
            return true;
        }
        public void inserirInicio(int value){
            new Node current = new Node(value);
            if(isEmpty() == true){
                head = current;
                tail = current;
            }
            else{
                current.next = head;
                head = current;
            }
            size++;
        }
        public void removerFinal(){
            //a fazer
        }
        public void inserirFinal(Object value){
            new Node current = new Node(value);
            if(isEmpty() == True){
                head = current;
                tail == current
                size--;
            }
            else{
                tail.next = current;
                tail = current;
                size--;
            }
        }
        public void removerInicio(){
            if(isEmpty() != true){
                if(head.next == null){
                    head = null;
                    tail = null;
                    size = 0;
                }
                else{
                    head = head.next;
                    size--;
                }
            }
        }

    }


