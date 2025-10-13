public class DequeLL{
    private Node head;
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
            if(isEmpty()){
                throw new DequeExcecao("Deque está vazio");
              
            }
            else{
                head = head.next;
                size--;
            }
        } 
        
        public void removerFinal(){
            if(isEmpty()){
               throw new DequeExcecao("Deque está vazio");
                }
            if(size == 1){
                head = null;
                tail = null;
                size = 0;
                return;
            }
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
            tail = current;
            size--;
            return;
    
        
        }
        public Object primeiro(){
            if (isEmpty()) {
                throw new DequeExcecao("Deque está vazio");
            }
            return head.value;
            }
        
        public Object ultimo(){
             if (isEmpty()) {
                throw new DequeExcecao("Deque está vazio");
            }
            return tail.value;
        }
}