import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class eTransfer extends JFrame{
    private JPanel transfer;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton submitButton;
    private JLabel complete;
    private JTextArea textArea3;
    private JButton backButton;

    public eTransfer(String cool2){
        setContentPane(transfer);
        setTitle("eTransfer");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        complete.setVisible(false);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int counter = 0;
                    Scanner myReader = new Scanner(new File(cool2 + ".txt"));
                    Scanner myReader2 = new Scanner(new File(textArea3.getText() + ".txt"));
                    while(myReader.hasNextLine()){
                        String data = myReader.nextLine();
                        counter++;
                        if(counter == 3 && textArea2.getText().equals("1")){
                            int number = Integer.parseInt(data);
                            if( number > Integer.parseInt(textArea1.getText())){
                                myReader = new Scanner(new File(cool2 + ".txt"));
                                ArrayList<String> temp = new ArrayList<String>(); // Create an ArrayList object
                                while(myReader.hasNextLine()){
                                    temp.add(myReader.nextLine());
                                }
                                File tempf = new File(cool2 + ".txt");
                                FileWriter fw = new FileWriter(tempf);
                                for(int i = 0; i < temp.size(); i++){
                                    if(i==2) {
                                        fw.write(String.valueOf(Integer.parseInt(temp.get(i)) - Integer.parseInt(textArea1.getText())) + "\n");
                                        continue;
                                    }
                                    fw.write(temp.get(i) + "\n");
                                }
                                LocalDateTime myDateObj = LocalDateTime.now();

                                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                                String formattedDate = myDateObj.format(myFormatObj);
                                fw.write("Account 3 Transaction eTransfer to "+textArea3.getText()+" of: " + textArea1.getText() + " dollars at " + formattedDate);
                                fw.close();
                                complete.setVisible(true);
                                complete.setText("Complete Transaction");



                            }else{
                                textArea1.setText("");
                                textArea2.setText("");
                                textArea3.setText("");
                                complete.setText("Can't do that");
                            }
                        }else if(counter == 4 && textArea2.getText().equals("2")){
                            int number = Integer.parseInt(data);
                            if( number > Integer.parseInt(textArea1.getText())){
                                myReader = new Scanner(new File(cool2 + ".txt"));
                                ArrayList<String> temp = new ArrayList<String>(); // Create an ArrayList object
                                while(myReader.hasNextLine()){
                                    temp.add(myReader.nextLine());
                                }
                                File tempf = new File(cool2 + ".txt");
                                FileWriter fw = new FileWriter(tempf);
                                for(int i = 0; i < temp.size(); i++){
                                    if(i==3) {
                                        fw.write(String.valueOf(Integer.parseInt(temp.get(i)) - Integer.parseInt(textArea1.getText())) + "\n");
                                        continue;
                                    }
                                    fw.write(temp.get(i) + "\n");
                                }
                                LocalDateTime myDateObj = LocalDateTime.now();
                                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                                String formattedDate = myDateObj.format(myFormatObj);
                                fw.write("Account 3 Transaction eTransfer to "+textArea3.getText()+" of: " + textArea1.getText() + " dollars at " + formattedDate);
                                fw.close();
                                complete.setVisible(true);
                                complete.setText("Complete Transaction");



                            }else{
                                textArea1.setText("");
                                textArea2.setText("");
                                textArea3.setText("");
                                complete.setText("Can't do that");
                            }
                        }else if(counter == 5 && textArea2.getText().equals("3")){
                            int number = Integer.parseInt(data);
                            if( number > Integer.parseInt(textArea1.getText())){
                                myReader = new Scanner(new File(cool2 + ".txt"));
                                ArrayList<String> temp = new ArrayList<String>(); // Create an ArrayList object
                                while(myReader.hasNextLine()){
                                    temp.add(myReader.nextLine());
                                }
                                File tempf = new File(cool2 + ".txt");
                                FileWriter fw = new FileWriter(tempf);
                                for(int i = 0; i < temp.size(); i++){
                                    if(i==4) {
                                        fw.write(String.valueOf(Integer.parseInt(temp.get(i)) - Integer.parseInt(textArea1.getText())) + "\n");
                                        continue;
                                    }
                                    fw.write(temp.get(i) + "\n");
                                }
                                LocalDateTime myDateObj = LocalDateTime.now();

                                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                                String formattedDate = myDateObj.format(myFormatObj);
                                fw.write("Account 3 Transaction eTransfer to "+textArea3.getText()+" of: " + textArea1.getText() + " dollars at " + formattedDate);
                                fw.close();
                                complete.setVisible(true);
                                complete.setText("Complete Transaction");



                            }else{
                                textArea1.setText("");
                                textArea2.setText("");
                                textArea3.setText("");
                                complete.setText("Can't do that");
                            }
                        }

                    }
                    counter = 0;
                    while(myReader2.hasNextLine()){
                        String data = myReader2.nextLine();
                        counter++;
                        if(counter == 3){
                            int number = Integer.parseInt(data);

                                myReader2 = new Scanner(new File(textArea3.getText() + ".txt"));
                                ArrayList<String> temp = new ArrayList<String>(); // Create an ArrayList object
                                while(myReader2.hasNextLine()){
                                    temp.add(myReader2.nextLine());
                                }
                                File tempf = new File(textArea3.getText() + ".txt");
                                FileWriter fw = new FileWriter(tempf);
                                for(int i = 0; i < temp.size(); i++){
                                    if(i==2) {
                                        fw.write(String.valueOf(Integer.parseInt(temp.get(i)) + Integer.parseInt(textArea1.getText())) + "\n");
                                        continue;
                                    }
                                    fw.write(temp.get(i) + "\n");
                                }
                                LocalDateTime myDateObj = LocalDateTime.now();

                                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                                String formattedDate = myDateObj.format(myFormatObj);
                                fw.write("ETransfer from : "+cool2 + " of " + textArea1.getText() + " dollars at " + formattedDate);
                                fw.close();
                                complete.setVisible(true);
                                complete.setText("Complete Transaction");




                        }

                    }

                }catch (FileNotFoundException ex) {
                    textArea1.setText("");
                    textArea2.setText("");
                    textArea3.setText("");
                    complete.setVisible(true);
                    complete.setText("Can't do that");
                } catch (IOException ex) {
                    textArea1.setText("");
                    textArea2.setText("");
                    textArea3.setText("");
                    complete.setText("Can't do that");

                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Account cool = new Account(cool2);
            }
        });
    }
}
