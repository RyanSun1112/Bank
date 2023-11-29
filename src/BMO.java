import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BMO extends JFrame{
    private JPanel BMO;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JLabel bmo;
    private JButton newLoginButton;
    private JButton loginButton;
    private JButton backButton;

    public BMO(){
        setContentPane(BMO);
        setTitle("Menu");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Choose_bank cool = new Choose_bank();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Scanner myReader = new Scanner(new File(textArea1.getText() + ".txt"));
                    String data = myReader.nextLine();
                    if (data.equals("BMO")) {
                        data = myReader.nextLine();
                        if(data.equals(textArea2.getText())){
                            dispose();
                            Account cool = new Account(textArea1.getText());
                        }

                    }
                    textArea2.setText("");
                    textArea1.setText("");

                }catch(Exception exception){
                    textArea2.setText("");
                    textArea1.setText("");

                }
            }
        });
        newLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File myObj = new File(textArea1.getText()+".txt");
                    if(!myObj.createNewFile()){
                        int num = 3/0;
                    }
                    FileWriter myWriter = new FileWriter(myObj);
                    myWriter.write("BMO\n");
                    String line = textArea2.getText();
                    myWriter.write(line+"\n");
                    myWriter.write("0\n");
                    myWriter.write("0\n");
                    myWriter.write("0");
                    myWriter.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                dispose();
                Account cool = new Account(textArea1.getText());
            }
        });
    }

    private void createUIComponents() throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("download.jpg"));

        Image image = bufferedImage.getScaledInstance(140, 90, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        bmo = new JLabel(newIcon);    }
}
