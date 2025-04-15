package com.mycompany.librarymanagmentsystem;
public class Book implements CRUD{
    
    private String Title;
    private String Auther;
    private String ISPN;
    private String genre;
    private String BookPages;
    int AvailableBooks = 0;

    public Book() {
    }

    public Book(String Title, String Auther, String ISPN, String genre, String BookPages) {
        this.Title = Title;
        this.Auther = Auther;
        this.ISPN = ISPN;
        this.genre = genre;
        this.BookPages = BookPages;
        this.AvailableBooks++;
    }
    
    public Book(String Title, String Auther, String ISPN, String genre, String BookPages , int AvailableBooks) {
        this.Title = Title;
        this.Auther = Auther;
        this.ISPN = ISPN;
        this.genre = genre;
        this.BookPages = BookPages;
        this.AvailableBooks = AvailableBooks;
    }
    
    public String getTitle() {
        return Title;
    }

    public String getAuther() {
        return Auther;
    }

    public String getISPN() {
        return ISPN;
    }

    public String getGenre() {
        return genre;
    }

    public String getBookPages() {
        return BookPages;
    }

    public int getAvailableBooks() {
        return AvailableBooks;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuther(String Auther) {
        this.Auther = Auther;
    }

    public void setISPN(String ISPN) {
        this.ISPN = ISPN;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBookPages(String BookPages) {
        this.BookPages = BookPages;
    }

    public void setAvailableBooks(int AvailableBooks) {
        this.AvailableBooks = AvailableBooks;
    }

    @Override
    public String toString() {
        return "Title: " + Title + "\nAuther: " + Auther + "\nISPN: " + ISPN + "\ngenre: " + genre + "\nBookPages: " + BookPages + "\nAvailableBooks: " + AvailableBooks + "\n";
    }

    @Override
    public void AddBook(String Title, String Auther, String ISPN, String genre, String BookPages) {
        
    }

    @Override
    public String UpdateBook(String Title, String Auther, String ISPN, String genre, String BookPages , int AvailableBooks) {
        return null;
    }

    @Override
    public String DeleteBook(String ISBN) {
        return null;
    }

    @Override
    public String ShowBook(String ISPN) {
        return null;
    }
    
}