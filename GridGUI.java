package Project2;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class GridGUI extends JFrame {
   
	private static final int CELL_SIZE = 30;

    public GridGUI(int rows, int cols) {
        super("GridGUI");
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(rows, cols));
       
        setSize(500,500);
       
        
        for (int i = 0; i < rows * cols; i++) {
            JPanel pixel = new JPanel();
            pixel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(pixel);
           
        }
        
        setVisible(true);
     
    }

    public static void main(String[] args) {
        GridGUI gui = new GridGUI(10, 10);
    }
}

