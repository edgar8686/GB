package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel {
    public Panel() {
        Font font = new Font("Arrial", Font.BOLD, 20);
        setLayout(new FlowLayout());
        JButton button1 = new JButton("Сгенерировать номера");
        button1.setFont(font);
        add(button1);

        TextField textField = new TextField("+7(999)0000000");
        textField.setFont(font);
        add(textField);


        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button1.setText(generateNumber());
                    }
                }
        );

        setVisible(true);
    }
    public String generateNumber() {
        Random random = new Random();
        String  telephoneNumber = "";
        telephoneNumber += "+7";
        telephoneNumber += "(999)";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        return telephoneNumber;


    }

}
