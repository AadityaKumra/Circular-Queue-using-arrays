public class CircularQueue{
  int size;
  int[] queue;
  int beg;
  int top;
  

  public void createQueue(int siz){
    queue=new int[siz];
    beg=-1;
    top=-1;
    size=siz;
    System.out.println("Queue created successfully.");
  }

  public boolean isEmpty(){
    if(top==-1)return true;
    else return false;
  }

  public boolean isFull(){
    
    if(top+1==beg) return true;
    else if(beg==0 && top+1==size) return true;
    else return false;
  }

  public void Enqueue(int value){
    if(isEmpty()){
      beg=0;
      top++;
      queue[top]=value;
      System.out.println("Successfull inserted " + value);
    }

    if(isFull()){
      System.out.println("Alas! Already full.");
    }
      
    else{
      if(top+1==size){
        top=0;
      }
      else{
      top++;
      }
    queue[top]=value;
  }
  System.out.println("Successfull inserted " + value);
  }
}