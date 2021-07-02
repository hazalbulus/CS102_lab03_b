/**
 * Lab01 part b IntBag class
 * @author Hazal Buluş
 * @version 1.0 17.06.2021
*/ 
import java.util.Arrays;
import java.util.Iterator;

public class IntBag {
    //Properties
    int[] bag;
    int currentValues;
    int stepValue;

    //Constructor
    public IntBag(){
        stepValue = 1;
        int size = 4;
        bag = new int[size];//initial length
        currentValues = 0;
    }

    public IntBag(int stepValue){

        this.stepValue = stepValue;
        int size = 4;
        bag = new int[size];//initial length
        currentValues = 0;
    }

    public Iterator iterator(){

        if(stepValue == 1)

            return new IntBagIterator(this);

        return new IntBagStepIterator(this, stepValue);

    }

    /**
     * add the given value at the end of the collection
     * @param value
     */
    public void addToEnd(int value){

        if(value >= 0){    
            //double the size of the array if there is no capacity for a new element
            if(currentValues == bag.length){
                bag = Arrays.copyOf(bag, bag.length * 2);
            }
            bag[currentValues] = value;
            currentValues++;
        }
        else
            return;
    }

    /**
     * add given value at the given index
     * @param value
     * @param index
     */
    public void addToIndex(int value, int index) {
        
        if(value >= 0){
        
            if(index >= bag.length || currentValues == bag.length)
                bag = Arrays.copyOf(bag, bag.length * 2);
            
            for(int j = bag.length - 1; j > index; j--){
                bag[j] = bag[j - 1];
            }
            
            bag[index] = value;
            currentValues++;
        }
        else
            return;
    }
    
    /**
     * This method removes the value at the given index by replacing the value with the last non-negative value
     * @param index
     */
    public void remove(int index){
        int lastValue = 0;
        int lastValueIndex = 0;
        for(int i =0; i<bag.length; i++){
            if(bag[i] != 0){
                lastValue = bag[i];
                lastValueIndex = i;
            }
        }
        bag[index] = lastValue;
        bag[lastValueIndex] = 0;

        currentValues--;
    }

    /**
     * This method checks whether the given value is in the array or not
     * @param value
     * @return true if array contains the given value, false otherwise
     */
    public boolean test(int value){

        boolean result = false;

        for(int i: bag){

            if(bag[i]==value)
            {
                result = true;
            }
            result = false;  
        }
        return result;
    }

    /**
     * @return string representation of the array
     */
    public String toString(){

        String result = "";

        for(int i = 0; i< bag.length; i++){
            result = result + "[" + i + "]" + " = " + bag[i] + "\n";
        }
        int sentinel = -(int)(Math.random() * 10);
        result = result + "[sentinel]" + " = " + sentinel + "\n";        
        return result ;

    }

    /**
     * This method returns the number of current values in the array
     * @return size 
     */
    public int size(){
        return currentValues;
    }

    /**
     * This method gets the value at the given index
     * @param index
     */
    public void getElement(int index){
        System.out.println(bag[index]);
    }

    /**
     * This method removes all instances of a given value in the collection
     * @param value
     */
    public void removeAll(int value){
        int[] copyBag = new int[bag.length];
        int j=0;
        int l=0;

        for(int i = 0; i < bag.length; i++){

            if(bag[i] != value){
                copyBag[j] = bag[i];
                j++;
            }
        }
        l = this.size()-j;
        bag = copyBag;
        currentValues = currentValues - l;
    }
}