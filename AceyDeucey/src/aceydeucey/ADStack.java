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
public class ADStack {
    //Implements a Stack, which is a data structure that works like a "line".

    //data - just used the ArrayList. It will hold each element
    private ArrayList<ADCard> data;

    public ADStack() {
        data = new ArrayList<ADCard>();     //the constructor will actually create the aggregate class instance
    }

    public ADCard push(ADCard obj) {
        data.add(0, obj);
        return obj;
    }
    //pop - pops the last item off the stack

    public ADCard pop() {
        if (data.size() == 0) {
            return null;
        } else {
            return data.remove(0);   //the ArrayList method will remove and return it,
        }
    }
    //peek - looks at the last thing in the stack without removing it

    public ADCard peek() {
        if (data.isEmpty()) {
            return null;
        } else {
            return data.get(0);
        }
    }
    //empty -tests if the stack is empty

    public Boolean empty() {
        if (data.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    //toString - toString for the stack

    @Override
    public String toString() {
        return data.toString();
    }

}

