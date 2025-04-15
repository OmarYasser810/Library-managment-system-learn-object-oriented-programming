package com.mycompany.librarymanagmentsystem;
public interface CRUD {
    
    void AddBook(String Title, String Auther, String ISPN, String genre, String BookPages);
    
    String UpdateBook(String Title, String Auther, String ISPN, String genre, String BookPages , int AvailableBooks);
    
    String DeleteBook(String ISBN);

    String ShowBook(String ISPN);
        
}
