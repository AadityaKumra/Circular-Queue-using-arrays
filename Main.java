class Main {
  public static void main(String[] args) {
    CircularQueue q=new CircularQueue();
    q.createQueue(3);
    
    boolean a=q.isEmpty();
    if(a){
      System.out.println("Empty.");
    }
    else{
      System.out.println("EH. not empty");
    }
    q.isFull();
    q.Enqueue(2);
    q.Enqueue(3);
    q.Enqueue(4);
    
  }
}