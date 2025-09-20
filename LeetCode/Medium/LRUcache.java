class LRUCache {

    static class Node{
        int key, val;
        Node prev;
        Node next;

        public Node(int k, int v){
        Node prev = null;
        Node next = null;
        this.key = k;
        this.val = v;
        }
    }
    int capacity;
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node ansNode = map.get(key);
        delNode(ansNode);
        insertAtHead(ansNode);
        
        return ansNode.val;
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            Node oldNode = map.get(key);
            oldNode.val = value;
            delNode(oldNode);
            insertAtHead(oldNode);
            return;
        }

        if(map.size()==capacity){
            Node lru = tail.prev;
            map.remove(lru.key);
            delNode(lru);
        }

        Node newNode = new Node(key, value);
        map.put(key, newNode);
        insertAtHead(newNode);
    }

    public void insertAtHead(Node newNode){
        Node oldNext = head.next;
        head.next = newNode;
        newNode.next = oldNext;
        newNode.prev = head; 
        oldNext.prev = newNode;
    }

    public void delNode(Node oldNode){
        Node oldPrev = oldNode.prev;
        Node oldNext = oldNode.next;

        oldPrev.next = oldNext;
        oldNext.prev = oldPrev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
