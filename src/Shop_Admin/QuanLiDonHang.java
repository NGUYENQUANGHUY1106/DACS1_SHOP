package Shop_Admin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.InputVerifier;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;

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
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Chat_Shop.Server_Chat;
import View.Customer_information;
import View.Manager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;

public class QuanLiDonHang extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private ImageIcon[] images;
    private int currentImageIndex = 0;
    private JLabel lblSlideshow;
    private JTable cart_giay;
    private JTable cart_bongda;
    private JTable cart_aoquan;
    private JTable cart_phukien;
    String url = "jdbc:mysql://localhost:3306/shop";
    String username = "root";
    String password = "11062005";

    private void startChatServer() {
        Thread serverThread = new Thread(() -> {
            Server_Chat.main(new String[]{});
        });
        serverThread.start();
    }

    public QuanLiDonHang() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1323, 750);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 993, 725);

        // Add the panel to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 0, 1309, 1023); // Adjust this size as needed
        contentPane.add(scrollPane);

        // Set preferred size for panel to ensure scroll bars appear
        panel.setPreferredSize(new Dimension(993, 1500)); // Change height as needed
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 0, 190, 1020);
        panel_1.setBackground(new Color(255, 0, 0));
        panel.add(panel_1);
        panel_1.setLayout(null);
        
                JButton btnNewButton_1 = new JButton("Báo Cáo Doanh Thu");
                btnNewButton_1.setBounds(0, 290, 186, 49);
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
                btnNewButton_3.setBounds(0, 231, 186, 49);
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
                        btnNewButton.setBounds(0, 172, 186, 49);
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
                        lblNewLabel.setBounds(26, 10, 121, 94);
                        panel_1.add(lblNewLabel);
                        
                        JLabel lblNewLabel_1 = new JLabel("Quang Huy");
                        lblNewLabel_1.setForeground(new Color(255, 255, 255));
                        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
                        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
                        lblNewLabel_1.setBounds(15, 95, 132, 22);
                        panel_1.add(lblNewLabel_1);
                        
                        JLabel lblNewLabel_2 = new JLabel("Chào mừng bạn trở lại");
                        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
                        lblNewLabel_2.setForeground(new Color(255, 255, 255));
                        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
                        lblNewLabel_2.setBounds(0, 114, 159, 22);
                        panel_1.add(lblNewLabel_2);
                        
                        JButton btnNewButton_1_1 = new JButton("Thoát");
                        btnNewButton_1_1.addMouseListener(new MouseAdapter() {
                        	@Override
                        	public void mouseClicked(MouseEvent e) {
                        	     btnNewButton_1_1.addMouseListener(new MouseAdapter() {
                        	        	@Override
                        	        	public void mouseClicked(MouseEvent e) {
                        	        		Manager manager = new Manager();
                        	        		dispose();
                        	        		manager.setVisible(true);
                        	        		setLocationRelativeTo(null);
                        	        	}
                        	        });
                        	}
                        });
                        btnNewButton_1_1.setOpaque(true);
                        btnNewButton_1_1.setForeground(Color.WHITE);
                        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        btnNewButton_1_1.setContentAreaFilled(true);
                        btnNewButton_1_1.setBorderPainted(false);
                        btnNewButton_1_1.setBackground(new Color(197, 141, 58));
                        btnNewButton_1_1.setBounds(0, 412, 186, 49);
                        panel_1.add(btnNewButton_1_1);
                        
                        JButton btnNewButton_2 = new JButton("Hổ Trợ KH");
                        btnNewButton_2.setBackground(new Color(255, 128, 0));
                        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        btnNewButton_2.setBounds(0, 349, 186, 43);
                        panel_1.add(btnNewButton_2);
                        
                        btnNewButton_2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                
                                startChatServer();
                            }
                        });
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(192, 192, 192));
        panel_3.setBounds(193, 0, 1076, 1020);
        panel.add(panel_3);
        panel_3.setLayout(null);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(255, 0, 0));
        panel_4.setBounds(10, 0, 10, 38);
        panel_3.add(panel_4);
        
        JPanel panel_5 = new JPanel();
        panel_5.setBackground(new Color(255, 0, 0));
        panel_5.setBounds(21, 0, 1045, 32);
        panel_3.add(panel_5);
        panel_5.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("Danh Sách Đơn Hàng");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(54, 0, 184, 38);
        panel_5.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-order-48.png"));
        lblNewLabel_4.setBounds(4, 0, 45, 38);
        panel_5.add(lblNewLabel_4);
        
        JButton btnNewButton_4_3 = new JButton("In file");
        btnNewButton_4_3.setBackground(new Color(0, 255, 128));
        btnNewButton_4_3.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-print-24.png"));
        btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exportTableToCSV(cart_giay, "cart_giay.csv");
                exportTableToCSV(cart_bongda, "cart_bongda.csv");
                exportTableToCSV(cart_aoquan, "cart_aoquan.csv");
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được lưu vào các file CSV.");
            }
        });
        btnNewButton_4_3.setBounds(20, 34, 127, 45);
        panel_3.add(btnNewButton_4_3);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setBounds(20, 58, 45, 38);
        panel_3.add(lblNewLabel_5);
        
        JButton btnNewButton_4_3_1 = new JButton("Xác Nhận");
        btnNewButton_4_3_1.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-accept-24.png"));
        btnNewButton_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_3_1.setBackground(new Color(0, 255, 128));
        btnNewButton_4_3_1.setBounds(176, 34, 127, 45);
        panel_3.add(btnNewButton_4_3_1);
        
        
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(21, 125, 1045, 168);
        panel_3.add(scrollPane_1);
        
        cart_giay = new JTable();
        cart_giay.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cart_giay.setModel(new DefaultTableModel(
                new Object[][] {},
                new String[] { "STT", "Tên Sản Phẩm", "Size", "Số Lượng", "Hình Ảnh", "Giá", "Tên KH", "Email", "SĐT", "Địa Chỉ" }
        ));
        scrollPane_1.setViewportView(cart_giay);

        giay_table(cart_giay); 
     
 
        
        
        
        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(21, 349, 1045, 160);
        panel_3.add(scrollPane_2);
        
        cart_bongda = new JTable();
        cart_bongda.setModel(new DefaultTableModel(
        	new Object[][] {},
        	new String[] {
        		"STT", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Size", "S\u1ED1 L\u01B0\u1EE3ng", "H\u00ECnh \u1EA2nh", "Gi\u00E1", "T\u00EAn KH", "Email", "S\u0110T", "\u0110\u1ECBa Ch\u1EC9"
        	}
        ));     
        scrollPane_2.setViewportView(cart_bongda);
        table_bongda(cart_bongda);
        
        JScrollPane aoquan_table = new JScrollPane();
        aoquan_table.setBounds(21, 573, 1045, 168);
        panel_3.add(aoquan_table);
        
        cart_aoquan = new JTable();
        cart_aoquan.setModel(new DefaultTableModel(
        	new Object[][] {},
        	new String[] {
        		"STT", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Size", "S\u1ED1 L\u01B0\u1EE3ng", "H\u00ECnh \u1EA2nh", "Gi\u00E1", "T\u00EAn KH", "Email", "S\u0110T", "\u0110\u1ECBa Ch\u1EC9"
        	}
        ));
        aoquan_table.setViewportView(cart_aoquan);
        table_aoquan(cart_aoquan);
        
        JButton btnNewButton_4_3_1_1_1 = new JButton("Làm Mới");
        btnNewButton_4_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_3_1_1_1.setBackground(new Color(0, 255, 128));
        btnNewButton_4_3_1_1_1.setBounds(334, 34, 127, 45);
        panel_3.add(btnNewButton_4_3_1_1_1);
        btnNewButton_4_3_1_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                QuanLiDonHang newFrame = new QuanLiDonHang();
                newFrame.setVisible(true);
            }
        });
 
        JScrollPane scrollPane_3_1 = new JScrollPane();
        scrollPane_3_1.setBounds(21, 801, 1045, 190);
        panel_3.add(scrollPane_3_1);
        
        cart_phukien = new JTable();
        cart_phukien.setModel(new DefaultTableModel(
        	new Object[][] {},
        	new String[] {
        		"STT", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Size", "S\u1ED1 L\u01B0\u1EE3ng", "H\u00ECnh \u1EA2nh", "Gi\u00E1", "T\u00EAn KH", "Email", "S\u0110T", "\u0110\u1ECBa Ch\u1EC9"
        	}
        ));
        scrollPane_3_1.setViewportView(cart_phukien);
        table_phukien(cart_phukien);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 0, 0));
        panel_2.setBounds(21, 763, 85, 38);
        panel_3.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_6 = new JLabel("Phụ Kiện");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_6.setBounds(0, 0, 85, 38);
        panel_2.add(lblNewLabel_6);
        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setLayout(null);
        panel_2_1.setBackground(Color.RED);
        panel_2_1.setBounds(21, 536, 85, 38);
        panel_3.add(panel_2_1);
        
        JLabel lblNewLabel_6_1 = new JLabel("Áo quần ");
        lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_6_1.setBounds(0, 0, 85, 38);
        panel_2_1.add(lblNewLabel_6_1);
        
        JPanel panel_2_2 = new JPanel();
        panel_2_2.setLayout(null);
        panel_2_2.setBackground(Color.RED);
        panel_2_2.setBounds(21, 312, 85, 38);
        panel_3.add(panel_2_2);
        
        JLabel bongda_table = new JLabel("Bóng Đá");
        bongda_table.setHorizontalAlignment(SwingConstants.CENTER);
        bongda_table.setFont(new Font("Tahoma", Font.BOLD, 16));
        bongda_table.setBounds(0, 0, 85, 38);
        panel_2_2.add(bongda_table);
        
        JPanel panel_2_3 = new JPanel();
        panel_2_3.setLayout(null);
        panel_2_3.setBackground(Color.RED);
        panel_2_3.setBounds(21, 89, 85, 38);
        panel_3.add(panel_2_3);
        
        JLabel lblNewLabel_6_3 = new JLabel("Giày");
        lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_6_3.setBounds(0, 0, 85, 38);
        panel_2_3.add(lblNewLabel_6_3);
        
       
                
                // Create a ButtonGroup and add the checkboxes to it
                ButtonGroup group = new ButtonGroup();
                
                ButtonGroup group1 = new ButtonGroup();
                
                ButtonGroup group2 = new ButtonGroup();
                
                ButtonGroup group3 = new ButtonGroup();
                
                ButtonGroup group4 = new ButtonGroup();
                
                ButtonGroup group5 = new ButtonGroup();
                
                ButtonGroup group6 = new ButtonGroup();
                
                ButtonGroup group7 = new ButtonGroup();
                
                
                JButton btnNewButton_4_3_1_1_1_1 = new JButton("Hủy Đơn Giày");
                btnNewButton_4_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
                btnNewButton_4_3_1_1_1_1.setBackground(new Color(0, 255, 128));
                btnNewButton_4_3_1_1_1_1.setBounds(939, 82, 127, 45);
                panel_3.add(btnNewButton_4_3_1_1_1_1);
                
                JButton btn_bongda = new JButton("Hủy Đơn Bóng Đá");
                btn_bongda.setFont(new Font("Tahoma", Font.PLAIN, 15));
                btn_bongda.setBackground(new Color(0, 255, 128));
                btn_bongda.setBounds(899, 305, 167, 45);
                panel_3.add(btn_bongda);
                
                JButton btn_aq = new JButton("Hủy Đơn Áo Quần");
                btn_aq.setFont(new Font("Tahoma", Font.PLAIN, 15));
                btn_aq.setBackground(new Color(0, 255, 128));
                btn_aq.setBounds(913, 529, 153, 45);
                panel_3.add(btn_aq);
                
                JButton btn_pk = new JButton("Hủy Phụ Kiện");
                btn_pk.setFont(new Font("Tahoma", Font.PLAIN, 15));
                btn_pk.setBackground(new Color(0, 255, 128));
                btn_pk.setBounds(939, 756, 127, 45);
                panel_3.add(btn_pk);


    // hủy đơn bóng đá
    btn_bongda.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    int selectedRow = cart_bongda.getSelectedRow();
		    if (selectedRow != -1) {
		        int id = (int) cart_bongda.getValueAt(selectedRow, 0);
		        // Hiển thị hộp thoại xác nhận
		        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn hủy đơn này?", "Xác nhận hủy đơn", JOptionPane.YES_NO_OPTION);
		        if (choice == JOptionPane.YES_OPTION) {
		            String sql = "DELETE FROM cart_bongda WHERE id = ?";
		            Connection connection = null; // Khởi tạo biến connection
		            PreparedStatement statement = null;
		            try {
		                // Gán giá trị cho biến connection
		                connection = DatabaseConnection.getConnection();
		                statement = connection.prepareStatement(sql);
		                statement.setInt(1, id);
		                statement.executeUpdate();
		                DefaultTableModel model = (DefaultTableModel) cart_bongda.getModel();
		                model.removeRow(selectedRow);
		                JOptionPane.showMessageDialog(null, "Đã hủy đơn thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		            } catch (SQLException ex) {
		                ex.printStackTrace();
		                JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi hủy đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		            } finally {
		                // Đóng connection và statement sau khi sử dụng xong
		                try {
		                    if (statement != null) {
		                        statement.close();
		                    }
		                    if (connection != null) {
		                        connection.close();
		                    }
		                } catch (SQLException ex) {
		                    ex.printStackTrace();
		                }
		            }
		        }
		    } else {
		        JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để hủy đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		    }
		}
		});
    //infile
    
    // hủy đơn phụ kiện 
    
    btn_pk.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    int selectedRow = cart_phukien.getSelectedRow();
		    if (selectedRow != -1) {
		        int id = (int) cart_phukien.getValueAt(selectedRow, 0);
		        // Hiển thị hộp thoại xác nhận
		        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn hủy đơn này?", "Xác nhận hủy đơn", JOptionPane.YES_NO_OPTION);
		        if (choice == JOptionPane.YES_OPTION) {
		            String sql = "DELETE FROM cart_phukien WHERE id = ?";
		            Connection connection = null; // Khởi tạo biến connection
		            PreparedStatement statement = null;
		            try {
		                // Gán giá trị cho biến connection
		                connection = DatabaseConnection.getConnection();
		                statement = connection.prepareStatement(sql);
		                statement.setInt(1, id);
		                statement.executeUpdate();
		                DefaultTableModel model = (DefaultTableModel) cart_phukien.getModel();
		                model.removeRow(selectedRow);
		                JOptionPane.showMessageDialog(null, "Đã hủy đơn thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		            } catch (SQLException ex) {
		                ex.printStackTrace();
		                JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi hủy đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		            } finally {
		                // Đóng connection và statement sau khi sử dụng xong
		                try {
		                    if (statement != null) {
		                        statement.close();
		                    }
		                    if (connection != null) {
		                        connection.close();
		                    }
		                } catch (SQLException ex) {
		                    ex.printStackTrace();
		                }
		            }
		        }
		    } else {
		        JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để hủy đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		    }
		}
		});
    
    // hủy đơn áo quần 
    
    btn_aq.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    int selectedRow = cart_aoquan.getSelectedRow();
		    if (selectedRow != -1) {
		        int id = (int) cart_aoquan.getValueAt(selectedRow, 0);
		        // Hiển thị hộp thoại xác nhận
		        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn hủy đơn này?", "Xác nhận hủy đơn", JOptionPane.YES_NO_OPTION);
		        if (choice == JOptionPane.YES_OPTION) {
		            String sql = "DELETE FROM cart_aoquan WHERE id = ?";
		            Connection connection = null; // Khởi tạo biến connection
		            PreparedStatement statement = null;
		            try {
		                // Gán giá trị cho biến connection
		                connection = DatabaseConnection.getConnection();
		                statement = connection.prepareStatement(sql);
		                statement.setInt(1, id);
		                statement.executeUpdate();
		                DefaultTableModel model = (DefaultTableModel) cart_aoquan.getModel();
		                model.removeRow(selectedRow);
		                JOptionPane.showMessageDialog(null, "Đã hủy đơn thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		            } catch (SQLException ex) {
		                ex.printStackTrace();
		                JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi hủy đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		            } finally {
		                // Đóng connection và statement sau khi sử dụng xong
		                try {
		                    if (statement != null) {
		                        statement.close();
		                    }
		                    if (connection != null) {
		                        connection.close();
		                    }
		                } catch (SQLException ex) {
		                    ex.printStackTrace();
		                }
		            }
		        }
		    } else {
		        JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để hủy đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		    }
		}
		});
}
    
    private static class ImageIconRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            label.setIcon((ImageIcon) value);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            return label;
        }
    }
    class CenterRenderer extends DefaultTableCellRenderer {
        public CenterRenderer() {
            // Đặt căn giữa cho dữ liệu trong các ô của JTable
            setHorizontalAlignment(SwingConstants.CENTER);
        }
    }
    //infile
    private void exportTableToCSV(JTable table, String filename) {
        try {
            FileWriter csvWriter = new FileWriter(filename);

            // Ghi tiêu đề cột
            for (int i = 0; i < table.getColumnCount(); i++) {
                csvWriter.append(table.getColumnName(i));
                if (i < table.getColumnCount() - 1) {
                    csvWriter.append(",");
                }
            }
            csvWriter.append("\n");

            // Ghi dữ liệu từ JTable
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
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 // giày
    private void giay_table(JTable table) {
        String query = "SELECT * FROM cart_giay";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            while (resultSet.next()) {
                byte[] imageData = resultSet.getBytes("image");
                ImageIcon imageIcon = new ImageIcon(imageData);
                
                // Resize the image to the desired size
                Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                ImageIcon resizedImageIcon = new ImageIcon(image);

                Object[] rowData = {
                    resultSet.getInt("id"),
                    resultSet.getString("productName"),
                    resultSet.getString("size"),
                    resultSet.getInt("quantity"),
                    resizedImageIcon,
                    resultSet.getDouble("price"),
                    resultSet.getString("Name"),
                    resultSet.getString("email"),
                    resultSet.getString("sdt"),
                    resultSet.getString("address")
                };
                model.addRow(rowData);
            }
            
            // Set the custom cell renderer for the column containing ImageIcon
            table.getColumnModel().getColumn(4).setCellRenderer(new ImageIconRenderer());
            
            // Set the column width to fit the image size
            table.getColumnModel().getColumn(4).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setMaxWidth(150);
            table.setRowHeight(150); // Set the row height to fit the image size
            
            // Set the row height for the JTable rows
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            int desiredHeight = 70; // Set the desired height
            renderer.setPreferredSize(new Dimension(0, desiredHeight)); // Set the preferred height
            table.setRowHeight(desiredHeight); // Set the row height for all rows
            
            // Set center alignment for table cells
            DefaultTableCellRenderer centerRenderer = new CenterRenderer();
            table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(8).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(9).setCellRenderer(centerRenderer); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // áo quần
    private void table_aoquan(JTable table) {
        String query = "SELECT * FROM cart_aoquan";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            while (resultSet.next()) {
                byte[] imageData = resultSet.getBytes("image");
                ImageIcon imageIcon = new ImageIcon(imageData);
                
                // Resize the image to the desired size
                Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                ImageIcon resizedImageIcon = new ImageIcon(image);

                Object[] rowData = {
                    resultSet.getInt("id"),
                    resultSet.getString("productName"),
                    resultSet.getString("size"),
                    resultSet.getInt("quantity"),
                    resizedImageIcon,
                    resultSet.getDouble("price"),
                    resultSet.getString("Name"),
                    resultSet.getString("email"),
                    resultSet.getString("sdt"),
                    resultSet.getString("address")
                };
                model.addRow(rowData);
            }
            
            // Set the custom cell renderer for the column containing ImageIcon
            table.getColumnModel().getColumn(4).setCellRenderer(new ImageIconRenderer());
            
            // Set the column width to fit the image size
            table.getColumnModel().getColumn(4).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setMaxWidth(150);
            table.setRowHeight(150); // Set the row height to fit the image size
            
            // Set the row height for the JTable rows
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            int desiredHeight = 150; // Set the desired height
            renderer.setPreferredSize(new Dimension(0, desiredHeight)); // Set the preferred height
            table.setRowHeight(desiredHeight); // Set the row height for all rows
            
            // Set center alignment for table cells
            DefaultTableCellRenderer centerRenderer = new CenterRenderer();
            table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(8).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(9).setCellRenderer(centerRenderer); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// phụ kiện
    private void table_phukien(JTable table) {
        String query = "SELECT * FROM cart_phukien";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            while (resultSet.next()) {
                byte[] imageData = resultSet.getBytes("image");
                ImageIcon imageIcon = new ImageIcon(imageData);
                
                // Resize the image to the desired size
                Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                ImageIcon resizedImageIcon = new ImageIcon(image);

                Object[] rowData = {
                    resultSet.getInt("id"),
                    resultSet.getString("productName"),
                    resultSet.getString("size"),
                    resultSet.getInt("quantity"),
                    resizedImageIcon,
                    resultSet.getDouble("price"),
                    resultSet.getString("Name"),
                    resultSet.getString("email"),
                    resultSet.getString("sdt"),
                    resultSet.getString("address")
                };
                model.addRow(rowData);
            }
            
            // Set the custom cell renderer for the column containing ImageIcon
            table.getColumnModel().getColumn(4).setCellRenderer(new ImageIconRenderer());
            
            // Set the column width to fit the image size
            table.getColumnModel().getColumn(4).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setMaxWidth(150);
            table.setRowHeight(150); // Set the row height to fit the image size
            
            // Set the row height for the JTable rows
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            int desiredHeight = 150; // Set the desired height
            renderer.setPreferredSize(new Dimension(0, desiredHeight)); // Set the preferred height
            table.setRowHeight(desiredHeight); // Set the row height for all rows
            
            // Set center alignment for table cells
            DefaultTableCellRenderer centerRenderer = new CenterRenderer();
            table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(8).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(9).setCellRenderer(centerRenderer); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// bóng đá
    private void table_bongda(JTable table) {
        String query = "SELECT * FROM cart_bongda";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            while (resultSet.next()) {
                byte[] imageData = resultSet.getBytes("image");
                ImageIcon imageIcon = new ImageIcon(imageData);
                
                // Resize the image to the desired size
                Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                ImageIcon resizedImageIcon = new ImageIcon(image);

                Object[] rowData = {
                    resultSet.getInt("id"),
                    resultSet.getString("productName"),
                    resultSet.getString("size"),
                    resultSet.getInt("quantity"),
                    resizedImageIcon,
                    resultSet.getDouble("price"),
                    resultSet.getString("Name"),
                    resultSet.getString("email"),
                    resultSet.getString("sdt"),
                    resultSet.getString("address")
                };
                model.addRow(rowData);
            }
            
            // Set the custom cell renderer for the column containing ImageIcon
            table.getColumnModel().getColumn(4).setCellRenderer(new ImageIconRenderer());
            
            // Set the column width to fit the image size
            table.getColumnModel().getColumn(4).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setMaxWidth(150);
            table.setRowHeight(150); // Set the row height to fit the image size
            
            // Set the row height for the JTable rows
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            int desiredHeight = 150; // Set the desired height
            renderer.setPreferredSize(new Dimension(0, desiredHeight)); // Set the preferred height
            table.setRowHeight(desiredHeight); // Set the row height for all rows
            
            // Set center alignment for table cells
            DefaultTableCellRenderer centerRenderer = new CenterRenderer();
            table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(8).setCellRenderer(centerRenderer); 
            table.getColumnModel().getColumn(9).setCellRenderer(centerRenderer); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    static class DatabaseConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/shop";
        private static final String USER = "root";
        private static final String PASSWORD = "11062005";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }
}