package com.mycompany.librarymanagmentsystem;
public class Account {
    private String Username;
    private String Password;
    private String Name;
    private String PhoneNumber;
    private String Address;
    private static int id = 0;
    private int ID;
    private boolean CanAccessAdminstration;
    
    public Account() {
    }

    public Account(String Username, String Password, String Name, String PhoneNumber, String Address) {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.id++;
        ID = id;
    }
    
    public Account(String Username, String Password, String Name, String PhoneNumber, String Address , int ID) {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public int getID() {
        return ID;
    }

    public boolean getCanAccessAdminstration() {
        return CanAccessAdminstration;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCanAccessAdminstration(boolean CanAccessAdminstration) {
        this.CanAccessAdminstration = CanAccessAdminstration;
    }

    @Override
    public String toString() {
        return "Username: " + Username + "\nPassword: " + Password + "\nName: " + Name + "\nPhoneNumber: " + PhoneNumber + "\nAddress: " + Address + "\nID: " + ID + "\n\n";
    }
    
}

