import java.awt.*;
import java.awt.event.*;
import java.io.*;

class TableDisplay{
    Frame displayFrame;
    MenuBar menuBar;
    Menu fileMenu;
    MenuItem openMenuItem;
    MenuItem exitMenuItem;
    ScrollPane scrollPane;
    Panel panel;

    TableDisplay(){
        initializeMenuBar();
        initializeFrame();
        registerListeners();
    }

    private void initializeFrame(){
        scrollPane = new ScrollPane(scrollPane.SCROLLBARS_ALWAYS);
        panel = new Panel();
        scrollPane.add(panel);
        displayFrame = new Frame("Display Table.txt contents");
        displayFrame.setBounds(100, 100, 500, 500);
        displayFrame.add(scrollPane);
        displayFrame.setMenuBar(menuBar);
        displayFrame.setVisible(true);
    }

    private void initializeMenuBar(){
        menuBar = new MenuBar();
        fileMenu = new Menu("File");
        openMenuItem = new MenuItem("Open");
        exitMenuItem = new MenuItem("Exit");
        menuBar.add(fileMenu);
        fileMenu.add(openMenuItem);
        fileMenu.add(exitMenuItem);
    }

    private void registerListeners(){
        DisplayWindowListener dwl = new DisplayWindowListener();
        displayFrame.addWindowListener(dwl);
        ExitActionListener eal = new ExitActionListener();
        exitMenuItem.addActionListener(eal);
        OpenActionListener oal = new OpenActionListener(displayFrame);
        openMenuItem.addActionListener(oal);
    }

    public static void main(String args[]){
        new TableDisplay();
    }

}
