public class DequeLDL{
    private Node head;
    private Node tail;
    private int size;

    private static class Node{
        Object value;
        Node next;
        Node prev;
        Node(Object value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    public DequeLDL(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void inserirInicio(Object value){
            Node current = new Node(value);
            if(isEmpty()){
                head = current;
                tail = current;
            }
            else{
                current.next = head;
                head.prev = current;
                head = current;
            }
            size++;
        }

         public void inserirFinal(Object value){
            Node current = new Node(value);
            if(isEmpty()){
                head = current;
                tail = current;
                size++;
            }
            else{
                tail.next = current;
                current.prev = tail;
                tail = current;
                size++;
            }
        }

        public void verDeque(){
            Node current = head;
            while(current != null){
                System.out.println(current.value);
                current = current.next;
            }
        }
        public void removerInicio(){
            if(isEmpty() == false){
               head = head.next;
                if (head != null) {
                    head.prev = null;
                } 
                else {
                    tail = null; 
                }
                size--;
            }
        } 
        
        public void removerFinal(){
            if(isEmpty()){
                return;
                }
            if(size == 1){
                head = null;
                tail = null;
                size = 0;
                return;
            }
            tail = tail.prev;
            tail.next=null;
            size--;
            return;
    
        
        }
        public Object primeiro(){
            return head.value;
        }
        public Object ultimo(){
            return tail.value;
        }


    }
