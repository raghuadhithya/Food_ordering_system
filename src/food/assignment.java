/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package food;

/**
 *
 * @author Raghu
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.Color;
class assignment extends Applet implements ActionListener
{
Frame f;
/* public void init()
{
f.setbackground(Color.pink);
}
*/

Button b1,b2,b3;
assignment()
{
f=new Frame("Colour");

b1=new Button("red");
b2=new Button("yellow");
b3=new Button("green");

f.setVisible(true);
f.setSize(400,400);
f.setLayout(new FlowLayout());
f.setBackground(Color.black);

f.add(b1);
f.add(b2);
f.add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource().equals(b1))
{
f.setBackground(Color.red);
}
if(e.getSource().equals(b2))
{
f.setBackground(Color.yellow);
}
if(e.getSource().equals(b3))
{
f.setBackground(Color.green);
}
}
public static void main(String...aa)
{
new assignment();
}
}
