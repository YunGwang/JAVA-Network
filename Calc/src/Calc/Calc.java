package Calc;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.Socket;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Calc extends JFrame {

	Container pane;
	JLabel label1, label2, label3;
	JTextField field1;
	JButton btn, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
	protected AbstractButton textField;
	protected String set;

	public static void main(String[] args) {
		Calc myGui = new Calc(); // 인스턴스만 만든다
	}

	Calc() {
		setTitle("2012621011 남윤광 [최종본]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x표시를 누르면 닫힐 수 있게 한다.
		pane = getContentPan e(); // 칠판
		pane.setBackground(new Color(246, 246, 246));
		setLayout(null); // 칠판을 어떻게 배열할거냐?
		// 이 부분에서 배치///

		JToolBar tool = new JToolBar();
		tool.setBounds(10, 10, 480, 35);
		this.add(tool);

		JButton tool1 = new JButton(new ImageIcon("0.png"));
		tool.add(tool1);
		JButton tool2 = new JButton(new ImageIcon("1.png"));
		tool.add(tool2);
		JButton tool3 = new JButton(new ImageIcon("2.png"));
		tool.add(tool3);
		JButton tool4 = new JButton(new ImageIcon("3.png"));
		tool.add(tool4);
		JButton tool5 = new JButton(new ImageIcon("4.png"));
		tool.add(tool5);
		JButton tool6 = new JButton(new ImageIcon("5.png"));
		tool.add(tool6);
		JButton tool7 = new JButton(new ImageIcon("6.png"));
		tool.add(tool7);
		JButton tool8 = new JButton(new ImageIcon("7.png"));
		tool.add(tool8);
		JButton tool9 = new JButton(new ImageIcon("8.png"));
		tool.add(tool9);
		JButton tool10 = new JButton(new ImageIcon("9.png"));
		tool.add(tool10);
		tool.addSeparator();
		JButton tool11 = new JButton(new ImageIcon("+.png"));
		tool.add(tool11);
		JButton tool12 = new JButton(new ImageIcon("-.png"));
		tool.add(tool12);
		JButton tool13 = new JButton(new ImageIcon("X.png"));
		tool.add(tool13);
		JButton tool14 = new JButton(new ImageIcon("--.png"));
		tool.add(tool14);
		tool.addSeparator();
		JButton tool15 = new JButton(new ImageIcon("=.png"));
		tool.add(tool15);

		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar); // this는 JFrame 자체다

		JMenu filemenu = new JMenu("파일");
		JMenu editmenu = new JMenu("편집");
		JMenu nummenu = new JMenu("숫자");
		JMenu Smenu = new JMenu("수식");
		JMenu Resultmenu = new JMenu("계산");
		bar.add(filemenu);
		bar.add(editmenu);
		bar.add(nummenu);
		bar.add(Smenu);
		bar.add(Resultmenu);

		JMenuItem newItem = new JMenuItem("새 문서");
		JMenuItem openItem = new JMenuItem("열기");
		JMenuItem exitItem = new JMenuItem("종료");

		JMenuItem numItem = new JMenuItem("0");
		JMenuItem numItem1 = new JMenuItem("1");
		JMenuItem numItem2 = new JMenuItem("2");
		JMenuItem numItem3 = new JMenuItem("3");
		JMenuItem numItem4 = new JMenuItem("4");
		JMenuItem numItem5 = new JMenuItem("5");
		JMenuItem numItem6 = new JMenuItem("6");
		JMenuItem numItem7 = new JMenuItem("7");
		JMenuItem numItem8 = new JMenuItem("8");
		JMenuItem numItem9 = new JMenuItem("9");
		JMenuItem numItem10 = new JMenuItem(".");

		JMenuItem SmenuItem = new JMenuItem("+");
		JMenuItem SmenuItem1 = new JMenuItem("-");
		JMenuItem SmenuItem2 = new JMenuItem("*");
		JMenuItem SmenuItem3 = new JMenuItem("/");

		JMenuItem ResultItem = new JMenuItem("=");

		nummenu.add(numItem);
		nummenu.add(numItem1);
		nummenu.add(numItem2);
		nummenu.add(numItem3);
		nummenu.add(numItem4);
		nummenu.add(numItem5);
		nummenu.add(numItem6);
		nummenu.add(numItem7);
		nummenu.add(numItem8);
		nummenu.add(numItem9);
		nummenu.add(numItem10);
		Smenu.add(SmenuItem);
		Smenu.add(SmenuItem1);
		Smenu.add(SmenuItem2);
		Smenu.add(SmenuItem3);
		Resultmenu.add(ResultItem);

		filemenu.add(newItem);
		filemenu.add(openItem);
		filemenu.addSeparator(); // 메뉴를 구분해주는 것
		filemenu.add(exitItem);

		tool1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length(); // field1의 배열 선언
				if (len == 0) {
				} // 배열의 길이가 0일경우 아무것도 안 한다.
				else { // 그게 아닐경우
					String set = field1.getText() + "0";
					field1.setText(set);
				}
			}
		});
		tool2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "1";
				field1.setText(set);

			}
		});
		tool3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "2";
				field1.setText(set);

			}
		});
		tool4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "3";
				field1.setText(set);
			}
		});
		tool5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "4";
				field1.setText(set);
			}
		});
		tool6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "5";
				field1.setText(set);
			}
		});
		tool7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "6";
				field1.setText(set);
			}
		});
		tool8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "7";
				field1.setText(set);
			}
		});
		tool9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "8";
				field1.setText(set);
			}
		});
		tool10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "9";
				field1.setText(set);
			}
		});
		numItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length(); // field1의 배열 선언
				if (len == 0) {
				} // 배열의 길이가 0일경우 아무것도 안 한다.
				else { // 그게 아닐경우
					String set = field1.getText() + "0";
					field1.setText(set);
				}
			}
		});

		numItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "1";
				field1.setText(set);
			}
		});
		numItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "2";
				field1.setText(set);
			}
		});
		numItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "3";
				field1.setText(set);
			}
		});
		numItem4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "4";
				field1.setText(set);
			}
		});
		numItem5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "5";
				field1.setText(set);
			}
		});
		numItem6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "6";
				field1.setText(set);
			}
		});
		numItem7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "7";
				field1.setText(set);
			}
		});
		numItem8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "8";
				field1.setText(set);
			}
		});
		numItem9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "9";
				field1.setText(set);
			}
		});
		numItem9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + "9";
				field1.setText(set);
			}
		});

		numItem10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String set = field1.getText() + ".";
				field1.setText(set);
			}
		});
		tool11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "+";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		tool12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "-";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		tool13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "-";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		tool14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "-";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		SmenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "-";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		SmenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "-";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		SmenuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "*";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		SmenuItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "/";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});

		tool15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				char b = a.charAt(a.length() - 1);
				if (b == '+' || b == '-' || b == '*' || b == '/') {
					field1.setText("");
					JOptionPane.showMessageDialog(null, "마지막에 연산자를 입력하지 마세요");
				} else {
					String data;
					data = field1.getText().toString();
					// 서버와 연결되는 코드들
					try {
						Socket socket = null;
						socket = new Socket("127.0.0.1", 10001);
						OutputStream stream = socket.getOutputStream();
						BufferedOutputStream out = new BufferedOutputStream(stream);
						byte[] bytes = data.getBytes();
						out.write(bytes);
						out.close();
						socket.close();
						// 결과 받기
						socket = new Socket("127.0.0.1", 10001);
						InputStream in = socket.getInputStream();
						DataInputStream dis = new DataInputStream(in);
						// 데이터를 꺼내기
						String getStr = dis.readUTF();
						data = getStr;
						field1.setText(data);
						dis.close();
						in.close();
						socket.close();
						System.out.println("Client : 받은 데이터 ----> " + getStr);
					} catch (Exception ee) {
					}
				}
			}
		});
		ResultItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a = field1.getText().toString();
				char b = a.charAt(a.length() - 1);
				if (b == '+' || b == '-' || b == '*' || b == '/') {
					field1.setText("");
					JOptionPane.showMessageDialog(null, "마지막에 연산자를 입력하지 마세요");
				} else {
					String data;
					data = field1.getText().toString();
					// 서버와 연결되는 코드들
					try {
						Socket socket = null;
						socket = new Socket("127.0.0.1", 10001);
						OutputStream stream = socket.getOutputStream();
						BufferedOutputStream out = new BufferedOutputStream(stream);
						byte[] bytes = data.getBytes();
						out.write(bytes);
						out.close();
						socket.close();
						// 결과 받기
						socket = new Socket("127.0.0.1", 10001);
						InputStream in = socket.getInputStream();
						DataInputStream dis = new DataInputStream(in);
						// 데이터를 꺼내기
						String getStr = dis.readUTF();
						data = getStr;
						field1.setText(data);
						dis.close();
						in.close();
						socket.close();
						System.out.println("Client : 받은 데이터 ----> " + getStr);
					} catch (Exception ee) {
					}
				}
			}
		});

		btn1 = new JButton("+");
		btn1.setBounds(370, 130, 100, 50);
		pane.add(btn1);
		btn1.setBackground(new Color(212, 244, 250));
		btn2 = new JButton("-");
		btn2.setBounds(370, 200, 100, 50);
		btn2.setBackground(new Color(212, 244, 250));
		pane.add(btn2);
		btn3 = new JButton("*");
		btn3.setBounds(370, 270, 100, 50);
		btn3.setBackground(new Color(212, 244, 250));
		pane.add(btn3);
		btn4 = new JButton("/");
		btn4.setBounds(370, 340, 100, 50);
		btn4.setBackground(new Color(212, 244, 250));
		pane.add(btn4);
		btn5 = new JButton("1");
		btn5.setBounds(10, 130, 100, 50);
		btn5.setBackground(new Color(212, 244, 250));
		pane.add(btn5);
		btn6 = new JButton("2");
		btn6.setBounds(130, 130, 100, 50);
		btn6.setBackground(new Color(212, 244, 250));
		pane.add(btn6);
		btn7 = new JButton("3");
		btn7.setBounds(250, 130, 100, 50);
		btn7.setBackground(new Color(212, 244, 250));
		pane.add(btn7);
		btn8 = new JButton("4");
		btn8.setBounds(10, 200, 100, 50);
		btn8.setBackground(new Color(212, 244, 250));
		pane.add(btn8);
		btn9 = new JButton("5");
		btn9.setBounds(130, 200, 100, 50);
		btn9.setBackground(new Color(212, 244, 250));
		pane.add(btn9);
		btn10 = new JButton("6");
		btn10.setBounds(250, 200, 100, 50);
		btn10.setBackground(new Color(212, 244, 250));
		pane.add(btn10);
		btn11 = new JButton("7");
		btn11.setBounds(10, 270, 100, 50);
		btn11.setBackground(new Color(212, 244, 250));
		pane.add(btn11);
		btn12 = new JButton("8");
		btn12.setBounds(130, 270, 100, 50);
		btn12.setBackground(new Color(212, 244, 250));
		pane.add(btn12);
		btn13 = new JButton("9");
		btn13.setBounds(250, 270, 100, 50);
		btn13.setBackground(new Color(212, 244, 250));
		pane.add(btn13);
		btn14 = new JButton("0");
		btn14.setBounds(130, 340, 100, 50);
		btn14.setBackground(new Color(212, 244, 250));
		pane.add(btn14);
		btn15 = new JButton("C");
		btn15.setBounds(10, 340, 100, 50);
		btn15.setBackground(new Color(212, 244, 250));
		pane.add(btn15);
		btn16 = new JButton("←");
		btn16.setBounds(250, 340, 100, 50);
		btn16.setBackground(new Color(212, 244, 250));
		pane.add(btn16);
		label1 = new JLabel("");
		label1.setBounds(10, 10, 150, 50);
		pane.add(label1);
		field1 = new JTextField(10);
		field1.setBounds(20, 50, 330, 50);
		field1.setEditable(false);
		pane.add(field1);
		btn = new JButton("=");
		btn.setBounds(370, 50, 100, 50);
		btn.setBackground(new Color(212, 244, 250));
		pane.add(btn);
		// 버튼에 리스너 만들기
		btn.addActionListener(new ActionListener() { // 여기에 다 때려박는거임

			public void actionPerformed(ActionEvent e) {
				String a = field1.getText().toString();
				char b = a.charAt(a.length() - 1);
				if (b == '+' || b == '-' || b == '*' || b == '/') {
					field1.setText("");
					JOptionPane.showMessageDialog(null, "마지막에 연산자를 입력하지 마세요");
				} else {
					String data;
					data = field1.getText().toString();
					// 서버와 연결되는 코드들
					try {
						Socket socket = null;
						socket = new Socket("127.0.0.1", 10001);
						OutputStream stream = socket.getOutputStream();
						BufferedOutputStream out = new BufferedOutputStream(stream);
						byte[] bytes = data.getBytes();
						out.write(bytes);
						out.close();
						socket.close();
						// 결과 받기
						socket = new Socket("127.0.0.1", 10001);
						InputStream in = socket.getInputStream();
						DataInputStream dis = new DataInputStream(in);
						// 데이터를 꺼내기
						String getStr = dis.readUTF();
						data = getStr;
						field1.setText(data);
						dis.close();
						in.close();
						socket.close();
						System.out.println("Client : 받은 데이터 ----> " + getStr);
					} catch (Exception ee) {
					}
				}
			}
		});
		btn1.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는

				String a = field1.getText().toString(); // string으로 field1을 불러온다
				int len = a.length(); // 배열을 a로 정의하고
				if (len == 0) { // 배열의 길이가 0일경우 아무것도 하지 않는다
				} else { // 그게 아닐경우 배열의 마지막 문자가 +나 -나 *나 /가 아닐경우 +를 써주고 이 반대
							// 경우일때는 다시 if로 돌아간다.
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "+";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		btn2.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "-";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		btn3.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "*";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		btn4.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는

				String a = field1.getText().toString();
				int len = a.length();
				if (len == 0) {
				} else {
					char b = a.charAt(a.length() - 1);
					if (b != '+' && b != '-' && b != '*' && b != '/') {
						String set = field1.getText() + "/";
						field1.setText(set);
					} else {
						JOptionPane.showMessageDialog(null, "연속으로 연산자를 입력하지 마세요");
					}
				}
			}
		});
		btn5.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "1";
				field1.setText(set);
			}
		});
		btn6.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "2";
				field1.setText(set);
			}
		});
		btn7.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "3";
				field1.setText(set);
			}
		});
		btn8.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "4";
				field1.setText(set);
			}
		});
		btn9.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "5";
				field1.setText(set);
			}
		});
		btn10.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "6";
				field1.setText(set);
			}
		});
		btn11.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "7";
				field1.setText(set);
			}
		});
		btn12.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "8";
				field1.setText(set);
			}
		});
		btn13.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText() + "9";
				field1.setText(set);
			}
		});
		btn14.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String a = field1.getText().toString();
				int len = a.length(); // field1의 배열 선언
				if (len == 0) {
				} // 배열의 길이가 0일경우 아무것도 안 한다.
				else { // 그게 아닐경우
					String set = field1.getText() + "0";
					field1.setText(set);
				}
			}
		});
		btn15.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				field1.setText(""); // 텍스트창 내용 지우고 0출력
			}
		});
		btn16.addActionListener(new ActionListener() { // 여기에 다 때려박는거임
			public void actionPerformed(ActionEvent e) { // 버튼을 누르면 이 부분이 실행되는
				String set = field1.getText();
				int len = set.length();
				set = set.substring(0, len - 1);
				field1.setText(set);
			}
		});
		/////////////////////
		setSize(512, 470);
		setVisible(true);
	}
}