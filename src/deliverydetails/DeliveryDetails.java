
package deliverydetails;

//import libraries
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class DeliveryDetails 
{
    
    public static void main(String[] args) 
    {
        //variable declarations
    String chooseTOWN = null;
     int townChoice;
     int townNo1 = 1;//declaration for if statements
     int townNo2 = 2;//
     int townNo3 = 3;//
     
      String chooseWEIGHT = null;
      int weightChoice;
      int weightNo1 = 1;//declaration for if statements
      int weightNo2 = 2;//
      int weightNo3 = 3;//
      
      String chooseCOURIER = null; 
      int courierChoice;
      int courierNo1 = 1;//declaration for if statements
      int courierNo2 = 2;//
      int courierNo3 = 3;//
      
      double price = 0;//double declaration of variables for calculations
      double vat; //
      double total;//
      
      //inputs
        townChoice = Integer.parseInt(JOptionPane.showInputDialog("Select the town the parcel will be delivered to\n1)Cape Town\n2)Pretoria\n3)Durban"));
        if (townChoice == townNo1){   //if statements
            chooseTOWN = "Cape Town";
            
        }if (townChoice == townNo2){  //
            chooseTOWN = "Pretoria";
         
        }if (townChoice == townNo3){  //
            chooseTOWN = "Durban";}
        
        weightChoice = Integer.parseInt(JOptionPane.showInputDialog("Select the weight category of the parcel to be delivered to:"+chooseTOWN+"\n1)0kg - 4kg\n2)5kg - 9kg\n3)Over 10kg"));
        if (weightChoice == weightNo1){ //if statements
            chooseWEIGHT = "0kg - 4kg";
            
        }if (weightChoice == weightNo2){//
            chooseWEIGHT = "5kg - 9kg";
         
        }if (weightChoice == weightNo3){//
            chooseWEIGHT = "Over 10kg";}
        
        courierChoice = Integer.parseInt(JOptionPane.showInputDialog("Select the courier company to deliver the parcel weight of "+chooseWEIGHT+" to "+chooseTOWN+"\n1)ABC Couriers\n2)Fast Track\n3)Rest Assured"));
        if (courierChoice == courierNo1){//if statements
            chooseCOURIER = "ABC Couriers";
            
        }if(courierChoice == courierNo2){//
            chooseCOURIER = "Fast Track";
         
        }if (courierChoice == courierNo3){//
            chooseCOURIER = "Rest Assured";}
        
        if (weightChoice == weightNo1){//if statements for price
            price = 300;
            
       }if (weightChoice == weightNo1){
            price = 500;
            
       }if (weightChoice == weightNo1){
            price = 700;}  
        
       //calculations or processes
       vat = price * 0.14;
       total = vat + price;
       
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");// formatts time
       LocalTime myObj = LocalTime.now();
       NumberFormat formatter = new DecimalFormat("#0.00");//rounds all calculations by .00
       
       //outputs
       System.out.println("DELIVERY REPORT - Created on " + myObj);
       System.out.println("***********************************************"); 
       System.out.println("TOWN:          " + chooseTOWN); 
       System.out.println("WEIGHT:        " + chooseWEIGHT); 
       System.out.println("PRICE:        R" + formatter.format(price)); 
       System.out.println("VAT (14%):    R" +  formatter.format(vat)); 
       System.out.println("TOTAL DUE:    R" +  formatter.format(total)); 
       System.out.println("COURIER:       " + chooseCOURIER); 
       System.out.println("***********************************************"); 
        
    }
}
