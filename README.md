# Library-managment-system-learn-object-oriented-programming
Project Title: Library Management System
Project Overview:
The Library Management System is a software application designed to manage the operations of a library efficiently. It allows librarians to perform tasks such as adding new books, managing book loans, tracking overdue books, and generating reports. The project will demonstrate core OOP concepts including inheritance, abstraction, polymorphism, encapsulation, access modifiers, class vs instance variables, and method overloading/overriding.
Key Features:
User Authentication: Implement a user authentication system to differentiate between librarians and library members. Use encapsulation to hide sensitive user information.
Book Management:
Create a Book class:
Define a Book class with private attributes such as title, author, ISBN, genre, etc. Encapsulate these attributes to protect the book data from direct manipulation.
Implement CRUD Operations:
Provide methods to add new books, update book information, and remove books from the library's collection. Ensure that these methods maintain data integrity and adhere to the principles of encapsulation.
Search Functionality:
Implement methods to find books by various criteria:
Find by Title: Create a method that accepts a title as input and returns a list of books matching the provided title.
Find by Author: Design a method that takes an author's name as input and returns a list of books written by the specified author.
Find by Genre: Implement a method to search for books belonging to a specific genre and return them as a list.
Find by ISBN: Provide a method to locate a book by its ISBN number and return the corresponding book object.
Demonstrate Abstraction:
Design interfaces for book-related operations, such as Addable, and Removable, to abstract the common behaviors shared by different types of objects in the library management system.
Member Management:
Create a Member class to store member information such as name, ID, contact details, etc. Apply encapsulation to ensure data integrity.
Implement methods to add new members, update member information, and remove members.
Loan Management:
Design a Loan class to represent book loans, including attributes like loan ID, due date, return status, etc. Encapsulate the loan data to prevent unauthorized access.
Implement methods for loaning books to members, returning books, and checking overdue books.
Fine Calculation: Calculate fines for overdue books based on a predefined fine rate per second.
Access Modifiers:
Utilize different access modifiers (public, private, protected, default) appropriately throughout the project to control access to class members as you see fit.
Class vs Instance Variables:
Clarify the difference between class variables (static) and instance variables by using them in appropriate scenarios. For example, a class variable could be used to keep track of the total number of books in the library, while instance variables store book-specific information.
Polymorphism:
Demonstrate polymorphism by creating methods that accept parameters of different types (e.g., Book, Member) and perform operations based on the actual type of the parameter.
Method Overloading and Overriding:
Implement method overloading to create multiple versions of methods with different parameter lists but the same name (e.g., addBook() with different parameters).
Utilize method overriding to allow subclasses to provide their own implementation of inherited methods (e.g., toString() method for customized book printing).
