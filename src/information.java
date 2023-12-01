import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class information extends JFrame{
    private JPanel info;
    private JButton backButton;
    private JButton billsButton;
    private JButton statisticsButton;
    private JButton menuButton;
    private JButton accountsButton;
    private JLabel title1;
    private JLabel image1;
    private JLabel balance;
    private JLabel email;
    private JLabel pin;
    private JLabel accountnum;
    private JLabel creditcard;

    public information(String cool2){
        int counter = 0;
        setContentPane(info);
        setTitle("Information");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        title1.setText("Account: " + cool2);
        email.setText("Email: " + cool2);
        String temp1 = cool2;
        String temp2 = "";
        try{
            Scanner myReader = new Scanner(new File(cool2 + ".txt"));
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                counter++;
                if(counter == 2){
                    pin.setText("Pin: " + data);
                    temp2 = data;
                }
                if(counter == 3){
                    balance.setText("Balance (chequing): "+ data);
                }
            }
        }catch(FileNotFoundException ex){

        }

        char[] charArray = temp1.toCharArray();
        char[] charArray2 = temp2.toCharArray();
        String accNum = "";
        String credit = "";
        for(int i = 0; i <= 9;i++){
            try{
                if(i%2 == 0){
                    accNum += charArray[i];
                }else{
                    accNum += charArray2[i];
                }
            }catch(ArrayIndexOutOfBoundsException ex){
                accNum +="0";
            }
        }
        for(int i = 1; i <= 8;i++){
            try{
                if(i%2 == 0){
                    credit += charArray2[charArray2.length - i];
                }else{
                    credit += charArray[charArray.length - i];
                }
            }catch(ArrayIndexOutOfBoundsException ex){
                credit +="0";
            }
        }
        accountnum.setText("Account Number: " + accNum);
        creditcard.setText("Credit card number: " + credit);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Account cool = new Account(cool2);
            }
        });
        accountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Accounts cool = new Accounts(cool2);
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Transactions cool = new Transactions(cool2);
            }
        });
    }



    private void createUIComponents() throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("9131529.png"));

        Image image = bufferedImage.getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        image1 = new JLabel(newIcon);
    }
}
