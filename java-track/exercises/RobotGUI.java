import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class RobotGUI {

	private DefaultListModel<Robot> bots;// = new ArrayList<Robot>();
	private JList list;
	private JFrame frame;
	private JTextField tfDirection;
	private JTextField tfDirection1;
	private JTextField tfY;
	private JTextField tfY1;
	private JTextField tfX;
	private JTextField tfX1;
	private JTextField tfSpeed;
	private JTextField tfSpeed1;
	private JTextField tfDistance;
	private JLabel lblRobotDetailName;
	private JLabel lblLocation;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblSpeed;
	private JLabel lblDirection;
	private JLabel lblRobotDetailName1;
	private JLabel lblLocation1;
	private JLabel lblX1;
	private JLabel lblY1;
	private JLabel lblSpeed1;
	private JLabel lblDirection1;
	private JButton btnDistanceFromAnother;

	public void createTestData() {
		Robot r = new Robot("Sarge", new int[]{0, 0}, 10, 90);
		Robot s = new Robot("Siri", new int[]{1, 1}, 8, 0);
		Robot t = new Robot("Tex", new int[]{-1, 1}, 5, 180);
		Robot u = new Robot("UbuntuBot", new int[]{-1, -1}, 6, 270);
		Robot v = new Robot("Victor", new int[]{1, -1}, 12, 90);
//		for (int i = 0; i < 3; ++i) {
			bots.add(bots.size(), r);
			bots.add(bots.size(), s);
			bots.add(bots.size(), t);
			bots.add(bots.size(), u);
			bots.add(bots.size(), v);			
//		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RobotGUI window = new RobotGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RobotGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		int frameWidth = 650;
		int frameHeight = 250;
		
		frame = new JFrame();
		frame.setBounds(400, 250, frameWidth, frameHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		bots = new DefaultListModel<Robot>();
		createTestData();
		
		lblRobotDetailName = new JLabel("");
		lblRobotDetailName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblRobotDetailName.setBounds(23, 241, 240, 29);
		lblRobotDetailName.setVisible(false);
		frame.getContentPane().add(lblRobotDetailName);
		
		lblLocation = new JLabel("Location");
		lblLocation.setBounds(30, 280, 61, 16);
		lblLocation.setVisible(false);
		frame.getContentPane().add(lblLocation);
		
		
		lblX = new JLabel("x");
		lblX.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblX.setBounds(90, 276, 12, 12);
		lblX.setVisible(false);
		frame.getContentPane().add(lblX);

		tfX = new JTextField();
		tfX.setHorizontalAlignment(SwingConstants.RIGHT);
		tfX.setBounds(96, 276, 44, 26);
		tfX.setColumns(10);
		tfX.setVisible(false);
		frame.getContentPane().add(tfX);
		
		
		lblY = new JLabel("y");
		lblY.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblY.setBounds(150, 276, 12, 12);
		lblY.setVisible(false);
		frame.getContentPane().add(lblY);

		tfY = new JTextField();
		tfY.setHorizontalAlignment(SwingConstants.RIGHT);
		tfY.setBounds(156, 276, 44, 26);
		tfY.setColumns(10);
		tfY.setVisible(false);
		frame.getContentPane().add(tfY);

		
		lblSpeed = new JLabel("speed");
		lblSpeed.setBounds(240, 280, 40, 16);
		lblSpeed.setVisible(false);
		frame.getContentPane().add(lblSpeed);
		
		tfSpeed = new JTextField();
		tfSpeed.setHorizontalAlignment(SwingConstants.RIGHT);
		tfSpeed.setBounds(276, 276, 54, 26);
		tfSpeed.setColumns(10);
		tfSpeed.setVisible(false);
		frame.getContentPane().add(tfSpeed);

		
		lblDirection = new JLabel("direction");
		lblDirection.setBounds(370, 280, 60, 16);
		lblDirection.setVisible(false);
		frame.getContentPane().add(lblDirection);
		
		tfDirection = new JTextField();
		tfDirection.setHorizontalAlignment(SwingConstants.RIGHT);
		tfDirection.setBounds(424, 276, 75, 26);
		tfDirection.setColumns(10);
		tfDirection.setVisible(false);
		frame.getContentPane().add(tfDirection);

		
		
		lblRobotDetailName1 = new JLabel("");
		lblRobotDetailName1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblRobotDetailName1.setBounds(23, 321, 240, 29);
		lblRobotDetailName1.setVisible(false);
		frame.getContentPane().add(lblRobotDetailName1);
		
		lblLocation1 = new JLabel("Location");
		lblLocation1.setBounds(30, 360, 61, 16);
		lblLocation1.setVisible(false);
		frame.getContentPane().add(lblLocation1);
		
		
		lblX1 = new JLabel("x");
		lblX1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblX1.setBounds(90, 356, 12, 12);
		lblX1.setVisible(false);
		frame.getContentPane().add(lblX1);

		tfX1 = new JTextField();
		tfX1.setHorizontalAlignment(SwingConstants.RIGHT);
		tfX1.setBounds(96, 356, 44, 26);
		tfX1.setColumns(10);
		tfX1.setVisible(false);
		frame.getContentPane().add(tfX1);
		
		
		lblY1 = new JLabel("y");
		lblY1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblY1.setBounds(150, 356, 12, 12);
		lblY1.setVisible(false);
		frame.getContentPane().add(lblY1);

		tfY1 = new JTextField();
		tfY1.setHorizontalAlignment(SwingConstants.RIGHT);
		tfY1.setBounds(156, 356, 44, 26);
		tfY1.setColumns(10);
		tfY1.setVisible(false);
		frame.getContentPane().add(tfY1);

		
		lblSpeed1 = new JLabel("speed");
		lblSpeed1.setBounds(240, 360, 40, 16);
		lblSpeed1.setVisible(false);
		frame.getContentPane().add(lblSpeed1);
		
		tfSpeed1 = new JTextField();
		tfSpeed1.setHorizontalAlignment(SwingConstants.RIGHT);
		tfSpeed1.setBounds(276, 356, 54, 26);
		tfSpeed1.setColumns(10);
		tfSpeed1.setVisible(false);
		frame.getContentPane().add(tfSpeed1);

		
		lblDirection1 = new JLabel("direction");
		lblDirection1.setBounds(370, 360, 60, 16);
		lblDirection1.setVisible(false);
		frame.getContentPane().add(lblDirection1);
		
		tfDirection1 = new JTextField();
		tfDirection1.setHorizontalAlignment(SwingConstants.RIGHT);
		tfDirection1.setBounds(424, 356, 75, 26);
		tfDirection1.setColumns(10);
		tfDirection1.setVisible(false);
		frame.getContentPane().add(tfDirection1);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(172, 64, 455, 140);
		frame.getContentPane().add(scrollPane);
		JList list = new JList(bots);
		scrollPane.setViewportView(list);
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int selected = list.getSelectedIndex();
				frame.setSize(frameWidth, frameHeight + 100);
				lblRobotDetailName.setText(bots.get(selected).getName());
				tfX.setText("" + bots.get(selected).getX());
				tfY.setText("" + bots.get(selected).getY());
				tfSpeed.setText("" + bots.get(selected).getSpeed());
				int dir = bots.get(selected).getOrientation();
				String dirStr = "";
				switch (dir) {
				case 90:
					dirStr = "North";
					break;
				case 270:
					dirStr = "South";
					break;
				case 0:
					dirStr = "East";
					break;
				case 180:
					dirStr = "West";
					break;
				}
				tfDirection.setText(dirStr);
				
				show();
			}
		});

		
		
		
		/**
		 * Instantiates the DISTANCE button
		 */
		btnDistanceFromAnother = new JButton("distance from bot");
		btnDistanceFromAnother.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int selected = list.getSelectedIndex();
				int index = get2ndRobot(bots);
				Robot r = bots.getElementAt(index);
				
				frame.setSize(frameWidth, frameHeight + 200);
				lblRobotDetailName1.setText(r.getName());
				tfX1.setText("" + r.getX());
				tfY1.setText("" + r.getY());
				tfSpeed1.setText("" + r.getSpeed());
				int dir = r.getOrientation();
				String dirStr = "";
				switch (dir) {
				case 90:
					dirStr = "North";
					break;
				case 270:
					dirStr = "South";
					break;
				case 0:
					dirStr = "East";
					break;
				case 180:
					dirStr = "West";
					break;
				}
				tfDirection1.setText(dirStr);
				
				show1s();
				
				double dist = r.distanceFromRobot(bots.get(selected));
				dist = (Math.round(dist * 100000.0)) / 100000.0;
				tfDistance.setText("" + dist);
				
			}
		});
		btnDistanceFromAnother.setBounds(370, 216, 150, 29);
		btnDistanceFromAnother.setVisible(false);
		frame.getContentPane().add(btnDistanceFromAnother);
		
		tfDistance = new JTextField();
		tfDistance.setHorizontalAlignment(SwingConstants.RIGHT);
		tfDistance.setBounds(518, 216, 108, 26);
		tfDistance.setVisible(false);
		frame.getContentPane().add(tfDistance);
		tfDistance.setColumns(10);
		
		
		
		
		/**
		 * Instantiates the MAKE-A-BOT button
		 */
		JButton btnNewButton = new JButton("make a bot");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setSize(frameWidth, frameHeight);
				
				hide();
				hide1s();
				
				String name = getNewRobotName();
				int x = getNewRobotX();
				int y = getNewRobotY();
				int speed = getNewRobotSpeed();
				int orientation = getNewRobotOrientation();
				Robot r = new Robot(name, new int[]{x, y}, speed, orientation);
				bots.add(bots.size(), r);
				list.setSelectedIndex(bots.size());
			}
		});
		btnNewButton.setBounds(6, 60, 150, 29);
		frame.getContentPane().add(btnNewButton);
		

		
		
		/**
		 * Instantiates the ROTATION button
		 */
		JButton btnRotateABot = new JButton("rotate a bot");
		btnRotateABot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setSize(frameWidth, frameHeight +100);
				
				hide1s();
				
				int selected = list.getSelectedIndex();
				if (selected == -1) {
					return;
				}
				Robot r = bots.get(selected);

				int left = turn();
				
				if (left == 1) {
					r.rotate(90);
				}
				else {
					r.rotate(270);
				}

				int dir = r.getOrientation();
				String dirStr = "";
				switch (dir) {
				case 90:
					dirStr = "North";
					break;
				case 270:
					dirStr = "South";
					break;
				case 0:
					dirStr = "East";
					break;
				case 180:
					dirStr = "West";
					break;
				}
				tfDirection.setText(dirStr);
				
			}
		});
		btnRotateABot.setBounds(6, 120, 150, 29);
		frame.getContentPane().add(btnRotateABot);
		

		
		
		/**
		 * Instantiates the MOVEMENT button
		 */
		JButton btnMoveABot = new JButton("move a bot");
		btnMoveABot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setSize(frameWidth, frameHeight +100);
				
				hide1s();
				
				int selected = list.getSelectedIndex();
				if (selected == -1) {
					return;
				}
				bots.get(selected).move();
				tfX.setText("" + bots.get(selected).getX());
				tfY.setText("" + bots.get(selected).getY());
				
			}
		});
		btnMoveABot.setBounds(6, 90, 150, 29);
		frame.getContentPane().add(btnMoveABot);
		
		
		
		
		/**
		 * Instantiates the EXIT button
		 */
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(6, 180, 150, 29);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("R  O  B  O  T  S  !");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel.setBounds(12, 12, 240, 30);
		frame.getContentPane().add(lblNewLabel);
	}
	
	
	
	
	public String getNewRobotName() {
		return (String)JOptionPane.showInputDialog(
				frame,
				"Robot's Name:  ",
				"Name Dialog", JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				"");
	}
	
	public int getNewRobotX() {
		String s = (String)JOptionPane.showInputDialog(
				frame,
				"Robot's Starting X-Coordinate:  ",
				"Position Dialog", JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				"");
		int x = Integer.parseInt(s);
		return x;
	}
	
	public int getNewRobotY() {
		String s = (String)JOptionPane.showInputDialog(
				frame,
				"Robot's Starting Y-Coordinate:  ",
				"Position Dialog", JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				"");
		int y = Integer.parseInt(s);
		return y;
	}

	public int getNewRobotSpeed() {
		String s = (String)JOptionPane.showInputDialog(
				frame,
				"Robot's Speed:  ",
				"Speed Dialog", JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				"");
		int speed = Integer.parseInt(s);
		while (speed < 0) {
			s = (String)JOptionPane.showInputDialog(
					frame,
					"Robot's Speed:  (please enter a positive value)",
					"Speed Dialog", JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
			speed = Integer.parseInt(s);
		}
		return speed;		
	}

	public int getNewRobotOrientation() {
		String s = (String)JOptionPane.showInputDialog(
					frame,
					"Robot's Orientation (0, 90, 180, 270):  ",
					"Speed Dialog", JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
		int orientation = Integer.parseInt(s);
		while ((orientation != 0) && (orientation != 90) && (orientation != 180) && (orientation != 270)) {
			s = (String)JOptionPane.showInputDialog(
					frame,
					"Robot's Orientation (0, 90, 180, 270):  ",
					"Orientation Dialog", JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
			orientation = Integer.parseInt(s);
		}
		return orientation;
	}
	
	
	public int get2ndRobot(DefaultListModel<Robot> bots) {
		
		String[] options = new String[bots.size()];
		
		for (int i = 0; i < bots.size(); ++i) {
			options[i] = bots.get(i).getName();
		}
		
		String s = (String)JOptionPane.showInputDialog(
				frame,
				"Get selected robot's distance from:",
				"Get Second Robot", JOptionPane.PLAIN_MESSAGE,
				null,
				options,
				options[0]);
		
		int index = -1;
		
		for (int i = 0; i < options.length; ++i) {
			if (options[i] == s) {
				index = i;
			}
		}

		return index;
	}
	
	public int turn() {
		
		 Object[] options = { "Right", "Left" };

		int s1 = JOptionPane.showOptionDialog(
				frame,
				"Turn direction:",
				"Rotation Dialog", JOptionPane.YES_NO_OPTION,
				-1,
				null,
				options,
				options[0]);
			
		 return s1;
	}
	
	public void hide() {
		lblRobotDetailName.setVisible(false);
		lblLocation.setVisible(false);
		lblX.setVisible(false);
		tfX.setVisible(false);
		lblY.setVisible(false);
		tfY.setVisible(false);
		lblSpeed.setVisible(false);
		tfSpeed.setVisible(false);
		lblDirection.setVisible(false);
		tfDirection.setVisible(false);
		btnDistanceFromAnother.setVisible(false);
		tfDistance.setVisible(false);		
	}
	
	public void show() {
		lblRobotDetailName.setVisible(true);
		lblLocation.setVisible(true);
		lblX.setVisible(true);
		tfX.setVisible(true);
		lblY.setVisible(true);
		tfY.setVisible(true);
		lblSpeed.setVisible(true);
		tfSpeed.setVisible(true);
		lblDirection.setVisible(true);
		tfDirection.setVisible(true);
		btnDistanceFromAnother.setVisible(true);
		tfDistance.setVisible(true);
	}
	
	public void hide1s() {
		lblRobotDetailName1.setVisible(false);
		lblLocation1.setVisible(false);
		lblX1.setVisible(false);
		tfX1.setVisible(false);
		lblY1.setVisible(false);
		tfY1.setVisible(false);
		lblSpeed1.setVisible(false);
		tfSpeed1.setVisible(false);
		lblDirection1.setVisible(false);
		tfDirection1.setVisible(false);
	}
	
	public void show1s() {
		lblRobotDetailName1.setVisible(true);
		lblLocation1.setVisible(true);
		lblX1.setVisible(true);
		tfX1.setVisible(true);
		lblY1.setVisible(true);
		tfY1.setVisible(true);
		lblSpeed1.setVisible(true);
		tfSpeed1.setVisible(true);
		lblDirection1.setVisible(true);
		tfDirection1.setVisible(true);
	}
	
}
