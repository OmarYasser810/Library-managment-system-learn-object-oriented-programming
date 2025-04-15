package com.mycompany.librarymanagmentsystem;
public class Librarian extends Account {
    
    public Librarian() {
    }
    
    public Librarian(String Username , String Password , String Name , String PhoneNumber , String Address){
        super(Username ,Password ,Name ,PhoneNumber ,Address);
        setCanAccessAdminstration(true);
    }
    
    public Librarian(String Username, String Password, String Name, String PhoneNumber, String Address , int ID){
        super(Username, Password, Name, PhoneNumber, Address ,ID);
        setCanAccessAdminstration(true);
    }
     
}
