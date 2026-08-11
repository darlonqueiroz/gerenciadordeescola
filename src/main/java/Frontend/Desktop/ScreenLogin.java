package Frontend.Desktop;

import javax.swing.*;
import java.awt.*;

public class ScreenLogin extends JFrame {

    JPanel panel = new JPanel();
    JLabel nameLabel = new JLabel("Name");
    JTextField nameText = new JTextField(20);
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField passwordText = new JPasswordField(20);
    JButton loginButton = new JButton("Login");
    JButton registerButton = new JButton("Register");
    JButton resetButton = new JButton("Reset");

    public ScreenLogin(){

    // Setting the title of the JFrame
    this.setTitle("Gerencia de Escola");
    this.setSize(700,850);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

        // Setting the layout of the panel to null
    panel.setLayout(null);

    // Setting the size of the panel
    panel.setSize(300,400);

    // Setting the background color of the panel
    panel.setBackground(new java.awt.Color(200,200,200));

    // Setting the bounds of the panel
    panel.setBounds(150,200,500,400);

    // Setting the layout of the JFrame to null
    this.setLayout(null);

    // Setting the background color of the JFrame
    this.getContentPane().setBackground(new java.awt.Color(100,100,100));



    // Setting the bounds of the nameLabel
    nameLabel.setBounds(10,20,80,25);

    // Setting the bounds of the nameText
    nameText.setBounds(100,20,185,25);
    nameText.setAlignmentX(Component.CENTER_ALIGNMENT);
    // Setting the bounds of the passwordLabel
    passwordLabel.setBounds(10,50,80,25);

    // Setting the bounds of the passwordText
    passwordText.setBounds(100,50,185,25);
    passwordText.setAlignmentX(Component.CENTER_ALIGNMENT);
    // Setting the bounds of the loginButton
    loginButton.setBounds(10, 80, 80, 25);

    // Setting the bounds of the registerButton
    registerButton.setBounds(180, 80, 90, 25);

    // Setting the bounds of the resetButton
    resetButton.setBounds(100, 80, 80, 25);



        // Adding the panel to the JFrame
        this.add(panel);
        // Adding the nameText to the panel
        panel.add(nameText);
        // Adding the nameLabel to the panel
        panel.add(nameLabel);
        // Adding the passwordLabel to the panel
        panel.add(passwordLabel);
        // Adding the passwordText to the panel
        panel.add(passwordText);
        // Adding the loginButton to the panel
        panel.add(loginButton);
        // Adding the resetButton to the panel
        panel.add(resetButton);
        // Adding the registerButton to the panel
        panel.add(registerButton);

       // panel.add(Box.createVerticalGlue()); // Empurra o conteúdo para o centro vertical do painel
      //  panel.add(nameLabel);
      //  panel.add(Box.createVerticalStrut(5)); // Pequeno espaço de 5 pixels
       // panel.add(nameText);
       // panel.add(Box.createVerticalStrut(15)); // Espaço entre blocos
       // panel.add(passwordLabel);
      //  panel.add(Box.createVerticalStrut(5));
       // panel.add(passwordText);
      //  panel.add(Box.createVerticalStrut(20));
       // panel.add(loginButton);
       // panel.add(Box.createVerticalGlue()); // Empurra de baixo para cima


    }
}
