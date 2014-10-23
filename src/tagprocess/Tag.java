
package tagprocess;

import java.io.Serializable;

/**
 * A class which represents the real world Tag object. 
 * <p> This class implements serializable so that, in turn, the sequence class 
 * can write the sequence arrayList to file as a serialized object 
 * @author Mark Tobin
 */
public class Tag implements Serializable{
    // Variable which describe the various parts of an actual Tag 
    private int tagNumber; 
    private String location;
    private float department; 
    private int value;
    private int adjustment; 
    private int clerk; 
    private boolean stockroom; // True when the object represents a stock room tag
    private boolean verified;  // True when the object details are verified on the second pass 
    
    /**
     * Class Constructor
     * @param tagNumber - The real world number of the Tag (A 6 digit reference number)
     * @param location - A one word description of the Tags location within the store. 
     * @param department - The department code assigned to a Tag
     * @param value - The financial value assigned to a Tag
     * @param adjustment - The amount of negative or positive adjustment assigned to a Tag
     * @param clerk - The clerk code assigned to a Tag 
     * @param stockroom - Boolean describing whether a Tag belongs to stock room 
     * @param verified  - Boolean describing whether a Tag has been verified by second pass 
     */
    public Tag(int tagNumber, String location, float department, int value, int adjustment, int clerk, boolean stockroom, boolean verified ){
        this.tagNumber = tagNumber; 
        this.location = location; 
        this.department = department; 
        this.value = value; 
        this.adjustment = adjustment; 
        this.clerk = clerk; 
        this.stockroom = stockroom;
        this.verified = verified; 
    }
    /**
     * Getter method. Returns tag number 
     * @return tagNumber - The real world tag number 
     */
    public int gettagNumber(){
        return tagNumber; 
    }
    /**
     * Getter method. Returns tag location 
     * @return location - The in store location of the tag 
     */
    public String getLocation(){
        return location;
    }
    /**
     * Getter method. Returns tag department 
     * @return department - The department code of the tag 
     */
    public float getdepartment(){
        return department; 
    }
    /**
     * Getter method. Returns tag value
     * @return value - The financial value of the tag 
     */
    public int getValue(){
        return value; 
    }
    /**
     * Getter method. Returns tag adjustment 
     * @return adjustment - The financial adjustment of a tag 
     */
    public int getadjustment(){
        return adjustment;
    }
    /**
     * Getter method. Returns clerk number 
     * @return clerk - The clerk code 
     */
    public int getClerk(){
        return clerk; 
    }
    /**
     * Getter method. Returns the stockroom boolean 
     * @return stockroom - True if tag is stock room 
     */
    public boolean getStockRoom(){
        return stockroom; 
    }
    /**
     * Getter method. Returns verified 
     * @return verified - True if the tag has been through second pass 
     */
    public boolean getVerified(){
        return verified; 
    }
    /**
     * Setter method - Assign parameter to tag object
     * @param newTagNumber 
     */
    public void setTagNumber(int newTagNumber){
        tagNumber = newTagNumber; 
    }
    /**
     * Setter method - Assign parameter to tag object
     * @param newLocation 
     */
    public void setLocation(String newLocation){
        location = newLocation; 
    }
    /**
     * Setter method - Assign parameter to tag object
     * @param newDepartment 
     */
    public void setdepartment(float newDepartment){
        department = newDepartment; 
    }
    /**
     * Setter method - Assign parameter to tag object
     * @param newValue 
     */
    public void setValue(int newValue){
        value = newValue; 
    }
    /**
     * Setter method - Assign parameter to tag object
     * @param newAdjustment 
     */
    public void setadjustment(int newAdjustment){
        adjustment = newAdjustment;
    }
    /**
     * Setter method - Assign parameter to tag object
     * @param newClerk 
     */
    public void setClerk(int newClerk){
        clerk = newClerk; 
    }
    /**
     * Setter method - Assign parameter to tag object
     * @param sr 
     */
    public void setStockroom(boolean sr){
        stockroom = sr; 
    }
    /**
     * Setter method - Assign parameter to tag object
     * @param ver 
     */
    public void setVerified(boolean ver){
        verified = ver; 
    }
    
}
