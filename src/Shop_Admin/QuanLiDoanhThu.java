package Shop_Admin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import View.Customer_information;
import View.Manager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;

public class QuanLiDoanhThu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private static final String URL = "jdbc:mysql://localhost:3306/shop";
    private static final String USER = "root";
    private static final String PASSWORD = "11062005";
    private JTable table;
    
    public QuanLiDoanhThu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1051, 659);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 993, 725);

        // Add the panel to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 0, 1037, 622); // Adjust this size as needed
        contentPane.add(scrollPane);

        // Set preferred size for panel to ensure scroll bars appear
        panel.setPreferredSize(new Dimension(993, 1500)); // Change height as needed
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 0, 234, 606);
        panel_1.setBackground(new Color(255, 0, 0));
        panel.add(panel_1);
        panel_1.setLayout(null);

        JButton btnNewButton_1 = new JButton("Báo Cáo Doanh Thu");
        btnNewButton_1.setBounds(0, 304, 234, 49);
        panel_1.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                QuanLiDoanhThu quanLiDoanhThuFrame = new QuanLiDoanhThu();
                dispose();
                quanLiDoanhThuFrame.setVisible(true);
                setLocationRelativeTo(null);
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setOpaque(true);
        btnNewButton_1.setContentAreaFilled(true);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setBackground(new Color(255, 166, 0));

        JButton btnNewButton_3 = new JButton("Quản Lí Đơn Hàng");
        btnNewButton_3.setBounds(0, 245, 234, 49);
        panel_1.add(btnNewButton_3);
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                QuanLiDonHang quanLiDonHangFrame = new QuanLiDonHang();
                quanLiDonHangFrame.setVisible(true);
            }
        });
        btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setOpaque(true);
        btnNewButton_3.setContentAreaFilled(true);
        btnNewButton_3.setBorderPainted(false);
        btnNewButton_3.setBackground(new Color(202, 83, 53));

        JButton btnNewButton = new JButton("Quản Lí Khách Hàng");
        btnNewButton.setBounds(0, 181, 234, 49);
        panel_1.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Customer_information customer_information = new Customer_information();
                dispose();
                customer_information.setVisible(true);
                setLocationRelativeTo(null);
            }
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton.setBackground(new Color(248, 103, 7)); // Set background color to red
        btnNewButton.setOpaque(true); // Ensure the button is opaque
        btnNewButton.setBorderPainted(false); // Optional: remove border
        btnNewButton.setContentAreaFilled(true);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\Header-Logo1500994616801 (1) (1).png"));
        lblNewLabel.setBounds(53, 10, 121, 94);
        panel_1.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Quang Huy");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(42, 95, 132, 22);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Chào mừng bạn trở lại");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(27, 114, 159, 22);
        panel_1.add(lblNewLabel_2);

        JButton btnNewButton_1_1 = new JButton("Thoát");
        btnNewButton_1_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		Manager manager = new Manager();
        		dispose();
        		manager.setVisible(true);
        		setLocationRelativeTo(null);
        	}
        });
        btnNewButton_1_1.setOpaque(true);
        btnNewButton_1_1.setForeground(Color.WHITE);
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_1_1.setContentAreaFilled(true);
        btnNewButton_1_1.setBorderPainted(false);
        btnNewButton_1_1.setBackground(new Color(197, 141, 58));
        btnNewButton_1_1.setBounds(0, 363, 234, 49);
        panel_1.add(btnNewButton_1_1);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(243, 0, 775, 36);
        panel_2.setBackground(new Color(255, 0, 0));
        panel.add(panel_2);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(192, 192, 192));
        panel_3.setBounds(243, 38, 787, 568);
        panel.add(panel_3);
        panel_3.setLayout(null);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(255, 0, 0));
        panel_4.setBounds(10, 10, 10, 38);
        panel_3.add(panel_4);

        JPanel panel_5 = new JPanel();
        panel_5.setBounds(21, 10, 556, 38);
        panel_3.add(panel_5);
        panel_5.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("Tổng Doanh Thu");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(54, 0, 184, 38);
        panel_5.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-sales-performance-48.png"));
        lblNewLabel_4.setBounds(4, 0, 45, 38);
        panel_5.add(lblNewLabel_4);

        JButton btnNewButton_2 = new JButton("Làm Mới");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		btnNewButton_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Ẩn frame hiện tại
                        setVisible(false);
                        // Tạo một frame mới của cùng một class
                        QuanLiDonHang newFrame = new QuanLiDonHang();
                        newFrame.setVisible(true);
                    }
                });
        	}
        });
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_2.setBackground(new Color(0, 255, 0));
        btnNewButton_2.setBounds(574, 10, 96, 38);
        panel_3.add(btnNewButton_2);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 80, 752, 69);
        panel_3.add(scrollPane_1);

        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "Gi\u00E0y", "B\u00F3ng \u0110\u00E1", "\u00C1o Qu\u1EA7n", "Ph\u1EE5 Ki\u1EC7n", "T\u1ED5ng"
            }
        ));
        scrollPane_1.setViewportView(table);
        
        JButton btnNewButton_2_1 = new JButton("In file");
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_2_1.setBackground(new Color(255, 128, 0));
        btnNewButton_2_1.setBounds(666, 10, 96, 38);
        panel_3.add(btnNewButton_2_1);

        // Set ActionListener for the "In file" button
        btnNewButton_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exportTableToCSV(table, "doanhthu.csv");
            }
        });

        hienThiDuLieu();
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_2_1.setBackground(new Color(255, 128, 0));
        btnNewButton_2_1.setBounds(666, 10, 96, 38);
        panel_3.add(btnNewButton_2_1);
       

        // Create a ButtonGroup and add the checkboxes to it
        ButtonGroup group = new ButtonGroup();
        ButtonGroup group1 = new ButtonGroup();
        ButtonGroup group2 = new ButtonGroup();
        ButtonGroup group3 = new ButtonGroup();
        ButtonGroup group4 = new ButtonGroup();
        ButtonGroup group5 = new ButtonGroup();
        ButtonGroup group6 = new ButtonGroup();
        ButtonGroup group7 = new ButtonGroup();
    }

    private double layTongGiaTienCart(String tableName) {
        double tongGia = 0.0;
        String query = "SELECT SUM(price) FROM " + tableName; // Assuming the column name for price is 'price'

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                tongGia = rs.getDouble(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tongGia;
    }
    //in file
    private void exportTableToCSV(JTable table, String filename) {
        try {
            FileWriter csvWriter = new FileWriter(filename);

            // Write column headers
            for (int i = 0; i < table.getColumnCount(); i++) {
                csvWriter.append(table.getColumnName(i));
                if (i < table.getColumnCount() - 1) {
                    csvWriter.append(",");
                }
            }
            csvWriter.append("\n");

            // Write table data
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    csvWriter.append(model.getValueAt(row, col).toString());
                    if (col < model.getColumnCount() - 1) {
                        csvWriter.append(",");
                    }
                }
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();

            JOptionPane.showMessageDialog(this, "Dữ liệu đã được xuất ra file " + filename + " thành công!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void hienThiDuLieu() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear the table before adding new data

        double tongGiaGiay = layTongGiaTienCart("cart_giay");
        double tongGiaBongDa = layTongGiaTienCart("cart_bongda");
        double tongGiaAoQuan = layTongGiaTienCart("cart_aoquan");
        double tongGiaPhuKien = layTongGiaTienCart("cart_phukien");
        double tongTien = tongGiaGiay + tongGiaBongDa + tongGiaAoQuan + tongGiaPhuKien;

        model.addRow(new Object[] { tongGiaGiay, tongGiaBongDa, tongGiaAoQuan, tongGiaPhuKien, tongTien });
    }
}
