package mainJFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ChangeFont extends JFrame{
	static public JTextField inputFont = new JTextField();//�����С
	public ChangeFont() {
		this.setTitle("�޸������С");
		this.setLayout(null);
		this.setSize(400, 180);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void Change() throws IOException {
		inputFont.setBounds(50, 30, 120, 40);
		this.add(inputFont);
		JButton sure = new JButton();
		sure.setText("ȷ��");
		sure.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				methodA();

			}
			private void methodA() {
				int size = Integer.parseInt(inputFont.getText());
				Font font = new Font("����", Font.PLAIN, size);
				mainJFrame.title.setFont(font);
				mainJFrame.title.repaint();
				mainJFrame.title.updateUI();
				mainJFrame.title.setVisible(true);
			}	
		});
		sure.setBounds(220, 30, 120, 40);
		this.add(sure);
	}
}