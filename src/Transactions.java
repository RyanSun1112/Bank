import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Transactions extends JFrame{
    private JLabel Transactions;
    private JPanel transactions;
    private JTextArea textArea1;
    private JButton backButton;
    private JButton menuButton;
    private JButton accountButton;
    private JButton billsButton;
    private JButton statisticsButton;
    private JButton ETransferButton;
    private JButton accountInformationButton;

    public Transactions(String cool2){
        int counter = 0;
        setContentPane(transactions);
        setTitle("Transactions");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try{
            Scanner myReader = new Scanner(new File(cool2 + ".txt"));
            String trans = "";
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                counter++;
                if(counter >= 6){
                    trans += data+"\n";
                }
            }
            if(trans.equals("")){
                textArea1.setText("No transactions");

            }else{
                textArea1.setText(trans);
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
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Account cool = new Account(cool2);

            }
        });
        accountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Accounts cool = new Accounts(cool2);
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
        ETransferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                eTransfer cool = new eTransfer(cool2);
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
}
