class Main {
  public static void main(String[] args) {
    CircularQueue cq=new CircularQueue(3);
    boolean res=cq.isEmpty();
    System.out.println(res);
    res=cq.isFull();
    System.out.println(res);
    cq.enQueue(0);
    cq.enQueue(1);
    cq.enQueue(2);
    cq.enQueue(3);
    cq.enQueue(4);
  }
}