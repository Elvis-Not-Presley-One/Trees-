package btslab.pkg8.tyler.elvis;

import java.util.HashSet;

/**
 *
 * @author Tyler Elvis Robert Group 9
 * @param <E>
 */
public class Tree<E extends Comparable<E>> 
{

    private BSTNode<E> root;
    private int numitems;

    /**
     * Con
     *
     */
    public Tree()
    {

    }

    /**
     * The add method adds a new node to the tree
     *
     * @param element element that gets added
     */
    public void add(E element) 
    {
        if (root == null) 
        {
            root = new BSTNode<E>(element, null, null);
        } 
        else 
        {
            BSTNode<E> cursor = root;
            boolean done = false;

            while (!done) 
            {
                if (element.compareTo(cursor.getData()) < 0) 
                {
                    if (cursor.getLeft() == null) {
                        cursor.setLeft(new BSTNode<E>(element, null, null));
                        done = true;
                    } 
                    else 
                    {
                        cursor = cursor.getLeft();
                    }
                }
                else
                {
                    if (cursor.getRight() == null) 
                    {
                        cursor.setRight(new BSTNode<E>(element, null, null));
                        done = true;
                    } 
                    else 
                    {
                        cursor = cursor.getRight();
                    }

                }

            }
        }
        numitems++;
    }

    /**
     * The remove method removes the node
     *
     * @param element the data that is being removed
     * @return
     */
    public boolean remove(E element) 
    {
        boolean found = false;
        BSTNode<E> cursor = root;
        BSTNode<E> parentOfCurosr = null;

        while (cursor != null && !found)
        {
            if (cursor.getData().equals(element)) 
            {
                found = true;
            } 
            else 
            {
                parentOfCurosr = cursor;

                if (element.compareTo(cursor.getData()) < 0)
                {
                    cursor = cursor.getLeft();

                }
                else 
                {
                    cursor = cursor.getRight();

                }

            }
        }

        if (cursor == null) 
        {
            found = false;
        } 
        else if (cursor == root && cursor.getLeft() == null) 
        {
            root = root.getRight();
            numitems--;
        } 
        else if (cursor != root && cursor.getLeft() == null)
        {
            if (cursor == parentOfCurosr.getLeft()) 
            {
                parentOfCurosr.setLeft(cursor.getRight());
                numitems--;
            } 
            else
            {
                parentOfCurosr.setRight(cursor.getRight());
                numitems--;
            }
        }
        else
        {
            cursor.setData(cursor.getLeft().getRightMostData());
            cursor.setLeft(cursor.getLeft().removeRightmost());
            numitems--;

        }

        return found;
    }

    /**
     * The size method gets the size of the tree
     *
     * @return size of the tree
     */
    public int size() 
    {
        return numitems;
    }

    /**
     * The printTree method prints the tree in order
     *
     */
    public void printTree() 
    {
        if (root != null) 
        {
            root.inorderPrint();
        }
    }
}
