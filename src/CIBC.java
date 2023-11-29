import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CIBC extends JFrame{
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel CIBC;
    private JLabel cibc;
    private JButton newLoginButton;
    private JButton LoginButton1;
    private JButton backButton;

    public CIBC(){
        textArea2.setText("");
        textArea1.setText("");
        setContentPane(CIBC);
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
        LoginButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Scanner myReader = new Scanner(new File(textArea1.getText() + ".txt"));
                    String data = myReader.nextLine();
                    if (data.equals("CIBC")) {
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
                    myWriter.write("CIBC\n");
                    String line = textArea2.getText();
                    myWriter.write(line+"\n");
                    myWriter.write("0\n");
                    myWriter.write("0\n");
                    myWriter.write("0");
                    myWriter.close();
                    dispose();
                    Account cool = new Account(textArea1.getText());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (ArithmeticException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }

    private void createUIComponents() throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("download (1).png"));

        Image image = bufferedImage.getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        cibc = new JLabel(newIcon);
        // TODO: place custom component creation code here
    }
}
