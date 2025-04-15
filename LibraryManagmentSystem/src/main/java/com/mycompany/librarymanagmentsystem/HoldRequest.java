package com.mycompany.librarymanagmentsystem;
import java.util.Date;

public class HoldRequest {
    
    Book book;
    Date requestDate;
    
    public HoldRequest( Book b, Date reqDate)  // para cons.
    {

        book = b;
        requestDate = reqDate;
    }
    
    public Book getBook()
    {
        return book;
    }
    
    public Date getRequestDate()
    {
        return requestDate;
    }
    
    // Print Hold Request Info 
    public void print()
    {
        System.out.print(book.getTitle() + "\t\t\t\t" + "\t\t\t\t"  + requestDate + "\n");
    }
}// HoldRequest Class Closed