import java.util.Iterator;

public class IntBagStepIterator implements IntIterator {
    
    IntBag aBag;
    int currentIndex;
    int stepValue;
    
    public IntBagStepIterator(IntBag aBag, int stepValue){

        this.stepValue = stepValue;
        this.aBag = aBag;
        currentIndex = 0;
        
    }
    
    //Methods

    @Override
    public boolean hasNext(){
        
        return currentIndex < aBag.size();
        
    }
    
    @Override
    public int nextInt(){
        int i = this.aBag.bag[currentIndex];
  
        currentIndex = currentIndex + stepValue;
 
        return i;
        
    }
    
    @Override
    public Object next(){

        return (Integer)(this.nextInt());
        
    }
    
}
