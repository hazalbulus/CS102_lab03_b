public class IntBagIterator implements IntIterator {

    IntBag theBag;
    int currentIndex;

    public IntBagIterator(IntBag theBag){
        this.theBag = theBag;
        currentIndex = 0;

    }

    //Methods
        
    @Override
    public boolean hasNext(){
        
        return currentIndex < theBag.size();
        
    }
    
    @Override
    public int nextInt(){
        int i = theBag.bag[currentIndex];
        currentIndex++;
        return i;
        
    }
    
    @Override
    public Object next(){
  
        return (Integer)(this.nextInt());
    }
 
}