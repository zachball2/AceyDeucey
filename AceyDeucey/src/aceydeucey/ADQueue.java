/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceydeucey;

import java.util.ArrayList;

/**
 *
 * @author Zachcollins
 */
public class ADQueue {
    //Implements a queue

    private ArrayList<ADCard> data;

    public ADQueue() {
        data = new ArrayList<ADCard>();
    }

    public ADCard add(ADCard obj) {//adds card to the queue
        data.add(obj);
        return obj;
    }
    //pop - pops the last item off the stack

    public ADCard remove() {    //removes card from queue
        if (data.size() == 0) {
            return null;
        } else {
            return data.remove(0);   //the ArrayList method will remove and return it,
        }
    }
    //looks at the last thing in the queue without removing it

    public ADCard look() {
        if (data.isEmpty()) {
            return null;
        } else {
            return data.get(0);
        }
    }
    //empty tests if the queue is empty

    public Boolean empty() {
        if (data.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    //toString - toString for the queue

    public String toString() {
        return data.toString();
    }

}

