package com.mycompany.librarymanagmentsystem;

import java.util.Scanner;

public class LibraryManagmentSystem {

    public static void main(String[] args) {

        //new GUI();
        
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        library.TrialBooks();
        library.TrialAccounts();
        String choice = "";
        String operation = "";
        String bigChoices = "";

        System.out.println("Username: ");
        String Username = scanner.nextLine();
        System.out.println("password");
        String Password = scanner.nextLine();

        if (library.Verify(Username, Password)) {  //librarian and member
            choice = null;
            while (choice != "end") {
                System.out.println("If you want to search type \"Account\"");
                System.out.println("If you want to see books type \"Books\"");
                System.out.println("If you want to see the loans type \"Loans\"");
                System.out.println("if you want to close the program type \"End\"");
                System.out.print("Enter your choice: ");
                bigChoices = scanner.nextLine();
                if (library.Verify(Username, Password)) {
                    if (bigChoices.equalsIgnoreCase("Account")) {
                        System.out.println("If you want to add member type \"Amember\"");
                        System.out.println("If you want to add librarian type \"Alibrarian\"");
                        System.out.println("If you want to delete member type \"Dmember\"");
                        System.out.println("If you want to show the acconts\"show\"");
                        System.out.println("if you want to update member infos type \"Uinfo\"");
                        System.out.print("Enter your choice: ");
                        bigChoices = scanner.nextLine();
                        if (operation.equalsIgnoreCase("Amember")) {
                            System.out.println("Enter username: ");
                            String username = scanner.nextLine();
                            System.out.println("Enter password: ");
                            String password = scanner.nextLine();
                            System.out.println("Enter name");
                            String name = scanner.nextLine();
                            System.out.println("Enter phone number: ");
                            String phone = scanner.nextLine();
                            System.out.println("Enter the address: ");
                            String address = scanner.nextLine();
                            library.AddMember(username, password, name, phone, address);
                        } else if (operation.equalsIgnoreCase("ALibrarian")) {
                            System.out.println("Enter username: ");
                            String username = scanner.nextLine();
                            System.out.println("Enter password: ");
                            String password = scanner.nextLine();
                            System.out.println("Enter name");
                            String name = scanner.nextLine();
                            System.out.println("Enter phone number: ");
                            String phone = scanner.nextLine();
                            System.out.println("Enter the address: ");
                            String address = scanner.nextLine();
                            library.AddLibrarian(username, password, name, phone, address);
                        } else if (operation.equalsIgnoreCase("show")) {
                            for (int i = 0; i < library.accounts.size(); i++) {
                                library.ShowAccount(i);
                            }
                        } else if (operation.equalsIgnoreCase("Dmember")) {
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            library.DeleteAccount(id);
                        } else if (operation.equalsIgnoreCase("Uinfo")) {
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter username: ");
                            String username = scanner.nextLine();
                            System.out.println("Enter password: ");
                            String password = scanner.nextLine();
                            System.out.println("Enter name");
                            String name = scanner.nextLine();
                            System.out.println("Enter phone number: ");
                            String phone = scanner.nextLine();
                            System.out.println("Enter the address: ");
                            String address = scanner.nextLine();
                            library.UpdateAccount(id, Username, Password, Username, choice, Password);
                        } else if (operation.equalsIgnoreCase("search")) {
                            int i = scanner.nextInt();
                            library.SearchAccount(i);
                        }
                    } else if (bigChoices.equalsIgnoreCase("Books")) {
                        System.out.println("If you want to search type \"search\"");
                        System.out.println("If you want to see books type \"show\"");
                        System.out.println("If you want to edit book type \"edit\"");
                        System.out.println("if you want to delete book type \"delete\"");
                        System.out.println("if you want to add book type \"add\"");
                        System.out.print("Enter your choice: ");
                        bigChoices = scanner.nextLine();
                        if (operation.equalsIgnoreCase("add")) {
                            System.out.println("Enter book name: ");
                            String title = scanner.nextLine();
                            System.out.println("Enter book author: ");
                            String author = scanner.nextLine();
                            System.out.println("Enter book ISPN: ");
                            String ISPN = scanner.nextLine();
                            System.out.println("Enter book genre: ");
                            String genre = scanner.nextLine();
                            System.out.println("Enter book book pages: ");
                            String bookpages = scanner.nextLine();
                            library.AddBook(title, author, ISPN, genre, bookpages);
                        } else if (operation.equalsIgnoreCase("edit")) {
                            System.out.println("Enter book name: ");
                            String title = scanner.nextLine();
                            System.out.println("Enter book author: ");
                            String author = scanner.nextLine();
                            System.out.println("Enter book ISPN: ");
                            String ISPN = scanner.nextLine();
                            System.out.println("Enter book genre: ");
                            String genre = scanner.nextLine();
                            System.out.println("Enter book book pages: ");
                            String bookpages = scanner.nextLine();
                            library.UpdateBook(title, author, ISPN, genre, bookpages, 2);
                        } else if (operation.equalsIgnoreCase("delete")) {
                            String ISPN = scanner.nextLine();
                            library.DeleteBook(ISPN);
                        } else if (operation.equalsIgnoreCase("search")) {
                            String ISPN = scanner.nextLine();
                            library.SearchBook(ISPN);
                        }
                    } else if (bigChoices.equalsIgnoreCase("Loans")) {

                        /*
                        //Compute Fine of a Borrower
        else if (choice == 4)
        {
            if("Clerk".equals(person.getClass().getSimpleName()) || "Librarian".equals(person.getClass().getSimpleName()))
            {
                Borrower bor = lib.findBorrower();
                
                if(bor!=null)
                {
                    double totalFine = lib.computeFine2(bor);
                    System.out.println("\nYour Total Fine is : Rs " + totalFine );                     
                }
            }
            else
            {
                double totalFine = lib.computeFine2((Borrower)person);
                System.out.println("\nYour Total Fine is : Rs " + totalFine );                 
            }
        }
        
        //Check hold request queue of a book
        else if (choice == 5)
        {
            ArrayList<Book> books = lib.searchForBooks();
            
            if (books != null)
            {
                input = takeInput(-1,books.size());
                books.get(input).printHoldRequests();
            }
        }
                       
        //Issue a Book
        else if (choice == 6)
        {
            ArrayList<Book> books = lib.searchForBooks();

            if (books != null)
            {
                input = takeInput(-1,books.size());
                Book b = books.get(input);
                
                Borrower bor = lib.findBorrower();

                if(bor!=null)
                {
                    b.issueBook(bor, (Staff)person);            
                }
            }
        }        

        //Return a Book
        else if (choice == 7)
        {
            Borrower bor = lib.findBorrower();

            if(bor!=null)
            {
                bor.printBorrowedBooks();
                ArrayList<Loan> loans = bor.getBorrowedBooks();
                
                if (!loans.isEmpty())
                {
                    input = takeInput(-1,loans.size());
                    Loan l = loans.get(input);
                    
                    l.getBook().returnBook(bor, l, (Staff)person);            
                }
                else
                    System.out.println("\nThis borrower " + bor.getName() + " has no book to return.");
            }
        }
                        
                    } else if (bigChoices.equalsIgnoreCase("end")) {
                        choice = "end";
                    }
                } else if (library.Verify(Username, Password) == false) {
                    System.out.println("If you want to see account info type \"Account\"");
                    System.out.println("If you want to see books type \"Books\"");
                    System.out.println("if you want to close the program type \"End\"");
                    System.out.print("Enter your choice: ");
                }*/
                    }
                } else {                                       //guest
                    choice = null;
                    System.out.println("If you want to search type \"Search\"");
                    System.out.println("If you want to see books type \"Show\"");
                    System.out.println("If you want to close the program type \"End\"");
                    System.out.print("Enter your choice: ");
                    operation = scanner.nextLine();

                    if (operation.equalsIgnoreCase("show")) {
                        library.ShowBookInfo();
                    } else if (operation.equalsIgnoreCase("search")) {
                        System.out.println("search: ");
                        String search = scanner.nextLine();
                        System.out.println("com.mycompany.test.Test.main()");
                        library.SearchBook(search);
                        System.out.println("If you want to search type \"Search\"");
                        System.out.println("If you want to see books type \"Show\"");
                        System.out.println("If you want to close the program type \"End\"");
                        System.out.print("Enter your choice: ");
                        operation = scanner.nextLine();
                    } else if (operation.equalsIgnoreCase("end")) {
                        choice = "end";
                    }
                }
            }
        }
    }
}
