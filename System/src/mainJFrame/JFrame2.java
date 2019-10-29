package mainJFrame;
import java.util.Date;
import java.text.*;
import javax.swing.*;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import javax.swing.table.DefaultTableModel;
public class JFrame2 extends JFrame{
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table;
	private JLabel Billnum;
	private BufferedReader bufferedReader;
	private LineNumberReader lineNum;
	private String[] head;
	private DefaultTableModel tableModel;
	public JFrame2() {
		this.setTitle("账单");
		this.setLayout(null);
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void openFile() throws IOException {
			try {
				String filename = (String)mainJFrame.cbx1.getSelectedItem();
				FileReader fileReader = new FileReader("C://LQX//eclipse//workspace//System//"+filename+".txt");	
				lineNum = new LineNumberReader(fileReader);
				lineNum.skip(Long.MAX_VALUE);
				int lines = lineNum.getLineNumber();//获取行数
				fileReader.close(); 
				fileReader = new FileReader("C://LQX//eclipse//workspace//System//"+filename+".txt");
				bufferedReader = new BufferedReader(fileReader);
				String line = bufferedReader.readLine();
				String[][] data = new String[lines - 1][3];
				int flag = 1;
				int j = 0;
				while (line != null) {
					if (flag == 1) {
						head = line.split("\t");
						flag = 0;
					} else {
						String[] text = line.split("\t");
						for (int i = 0; i < text.length; i++) {
							data[j][i] = text[i];
						}
						j++;
					}
					line = bufferedReader.readLine();
				}
				tableModel = new DefaultTableModel(data, head);
				table = new JTable(tableModel);
				table.setEnabled(false);
				scrollPane.setViewportView(table);
				scrollPane.setBounds(110, 80, 350, 400);
				
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				String time = df.format(new Date());
				
				Font font = new Font("宋体", Font.PLAIN, 25);
				Billnum = new JLabel();
				Billnum.setFont(font);
				Billnum.setText(" 账单编号:"+mainJFrame.billnum+"         时间:"+time);
				Billnum.setBounds(0, 0, 600, 30);
				
				this.add(Billnum);
				this.add(scrollPane);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
}