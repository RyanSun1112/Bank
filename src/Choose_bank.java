import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Choose_bank extends JFrame {
    private JPanel Scene1;
    private JLabel Picture;
    private JLabel TD;
    private JLabel CIBC;
    private JLabel RBC;
    private JLabel ScotiaBank;
    private JLabel BMO;
    private JLabel National;

    public Choose_bank(){
        setContentPane(Scene1);
        setTitle("Menu");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        TD.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                TD cool = new TD();
            }
        });
        CIBC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                CIBC cool = new CIBC();
            }
        });
        RBC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                RBC cool = new RBC();
            }
        });
        ScotiaBank.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                Scotiabank cool = new Scotiabank();
            }
        });
        BMO.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                BMO cool = new BMO();
            }
        });
        National.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                National cool = new National();
            }
        });
    }

    private void createUIComponents() throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("7969271.png"));

        Image image = bufferedImage.getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        Picture = new JLabel(newIcon);
        bufferedImage = ImageIO.read(new File("download.png"));

        image = bufferedImage.getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        newIcon = new ImageIcon(image);
        TD = new JLabel(newIcon);
        bufferedImage = ImageIO.read(new File("download (1).png"));

        image = bufferedImage.getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        newIcon = new ImageIcon(image);
        CIBC = new JLabel(newIcon);
        bufferedImage = ImageIO.read(new File("download (2).png"));

        image = bufferedImage.getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        newIcon = new ImageIcon(image);
        RBC = new JLabel(newIcon);
        bufferedImage = ImageIO.read(new File("download (3).png"));

        image = bufferedImage.getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        newIcon = new ImageIcon(image);
        ScotiaBank = new JLabel(newIcon);
        bufferedImage = ImageIO.read(new File("download.jpg"));

        image = bufferedImage.getScaledInstance(180, 90, Image.SCALE_DEFAULT);
        newIcon = new ImageIcon(image);
        BMO = new JLabel(newIcon);
        bufferedImage = ImageIO.read(new File("download (4).png"));

        image = bufferedImage.getScaledInstance(180, 90, Image.SCALE_DEFAULT);
        newIcon = new ImageIcon(image);
        National = new JLabel(newIcon);
    }
}
