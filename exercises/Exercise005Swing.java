import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Exercise005Swing extends JFrame {
    private static JLabel outputLabel = new JLabel("",SwingConstants.CENTER);
    private static JButton button = new JButton("Click Here");

    public static void main(String[] args) throws Exception{
        Exercise005Swing window = new Exercise005Swing();
        window.setVisible(true);
        window.setSize(250, 225);
        window.setTitle("Exercise004");
        window.setResizable(false);
        window.setLayout(new GridLayout(2,1));
        window.getContentPane().add(outputLabel);
        window.getContentPane().add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (outputLabel.getText() == "") {
                    outputLabel.setText("Hello, World!");
                } else {
                    List<String> characters = Arrays.asList("Hello World!".split(""));
                    Collections.shuffle(characters);
                    String afterShuffle = "";
                    for (String character : characters) {
                        afterShuffle += character;
                    }
                    outputLabel.setText(afterShuffle);
                }
            }
        });
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}