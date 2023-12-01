import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Account extends JFrame{

    private JLabel image1;
    private JLabel title1;

    private JPanel account;
    private JLabel balance;
    private JButton backButton;
    private JButton statisticsButton;
    private JButton billsButton;
    private JButton transactionsButton;
    private JButton accountsButton;
    private JButton accountInformationButton;
    private JLabel trans1;
    private JLabel trans2;
    private JLabel trans3;
    private JLabel trans4;
    private JLabel trans5;
    private JLabel trans6;
    private JTextArea textArea1;

    public Account (String cool2)   {
        trans1.setVisible(true);

        trans2.setVisible(false);
        trans3.setVisible(false);
        trans4.setVisible(false);
        trans5.setVisible(false);
        trans6.setVisible(false);

        setContentPane(account);
        setTitle("Account");
        setSize(950,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int counter = 0;
        title1.setText("Account: " + cool2);
        try{
            Scanner myReader = new Scanner(new File(cool2 + ".txt"));
            ArrayList <String> trans = new ArrayList<String>();
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                counter++;
                if(counter == 3){
                    balance.setText("Balance (Chequing): "+ data);
                }
                if(counter == 6){
                    trans1.setText(data);
                    trans1.setVisible(true);
                }
                if(counter == 7){
                    trans2.setText(data);
                    trans2.setVisible(true);

                }
                if(counter == 8){
                    trans3.setText(data);
                    trans3.setVisible(true);

                }
                if(counter == 9){
                    trans4.setText(data);
                    trans4.setVisible(true);

                }
                if(counter == 10){
                    trans5.setText(data);
                    trans5.setVisible(true);

                }
                if(counter == 11){
                    trans6.setText(data);
                    trans6.setVisible(true);

                }


            }


        }catch(FileNotFoundException ex){

        }


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Choose_bank cool = new Choose_bank();
            }
        });
        accountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Accounts cool = new Accounts(cool2);
            }
        });
        transactionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Transactions cool = new Transactions(cool2);
            }
        });
        billsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Bills cool = new Bills();
            }
        });
        statisticsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Statistics cool = new Statistics();
            }
        });
        accountInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                information cool = new information(cool2);

            }
        });
    }

    private void createUIComponents() throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("9131529.png"));

        Image image = bufferedImage.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        image1 = new JLabel(newIcon);
    }
}
