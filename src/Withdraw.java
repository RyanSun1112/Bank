import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;
import java.util.ArrayList; // import the ArrayList class



public class Withdraw extends JFrame{
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton submitButton;
    private JPanel withdraw;
    private JLabel complete;

    public Withdraw(String cool2){
        setContentPane(withdraw);
        setTitle("Menu");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        complete.setVisible(false);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int counter =0;
                    Scanner myReader = new Scanner(new File(cool2 + ".txt"));
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
                                fw.write("Account 1 Transaction Withdraw of: " + textArea1.getText() + " dollars at " + formattedDate);
                                fw.close();
                                complete.setVisible(true);



                            }else{
                                System.out.print("Invalid");
                            }
                        }else if(counter == 3 && textArea2.getText().equals("2")){
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
                                fw.write("Account 2 Transaction Withdraw of: " + textArea1.getText() + " dollars at " + formattedDate);
                                fw.close();
                                complete.setVisible(true);



                            }else{
                                System.out.print("Invalid");
                            }
                        }else if(counter == 3 && textArea2.getText().equals("3")){
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
                            fw.write("Account 3 Transaction Withdraw of: " + textArea1.getText() + " dollars at " + formattedDate);
                            fw.close();
                            complete.setVisible(true);



                        }else{
                            System.out.print("Invalid");
                        }
                    }

                    }
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
