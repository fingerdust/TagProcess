
package tagprocess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.List; 

/**
 * A class which represents a sequence of Tags. 
 * It consists of an ArrayList class constructor which uses Tag objects as 
 * list elements and getter, setter methods to return parts of each list entry.
 * It also has methods to return the size of the list, index numbers for tags
 * and methods which get one part of a list item given another. 
 * @author Mark Tobin
 */
public class Sequence{
    /** tags represents the list of inputted tags */
    List<Tag> tags = new ArrayList<Tag>(); 
    /** A method which describes the addition of a Tag object to the sequence list
     * @param tagNumber - The identifying number of each tag.
     * @param location - Text describing the location of each tag.
     * @param department - The department code assigned to a tag.
     * @param value - The value assigned to each tag. 
     * @param adjustment - The adjustment assigned to each tag. 
     * @param clerk - The clerk code number assigned to each tag. 
     * @param stockroom - A boolean which is true for tags assigned to the stockroom
     * @param verified - A boolean which is true only is the tag has been through second pass. 
     */ 
    public void add(int tagNumber, String location, float department, int value, 
            int adjustment, int clerk, boolean stockroom, boolean verified){
    tags.add(new Tag(tagNumber, location, department, value, adjustment, clerk, stockroom, verified));
    }
    /**
     * Method which returns the integer number of a Tag object given it's sequence list index.
     * @param index
     * @return tagNumber 
     */
    public int getTagNumber(int index){
        return tags.get(index).gettagNumber(); 
    }
    /**
     * Method which returns the location string of a Tag object given it's sequence list index.
     * @param index
     * @return location 
     */
    public String getLocation(int index){
        return tags.get(index).getLocation();
    }
    /**
     * Method which returns the department code of a Tag object given it's sequence list index.
     * @param index
     * @return department
     */
    public float getDepartment(int index){
        return tags.get(index).getdepartment();
    }
    /**
     * Method which returns the value of a Tag object given it's sequence list index.
     * @param index
     * @return value 
     */
    public int getValue(int index){
        return tags.get(index).getValue();
    }
    /**
     * Method which returns the adjustment of a Tag object given it's sequence list index.
     * @param index
     * @return value 
     */
    public int getAdjustment(int index){
        return tags.get(index).getadjustment();
    }
    /**
     * Method which returns the clerk number of a Tag object given it's sequence list index.
     * @param index
     * @return clerk
     */
    public int getClerk(int index){
        return tags.get(index).getClerk();
    }
    /**
     * Method which returns the stockroom boolean of a Tag object given it's sequence list index.
     * @param index
     * @return stockroom
     */
    public boolean getStockroom(int index){
        return tags.get(index).getStockRoom(); 
    }
    /**
     * Method which returns the verified boolean of a Tag object given it's sequence list index.
     * @param index
     * @return verified
     */
    public boolean getVerified(int index){
        return tags.get(index).getVerified();
    }
    /**
     * Method which returns the entire Sequence ArrayList 
     * @return tags - The arraylist representing all entered tags. 
     */
    public List<Tag> getTags() {
        return tags;
    }
    /**
     * Method used to set the TagNumber of a Tag object in the sequence using its 
     * index number. 
     * @param index - The index of the tag object in the sequence arrayList 
     * @param newTag - The value we are assigning to tagNumber element of this list entry. 
     */
    public void setTagNumber(int index, int newTag){
        tags.get(index).setTagNumber(newTag);
    }
    /**
     * Method used to set the Location of a Tag object in the sequence using its 
     * index number. 
     * @param index - The index of the tag object in the sequence arrayList 
     * @param newLocation - The value we are assigning to location element of this list entry. 
     */
    public void setLocation(int index, String newLocation){
        tags.get(index).setLocation(newLocation);
    }
    /**
     * Method used to set the Department of a Tag object in the sequence using its 
     * index number. 
     * @param index - The index of the tag object in the sequence arrayList 
     * @param newDepartment - The value we are assigning to the department element of this list entry. 
     */
    public void setDepartment(int index, float newDepartment){
        tags.get(index).setdepartment(newDepartment);
    }
    /**
     * Method used to set the Value of a Tag object in the sequence using its 
     * index number. 
     * @param index - The index of the tag object in the sequence arrayList 
     * @param newValue - The value we are assigning to the value element of this list entry. 
     */
    public void setValue(int index, int newValue){
        tags.get(index).setValue(newValue);
    }
    /**
     * Method used to set the Adjustment of a Tag object in the sequence using its 
     * index number. 
     * @param index - The index of the tag object in the sequence arrayList 
     * @param newAdjustment - The value we are assigning to the adjustment element of this list entry. 
     */
    public void setAdjustment(int index, int newAdjustment){
        tags.get(index).setadjustment(newAdjustment);
    }
    /**
     * Method used to set the Clerk of a Tag object in the sequence using its 
     * index number. 
     * @param index - The index of the tag object in the sequence arrayList 
     * @param newClerk - The value we are assigning to the clerk element of this list entry. 
     */
    public void setClerk(int index, int newClerk){
        tags.get(index).setClerk(newClerk);
    }
    /**
     * Method used to set the Stockroom of a Tag object in the sequence using its 
     * index number. 
     * @param index - The index of the tag object in the sequence arrayList 
     * @param sr - The value we are assigning to the stockroom element of this list entry. 
     */
    public void setStockroom(int index, boolean sr){
        tags.get(index).setStockroom(sr);
    }
    /**
     * Method used to set the Verified of a Tag object in the sequence using its 
     * index number. 
     * @param index - The index of the tag object in the sequence arrayList 
     * @param ver - The value we are assigning to the verified element of this list entry. 
     */
    public void setVerified(int index, boolean ver){
        tags.get(index).setVerified(ver);
    }
    /**
     * Method to return the length of the current sequence list 
     * @return length - The length of the sequence list. 
     */
    public int length(){
        return tags.size(); 
    }
    /**
     * Method to return a Tag object given that tag's actual tag number. 
     * @param newTagNumber
     * @return Tag - Object 
     */
    public Tag returnTag(int newTagNumber){
        // Create a Tag object set to null 
        Tag tag = new Tag(0, "", 0,0,0,0,false,false);
        for(int i=0;i<tags.size();i++){
            // Find Tag with actual tag number 
            if(tags.get(i).gettagNumber() == newTagNumber){
               tag =  tags.get(i); 
                
            }             
        }
        return tag; 
    }
    /**
     * Method to return the list index of a Tag object given it's actual tag number. 
     * @param newTagNumber
     * @return i - The index of the Tag in the sequence list. 
     */
    public int returnIndex(int newTagNumber){
        for(int i=0;i<tags.size();i++){
            if(tags.get(i).gettagNumber() == newTagNumber){
               return i; 
                
            }             
        }
        return -1;
    }
    /**
     * Method to write the sequence list to file as a serialized object. 
     * @param file - The file to write the serialized version of the list to. 
     */
    public void writeToFile(File file){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tags); // Write serial object 
            oos.close();
        }catch(IOException ioe){
            System.err.println(ioe);
        }
    }
    /**
     * Method to read a serialized object from file and use it to create a new sequence list. 
     * @param file 
     */
    public void readFromFile(File file){
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            tags = (List<Tag>) ois.readObject(); // Assign the object to the arrayList variable. 
            ois.close();
        }catch(IOException ioe){
            System.err.println(ioe);
        }catch(ClassNotFoundException cnf){
            System.err.println(cnf);
        }
    }
    /**
     * Method to test whether the sequence list contains a particular tag referenced by Tag Number. 
     * @param test
     * @return true - if the sequence contains test tag number. 
     */
    public boolean containing(int test){
        for(int i=0;i<tags.size();i++){
            if(test == tags.get(i).gettagNumber()){
                return true; 
            }
        }
        return false; 
    }
    public void sortSequence(){
        Collections.sort(tags, new TagComparator()); 
    }
            
}
