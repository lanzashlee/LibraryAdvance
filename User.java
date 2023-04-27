import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class User {

        public static void Adminlogin() {
            
            JFrame adminLoginFrame = new JFrame("Admin Login");
            JPanel adminFramePanel = new JPanel();
            JLabel adminText = new JLabel("Welcome to Admin Login");
            JLabel adminUsername = new JLabel("Username:");
            JLabel adminPassword = new JLabel("Password:");
            JTextField adminUserInput = new JTextField();
            JPasswordField adminPassInput = new JPasswordField();
            JButton loginButton = new JButton("Login");
            
            adminText.setBounds(150, 30, 200, 40);
            adminText.setFont(new Font("Times New Roman",Font.BOLD, 14));
            adminUsername.setBounds(50, 95, 80, 25);
            adminPassword.setBounds(50, 140, 80, 25);
            adminUserInput.setLayout(null);
            adminUserInput.setBounds(120, 95, 200, 25);
            adminPassInput.setLayout(null);
            adminPassInput.setBounds(120, 140, 200, 25);            
            loginButton.setLayout(null);
            loginButton.setBounds(165, 190, 115, 40);

            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String username = adminUserInput.getText();
                    String password = adminPassInput.getText();
                    
                    if ((username.equals("Admin_01") && password.equals("AdminOne")) || (username.equals("Admin_02") && password.equals("AdminTwo")) || (username.equals("Admin_03") && password.equals("AdminThree"))) {
                        JOptionPane.showMessageDialog(adminLoginFrame, "SUCCESFULLY LOGIN");
                        adminLoginFrame.dispose();
                        adminpage();
    
                    } else if ((!username.equals("Admin_01") && password.equals("AdminOne")) || (!username.equals("Admin_02") && password.equals("AdminTwo")) || (!username.equals("Admin_03") && password.equals("AdminThree"))) {
                        JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME.");
                        
                    } else if ((username.equals("Admin_01") && !password.equals("AdminOne")) || (username.equals("Admin_02") && !password.equals("AdminTwo")) || (username.equals("Admin_03") && !password.equals("AdminThree"))) {
                        JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT PASSWORD.");
                        
                    } else if ((!username.equals("Admin_01") && !password.equals("AdminOne")) || (!username.equals("Admin_02") && !password.equals("AdminTwo")) || (!username.equals("Admin_03") && !password.equals("AdminThree"))) {
                        JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME and PASSWORD.");
                        
                    } 
                }
            });
            
    
            adminFramePanel.setLayout(null);
            adminFramePanel.add(adminText);
            adminFramePanel.add(adminUsername);
            adminFramePanel.add(adminPassword);
            adminFramePanel.add(adminUserInput);
            adminFramePanel.add(adminPassInput);
            adminFramePanel.add(loginButton);
            
            adminLoginFrame.setLocation(400, 100);
            adminLoginFrame.setSize(400, 300);
            adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            adminLoginFrame.setLayout(null);
            adminLoginFrame.setVisible(true);
    
            adminLoginFrame.add(adminFramePanel);
            adminLoginFrame.add(adminText);
            adminLoginFrame.add(adminUsername);
            adminLoginFrame.add(adminPassword);
            adminLoginFrame.add(adminUserInput);
            adminLoginFrame.add(adminPassInput);
            adminLoginFrame.add(loginButton);
            
        }
        public static void adminpage() {
            
            JFrame adminpageFrame = new JFrame("Admin Page");
            JPanel adminpagePanel = new JPanel();
            JLabel adminpageText = new JLabel("Welcome to NU Library System!");
            
            
            adminpagePanel.setLayout(null);
            adminpagePanel.add(adminpageText);
            
            adminpageText.setBounds(90, 100, 300, 40);
            adminpageText.setLayout(null);
            adminpageText.setFont(new Font("Times New Roman", Font.BOLD, 12));
            
            adminpageFrame.setLocation(400, 100);
            adminpageFrame.setSize(400, 300);
            adminpageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            adminpageFrame.setLayout(null);
            adminpageFrame.setVisible(true);
            adminpageFrame.add(adminpagePanel);
            adminpageFrame.add(adminpageText);
        }
    
        public static void librarianLogin() {
            
            JFrame librarianLoginFrame = new JFrame("Login as Librarian");
            JPanel librarianFramePanel = new JPanel();
            JLabel librarianText = new JLabel("Hello!");
            JLabel librarianUsername = new JLabel("Username:");
            JLabel librarianPassword = new JLabel("Password:");
            JTextField librarianUserInput = new JTextField();
            JPasswordField librarianPassInput = new JPasswordField();
            JButton loginButton = new JButton("Login");
        
            librarianText.setBounds(140, 30, 200, 40);
            librarianText.setFont(new Font("Times New Roman",Font.BOLD, 12));
            librarianUsername.setBounds(50, 95, 80, 25);
            librarianPassword.setBounds(50, 140, 80, 25);
            
            librarianUserInput.setLayout(null);
            librarianUserInput.setBounds(120, 95, 200, 25);
            librarianPassInput.setLayout(null);
            librarianPassInput.setBounds(120, 140, 200, 25);
            
            loginButton.setLayout(null);
            loginButton.setBounds(165, 190, 115, 40);
            loginButton.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
                    String username = librarianUserInput.getText();
                    String password = librarianPassInput.getText();
                    
                    if ((username.equals("Librarian_01") && password.equals("LibOne")) || (username.equals("Librarian_02") && password.equals("LibTwo")) || (username.equals("Librarian_03") && password.equals("LibThree"))) {
                        JOptionPane.showMessageDialog(librarianLoginFrame, "SUCCESFULLY LOGIN");
                        librarianLoginFrame.dispose();
                        librarianpage();
                
                    } else if ((!username.equals("Librarian_01") && password.equals("LibOne")) || (!username.equals("Librarian_02") && password.equals("LibTwo")) || (!username.equals("Librarian_03") && password.equals("LibThree"))) {
                        JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME.");
                        
                    } else if ((username.equals("Librarian_01") && !password.equals("LibOne")) || (username.equals("Librarian_02") && !password.equals("LibTwo")) || (username.equals("Librarian_03") && !password.equals("LibThree"))) {
                        JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT PASSWORD.");
                        
                    } else if ((!username.equals("Librarian_01") && !password.equals("LibOne")) || (!username.equals("Librarian_02") && !password.equals("LibTwo")) || (!username.equals("Librarian_03") && !password.equals("LibThree"))) {
                        JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME and PASSWORD.");
                        
                    } 
                }
            });
            
            
            librarianFramePanel.setLayout(null);
            librarianFramePanel.add(librarianText);
            librarianFramePanel.add(librarianUsername);
            librarianFramePanel.add(librarianPassword);
            librarianFramePanel.add(librarianUserInput);
            librarianFramePanel.add(librarianPassInput);
            librarianFramePanel.add(loginButton);
            
            librarianLoginFrame.setLocation(400, 100);
            librarianLoginFrame.setSize(400, 300);
            librarianLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            librarianLoginFrame.setLayout(null);
            librarianLoginFrame.setVisible(true);
            librarianLoginFrame.add(librarianFramePanel);
            librarianLoginFrame.add(librarianText);
            librarianLoginFrame.add(librarianUsername);
            librarianLoginFrame.add(librarianPassword);
            librarianLoginFrame.add(librarianUserInput);
            librarianLoginFrame.add(librarianPassInput);
            librarianLoginFrame.add(loginButton);
            
          }
        public static void librarianpage() {
                
            JFrame libModuleFrame = new JFrame("Librarian Page");
            JPanel libModulePanel = new JPanel();
            JLabel libModuleText = new JLabel("Book Rental System");
            JLabel libBookList = new JLabel("List of Books");
            JFrame showpasswordsPanel = new JFrame();
            
            
            libModuleText.setBounds(180, 20, 300, 40);
            libModuleText.setLayout(null);
            libModuleText.setFont(new Font("Times New Roman", Font.BOLD, 12));
                    
            libBookList.setBounds(200, 50, 200, 40);
            libBookList.setLayout(null);
            libBookList.setFont(new Font("Times New Roman", Font.BOLD, 12));
          
           
            // index of the bookin the list
            JLabel bookIndex1 = new JLabel("1.");
            JLabel bookIndex2 = new JLabel("2.");
            JLabel bookIndex3 = new JLabel("3.");
            //title of the book in the list
            JLabel bookTitle1 = new JLabel("Don Quixote");
            JLabel bookTitle2 = new JLabel("Lord of the Rings");
            JLabel bookTitle3 = new JLabel("And Then There Were None");
            //author of the book
            JLabel bookAuthor1 = new JLabel("Miguel de Cervantes");
            JLabel bookAuthor2 = new JLabel("J.R.R. Tolkien");
            JLabel bookAuthor3 = new JLabel("Agatha Christie");
            //available copy of the book
            JLabel bookCopy1 = new JLabel("5 Copies");
            JLabel bookCopy2 = new JLabel("7 Copies");
            JLabel bookCopy3 = new JLabel("12 Copies");

            bookIndex1.setBounds(50, 100, 80, 25);
            bookIndex2.setBounds(50, 130, 80, 25);
            bookIndex3.setBounds(50, 160, 80, 25);
            libModulePanel.add(bookIndex1);
            libModulePanel.add(bookIndex2);
            libModulePanel.add(bookIndex3);

            bookTitle1.setBounds(70, 100, 150, 25);
            bookTitle2.setBounds(70, 130, 150, 25);
            bookTitle3.setBounds(70, 160, 150, 25);
            libModulePanel.add(bookTitle1);
            libModulePanel.add(bookTitle2);
            libModulePanel.add(bookTitle3);
            
            bookAuthor1.setBounds(230, 100, 150, 25);
            bookAuthor2.setBounds(230, 130, 150, 25);
            bookAuthor3.setBounds(230, 160, 150, 25);

            libModulePanel.add(bookAuthor1);
            libModulePanel.add(bookAuthor2);
            libModulePanel.add(bookAuthor3);

            
            bookCopy1.setBounds(360, 100, 150, 25);
            bookCopy2.setBounds(360, 130, 150, 25);
            bookCopy3.setBounds(360, 160, 150, 25);

            libModulePanel.add(bookCopy1);
            libModulePanel.add(bookCopy2);
            libModulePanel.add(bookCopy3);
                    
            libModulePanel.setLayout(null);
            libModulePanel.add(libModuleText);
            libModulePanel.add(libBookList);

            libModuleFrame.setLocation(400, 100);
            libModuleFrame.setSize(500, 265);
            libModuleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            libModuleFrame.setLayout(null);
            libModuleFrame.setVisible(true);
            libModuleFrame.add(libModulePanel);
            libModuleFrame.add(libModuleText);
            libModuleFrame.add(libBookList);
            libModuleFrame.add(bookIndex1);
            libModuleFrame.add(bookIndex2);
            libModuleFrame.add(bookIndex3);
            libModuleFrame.add(bookTitle1);
            libModuleFrame.add(bookTitle2);
            libModuleFrame.add(bookTitle3);
            libModuleFrame.add(bookAuthor1);
            libModuleFrame.add(bookAuthor2);
            libModuleFrame.add(bookAuthor3);
            libModuleFrame.add(bookCopy1);
            libModuleFrame.add(bookCopy2);
            libModuleFrame.add(bookCopy3);
           
            
          }
}
