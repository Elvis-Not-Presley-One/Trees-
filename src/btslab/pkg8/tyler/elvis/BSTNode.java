package btslab.pkg8.tyler.elvis;

/**
 *
 * @author Tyler Elvis Robert Group 9
 * @param <E>
 */
// note: add <E extends Comparable<E>> if you use recursive
//       method instructor wrote on board...hope that's
//       not news
public class BSTNode<E extends Comparable<E>>
{

    private E data;
    private BSTNode<E> left;
    private BSTNode<E> right;

    /**
     * The BSTNode is Con 
     * 
     * @param newData is the new element 
     * @param newLeft is the new left 
     * @param newRight is the new right
     */
    public BSTNode(E newData, BSTNode<E> newLeft, BSTNode<E> newRight) {
        data = newData;
        left = newLeft;
        right = newRight;

    }

    /**
     * The getData method gets the data in the tree
     * 
     * @return the data 
     */
    public E getData() 
    {
        return data;
    }

    /**
     * The getLeft method gets the left node off the tree
     * 
     * @return the left node
     */
    public BSTNode<E> getLeft() 
    {
        return left;
    }

    /**
     * The getRight method gets the right side node 
     * 
     * @return the right node 
     */
    public BSTNode<E> getRight() 
    {
        return right;
    }

    /**
     * The inorderPrint method uses recurstion to get the print the vlaues 
     * of the tree in order 
     *
     */
    public void inorderPrint() 
    {
        if (left != null) 
        {
            left.inorderPrint();
        }
        System.out.println(data);
        
        if (right != null) 
        {
            right.inorderPrint();
        }
    }

    /**
     * The setData method sets the data to input 
     * 
     * @param newData sets the data to data
     */
    public void setData(E newData) 
    {
        data = newData;
    }

    /**
     * The setLeft method sets the left to the input 
     * 
     * @param newLeft sets left to input
     */
    public void setLeft(BSTNode<E> newLeft)
    {
        left = newLeft;
    }

    /**
     * The setRight method sets the right to the new right 
     * 
     * @param newRight the new right input 
     */
    public void setRight(BSTNode<E> newRight) 
    {
        right = newRight;
    }

    /**
     * The getRightMostData() gets the data on the rightmost node
     * 
     * @return data of the node
     */
    public E getRightMostData()
    {
        if (right == null)
        {
            return data; 
        }
        else
        {
            return right.getRightMostData();
        }
    }
    
    /**
     * The removeRightMost data removes the node on the rightmost node
     * 
     * @return the left link or right link
     */
    public BSTNode<E> removeRightmost()
    {
        if (right == null)
        {
            return left; 
        }
        else
        {
            right = right.removeRightmost();
            return this; 
        }
    }
    
    
    
}
