package Application;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu menuWindow;
    public static AddMenu addWindow;

    public static AddDebit debitWindow;
    public static AddCredit creditWindow;
    public static AddSaving savingWindow;

    public MainFrame() {
        this.setSize(500, 600);
        this.setTitle("Bank");
        this.setDefaultCloseOperation(3);
        menuWindow = new MainMenu();
        menuWindow.setLocation(0, 0);
        this.add(menuWindow);

        addWindow = new AddMenu();
        addWindow.setLocation(0, 0);
        addWindow.setVisible(false);
        this.add(addWindow);

        debitWindow = new AddDebit();
        debitWindow.setLocation(0, 0);
        debitWindow.setVisible(false);
        this.add(debitWindow);

        creditWindow = new AddCredit();
        creditWindow.setLocation(0, 0);
        creditWindow.setVisible(false);
        this.add(creditWindow);

        savingWindow = new AddSaving();
        savingWindow.setLocation(0, 0);
        savingWindow.setVisible(false);
        this.add(savingWindow);
    }
}
