public class CircularQueue{
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;
  int size;

  public CircularQueue(int size){
    this.arr=new int[size];
    this.size=size;
    this.topOfQueue=-1;
    this.beginningOfQueue=-1;
    System.out.println("Circular Queue of size "+size+" created successfully.");
  }

  public boolean isEmpty(){
    if(topOfQueue==-1){
      return true;
    }
    else return false;
  }

  public boolean isFull(){
    if(topOfQueue+1==beginningOfQueue){
      return true;
    }
    if(beginningOfQueue==0 && topOfQueue+1==size){
      return true;
    }
    else return false;
  }

  public void enQueue(int value){
    if (isFull()){
      System.out.println("Queue is already full");
    }
    else if(isEmpty()){
      beginningOfQueue=0;
      topOfQueue++;
      arr[topOfQueue]=value;
      System.out.println("succesfully inserted "+value+" into the queue.");}
      else{
        if(topOfQueue+1==size){
          topOfQueue=0;
        }
        else{
          topOfQueue++;
        }
        arr[topOfQueue]=value;
        System.out.println("succesfully inserted "+value+" into the queue.");
    }
  }
}
