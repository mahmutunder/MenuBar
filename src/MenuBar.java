import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    // menu itmes

    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    JLabel label;


    public MenuBar(){
        label= new JLabel();

        // create manu bar
        menuBar= new JMenuBar();
        // create menu objects
        fileMenu= new JMenu("File");
        // alt+f
        fileMenu.setMnemonic(KeyEvent.VK_F);

        editMenu= new JMenu("Edit");
        helpMenu= new JMenu("Help");
        // crete items object

        // alt+o
        openItem= new JMenuItem("Open");
        // alt+s
        saveItem= new JMenuItem("Save");
        // alt+e
        exitItem= new JMenuItem("Exit");

        // add action
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // add Mnemonic
        openItem.setMnemonic(KeyEvent.VK_O);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);


        // add menu-items to menu

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // add menu objects to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setTitle("Menu Bar");
        setDefaultCloseOperation(3);
        setLocation(600,300);
        add(label);
        setJMenuBar(menuBar);
        setLayout(new FlowLayout());
        setSize(600,600);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==openItem){
            label.setText("Opening!!!");
        } else if (e.getSource()==saveItem) {
            label.setText("Saving!!!");
        } else if (e.getSource()==exitItem) {
                System.exit(0);


        }
    }
}
