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

public class National extends JFrame{
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JLabel national;
    private JPanel NATIONAL;
    private JButton newLoginButton;
    private JButton loginButton;
    private JButton backButton;
    private JLabel additional;

    public National(){
        setContentPane(NATIONAL);
        setTitle("National");
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
                    if (data.equals("National")) {
                        data = myReader.nextLine();
                        if(data.equals(textArea2.getText())){
                            dispose();
                            Account cool = new Account(textArea1.getText());
                        }

                    }
                    additional.setText("Information wrong");

                    textArea2.setText("");
                    textArea1.setText("");

                }catch(Exception exception){
                    additional.setText("Does not exist");

                    textArea2.setText("");
                    textArea1.setText("");

                }
            }
        });
        newLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(textArea1.getText().equals("")|| textArea2.getText().equals("")){
                        int num = 3/0;
                    }
                    File myObj = new File(textArea1.getText()+".txt");

                    if(!myObj.createNewFile()){
                        int num = 3/0;
                    }
                    FileWriter myWriter = new FileWriter(myObj);
                    myWriter.write("National\n");
                    String line = textArea2.getText();
                    myWriter.write(line+"\n");
                    myWriter.write("0\n");
                    myWriter.write("0\n");
                    myWriter.write("0");
                    myWriter.close();
                    dispose();
                    Account cool = new Account(textArea1.getText());
                } catch (IOException ex) {
                    additional.setText("Can't do that");
                }catch (ArithmeticException ex){
                    additional.setText("Can't do that");

                }
            }
        });
    }

    private void createUIComponents() throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("download (4).png"));

        Image image = bufferedImage.getScaledInstance(180, 90, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        national = new JLabel(newIcon);
    }
}
