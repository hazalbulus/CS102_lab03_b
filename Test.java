import java.util.Iterator;

/**
 * Test for iterators 
 * @author Hazal Buluş
 * @version 02.07.2021
*/ 
public class Test
{
    public static void main(String[] args)
    {
        
        IntBag bag = new IntBag();
        
        bag.addToEnd(1);
        bag.addToEnd(2);
        bag.addToEnd(3);
        bag.addToEnd(4);
        bag.addToEnd(5);
        bag.addToEnd(6);
        bag.addToEnd(7);
        bag.addToEnd(8);
        bag.addToEnd(9);
        bag.addToEnd(10);
        bag.addToEnd(11);
        bag.addToEnd(12);
        bag.addToEnd(13);
        bag.addToEnd(14);
        bag.addToEnd(15);
        bag.addToEnd(16);
        bag.addToEnd(17);
        bag.addToEnd(18);
        bag.addToEnd(19);
        bag.addToEnd(20);
        bag.addToEnd(21);
        
        
        
        Iterator i, j;
        
        i = bag.iterator();
        
        while ( i.hasNext() )
        {
            System.out.println( i.next() );
            j = bag.iterator();
            while ( j.hasNext() )
            {
                System.out.println( "--" + j.next() );
            }
        }   
    }
}
