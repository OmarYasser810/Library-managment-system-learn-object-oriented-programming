package com.mycompany.librarymanagmentsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUI extends javax.swing.JFrame implements ActionListener {

    Scanner scanner = new Scanner(System.in);
    String choice;
    String operation;
    String bigChoices;
    public int ID;
    public boolean access = false;
    JFrame frame;
    JButton okLogin, guestButton;
    public JTextField username;
    public JPasswordField password;
    JLabel libraryName, Verification, front, login, UN, pass ;
    Library library = new Library();
    
    public GUI() {
        initComponents();
        
        username = new JTextField();
        username.setBounds(245, 325, 170, 25);
  
        password = new JPasswordField();
        password.setBounds(245, 358, 170, 25);
        
        okLogin = new JButton();
        okLogin.setBounds(354, 430, 60, 25);
        okLogin.setText("Ok");
        okLogin.setFocusable(false);
        okLogin.setFont(new Font("Comic Sans", Font.BOLD, 15));
        okLogin.setForeground(Color.red);
        okLogin.addActionListener(this);

        guestButton = new JButton();
        guestButton.setBounds(158, 430, 150, 25);
        guestButton.setText("Login as guest");
        guestButton.setForeground(Color.red);
        guestButton.setFocusable(false);
        guestButton.setFont(new Font("Comic Sans", Font.BOLD, 15));
        guestButton.setForeground(Color.red);
        //guestButton.setBackground(new Color(238,238,238,255));
        guestButton.addActionListener(this);

        ImageIcon outLogo = new ImageIcon("C:\\Users\\DELL\\Downloads\\Logo.png");
        ImageIcon inLogo = new ImageIcon("C:\\Users\\DELL\\Downloads\\LibraryLogo.png");
        Image LibraryLogo = inLogo.getImage();
        LibraryLogo = LibraryLogo.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        inLogo = new ImageIcon(LibraryLogo);

        libraryName = new JLabel();
        libraryName.setText("Team 4 library");
        libraryName.setBounds(14, 15, 175, 25);
        libraryName.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        libraryName.setVisible(false);

        front = new JLabel();
        front.setText("Welcome to team 4 library");
        front.setFont(new Font("Arial Black", Font.PLAIN, 22));
        front.setHorizontalTextPosition(JLabel.CENTER);
        front.setVerticalTextPosition(JLabel.BOTTOM);
        front.setIconTextGap(25);
        front.setIcon(inLogo);
        front.setHorizontalAlignment(JLabel.CENTER);
        front.setVerticalAlignment(JLabel.TOP);
        front.setBounds(110, 85, 350, 160);
        
        login = new JLabel();
        login.setText("Login page");
        login.setBounds(220, 267, 125, 30);
        login.setFont(new Font("Antique Olive", Font.PLAIN, 25));
        login.setForeground(Color.red);
        
        UN = new JLabel();
        UN.setText("Username: ");
        UN.setBounds(160, 322, 80, 25);
        UN.setFont(new Font("Antique Olive", Font.BOLD, 15));
        
        pass = new JLabel();
        pass.setText("Password: ");
        pass.setBounds(160, 358, 77, 25);
        pass.setFont(new Font("Antique Olive", Font.BOLD, 15));
        
        Verification = new JLabel();
        Verification.setText("Incorrect username or password");
        Verification.setBounds(180, 390, 215, 25);
        Verification.setFont(new Font("Antique Olive", Font.PLAIN, 15));
        Verification.setForeground(Color.red);
        
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setTitle("Team 4 library");
        frame.setIconImage(outLogo.getImage());
        frame.setLayout(null);
        //frame.getContentPane().setBackground(Color.white);
        frame.add(libraryName);
        frame.add(front);
        frame.add(login);
        frame.add(UN);
        frame.add(pass);
        frame.add(Verification);
        Verification.setVisible(false);
        frame.add(okLogin);
        frame.add(guestButton);
        frame.add(username);
        frame.add(password);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        library.TrialAccounts();
        library.TrialBooks();
        
        String inUsername = null;
        String inPassword = null;
        if (e.getSource() == okLogin) {
            inUsername = username.getText();
            inPassword = password.getText();
            if (library.Verify(inUsername, inPassword)){
                choice = null;
            while (choice != "end") {
                System.out.println("If you want to search type \"Account\"");
                System.out.println("If you want to see books type \"Books\"");
                System.out.println("If you want to close the program type \"Loans\"");
                System.out.println("if you want to cose the program type \"End\"");
                System.out.print("Enter your choice: ");
                bigChoices = scanner.nextLine();
                if (bigChoices.equalsIgnoreCase("Accounts")) {
                    if (choice.equalsIgnoreCase(operation)) {
                        if (operation.equalsIgnoreCase("add member")) {
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
                        } else if (operation.equalsIgnoreCase("add Librarian")) {
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
                        }
                    }
                } else if (bigChoices.equalsIgnoreCase("Books")) {
                    if (operation.equalsIgnoreCase("add book")) {
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
                    }
                } else if (bigChoices.equalsIgnoreCase("Loans")) {

                }
            }
            }
            else{
                Verification.setText("Password or username incorrect");
                Verification.setVisible(true);
            }
        }
        else if (e.getSource() == guestButton) {
            access = false;
            System.exit(0);
            choice = null;
            while (choice != "End") {
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
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
