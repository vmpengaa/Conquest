package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameplayWindow {

	private JFrame frmConquest;
	private JTextField txtArtillery;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameplayWindow window = new GameplayWindow();
					window.frmConquest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameplayWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConquest = new JFrame();
		frmConquest.setTitle("Conquest\r\n");
		frmConquest.setBounds(100, 100, 700, 390);
		frmConquest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConquest.getContentPane().setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("ActualityWire\r\n");
		internalFrame.setBorder(new LineBorder(new Color(0, 0, 0)));
		internalFrame.setFrameIcon(null);
		internalFrame.setBounds(0, 11, 183, 86);
		frmConquest.getContentPane().add(internalFrame);
		
		JInternalFrame internalFrame_1 = new JInternalFrame("MiniMap");
		internalFrame_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		internalFrame_1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		internalFrame_1.setToolTipText("MiniMap\r\n");
		internalFrame_1.setFrameIcon(null);
		internalFrame_1.setBounds(501, 212, 183, 140);
		frmConquest.getContentPane().add(internalFrame_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		desktopPane.setBackground(Color.WHITE);
		desktopPane.setBounds(0, 281, 158, 71);
		frmConquest.getContentPane().add(desktopPane);
		
		txtArtillery = new JTextField();
		txtArtillery.setHorizontalAlignment(SwingConstants.CENTER);
		txtArtillery.setText("Artillery");
		txtArtillery.setBounds(0, 0, 158, 20);
		desktopPane.add(txtArtillery);
		txtArtillery.setColumns(10);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMenu.setBounds(606, 0, 68, 15);
		frmConquest.getContentPane().add(btnMenu);
		
		JButton btnNewButton = new JButton("Help\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(529, 0, 68, 15);
		frmConquest.getContentPane().add(btnNewButton);
		internalFrame_1.setVisible(true);
		internalFrame.setVisible(true);
	}
}
