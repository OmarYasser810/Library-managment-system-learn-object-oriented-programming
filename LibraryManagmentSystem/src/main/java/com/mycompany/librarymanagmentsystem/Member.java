package com.mycompany.librarymanagmentsystem;
public class Member extends Account {

    public Member() {
    }

    public Member(String Username, String Password, String Name, String PhoneNumber, String Address) {
        super(Username, Password, Name, PhoneNumber, Address);
        setCanAccessAdminstration(false);
    }
    
    public Member(String Username, String Password, String Name, String PhoneNumber, String Address , int ID) {
        super(Username, Password, Name, PhoneNumber, Address ,ID);
        setCanAccessAdminstration(false);
    }
    
}
