package com.company;
import javax.swing.*;
import javax.swing.text.ElementIterator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener
{
    JFrame frame = new JFrame();

    public Main()
    {
            setSize(500, 500);
            setTitle("Tic Tac Toe");
            setVisible(true);
            setDefaultCloseOperation(3);
        //JOptionPane.showMessageDialog(frame, "First Player Turn");

            for (int i = 0; i < 9; i++)
            {
                JButton button = new JButton("");
                add(button);
                // without Layout we couldn't see more than one button
                setLayout(new GridLayout(3,3));
                button.addActionListener(this);
                //System.out.println(button.);
            }
            //JOptionPane.showMessageDialog(frame, "We Win!");
    }
    public static void main(String[] args)
    {
	    // lambda call whole 'Main()'
        SwingUtilities.invokeLater(
                ()->new Main()      );
    }

    private int counter;
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // get info about used obiect (set to JButton)
        JButton button = (JButton)e.getSource();
        button.setFont(new Font("Arial", Font.PLAIN, 40));
        if(counter%2==0)
        {
            button.setText("O");
            JOptionPane.showMessageDialog(frame, "Second Player Turn");
        }
        else
        {
            button.setText("X");
            JOptionPane.showMessageDialog(frame, "First Player Turn");
        }
        // increment
        counter++;
        // click access only once
        button.setEnabled(false);
        
    }
}
