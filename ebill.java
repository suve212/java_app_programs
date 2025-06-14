import java.awt.*;
import java.awt.event.*;
class Bill extends Frame implements ActionListener
{
TextField t3,t4,t5,t6,t7;
public static void main(String[] args)
{
Bill f = new Bill();
f.setSize(800,600);
f.setTitle("ELECTRICITY BILL");
f.setLayout(null);
f.setVisible(true);
}
Bill()
{
this.setBackground(new Color(250, 250, 250));
Panel p1 = new Panel();
p1.setLayout(null);
p1.setBackground(new Color(63, 81, 181));
p1.setBounds(0, 30, 800, 150);
Label l0 = new Label("GOVERNMENT OF TAMILNADU",Label.CENTER);
Label l1 = new Label("TANGEDCO");
Font f0 = new Font("Arial",Font.BOLD,26);
Font f1 = new Font("Arial",Font.BOLD,25);
Font f2 = new Font("Arial",Font.BOLD,24);
l0.setFont(f0);
l0.setForeground(Color.WHITE);
l1.setForeground(Color.WHITE);
l1.setFont(f2);
l0.setBounds(180,40,400,30);
l1.setBounds(260,70,400,30);
p1.add(l0);
p1.add(l1);
this.add(p1);
Panel p2 = new Panel();
p2.setLayout(null);
p2.setBackground(new Color(255, 204, 128));
p2.setBounds(0,180,800,50);
Label l3 = new Label("ELECTRICITY BILL");
l3.setFont(f0);
l3.setBounds(200,10,400,30);
p2.add(l3);
this.add(p2);
Label l11 = new Label("ENTER THE EB-NO");
l11.setBounds(50,250,150,25);
this.add(l11);
TextField t1 = new TextField(20);
t1.setBounds(250,250,200,25);
this.add(t1);
Label l12 = new Label("ENTER CUSTOMER NAME");
l12.setBounds(50,280,150,25);
this.add(l12);
TextField t2 = new TextField(20);
t2.setBounds(250,280,200,25);
this.add(t2);
Label l13 = new Label("ENTER PREVIOUS UNIT");
l13.setBounds(50,310,150,25);
this.add(l13);
t3 = new TextField(20);
t3.setBounds(250,310,200,25);
this.add(t3);
Label l14 = new Label("ENTER CURRENT UNIT");
l14.setBounds(50,340,180,25);
this.add(l14);
t4 = new TextField(20);
t4.setBounds(250,340,200,25);
this.add(t4);
Label l15 = new Label("UNIT CONSUMED");
l15.setBounds(50,370,180,25);
this.add(l15);
t5 = new TextField(20);
t5.setBounds(250,370,200,25);
this.add(t5);
Label l16 = new Label("TOTAL AMOUNT");
l16.setBounds(50,400,150,25);
this.add(l16);
t6 = new TextField(20);
t6.setBounds(250,400,200,25);
this.add(t6);
Button b1 = new Button("SUMBIT");
b1.setBackground(new Color(179,229,252));
b1.setBounds(300,470,100,30);
this.add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
try
{
int m1 = Integer.parseInt(t3.getText());
int m2 = Integer.parseInt(t4.getText());
int unit = m2-m1;
int amount = unit*5;
t5.setText(String.valueOf(unit));
t6.setText(String.valueOf(amount));
t6.setText("Invalid Input");
t7.setText("Check Unit");
}
catch (NumberFormatException e) {}
}
}
