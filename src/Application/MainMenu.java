package Application;

import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    private JButton startButton;
    private JButton endButton;

    public MainMenu() {
        this.setSize(500, 600);
        this.setLayout((LayoutManager)null);
        this.startButton = new JButton("Start");
        this.startButton.setBounds(100, 80, 300, 30);
        this.startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame var10000 = Main.frame;
                MainFrame.menuWindow.setVisible(false);
                var10000 = Main.frame;
                MainFrame.addWindow.setVisible(true);
            }
        });
        this.add(this.startButton);
        this.endButton = new JButton("Exit");
        this.endButton.setBounds(100, 160, 300, 30);
        this.endButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(this.endButton);
    }
}
