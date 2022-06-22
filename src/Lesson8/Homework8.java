package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Homework8 extends JFrame {
        public Homework8() {

                setTitle("Window");
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setBounds(300, 300, 400, 400);
                setResizable(false);
                add(new Panel(), BorderLayout.CENTER);

                setVisible(true);
        }
}
