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
	static int billnum = 0;//�˵����
	static JFrame mainJF = new JFrame("�������ϵͳ");
	static JLabel title = new JLabel("***��������ӭ��***", JLabel.CENTER);
	static JTabbedPane tabbedPane = new JTabbedPane();//��
	static JTabbedPane tabbedPane1 = new JTabbedPane();//��
	static Component panel2 = redwind();//����Ӵ�
	static Component panel5 = beef();//ţ���Ӵ�
	static Component panel6 = fruit();//ˮ���Ӵ�
	static Component panel7 = sweet();//��Ʒ�Ӵ�
	static Component panel8 = drink();//�����Ӵ�
	static Component panel9 = eat();//С���Ӵ�	
	static Component panell =  makeMenuPanel();//��߲˵���
	static Component panel4 = button();//�ײ���ť
	static JMenuBar mb = new JMenuBar();//����ϵͳ����
	static String[] desk = {"��1","��2","��3","��4","��5","��6","��7","��8"};
	static JComboBox cbx1 = new JComboBox(desk);//����
	static String[] menutitle = {"����","����","�۸�"};
	static JScrollPane Pane2 = new JScrollPane();//�б�
	static DefaultTableModel tb = new DefaultTableModel();
	static Vector data = new Vector();//��������
	static Vector names = new Vector();//��������
	static JTable table = new JTable(tb);
	static private String fPath="C://LQX//eclipse//workspace//System";//�ļ�����·��
	static private BufferedWriter bw;	
	static public JTextField input = new JTextField();//��������
	static public int sum=0;
	static JLabel sumtext = new JLabel();
	public static Component makeMenuPanel() {//�˵�����
		JPanel panel = new JPanel(false);
		panel.setLayout(new BorderLayout());
		ImageIcon image = new ImageIcon("src\\image\\1.png");//����ͼƬ
		JLabel lb_image = new JLabel(image);
		lb_image.setLayout(null);
		JButton[] menu = new JButton[6];
		for(int i=0;i<menu.length;i++) {
			menu[i] = new JButton("Btn"+i);
		}
		menu[0].setText("�����");
		menu[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(0);
			}
		});
		menu[1].setText("ţ��");
		menu[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(1);
			}
		});
		menu[2].setText("ˮ��ɳ��");
		menu[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(2);
			}
		});
		menu[3].setText("��Ʒ��");
		menu[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(3);
			}
		});
		menu[4].setText("��Ʒ��"); 
		menu[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				methodA();
			}
			private void methodA() {
				 tabbedPane1.setSelectedIndex(4);
			}
		});
		menu[5].setText("С����");
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
		
		Font font = new Font("����", Font.BOLD, 15);
		Font boxfont = new Font("����", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;//��ѡ��
		box1 = new JCheckBox("���1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("���2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("���3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("���4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("���5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("���6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("���1");
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
					vRow.add("���2");
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
					vRow.add("���3");
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
					vRow.add("���4");
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
					vRow.add("���5");
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
					vRow.add("���6");
					vRow.add(1);
					vRow.add(78);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\wind1.png");
		JLabel im1 = new JLabel("98Ԫ",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\wind2.png");
		JLabel im2 = new JLabel("88Ԫ",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\wind3.png");
		JLabel im3 = new JLabel("88Ԫ",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\wind4.png");
		JLabel im4 = new JLabel("68Ԫ",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\wind5.png");
		JLabel im5 = new JLabel("98Ԫ",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\wind6.png");
		JLabel im6 = new JLabel("78Ԫ",image6,SwingConstants.TRAILING);
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
		
		Font font = new Font("����", Font.BOLD, 15);
		Font boxfont = new Font("����", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("ţ��1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("ţ��2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("ţ��3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("ţ��4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("ţ��5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("ţ��6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("ţ��1");
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
					vRow.add("ţ��2");
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
					vRow.add("ţ��3");
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
					vRow.add("ţ��4");
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
					vRow.add("ţ��5");
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
					vRow.add("ţ��6");
					vRow.add(1);
					vRow.add(119);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\beef1.png");
		JLabel im1 = new JLabel("69Ԫ",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\beef2.png");
		JLabel im2 = new JLabel("89Ԫ",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\beef3.png");
		JLabel im3 = new JLabel("79Ԫ",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\beef4.png");
		JLabel im4 = new JLabel("99Ԫ",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\beef5.png");
		JLabel im5 = new JLabel("109Ԫ",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\beef6.png");
		JLabel im6 = new JLabel("119Ԫ",image6,SwingConstants.TRAILING);
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
		
		Font font = new Font("����", Font.BOLD, 15);
		Font boxfont = new Font("����", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("ˮ��1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("ˮ��2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("ˮ��3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("ˮ��4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("ˮ��5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("ˮ��6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("ˮ��1");
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
					vRow.add("ˮ��2");
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
					vRow.add("ˮ��3");
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
					vRow.add("ˮ��4");
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
					vRow.add("ˮ��5");
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
					vRow.add("ˮ��6");
					vRow.add(1);
					vRow.add(32);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\fruit1.png");
		JLabel im1 = new JLabel("27Ԫ",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\fruit2.png");
		JLabel im2 = new JLabel("34Ԫ",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\fruit3.png");
		JLabel im3 = new JLabel("41Ԫ",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\fruit4.png");
		JLabel im4 = new JLabel("37Ԫ",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\fruit5.png");
		JLabel im5 = new JLabel("26Ԫ",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\fruit6.png");
		JLabel im6 = new JLabel("32Ԫ",image6,SwingConstants.TRAILING);
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
		
		Font font = new Font("����", Font.BOLD, 15);
		Font boxfont = new Font("����", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("���1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("���2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("���3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("���4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("���5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("���6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("���1");
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
					vRow.add("���2");
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
					vRow.add("���3");
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
					vRow.add("���4");
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
					vRow.add("���5");
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
					vRow.add("���6");
					vRow.add(1);
					vRow.add(33);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\sweet1.png");
		JLabel im1 = new JLabel("48Ԫ",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\sweet2.png");
		JLabel im2 = new JLabel("28Ԫ",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\sweet3.png");
		JLabel im3 = new JLabel("18Ԫ",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\sweet4.png");
		JLabel im4 = new JLabel("26Ԫ",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\sweet5.png");
		JLabel im5 = new JLabel("38Ԫ",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\sweet6.png");
		JLabel im6 = new JLabel("33Ԫ",image6,SwingConstants.TRAILING);
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
		
		Font font = new Font("����", Font.BOLD, 15);
		Font boxfont = new Font("����", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("��Ʒ1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("��Ʒ2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("��Ʒ3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("��Ʒ4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("��Ʒ5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("��Ʒ6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("��Ʒ1");
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
					vRow.add("��Ʒ2");
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
					vRow.add("��Ʒ3");
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
					vRow.add("��Ʒ4");
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
					vRow.add("��Ʒ5");
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
					vRow.add("��Ʒ6");
					vRow.add(1);
					vRow.add(20);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\drink1.png");
		JLabel im1 = new JLabel("18Ԫ",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\drink2.png");
		JLabel im2 = new JLabel("15Ԫ",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\drink3.png");
		JLabel im3 = new JLabel("17Ԫ",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\drink4.png");
		JLabel im4 = new JLabel("16Ԫ",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\drink5.png");
		JLabel im5 = new JLabel("12Ԫ",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\drink6.png");
		JLabel im6 = new JLabel("20Ԫ",image6,SwingConstants.TRAILING);
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
		
		Font font = new Font("����", Font.BOLD, 15);
		Font boxfont = new Font("����", Font.BOLD,20);
		
		JCheckBox box1,box2,box3,box4,box5,box6;
		box1 = new JCheckBox("С��1");box1.setOpaque(false);box1.setFont(boxfont);box1.setHorizontalAlignment((int) 0.5f);		
		box2 = new JCheckBox("С��2");box2.setOpaque(false);box2.setFont(boxfont);box2.setHorizontalAlignment((int) 0.5f);
		box3 = new JCheckBox("С��3");box3.setOpaque(false);box3.setFont(boxfont);box3.setHorizontalAlignment((int) 0.5f);
		box4 = new JCheckBox("С��4");box4.setOpaque(false);box4.setFont(boxfont);box4.setHorizontalAlignment((int) 0.5f);
		box5 = new JCheckBox("С��5");box5.setOpaque(false);box5.setFont(boxfont);box5.setHorizontalAlignment((int) 0.5f);
		box6 = new JCheckBox("С��6");box6.setOpaque(false);box6.setFont(boxfont);box6.setHorizontalAlignment((int) 0.5f);
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int stateChange = e.getStateChange();
				if(stateChange==ItemEvent.SELECTED) {
					Vector vRow = new Vector();
					vRow.add("С��1");
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
					vRow.add("С��2");
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
					vRow.add("С��3");
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
					vRow.add("С��4");
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
					vRow.add("С��5");
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
					vRow.add("С��6");
					vRow.add(1);
					vRow.add(50);
					data.add(vRow);
				}
			}
		});
		
		
	
		
		ImageIcon image1 = new ImageIcon("src\\image\\eat1.png");
		JLabel im1 = new JLabel("28Ԫ",image1,SwingConstants.TRAILING);
		im1.setFont(font);
		im1.setForeground(Color.BLACK);
		im1.setBounds(30, 20, 200, 300);
		im1.setVerticalTextPosition(JLabel.BOTTOM);
		im1.setHorizontalTextPosition(JLabel.CENTER); 
		box1.setBounds(30, 320, 200, 25);		
	
		ImageIcon image2 = new ImageIcon("src\\image\\eat2.png");
		JLabel im2 = new JLabel("45Ԫ",image2,SwingConstants.TRAILING);		
		im2.setFont(font);
		im2.setForeground(Color.BLACK);
		im2.setVerticalTextPosition(JLabel.BOTTOM);
		im2.setHorizontalTextPosition(JLabel.CENTER); 
		im2.setBounds(280, 20, 200, 300);
		box2.setBounds(280, 320, 200, 25);
		
		ImageIcon image3 = new ImageIcon("src\\image\\eat3.png");
		JLabel im3 = new JLabel("27Ԫ",image3,SwingConstants.TRAILING);
		im3.setFont(font);
		im3.setForeground(Color.BLACK);
		im3.setVerticalTextPosition(JLabel.BOTTOM);
		im3.setHorizontalTextPosition(JLabel.CENTER); 
		im3.setBounds(530, 20, 200, 300);
		box3.setBounds(530, 320, 200, 25);
		
		ImageIcon image4 = new ImageIcon("src\\image\\eat4.png");
		JLabel im4 = new JLabel("36Ԫ",image4,SwingConstants.TRAILING);
		im4.setFont(font);
		im4.setForeground(Color.BLACK);
		im4.setVerticalTextPosition(JLabel.BOTTOM);
		im4.setHorizontalTextPosition(JLabel.CENTER); 
		im4.setBounds(30, 370, 200, 300);
		box4.setBounds(30, 670, 200, 25);
		
		ImageIcon image5 = new ImageIcon("src\\image\\eat5.png");
		JLabel im5 = new JLabel("52Ԫ",image5,SwingConstants.TRAILING);
		im5.setFont(font);
		im5.setForeground(Color.BLACK);
		im5.setVerticalTextPosition(JLabel.BOTTOM);
		im5.setHorizontalTextPosition(JLabel.CENTER); 
		im5.setBounds(280, 370, 200, 300);
		box5.setBounds(280, 670, 200, 25);
		
		ImageIcon image6 = new ImageIcon("src\\image\\eat6.png");
		JLabel im6 = new JLabel("50Ԫ",image6,SwingConstants.TRAILING);
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
		  menu[0].setText("ȡ��"); 
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
		  menu[1].setText("�µ�"); 
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
				  sumtext.setText("�ܽ��Ϊ��"+sum+"Ԫ");
				  sumtext.validate();//�ػ�JPanel
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
		  menu[2].setText("�ӵ�");
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
				sumtext.setText("�ܽ��Ϊ��"+sum+"Ԫ");
				sumtext.validate();//�ػ�JPanel
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
		  menu[3].setText("����"); 
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
						sumtext.setText("�ܽ��Ϊ��"+sum+"Ԫ");
						sumtext.validate();//�ػ�JPanel
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
		 
		 Font font = new Font("����", Font.PLAIN, 35);
		 title.setFont(font);
		 title.setOpaque(true);
		 title.setBackground(Color.black);
		 title.setForeground(Color.WHITE);
		 title.setBounds(0, 0, 1400,80);
		 container.add(title);
	
		 tabbedPane.addTab("��ʽ����" , null , panell, "");
		 tabbedPane.setBounds(0, 80, 200, 750);
		 container.add(tabbedPane);
		 
		 
		 tabbedPane1.setBounds(200, 80, 800, 750);
		 tabbedPane1.addTab("�����", null,panel2,"");
		 tabbedPane1.addTab("ţ��", null,panel5,"");
		 tabbedPane1.addTab("ˮ��ɳ��", null,panel6,"");
		 tabbedPane1.addTab("��Ʒ��", null,panel7,"");
		 tabbedPane1.addTab("��Ʒ", null,panel8,"");
		 tabbedPane1.addTab("С��", null,panel9,"");
		 container.add(tabbedPane1);
		 
		 panel4.setBounds(0,830, 1400, 80);
		 container.add(panel4);
		  
		 Font font2 = new Font("����", Font.BOLD, 20);
		 JLabel desknumber = new JLabel("��ѡ�����ţ�");
		 desknumber.setFont(font2);
		 desknumber.setBounds(1120,120,150, 25);
		 container.add(desknumber);
		 
		 cbx1.setFont(font2);
		 cbx1.setBounds(1060, 160, 250, 30);
		 container.add(cbx1);
		
		 Font font3 = new Font("����", Font.BOLD, 15);
	   	 JLabel humannum = new JLabel("�������ò���������λ�ѣ�4Ԫ/λ ����");
		 humannum.setBounds(1050, 220, 300, 25);
		 humannum.setFont(font3);
		 container.add(humannum);
		
		 input.setBounds(1060, 260, 250, 30);
		 container.add(input);
		
		 JLabel menutext = new JLabel("�ѵ��ʽ�б�");
		 menutext.setFont(font2);
		 menutext.setBounds(1120, 320, 180, 25);
		 container.add(menutext);
		 
		 sumtext.setBounds(1120, 780, 180, 25);
		 sumtext.setFont(font2);
		 
		 container.add(sumtext);
			
		 names.add("����");
		 names.add("����");
		 names.add("�۸�");
		 tb.setDataVector(data, names);
		 Pane2.setViewportView(table);
		 table.setEnabled(false);
		 Pane2.setBounds(1020, 360, 350, 400);
		 container.add(Pane2);
		  
		 JMenu menu = new JMenu("ϵͳ����");
		 JMenuItem mi1 = new JMenuItem("�����С");
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
		 JMenuItem mi2 = new JMenuItem("������ɫ");
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
		  
		 mainJF.setResizable(false);//���ڲ��ɸı��С
		 mainJF.setJMenuBar(mb);
		 mainJF.setVisible(true);
	}
}