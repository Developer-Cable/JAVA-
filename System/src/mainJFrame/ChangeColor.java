package mainJFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ChangeColor extends JFrame{
	static String[] color = {"红色","黄色","蓝色"};
	static JComboBox cbx = new JComboBox(color);//桌号
	public ChangeColor() {
		this.setTitle("修改字体颜色");
		this.setLayout(null);
		this.setSize(400, 180);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void Change() throws IOException {
		cbx.setBounds(50, 30, 120, 40);
		this.add(cbx);
		JButton sure = new JButton();
		sure.setText("确定");
		sure.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				methodA();

			}
			private void methodA() {
				String cho;
				cho = (String)cbx.getSelectedItem();
				if(cho == "红色") {
					mainJFrame.title.setForeground(Color.red);
					mainJFrame.title.repaint();
					mainJFrame.title.updateUI();
					mainJFrame.title.setVisible(true);
				}
				if(cho == "黄色") {
					mainJFrame.title.setForeground(Color.yellow);
					mainJFrame.title.repaint();
					mainJFrame.title.updateUI();
					mainJFrame.title.setVisible(true);
				}
				if(cho == "蓝色") {
					mainJFrame.title.setForeground(Color.blue);
					mainJFrame.title.repaint();
					mainJFrame.title.updateUI();
					mainJFrame.title.setVisible(true);
				}
			}	
		});
		sure.setBounds(220, 30, 120, 40);
		this.add(sure);
	}
}
