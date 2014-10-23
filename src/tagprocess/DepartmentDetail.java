/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tagprocess;

/**
 *
 * @author mark
 */
public class DepartmentDetail {
    private String name; 
    private double vat; 
    private double margin; 
    private String article; 
    
    public DepartmentDetail(String name, double vat, double margin, String article){
        this.name = name;
        this.vat = vat;
        this.margin = margin; 
        this.article = article; 
    }
    public String getName(){
        return name; 
    }
    public double getVat(){
        return vat;
    }
    public double getMargin(){
        return margin; 
    }
    public String getArticle(){
        return article; 
    }
}
