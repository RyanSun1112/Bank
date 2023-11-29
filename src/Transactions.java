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

    public Transactions(String cool2){
        int counter = 0;
        setContentPane(transactions);
        setTitle("Menu");
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
    }
}
