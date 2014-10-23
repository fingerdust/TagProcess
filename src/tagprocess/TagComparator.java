/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tagprocess;

import java.util.Comparator;

/**
 *
 * @author mark
 */
public class TagComparator implements Comparator<Tag>{
    public int compare(Tag t1, Tag t2){
        return t1.gettagNumber() - t2.gettagNumber(); 
    }
    
}
