import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Accounts extends JFrame {
    private JPanel Accounts1;
    private JButton backButton;
    private JButton accountInformationButton;
    private JButton withdrawButton;
    private JButton depositButton;
    private JButton withdrawButton1;
    private JButton depositButton1;
    private JButton withdrawButton2;
    private JButton depositButton2;
    private JButton menuButton;
    private JButton transactionsButton;
    private JButton statisticsButton;
    private JButton billsButton;
    private JLabel balance1;
    private JLabel balance2;
    private JLabel balance3;

    public Accounts(String cool2){
        setContentPane(Accounts1);
        setTitle("Menu");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int counter = 0;
        try{
            Scanner myReader = new Scanner(new File(cool2 + ".txt"));
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                counter++;
                if(counter == 3){
                    balance1.setText("Balance: "+ data);
                }
                if(counter == 4){
                    balance2.setText("Balance: "+ data);
                }
                if(counter == 5){
                    balance3.setText("Balance: "+ data);
                    break;
                }
            }

        }catch(FileNotFoundException ex){

        }

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Account cool = new Account(cool2);
            }
        });
        accountInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                information cool = new information();
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Account cool = new Account(cool2);
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
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Withdraw cool = new Withdraw(cool2);
            }
        });
        withdrawButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Withdraw cool = new Withdraw(cool2);
            }
        });
        withdrawButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Withdraw cool = new Withdraw(cool2);
            }
        });
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Deposit cool = new Deposit(cool2);
            }
        });
        depositButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Deposit cool = new Deposit(cool2);
            }
        });
        depositButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Deposit cool = new Deposit(cool2);
            }
        });
    }
}
