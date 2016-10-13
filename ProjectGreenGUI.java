import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ProjectGreenGUI extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTable table;
    private JTable table_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    ProjectGreenGUI frame = new ProjectGreenGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ProjectGreenGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 774, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setBounds(45, 40, 116, 22);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(250, 40, 116, 22);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblRoadWidthm = new JLabel("Road Length (m)");
        lblRoadWidthm.setBounds(45, 75, 116, 16);
        contentPane.add(lblRoadWidthm);

        JLabel lblCarsPerDay = new JLabel("Cars per day");
        lblCarsPerDay.setBounds(250, 75, 116, 16);
        contentPane.add(lblCarsPerDay);

        JLabel lblInstallationCost = new JLabel("Installation Cost:");
        lblInstallationCost.setBounds(45, 115, 116, 16);
        contentPane.add(lblInstallationCost);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(148, 115, 161, 16);
        contentPane.add(lblNewLabel);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lblNewLabel.setText("One Biiilllliioonn Dollars");
                Object[] col = {"", "Year 1", "Year 2", "Year 3"};
                Object[][] row = {
                    {"Profits", "-2345", "-1121", "254"},
                    {"Electricity (kWH)", "221", "335", "234"},
                };

                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setBounds(43, 207, 653, 271);
                contentPane.add(scrollPane);
                table_1 = new JTable(row, col);
                scrollPane.setViewportView(table_1);
            }
        });
        btnCalculate.setBounds(506, 39, 97, 25);
        contentPane.add(btnCalculate);


    }
}
