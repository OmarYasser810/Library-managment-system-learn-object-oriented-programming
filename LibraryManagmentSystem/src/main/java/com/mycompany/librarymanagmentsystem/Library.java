package com.mycompany.librarymanagmentsystem;
import java.util.ArrayList;

public class Library extends Book{

    static long getPerDayFine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int book_return_deadline;                   //return deadline after which fine will be generated each day
    public double per_day_fine;

    public double getPer_day_fine() {
        return per_day_fine;
    }



    public void setReturnDeadline(int deadline)
    {
        book_return_deadline = deadline;
    }

    public void setFine(double perDayFine)
    {
        per_day_fine = perDayFine;
    }
    
    static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
//---------------------------------------Accounts------------------------------------------------------------------ 
    ArrayList <Account> accounts = new ArrayList();
    
    Librarian Admin = new Librarian("Admin" , "0000" , "Omar yasser" , "01554377220" , "El-Awqaf");
    Member Member1 = new Member("Member1" , "0001" , "Jack sparrow" , "01265789546" , "Oceans");
    
    //Test accounts
    public void TrialAccounts(){
        accounts.add(Admin);
        accounts.add(Member1);
    }
    
    //verify if correct or incorrect username and password
    public boolean Verify(String username , String password){
        boolean CanAccess = true;
        for (int i = 0 ; i < accounts.size() ; i++){
            if (username.equals(accounts.get(i).getUsername()) && password.equals(accounts.get(i).getPassword())){                
                CanAccess = true;
                break;
            }
            else{CanAccess = false;}
        }
        return CanAccess;
    }
    
    //Know the user is librarian or member
    public boolean LibrariaOrMember(String username , String password){
        boolean CanAccess = true;
        for (int i = 0 ; i < accounts.size() ; i++){
            if (username.equals(accounts.get(i).getUsername()) && password.equals(accounts.get(i).getPassword())){                
                CanAccess = accounts.get(i).getCanAccessAdminstration();
                break;
            }
        }
        return CanAccess;
    }
    
    //Add librarian account
    public void AddLibrarian(String username , String password , String name ,String phone ,String address){
        accounts.add(new Librarian(username , password , name , phone , address));
    }
    
    //Add member account
    public void AddMember(String username , String password , String name ,String phone ,String address){
        accounts.add(new Member(username , password , name , phone , address));
    }
    
    //Edit account informations
    public void UpdateAccount(int id , String username , String password , String name ,String phone ,String address){
        for (Account x : accounts){
            if (x.getID() == id){
            x.setUsername(username);
            x.setPassword(password);
            x.setPhoneNumber(phone);
            x.setName(name);
            x.setAddress(address);
            }
        }
    }
    
    //Delete or remove an account
    public String DeleteAccount(int ID){
        String Return = null;
        for (Account x : accounts){
            if (x.getID() == ID){
                if(x.getCanAccessAdminstration()){
                    Return = "You can not delete this account";
                }
                else{Return = "This account has been deleted";}
            }
        }
        return Return;
    }
    
    //Search for specfic accounts 
    public String SearchAccount(int ID){
        String Return = null;
        for (Account x : accounts){
            if (x.getID() == ID){
                if(x.getCanAccessAdminstration()){
                    Return = "You do not have access to see this account";
                }
                else{Return = x.toString();}
            }
        }   
        return Return;
    }
    
    //Show account or Accounts
    public void ShowAccount(int i){
        System.out.println(accounts.get(i).toString());
    }
    
    
    //-----------------------------------------------Books-------------------------------------------------------------
    
    ArrayList<Book> books = new ArrayList();
    
    Book book1 = new Book("Omniscient Reader Viewpoint" , "Ize Press" , "9798354150137" , "Fantasy" , "252");
    Book book2 = new Book("The Adventures of Sherlock Holmes" , "Arthur Conan Doyle" , "9780241347782" , "Crime" , "307");
    Book book3 = new Book("Harry Potter and the Order of the Phoenix" , "J.K. Rowling" , "9780439358064" , "Adventure" , "766");

    //Test Books
    public void TrialBooks(){
        books.add(book1);
        books.add(book2);
        books.add(book3);
    }
    
    //Add a book
    public void AddBook(String Title, String Auther, String ISPN, String genre, String BookPages){
        Boolean exist = false;
        for (Book x : books){
            if (x.getISPN().equals(ISPN)){
                x.AvailableBooks++;
                exist = true;
            }
            if (exist = false){
                books.add(new Book( Title , Auther , ISPN , genre , BookPages));
            }
        }
    }
    
    //Delete or remove a book
    public String DeleteBook(String ISPN){
        String Return = null;
        for (Book x : books){
            if (x.getISPN().equals(ISPN)){
                if (x.AvailableBooks > 1){
                    x.AvailableBooks--;
                    Return = "Book has been deleted";
                }
                else{
                    books.remove(x);
                    Return = "Book has been deleted";
                }
            }
        }
        if (Return.equals(null)){
            Return = "Book not found";
        }
        return Return;
    }
    
    //Edit book informations
    public String UpdateBook(String Title, String Auther, String ISPN, String genre, String BookPages , int AvailableBooks){
        String Return = null;
        for (Book x : books){
            if (x.getISPN().equals(ISPN)){
                if (Title != null){
                    x.setTitle(Title);
                }
                if (Auther != null){
                    x.setTitle(Auther);
                }
                if (genre != null){
                    x.setTitle(genre);
                }
                if (BookPages != null){
                    x.setTitle(BookPages);
                }
                if (AvailableBooks != 0){
                    x.setAvailableBooks(AvailableBooks);
                    Return = "Book have been edited";
                }
            }
        }
        if (Return.equals(null)){
            Return = "Book not found";
        }
        return Return;
    }
    
    //Show book text
    public void ShowBook(){
        
    }
    
    public void ShowBookInfo(){
        for (int i = 0 ; i < books.size() ; i++){
                System.out.println(books.get(i).toString());
        }
    }
    
    //Show book or books informations
    public String ShowBookInfo(String ISPN){
        String Return = null;
        for (int i = 0 ; i < books.size() ; i++){
            if (books.get(i).getISPN().equals(ISPN)){
                Return = books.get(i).toString();
            }
        }
        return Return;
    }
    
    //Search for a specfic book
    public void SearchBook(String search){
        for (int i = 0 ; i < books.size() ; i++){
            if (books.get(i).getTitle().equals(search) || books.get(i).getAuther().equals(search) || books.get(i).getISPN().equals(search) || books.get(i).getGenre().equals(search)){
                System.out.println(books.get(i).toString());
            }
        }
    }  
}