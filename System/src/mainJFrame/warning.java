package mainJFrame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class warning extends JFrame{
	static JLabel warn = new JLabel("��������������", JLabel.CENTER);
	public warning() {
	this.setTitle("����!");
	this.setLayout(null);
	this.setSize(400, 200);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	}
	public void warn() {
		warn.setBounds(0, 0, 400, 80);
		Font font = new Font("����", Font.BOLD, 25);
		warn.setFont(font);
		JButton close = new JButton();
		close.setText("�ر�");
		close.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				methodA();
			}
		});
		close.setBounds(140, 80, 100, 30);
		this.add(warn);
		this.add(close);
	}
	public void methodA() {
		this.setVisible(false);
	}
}
