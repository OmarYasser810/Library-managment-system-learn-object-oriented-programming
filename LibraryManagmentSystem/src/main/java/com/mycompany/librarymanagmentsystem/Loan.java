package com.mycompany.librarymanagmentsystem;

import java.util.Date;
import java.util.Scanner;

public class Loan {
    
    private Book book;
    
    private Date issuedDate;
    
    private Date dateReturned;
    
    private boolean finePaid;
       
    public int book_return_deadline; 
    //return deadline after which fine will be generated each day
    public double per_day_fine;
    
    public Loan( Book b, Date iDate, Date rDate, boolean fPaid)  {
       
        book = b;
        issuedDate = iDate;//date borrowoed
        dateReturned = rDate;//date returned 
        
        finePaid = fPaid;
    }
    
    public Book getBook()       //Returns the book
    {
        return book;
    }
    
    public Date getIssuedDate()     //Returns the date on which this particular book was issued
    {
        return issuedDate;
    } 

    public Date getReturnDate()     //Returns the date on which this particular book was returned
    {
        return dateReturned;
    }
    
  
    public boolean getFineStatus()  // Returns status of fine
    {
        return finePaid;
    }
    
    public void setReturnedDate(Date dReturned)
    {
        dateReturned = dReturned;
    }
    
    public void setFineStatus(boolean fStatus)
    {
        finePaid = fStatus;
    }    

    public Date getDateReturned() {
        return dateReturned;
    }

    public boolean isFinePaid() {
        return finePaid;
    }

    
    //Computes fine for a particular loan only
    public double computeFine1()
    {

        //-----------Computing Fine-----------        
        double totalFine = 0;
     if (!finePaid) {
        Date currentDate = new Date();
        long daysOverdue = calculateDaysOverdue(currentDate);
        if (daysOverdue > 0) {
            totalFine = daysOverdue * Library.getPerDayFine();
        }
    }
    return totalFine;
}
    
    
   
    public void payFine()
    {
        //-----------Computing Fine-----------//
        
        double totalFine = computeFine1();
                
        if (totalFine > 0)
        {
            System.out.println("\nTotal Fine generated: Rs " + totalFine);

            System.out.println("Do you want to pay? (y/n)");
            
            Scanner input = new Scanner(System.in); 
            
            String choice = input.next();
            
            if(choice.equalsIgnoreCase("y"))
                finePaid = true; 
            
            if(choice.equalsIgnoreCase("n"))
                finePaid = false; 
        }
        else
        {
            System.out.println("\nNo fine is generated.");
            finePaid = true;
            // Since no fine has been generated, this line sets the variable finePaid to true, indicating that the fine has been paid (or there was no fine to pay).
        }        
    }
    // Extending issued Date 
    public void renewIssuedBook(Date iDate)
    {        
        issuedDate = iDate;
        System.out.println("has been extended. The deadline of the book \"" + getBook().getTitle() + "\"");      

        System.out.println("Issued Book is successfully renewed!\n");
       /// This line prints a message informing the user that the issued book has been successfully renewed.
    }

    private long calculateDaysOverdue(Date currentDate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}