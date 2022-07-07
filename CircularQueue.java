public class CircularQueue{
  int size;
  int[] queue;
  int beg=-1;
  int top=-1;
  

  public void createQueue(int size,int value){
    beg++;
    top++;
    queue=new int[size];
    queue[beg]=value;
    System.out.println("Queue created successfully.");
  }

  public boolean isEmpty(){
    if(beg==-1)return true;
    else return false;
  }

  // public boolean isFull(){
    
  //   if(top+1==beg) return true;
  //   else return false;
  // }

  // public void Enqueue(int value){
  //   if(isEmpty()){
  //     createQueue(size, value);
  //   }

  //   if(isFull()){
  //     System.out.println("Alas! Already full.");
  //   }
      
  //   else{
  //     top++;
  //     queue[top]=value;
  //   }
  // }
  
}