import java.awt.*;

public class New {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(300,450);
		f.setTitle("Mini CalculaTOR");
		f.setBackground(Color.LIGHT_GRAY);
		Button b=new Button("+");
		b.setBounds(30, 300, 40, 20);
		f.add(b);
		Button b2=new Button("-");
		b2.setBounds(95, 300, 40, 20);
		f.add(b2);
		Button b3=new Button("*");
		b3.setBounds(160, 300, 40, 20);
		f.add(b3);
		Button b4=new Button("/");
		b4.setBounds(225, 300, 40, 20);
		f.add(b4);
		Label l=new Label("1st operand");
		l.setBounds(25, 100, 75, 20);
		f.add(l);
		Label l2=new Label("2nd operand");
		l2.setBounds(25, 150, 75, 20);
		f.add(l2);
		TextField t=new TextField();
		t.setBounds(110, 100, 100, 20);
		f.add(t);
		TextField t2=new TextField();
		t2.setBounds(110, 150, 100, 20);
		f.add(t2);
		}
}