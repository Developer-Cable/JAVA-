package mainJFrame;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.table.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
public class mainJFrame {
	static int billnum = 0;//账单编号
	static JFrame mainJF = new JFrame("餐厅点餐系统");
	static JLabel title = new JLabel("***西餐厅欢迎您***", JLabel.CENTER);
	static JTabbedPane tabbedPane = new JTabbedPane();//左
	static JTabbedPane tabbedPane1 = new JTabbedPane();//中
	static Component panel2 = redwind();//红酒视窗
	static Component panel5 = beef();//牛肉视窗
	static Component panel6 = fruit();//水果视窗
	static Component panel7 = sweet();//甜品视窗
	static Component panel8 = drink();//饮料视窗
	static Component panel9 = eat();//小吃视窗	
	static Component panell =  makeMenuPanel();//左边菜单栏
	static Component panel4 = button();//底部按钮
	static JMenuBar mb = new JMenuBar();//顶部系统设置
	static String[] desk = {"桌1","桌2","桌3","桌4","桌5","桌6","桌7","桌8"};
	static JComboBox cbx1 = new JComboBox(desk);//桌号
	static String[] menutitle = {"菜名","数量","价格"};
	static JScrollPane Pane2 = new JScrollPane();//列表
	static DefaultTableModel tb = new DefaultTableModel();
	static Vector data = new Vector();//行向量集
	static Vector names = new Vector();//列向量集
	static JTable table = new JTable(tb);
	static private String fPath="C://LQX//eclipse//workspace//System";//文件保存路径
	static private BufferedWriter bw;	
	static public JTextField input = new JTextField();//输入人数
	static public int sum=0;
	static JLabel sumtext = new JLabel();
	public static Component makeMenuPanel() {//菜单导航
		JPanel panel = new JPanel(false);
		panel.setLayout(new BorderLayout());
		ImageIcon image = new ImageIcon("src\\image\\1.png");//背景图片
		JLabel lb_image = new JLabel(image);
		lb_image.setLayout(null);
		JButton[] menu = new JButton[6];
		for(int i=0;i<menu.length;i++) {
			menu[i] = new JButton("Btn"+i);
		}
		menu[0].setText("红酒类");
		menu[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(0);
			}
		});
		menu[1].setText("牛排");
		menu[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(1);
			}
		});
		menu[2].setText("水果沙拉");
		menu[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(2);
			}
		});
		menu[3].setText("甜品类");
		menu[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(3);
			}
		});
		menu[4].setText("饮品类"); 
		menu[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(4);
			}
		});
		menu[5].setText("小吃类");
		menu[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(5);
			}
		});
		for(int i=0;i<menu.length;i++) {
			menu[i].setBounds(20,35+65*i,150,45);
			lb_image.add(menu[i]);
		}
		panel.add(lb_image);
		return panel;
	}
	public static JPanel redwind() {
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		
		Font font = new Font("宋体", Font.BOLD, 15);
		Font boxfont = new Font("黑体", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;//复选框
		box1 = new JCheckBox("红酒1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("红酒2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("红酒3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("红酒4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("红酒5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("红酒6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("红酒1");
					vRow.add(1);
					vRow.add(98);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("红酒2");
					vRow.add(1);
					vRow.add(88);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("红酒3");
					vRow.add(1);
					vRow.add(88);
					data.add(vRow);
				}
			}
		});
		box4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("红酒4");
					vRow.add(1);
					vRow.add(68);
					data.add(vRow);
				}
			}
		});
		box5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("红酒5");
					vRow.add(1);
					vRow.add(98);
					data.add(vRow);
				}
			}
		});		
		box6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("红酒6");
					vRow.add(1);
					vRow.add(78);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\wind1.png");
		JLabel im1 = new JLabel("98元",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\wind2.png");
		JLabel im2 = new JLabel("88元",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\wind3.png");
		JLabel im3 = new JLabel("88元",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\wind4.png");
		JLabel im4 = new JLabel("68元",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\wind5.png");
		JLabel im5 = new JLabel("98元",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\wind6.png");
		JLabel im6 = new JLabel("78元",image6,SwingConstants.TRAILING);
		im6.setFont(font);
		im6.setForeground(Color.BLACK);
		im6.setVerticalTextPosition(JLabel.BOTTOM);
		im6.setHorizontalTextPosition(JLabel.CENTER); 
		im6.setBounds(530, 370, 200, 300);
		box6.setBounds(530, 670, 200, 25);
		
		panel.add(im1);
		panel.add(box1);
		panel.add(im2);
		panel.add(box2);
		panel.add(im3);
		panel.add(box3);
		panel.add(im4);
		panel.add(box4);
		panel.add(im5);
		panel.add(box5);
		panel.add(im6);
		panel.add(box6);
		
		return panel;
	}
	public static JPanel beef() {
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		
		Font font = new Font("宋体", Font.BOLD, 15);
		Font boxfont = new Font("黑体", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("牛排1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("牛排2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("牛排3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("牛排4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("牛排5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("牛排6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("牛排1");
					vRow.add(1);
					vRow.add(69);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("牛排2");
					vRow.add(1);
					vRow.add(89);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("牛排3");
					vRow.add(1);
					vRow.add(79);
					data.add(vRow);
				}
			}
		});
		box4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("牛排4");
					vRow.add(1);
					vRow.add(99);
					data.add(vRow);
				}
			}
		});
		box5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("牛排5");
					vRow.add(1);
					vRow.add(109);
					data.add(vRow);
				}
			}
		});		
		box6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("牛排6");
					vRow.add(1);
					vRow.add(119);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\beef1.png");
		JLabel im1 = new JLabel("69元",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\beef2.png");
		JLabel im2 = new JLabel("89元",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\beef3.png");
		JLabel im3 = new JLabel("79元",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\beef4.png");
		JLabel im4 = new JLabel("99元",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\beef5.png");
		JLabel im5 = new JLabel("109元",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\beef6.png");
		JLabel im6 = new JLabel("119元",image6,SwingConstants.TRAILING);
		im6.setFont(font);
		im6.setForeground(Color.BLACK);
		im6.setVerticalTextPosition(JLabel.BOTTOM);
		im6.setHorizontalTextPosition(JLabel.CENTER); 
		im6.setBounds(530, 370, 200, 300);
		box6.setBounds(530, 670, 200, 25);
		
		panel.add(im1);
		panel.add(box1);
		panel.add(im2);
		panel.add(box2);
		panel.add(im3);
		panel.add(box3);
		panel.add(im4);
		panel.add(box4);
		panel.add(im5);
		panel.add(box5);
		panel.add(im6);
		panel.add(box6);
		
		return panel;
	}
	public static JPanel fruit() {
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		
		Font font = new Font("宋体", Font.BOLD, 15);
		Font boxfont = new Font("黑体", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("水果1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("水果2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("水果3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("水果4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("水果5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("水果6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("水果1");
					vRow.add(1);
					vRow.add(27);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("水果2");
					vRow.add(1);
					vRow.add(34);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("水果3");
					vRow.add(1);
					vRow.add(41);
					data.add(vRow);
				}
			}
		});
		box4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("水果4");
					vRow.add(1);
					vRow.add(37);
					data.add(vRow);
				}
			}
		});
		box5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("水果5");
					vRow.add(1);
					vRow.add(26);
					data.add(vRow);
				}
			}
		});		
		box6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("水果6");
					vRow.add(1);
					vRow.add(32);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\fruit1.png");
		JLabel im1 = new JLabel("27元",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\fruit2.png");
		JLabel im2 = new JLabel("34元",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\fruit3.png");
		JLabel im3 = new JLabel("41元",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\fruit4.png");
		JLabel im4 = new JLabel("37元",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\fruit5.png");
		JLabel im5 = new JLabel("26元",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\fruit6.png");
		JLabel im6 = new JLabel("32元",image6,SwingConstants.TRAILING);
		im6.setFont(font);
		im6.setForeground(Color.BLACK);
		im6.setVerticalTextPosition(JLabel.BOTTOM);
		im6.setHorizontalTextPosition(JLabel.CENTER); 
		im6.setBounds(530, 370, 200, 300);
		box6.setBounds(530, 670, 200, 25);
		
		panel.add(im1);
		panel.add(box1);
		panel.add(im2);
		panel.add(box2);
		panel.add(im3);
		panel.add(box3);
		panel.add(im4);
		panel.add(box4);
		panel.add(im5);
		panel.add(box5);
		panel.add(im6);
		panel.add(box6);
		
		return panel;
	}
	public static JPanel sweet() {
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		
		Font font = new Font("宋体", Font.BOLD, 15);
		Font boxfont = new Font("黑体", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("糕点1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("糕点2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("糕点3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("糕点4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("糕点5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("糕点6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("糕点1");
					vRow.add(1);
					vRow.add(48);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("糕点2");
					vRow.add(1);
					vRow.add(28);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("糕点3");
					vRow.add(1);
					vRow.add(18);
					data.add(vRow);
				}
			}
		});
		box4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("糕点4");
					vRow.add(1);
					vRow.add(26);
					data.add(vRow);
				}
			}
		});
		box5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("糕点5");
					vRow.add(1);
					vRow.add(38);
					data.add(vRow);
				}
			}
		});		
		box6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("糕点6");
					vRow.add(1);
					vRow.add(33);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\sweet1.png");
		JLabel im1 = new JLabel("48元",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\sweet2.png");
		JLabel im2 = new JLabel("28元",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\sweet3.png");
		JLabel im3 = new JLabel("18元",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\sweet4.png");
		JLabel im4 = new JLabel("26元",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\sweet5.png");
		JLabel im5 = new JLabel("38元",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\sweet6.png");
		JLabel im6 = new JLabel("33元",image6,SwingConstants.TRAILING);
		im6.setFont(font);
		im6.setForeground(Color.BLACK);
		im6.setVerticalTextPosition(JLabel.BOTTOM);
		im6.setHorizontalTextPosition(JLabel.CENTER); 
		im6.setBounds(530, 370, 200, 300);
		box6.setBounds(530, 670, 200, 25);
		
		panel.add(im1);
		panel.add(box1);
		panel.add(im2);
		panel.add(box2);
		panel.add(im3);
		panel.add(box3);
		panel.add(im4);
		panel.add(box4);
		panel.add(im5);
		panel.add(box5);
		panel.add(im6);
		panel.add(box6);
		
		return panel;
	}
	public static JPanel drink() {
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		
		Font font = new Font("宋体", Font.BOLD, 15);
		Font boxfont = new Font("黑体", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("饮品1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("饮品2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("饮品3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("饮品4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("饮品5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("饮品6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("饮品1");
					vRow.add(1);
					vRow.add(18);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("饮品2");
					vRow.add(1);
					vRow.add(15);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("饮品3");
					vRow.add(1);
					vRow.add(17);
					data.add(vRow);
				}
			}
		});
		box4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("饮品4");
					vRow.add(1);
					vRow.add(16);
					data.add(vRow);
				}
			}
		});
		box5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("饮品5");
					vRow.add(1);
					vRow.add(12);
					data.add(vRow);
				}
			}
		});		
		box6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("饮品6");
					vRow.add(1);
					vRow.add(20);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\drink1.png");
		JLabel im1 = new JLabel("18元",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\drink2.png");
		JLabel im2 = new JLabel("15元",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\drink3.png");
		JLabel im3 = new JLabel("17元",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\drink4.png");
		JLabel im4 = new JLabel("16元",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\drink5.png");
		JLabel im5 = new JLabel("12元",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\drink6.png");
		JLabel im6 = new JLabel("20元",image6,SwingConstants.TRAILING);
		im6.setFont(font);
		im6.setForeground(Color.BLACK);
		im6.setVerticalTextPosition(JLabel.BOTTOM);
		im6.setHorizontalTextPosition(JLabel.CENTER); 
		im6.setBounds(530, 370, 200, 300);
		box6.setBounds(530, 670, 200, 25);
		
		panel.add(im1);
		panel.add(box1);
		panel.add(im2);
		panel.add(box2);
		panel.add(im3);
		panel.add(box3);
		panel.add(im4);
		panel.add(box4);
		panel.add(im5);
		panel.add(box5);
		panel.add(im6);
		panel.add(box6);
		
		return panel;
	}
	public static JPanel eat() {
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		
		Font font = new Font("宋体", Font.BOLD, 15);
		Font boxfont = new Font("黑体", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("小吃1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("小吃2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("小吃3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("小吃4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("小吃5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("小吃6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("小吃1");
					vRow.add(1);
					vRow.add(28);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("小吃2");
					vRow.add(1);
					vRow.add(45);
					data.add(vRow);
				}
//				else {
//					tb.removeRow(tb.getRowCount()-1);
//				}
			}
		});
		box3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("小吃3");
					vRow.add(1);
					vRow.add(27);
					data.add(vRow);
				}
			}
		});
		box4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("小吃4");
					vRow.add(1);
					vRow.add(36);
					data.add(vRow);
				}
			}
		});
		box5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("小吃5");
					vRow.add(1);
					vRow.add(52);
					data.add(vRow);
				}
			}
		});		
		box6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("小吃6");
					vRow.add(1);
					vRow.add(50);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\eat1.png");
		JLabel im1 = new JLabel("28元",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\eat2.png");
		JLabel im2 = new JLabel("45元",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\eat3.png");
		JLabel im3 = new JLabel("27元",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\eat4.png");
		JLabel im4 = new JLabel("36元",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\eat5.png");
		JLabel im5 = new JLabel("52元",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\eat6.png");
		JLabel im6 = new JLabel("50元",image6,SwingConstants.TRAILING);
		im6.setFont(font);
		im6.setForeground(Color.BLACK);
		im6.setVerticalTextPosition(JLabel.BOTTOM);
		im6.setHorizontalTextPosition(JLabel.CENTER); 
		im6.setBounds(530, 370, 200, 300);
		box6.setBounds(530, 670, 200, 25);
		
		panel.add(im1);
		panel.add(box1);
		panel.add(im2);
		panel.add(box2);
		panel.add(im3);
		panel.add(box3);
		panel.add(im4);
		panel.add(box4);
		panel.add(im5);
		panel.add(box5);
		panel.add(im6);
		panel.add(box6);
		
		return panel;
	}
	protected static Component button() {
		JPanel panel = new JPanel(false);
		  
		  panel.setLayout(null); 
		  JButton[] menu = new JButton[4];
		  for(int i=0;i<menu.length;i++)
		  { 
			  menu[i] = new JButton("Btn"+i); 
		  }
		  menu[0].setText("取消"); 
		  menu[0].addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				Component[] components1 = ((JPanel)panel2).getComponents();
				Component[] components2 = ((JPanel)panel5).getComponents();
				Component[] components3 = ((JPanel)panel6).getComponents();
				Component[] components4 = ((JPanel)panel7).getComponents();
				Component[] components5 = ((JPanel)panel8).getComponents();
				Component[] components6 = ((JPanel)panel9).getComponents();
				doUnSelect(components1);
				doUnSelect(components2);
				doUnSelect(components3);
				doUnSelect(components4);
				doUnSelect(components5);
				doUnSelect(components6);
			}
			public void doUnSelect(Component[] components) {
				tb.setRowCount(0);		    
			   for (Component component : components) {
			      if (component instanceof JCheckBox) {
			            ((JCheckBox) component).setSelected(false);
			        }
			    }
			}
		  });
		  menu[1].setText("下单"); 
		  menu[1].addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i =methodA();
				if(i==1) {saveFile();};
			}
			private int methodA() {
				  if(input.getText().length()==0) {
					  JFrame warn = new warning();
					  ((warning)warn).warn();
					  return 0;
				  }
				  tb = new DefaultTableModel(data,names);
				  table.setModel(tb);
				  saveFile();
				  int rows = table.getRowCount();
				  int humannum = Integer.valueOf(input.getText());
				  sum = 0;
				  for(int i = 0;i<rows;i++) {
				   	sum += ((int)table.getValueAt(i, 2));
				  }
				  sum += (humannum*4); 
				  sumtext.setText("总金额为："+sum+"元");
				  sumtext.validate();//重画JPanel
				  sumtext.repaint();
				  return 1;
			  }
			public void saveFile() {
				try {
					String fName = (String)mainJFrame.cbx1.getSelectedItem();
					FileWriter fw = new FileWriter(fPath + "/" + fName+".txt");
					bw = new BufferedWriter(fw);
					bw.write(menutitle[0] + "\t" +menutitle[1] + "\t" + menutitle[2] + "\r\n");
					int rowNumber = tb.getRowCount();
					for (int i=0;i<rowNumber;i++) {
						for (int j=0;j<3;j++) {
							bw.write(tb.getValueAt(i, j) + "\t");
						}
						bw.write("\r\n");
					}
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		  });
		  menu[2].setText("加单");
		  menu[2].addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				methodA();
				saveFile();
				int rows = table.getRowCount();
				int humannum = Integer.valueOf(input.getText());
				sum = 0;
				for(int i = 0;i<rows;i++) {
				   	sum += ((int)table.getValueAt(i, 2));
				}
				sum += (humannum*4); 
				sumtext.setText("总金额为："+sum+"元");
				sumtext.validate();//重画JPanel
				sumtext.repaint();
			}
			private void methodA() {
				  tb = new DefaultTableModel(data,names);
				  table.setModel(tb);
			  }
			public void saveFile() {
				try {
					String fName = (String)mainJFrame.cbx1.getSelectedItem();
					FileWriter fw = new FileWriter(fPath + "/" + fName+".txt");
					bw = new BufferedWriter(fw);
					bw.write(menutitle[0] + "\t" +menutitle[1] + "\t" + menutitle[2] + "\r\n");
					int rowNumber = tb.getRowCount();
					for (int i=0;i<rowNumber;i++) {
						for (int j=0;j<3;j++) {
							bw.write(tb.getValueAt(i, j) + "\t");
						}
						bw.write("\r\n");
					}
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		  });
		  menu[3].setText("结账"); 
		  menu[3].addMouseListener(new MouseAdapter() {
				public void mouseReleased(MouseEvent e) {					
					JFrame JF2 = new JFrame2();				    
					tb.setRowCount(0);
					try {
						Component[] components1 = ((JPanel)panel2).getComponents();
						Component[] components2 = ((JPanel)panel5).getComponents();
						Component[] components3 = ((JPanel)panel6).getComponents();
						Component[] components4 = ((JPanel)panel7).getComponents();
						Component[] components5 = ((JPanel)panel8).getComponents();
						Component[] components6 = ((JPanel)panel9).getComponents();
						doUnSelect(components1);
						doUnSelect(components2);
						doUnSelect(components3);
						doUnSelect(components4);
						doUnSelect(components5);
						doUnSelect(components6);
						billnum++;
						((JFrame2)JF2).openFile();
						sum = 0;
						sumtext.setText("总金额为："+sum+"元");
						sumtext.validate();//重画JPanel
						sumtext.repaint();
						input.setText("");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				public void doUnSelect(Component[] components) {
					//tb.setRowCount(0);		    
				   for (Component component : components) {
				      if (component instanceof JCheckBox) {
				            ((JCheckBox) component).setSelected(false);
				        }
				    }
				}
		  });
		  for(int i=0;i<menu.length;i++) 
		  { 
			  menu[i].setBounds(250+i*50+i*200, 7, 130, 50);
			  panel.add(menu[i]);
		  }
		 
		//panel.setBackground(Color.black);
		return panel;
	}
public static void main(String[] args) {
		 mainJF.setSize(1400,975);
		 mainJF.setLocationRelativeTo(null);
		 Container container = mainJF.getContentPane();
		 container.setLayout(null);
		 container.setBackground(Color.WHITE);
		 
		 Font font = new Font("宋体", Font.PLAIN, 35);
		 title.setFont(font);
		 title.setOpaque(true);
		 title.setBackground(Color.black);
		 title.setForeground(Color.WHITE);
		 title.setBounds(0, 0, 1400,80);
		 container.add(title);
	
		 tabbedPane.addTab("菜式导航" , null , panell, "");
		 tabbedPane.setBounds(0, 80, 200, 750);
		 container.add(tabbedPane);
		 
		 
		 tabbedPane1.setBounds(200, 80, 800, 750);
		 tabbedPane1.addTab("红酒类", null,panel2,"");
		 tabbedPane1.addTab("牛排", null,panel5,"");
		 tabbedPane1.addTab("水果沙拉", null,panel6,"");
		 tabbedPane1.addTab("甜品类", null,panel7,"");
		 tabbedPane1.addTab("饮品", null,panel8,"");
		 tabbedPane1.addTab("小吃", null,panel9,"");
		 container.add(tabbedPane1);
		 
		 panel4.setBounds(0,830, 1400, 80);
		 container.add(panel4);
		  
		 Font font2 = new Font("宋体", Font.BOLD, 20);
		 JLabel desknumber = new JLabel("请选择桌号：");
		 desknumber.setFont(font2);
		 desknumber.setBounds(1120,120,150, 25);
		 container.add(desknumber);
		 
		 cbx1.setFont(font2);
		 cbx1.setBounds(1060, 160, 250, 30);
		 container.add(cbx1);
		
		 Font font3 = new Font("宋体", Font.BOLD, 15);
	   	 JLabel humannum = new JLabel("请输入用餐人数（茶位费：4元/位 ）：");
		 humannum.setBounds(1050, 220, 300, 25);
		 humannum.setFont(font3);
		 container.add(humannum);
		
		 input.setBounds(1060, 260, 250, 30);
		 container.add(input);
		
		 JLabel menutext = new JLabel("已点菜式列表：");
		 menutext.setFont(font2);
		 menutext.setBounds(1120, 320, 180, 25);
		 container.add(menutext);
		 
		 sumtext.setBounds(1120, 780, 180, 25);
		 sumtext.setFont(font2);
		 
		 container.add(sumtext);
			
		 names.add("菜名");
		 names.add("数量");
		 names.add("价格");
		 tb.setDataVector(data, names);
		 Pane2.setViewportView(table);
		 table.setEnabled(false);
		 Pane2.setBounds(1020, 360, 350, 400);
		 container.add(Pane2);
		  
		 JMenu menu = new JMenu("系统设置");
		 JMenuItem mi1 = new JMenuItem("字体大小");
		 mi1.addMouseListener(new MouseAdapter() {
			 @Override
			 public void mouseReleased(MouseEvent e){
				 try {
				 JFrame setupfont = new ChangeFont();
				 ((ChangeFont)setupfont).Change();
			 }catch (IOException e1) {
					e1.printStackTrace();
				} 
			 }
			 });
		 JMenuItem mi2 = new JMenuItem("字体颜色");
		 mi2.addMouseListener(new MouseAdapter() {
			 @Override
			 public void mouseReleased(MouseEvent e){
				 try {
				 JFrame setupfont = new ChangeColor();
				 ((ChangeColor)setupfont).Change();
			 }catch (IOException e1) {
					e1.printStackTrace();
				} 
			 }
			 });
		 mb.add(menu);
		 menu.add(mi1);
		 menu.add(mi2);
		  
		 mainJF.setResizable(false);//窗口不可改变大小
		 mainJF.setJMenuBar(mb);
		 mainJF.setVisible(true);
	}
}