package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Shop_Admin.QuanLiDonHang;
import Shop_View.Client_Shop;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Label;
import java.awt.Window;

public class Manager extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable bang;
	private Customer_information customer_information;
	private JTextField txtkhachhang;
	private int stt = 1;
	private JDateChooser txtlich;
	private JComboBox<String> comboBox_1;	 
	int sttValue = 1;
	private JComboBox txtmasan;
	private JComboBox txtbatdau;
	private JComboBox txtkethuc;
	private JComboBox txtgia;
	private JComboBox txtthue;
	public Connection connection;
	Connection sqlConn = null ;
	PreparedStatement pst = null;
	ResultSet rs = null ;
	private static final String username = "root";
	private static final String password = "11062005";
	private static final String dataConn = "jdbc:mysql://localhost:3306/quanlysanbong";	
	private void displaySelectedRowData(int selectedRow) {
	    // Lấy dữ liệu từ bảng cho dòng đã chọn
	    int stt = (int) bang.getValueAt(selectedRow, 0);
	    String maSan = (String) bang.getValueAt(selectedRow, 1);
	    String tenKhachHang = (String) bang.getValueAt(selectedRow, 2);
	    Date ngayDat = (Date) bang.getValueAt(selectedRow, 3);
	    String gioBatDau = (String) bang.getValueAt(selectedRow, 4);
	    String gioKetThuc = (String) bang.getValueAt(selectedRow, 5);
	    String donGia = (String) bang.getValueAt(selectedRow, 6);
	    String loaiThue = (String) bang.getValueAt(selectedRow, 7);

	    // Hiển thị thông tin lên các mục khác trên giao diện
	    txtmasan.setSelectedItem(maSan);
	    txtkhachhang.setText(tenKhachHang);
	    txtlich.setDate(ngayDat);
	    txtbatdau.setSelectedItem(gioBatDau);
	    txtkethuc.setSelectedItem(gioKetThuc);
	    txtgia.setSelectedItem(donGia);
	    txtthue.setSelectedItem(loaiThue);
	}

	private int getCurrentSttValueFromDatabase() {
	    int currentStt = 0; 
	    return currentStt;
	}
	public Manager() {
		this.init();
		updateTable();
	}
	
		private void init() {

		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1473, 762);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton san1 = new JButton("Sân 1");
		san1.setBounds(705, 43, 175, 107);
		san1.setBackground(new Color(193, 219, 214));
		san1.setForeground(new Color(0, 0, 0));
		san1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		san1.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(san1);
		
		JButton san2 = new JButton("Sân 2");
		san2.setBounds(890, 43, 171, 107);
		san2.setBackground(new Color(193, 219, 214));
		san2.setFont(new Font("Tahoma", Font.BOLD, 20));
		san2.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(san2);
		
		JButton san3 = new JButton("Sân 3");
		san3.setBounds(1071, 43, 184, 107);
		san3.setBackground(new Color(193, 219, 214));
		san3.setFont(new Font("Tahoma", Font.BOLD, 20));
		san3.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(san3);
		
		JButton san4 = new JButton("Sân 4");
		san4.setBounds(1265, 43, 171, 107);
		san4.setBackground(new Color(193, 219, 214));
		san4.setFont(new Font("Tahoma", Font.BOLD, 20));
		san4.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(san4);
		
		JButton san5 = new JButton("Sân 5");
		san5.setBounds(705, 160, 175, 101);
		san5.setBackground(new Color(193, 219, 214));
		san5.setFont(new Font("Tahoma", Font.BOLD, 20));
		san5.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(san5);
		
		JButton san6 = new JButton("Sân 6");
		san6.setBounds(886, 160, 171, 101);
		san6.setBackground(new Color(193, 219, 214));
		san6.setFont(new Font("Tahoma", Font.BOLD, 20));
		san6.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(san6);
		
		JButton san7 = new JButton("Sân 7");
		san7.setBounds(1071, 160, 184, 101);
		san7.setBackground(new Color(193, 219, 214));
		san7.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		san7.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(san7);
		
		JButton san8 = new JButton("Sân 8");
		san8.setBounds(1265, 160, 171, 101);
		san8.setBackground(new Color(193, 219, 214));
		san8.setFont(new Font("Tahoma", Font.BOLD, 20));
		san8.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(san8);
		
		JButton sanVIP = new JButton("SÂN 9 VIP");
		sanVIP.setBounds(705, 271, 342, 101);
		
		sanVIP.setBackground(new Color(193, 219, 214));
		sanVIP.setFont(new Font("Tahoma", Font.BOLD, 27));
		sanVIP.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(sanVIP);
		
		JButton sanVIP2 = new JButton("Sân 10 VIP");
		sanVIP2.setBounds(1079, 271, 357, 101);
		sanVIP2.setBackground(new Color(193, 219, 214));
		sanVIP2.setFont(new Font("Tahoma", Font.BOLD, 27));
		sanVIP2.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.72 (1).png"));
		contentPane.add(sanVIP2);
		
		JLabel lblNewLabel = new JLabel("Mã Sân ");
		lblNewLabel.setBounds(277, 43, 148, 31);
		lblNewLabel.setForeground(new Color(238, 81, 53));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Khách Hàng ");
		lblNewLabel_1.setBounds(277, 103, 171, 33);
		lblNewLabel_1.setForeground(new Color(238, 81, 53));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Giờ Bắt Đầu ");
		lblNewLabel_2.setBounds(277, 212, 131, 31);
		lblNewLabel_2.setForeground(new Color(238, 81, 53));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Giờ Kết Thúc ");
		lblNewLabel_3.setBounds(277, 245, 148, 41);
		lblNewLabel_3.setForeground(new Color(238, 81, 53));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Đơn Giá ");
		lblNewLabel_5.setBounds(277, 296, 107, 25);
		lblNewLabel_5.setForeground(new Color(238, 81, 53));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Loại Thuê");
		lblNewLabel_6.setBounds(277, 331, 107, 41);
		lblNewLabel_6.setForeground(new Color(238, 81, 53));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 237, 725);
		panel_2.setBackground(new Color(235, 199, 233));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 10, 217, 705);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btndangxuat = new JButton("Đăng Xuất ");
		btndangxuat.setBounds(0, 627, 217, 49);
		btndangxuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(btndangxuat, "Confirm if you want to Log out", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{	
				dispose();
				Login login = new Login(null);
				login.setVisible(true);
				}
			}
		});
		btndangxuat.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Icons8-Windows-8-Users-Exit.32.png"));
		panel_3.add(btndangxuat);
		btndangxuat.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JButton btnqualykhachhang = new JButton("Quản Lý Khách Hàng");
		btnqualykhachhang.setBounds(0, 198, 217, 57);
		btnqualykhachhang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				 Customer_information customer_information = new Customer_information();
				customer_information.setVisible(true);
			}
		});
		btnqualykhachhang.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnqualykhachhang.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Icojam-Blue-Bits-User-search.32.png"));
		panel_3.add(btnqualykhachhang);
		
		JButton btnquanlydanhthu = new JButton("Quản Lý Doanh thu");
		btnquanlydanhthu.setBounds(0, 265, 217, 57);
		btnquanlydanhthu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnquanlydanhthu.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Double-J-Design-Origami-Chart-pie.32.png"));
		panel_3.add(btnquanlydanhthu);
		btnquanlydanhthu.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String[] options = {"Doanh Thu Ngày", "Doanh Thu Tháng", "Doanh Thu Năm"};
		        int choice = JOptionPane.showOptionDialog(null, "Chọn loại quản lý doanh thu:", "Quản Lý Doanh Thu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

		        double totalRevenue = 0.0;

		        switch (choice) {
		            case 0: 
		                String ngayNhap = JOptionPane.showInputDialog(null, "Nhập ngày (yyyy-MM-dd):");
		                if (ngayNhap != null && !ngayNhap.isEmpty()) {
		                    try {
		                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		                        Date ngay = sdf.parse(ngayNhap);
		                        java.sql.Date ngaySQL = new java.sql.Date(ngay.getTime());
		                        totalRevenue = calculateTotalRevenueForDate(ngaySQL);
		                        JOptionPane.showMessageDialog(null, "Doanh thu cho ngày " + ngayNhap + ": " + totalRevenue + " VND");
		                    } catch (ParseException ex) {
		                        JOptionPane.showMessageDialog(null, "Ngày không hợp lệ. Vui lòng nhập đúng định dạng (YYYY-MM-DD).");
		                    }
		                }
		                break;
		            case 1: // Doanh thu tháng
		                String thangNamNhap = JOptionPane.showInputDialog(null, "Nhập năm và tháng (YYYY-MM):");
		                if (thangNamNhap != null && !thangNamNhap.isEmpty()) {
		                    String[] parts = thangNamNhap.split("-");
		                    int year = Integer.parseInt(parts[0]);
		                    int month = Integer.parseInt(parts[1]);
		                    totalRevenue = calculateTotalRevenueForMonthAndYear(year, month);
		                    JOptionPane.showMessageDialog(null, "Doanh thu cho tháng " + thangNamNhap + ": " + totalRevenue + " VND");
		                } else {
		                    JOptionPane.showMessageDialog(null, "Năm và tháng không hợp lệ. Vui lòng nhập đúng định dạng (YYYY-MM).");
		                }
		                break;
		            case 2: // Doanh thu năm
		                String namNhap = JOptionPane.showInputDialog(null, "Nhập năm:");
		                if (namNhap != null && !namNhap.isEmpty()) {
		                    int year = Integer.parseInt(namNhap);
		                    totalRevenue = calculateTotalRevenueForYear(year);
		                    JOptionPane.showMessageDialog(null, "Doanh thu cho năm " + namNhap + ": " + totalRevenue + " VND");
		                } else {
		                    JOptionPane.showMessageDialog(null, "Năm không hợp lệ. Vui lòng nhập năm.");
		                }
		                break;
		            default:
		                break;
		        }
		    }
		});

		
		
		
		JButton btndatsan = new JButton("Đặt Sân ");
		btndatsan.setBounds(0, 332, 217, 49);
		btndatsan.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Fasticon-Fast-Icon-Users-Add-user.32 (1).png"));
		btndatsan.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btndatsan);
		btndatsan.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Fasticon-Fast-Icon-Users-Add-user.32 (1).png"));
		panel_3.add(btndatsan);
		
		
		
		JButton btnhuysan = new JButton("Hủy Sân ");
		btnhuysan.setBounds(0, 568, 217, 49);
		btnhuysan.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Oxygen-Icons.org-Oxygen-Actions-application-exit.32.png"));
		panel_3.add(btnhuysan);
		btnhuysan.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnhuysan.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int selectedRow = bang.getSelectedRow();

		        if (selectedRow != -1) {
		            int stt = (int) bang.getValueAt(selectedRow, 0);
		            if(JOptionPane.showConfirmDialog(btnhuysan, "Bạn có chắc chắn muốn hủy sân không", "Hủy Sân", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
		            {
		            try {
		                String url = "jdbc:mysql://localhost:3306/quanlysanbong";
		                String user = "root";
		                String password = "11062005";

		                Connection connection = DriverManager.getConnection(url, user, password);

		                String deleteQuery = "DELETE FROM quanlydanhsachdatsan WHERE STT = ?";
		                PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
		                preparedStatement.setInt(1, stt);

		                int affectedRows = preparedStatement.executeUpdate();

		                if (affectedRows > 0) {
		                    JOptionPane.showMessageDialog(null, "Hủy sân thành công!");
		                    updateTable(); 
		                } else {
		                    JOptionPane.showMessageDialog(null, "Không thể hủy sân. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		                }

		                preparedStatement.close();
		                connection.close();
		            } catch (Exception ex) {
		                ex.printStackTrace();
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để hủy sân.", "Lưu ý", JOptionPane.WARNING_MESSAGE);
		        }
		        }
		    }
		});

		
		JButton btnxoa = new JButton("Xóa ");
		btnxoa.setBounds(0, 391, 217, 49);
		btnxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JFrame resetFrame = new JFrame("Reset");
			        if(JOptionPane.showConfirmDialog(resetFrame, "Bạn có muốn xóa hết dữ liệu liệu đã chọn không","Customer Information",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			        {
			            txtmasan.setSelectedItem("");
			            txtkhachhang.setText("");
			            txtlich.setDate(null);
			            txtbatdau.setSelectedItem("");
			            txtkethuc.setSelectedItem("");
			            txtgia.setSelectedItem("");
			            txtthue.setSelectedItem("");
			        }
			}
		});
		btnxoa.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Oxygen-Icons.org-Oxygen-Actions-tools-media-optical-erase.32.png"));
		panel_3.add(btnxoa);
		btnxoa.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JButton capnhat = new JButton("Chỉnh Sửa");
		capnhat.setBounds(0, 450, 217, 49);
        capnhat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int selectedRow = bang.getSelectedRow();

                    if (selectedRow != -1) {
                        if (JOptionPane.showConfirmDialog(null, "Confirm if you want to Edit", "Customer Information", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            sqlConn = DriverManager.getConnection(dataConn, username, password);
                            PreparedStatement pst = sqlConn.prepareStatement(
                                    "UPDATE quanlydanhsachdatsan SET maSan =?, tenKhachHang =?, ngayDat =?, gioBatDau =?, gioKetThuc =?,donGia =?,loaiThue=?  WHERE STT =?");

                            pst.setString(1, txtmasan.getSelectedItem().toString());
                            pst.setString(2, txtkhachhang.getText());
                            java.sql.Date ngayDat = new java.sql.Date(txtlich.getDate().getTime());
                            pst.setDate(3, ngayDat);
                            pst.setString(4, txtbatdau.getSelectedItem().toString());
                            pst.setString(5, txtkethuc.getSelectedItem().toString());
                            pst.setString(6, txtgia.getSelectedItem().toString());
                            pst.setString(7, txtthue.getSelectedItem().toString());

                            // Lấy giá trị của cột STT từ model, không phải từ table
                            int sttValue = (int) bang.getModel().getValueAt(selectedRow, 0);

                            pst.setInt(8, sttValue);
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Successfully updated record!");
                            updateTable();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select a row to update.");
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Existing code...
    

    // Existing methods...
		capnhat.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Custom-Icon-Design-Pretty-Office-9-Edit-validated.32.png"));
		capnhat.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(capnhat);
		
		JButton timkiem = new JButton("Tìm Kiếm");
		timkiem.setBounds(0, 509, 217, 49);
		timkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String timkiemten = JOptionPane.showInputDialog("Vui lòng nhập tên muốn tìm kiếm ");
				if (timkiemten != null) {
				    DefaultTableModel model = (DefaultTableModel) bang.getModel();
				    boolean found = false;
				    for (int i = 0; i < model.getRowCount(); i++) {
				        String TimKiem = model.getValueAt(i, 2).toString(); 
				        if (TimKiem.equals(timkiemten)) {
				            bang.setRowSelectionInterval(i, i);
				            found = true;
				            break;
				        }
				    }
				    if (found) {
				        JOptionPane.showMessageDialog(rootPane, "Đã Tìm Kiếm Tên Khách Hàng :" + timkiemten);
				    } else {
				        JOptionPane.showMessageDialog(rootPane, "Không Tìm Thấy " + timkiemten);
				    }
				} else {
				    JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tên muốn tìm kiếm");
				}
			}
		});
		timkiem.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Iconleak-Atrous-Search.32.png"));
		timkiem.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(timkiem);
		
		JButton btnNewButton = new JButton("Quản Lý Shop");

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				QuanLiDonHang quanLiDonHang =  new QuanLiDonHang ();
				dispose();
				quanLiDonHang.setVisible(true);
				setLocationRelativeTo(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\icons8-add-shopping-cart-50 (1).png"));
		btnNewButton.setBounds(0, 139, 217, 49);
		panel_3.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\logomu (2).png"));
		lblNewLabel_4.setBounds(64, 30, 78, 57);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Quang Huy");
		lblNewLabel_7.setForeground(new Color(255, 255, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(40, 97, 119, 32);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\pngtree-an-empty-football-stadium-filled-with-green-grass-and-lighting-picture-image_2745478 (1).jpg"));
		lblNewLabel_8.setBounds(0, 0, 217, 705);
		panel_3.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(238, 389, 1220, 355);
		panel_1.setBackground(new Color(154, 224, 219));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1178, 320);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1200, 325);
		panel.add(scrollPane);
		
		bang = new JTable();		
		bang.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bang.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "M\u00E3 S\u00E2n ", "T\u00EAn Kh\u00E1ch H\u00E0ng ", " Ng\u00E0y \u0110\u1EB7t ", " Gi\u1EDD B\u1EAFt \u0110\u1EA7u ", "Gi\u1EDD K\u1EBFt Th\u00FAc", "\u0110\u01A1n Gi\u00E1 ", "Lo\u1EA1i Thu\u00EA "
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		bang.getColumnModel().getColumn(0).setPreferredWidth(41);
		bang.getColumnModel().getColumn(1).setPreferredWidth(60);
		bang.getColumnModel().getColumn(2).setPreferredWidth(137);
		bang.getColumnModel().getColumn(3).setPreferredWidth(97);
		bang.getColumnModel().getColumn(4).setPreferredWidth(90);
		bang.getColumnModel().getColumn(5).setPreferredWidth(90);
		bang.getColumnModel().getColumn(7).setPreferredWidth(89);
		scrollPane.setViewportView(bang);
		
		 txtmasan = new JComboBox();
		 txtmasan.setBounds(458, 43, 212, 41);
		txtmasan.setFont(new Font("Arial", Font.BOLD, 16));
		txtmasan.setModel(new DefaultComboBoxModel(new String[] {"", "Sân 1", "Sân 2", "Sân 3", "Sân 4", "Sân 5", "Sân 6", "Sân 7", "Sân 8", "Sân 9 VIP", "Sân 10 VIP"}));
		contentPane.add(txtmasan);
		txtmasan.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String selectedSan = (String) txtmasan.getSelectedItem();
		        if (selectedSan != null && !selectedSan.isEmpty()) {
		            if (selectedSan.equals("Sân 1") || selectedSan.equals("Sân 2") || selectedSan.equals("Sân 3") || 
		                selectedSan.equals("Sân 4") || selectedSan.equals("Sân 5") || selectedSan.equals("Sân 6") || 
		                selectedSan.equals("Sân 7") || selectedSan.equals("Sân 8")) {
		                txtgia.setSelectedItem("150000");
		            } else if (selectedSan.equals("Sân 9 VIP") || selectedSan.equals("Sân 10 VIP")) {
		                txtgia.setSelectedItem("200000");
		            }
		        }
		    }
		});

		Set<String> normalFields = new HashSet<>(Arrays.asList("Sân 1", "Sân 2", "Sân 3", "Sân 4", "Sân 5", "Sân 6", "Sân 7", "Sân 8"));
		Set<String> vipFields = new HashSet<>(Arrays.asList("Sân 9 VIP", "Sân 10 VIP"));

		txtmasan.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String selectedSan = (String) txtmasan.getSelectedItem();
		        if (selectedSan != null && !selectedSan.isEmpty()) {
		            if (normalFields.contains(selectedSan)) {
		                txtgia.setSelectedItem("150000");
		            } else if (vipFields.contains(selectedSan)) {
		                txtgia.setSelectedItem("200000");
		            }
		        }
		    }
		});

		
		txtkhachhang = new JTextField();
		txtkhachhang.setBounds(458, 101, 212, 41);
		txtkhachhang.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(txtkhachhang);
		txtkhachhang.setColumns(10);
		
		txtbatdau = new JComboBox();
		txtbatdau.setBounds(457, 210, 213, 33);
		txtbatdau.setFont(new Font("Arial", Font.BOLD, 16));
		txtbatdau.setModel(new DefaultComboBoxModel(new String[] {"", "6H", "7H", "7H30", "8H", "8H30", "9H", "9H30", "10H", "10H30", "13H", "13H30", "14H", "14H30", "15H", "15H30", "16H", "16H30", "17H", "17H30", "18H", "18H30", "19H", "19H30", "20H", "20H30", "21H", "21H30", "22H", "22H30", "23H"}));
		contentPane.add(txtbatdau);
		
		txtbatdau.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String batdau = (String) txtbatdau.getSelectedItem();
		        if (batdau != null && !batdau.isEmpty()) {
		            // Lấy giờ và phút từ chuỗi
		            String[] timeParts = batdau.split("H");
		            int hour = Integer.parseInt(timeParts[0]);
		            int minute = 0;
		            if (timeParts.length > 1) {
		                minute = Integer.parseInt(timeParts[1]);
		            }
		            
		            // Tăng giờ lên 1
		            hour += 1;

		            // Tạo chuỗi giờ kết thúc
		            String kethuc = hour + "H";
		            if (minute != 0) {
		                kethuc += minute;
		            }

		            // Đặt giá trị cho JComboBox txtkethuc
		            txtkethuc.setSelectedItem(kethuc);
		        }
		    }
		});
		
		

		txtlich = new JDateChooser();
		txtlich.setBounds(458, 160, 212, 40);
		contentPane.add(txtlich);
		
		 txtkethuc = new JComboBox();
		 txtkethuc.setBounds(457, 253, 213, 33);
		txtkethuc.setFont(new Font("Arial", Font.BOLD, 16));
		txtkethuc.setModel(new DefaultComboBoxModel(new String[] {"", "7H", "7H30", "8H", "8H30", "9H", "9H30", "10H", "10H30", "13H", "13H30", "14H", "14H30", "15H", "15H30", "16H", "16H30", "17H", "17H30", "18H", "18H30", "19H", "19H30", "20H", "20H30", "21H", "21H30", "22H", "22H30", "23H"}));
		contentPane.add(txtkethuc);
		
		txtthue = new JComboBox();
		txtthue.setBounds(457, 339, 213, 33);
		txtthue.setFont(new Font("Arial", Font.BOLD, 16));
		txtthue.setModel(new DefaultComboBoxModel(new String[] {"", "Đặt Trước \t", "Trực Tiếp"}));
		contentPane.add(txtthue);
		
		 txtgia = new JComboBox();
		 txtgia.setBounds(457, 293, 213, 39);
		txtgia.setFont(new Font("Arial", Font.BOLD, 16));
		txtgia.setModel(new DefaultComboBoxModel(new String[] {"", "150000", "200000", "250000", "300000"}));
		contentPane.add(txtgia);
		

        setLocationRelativeTo(null);
	        
		JPanel reservationPanel = new JPanel();
		reservationPanel.setBounds(237, 0, 1236, 390);
		contentPane.add(reservationPanel);
		reservationPanel.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("Ngày Đặt ");
		lblNewLabel_5_1.setForeground(new Color(238, 81, 53));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(46, 161, 107, 25);
		reservationPanel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\pngtree-illuminated-soccer-football-stadium-arena-in-3d-render-picture-image_3753112 (1).jpg"));
		lblNewLabel_10.setBounds(0, 0, 1237, 390);
		reservationPanel.add(lblNewLabel_10);
		DefaultTableModel model = (DefaultTableModel) bang.getModel();
		model.fireTableDataChanged();			
	
        
		
	    btndatsan.addActionListener(new ActionListener() {	    
		@Override
	    public void actionPerformed(ActionEvent e) {
	        try {
	            String url = "jdbc:mysql://localhost:3306/quanlysanbong";
	            String user = "root";
	            String password = "11062005";

	             connection = DriverManager.getConnection(url, user, password);

	            String checkQuery = "SELECT * FROM quanlydanhsachdatsan WHERE maSan = ? AND ngayDat = ? AND gioBatDau = ?";
	            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
	            checkStatement.setString(1, txtmasan.getSelectedItem().toString());
	            java.sql.Date ngayDat = new java.sql.Date(txtlich.getDate().getTime());
	            checkStatement.setDate(2, ngayDat);
	            checkStatement.setString(3, txtbatdau.getSelectedItem().toString());

	            ResultSet resultSet = checkStatement.executeQuery();

	            if (resultSet.next()) {
	                JOptionPane.showMessageDialog(null, "Lỗi: Sân đã được đặt vào thời gian này. Vui lòng chọn sân khác hoặc thời gian khác.");
	            } else {
	                String insertQuery = "INSERT INTO quanlydanhsachdatsan (maSan, tenKhachHang, ngayDat, gioBatDau, gioKetThuc, donGia, loaithue) VALUES (?, ?, ?, ?, ?, ?, ?)\r\n"+ "";
	                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

	                preparedStatement.setString(1, txtmasan.getSelectedItem().toString());
	                preparedStatement.setString(2, txtkhachhang.getText());
	                preparedStatement.setDate(3, ngayDat);
	                preparedStatement.setString(4, txtbatdau.getSelectedItem().toString());
	                preparedStatement.setString(5, txtkethuc.getSelectedItem().toString());
	                preparedStatement.setString(6, txtgia.getSelectedItem().toString());
	                preparedStatement.setString(7, txtthue.getSelectedItem().toString());

	                preparedStatement.executeUpdate();

	                preparedStatement.close();
	                connection.close();

	                JOptionPane.showMessageDialog(null, "Đặt sân thành công!");

	                updateTable();
	            }

	            resultSet.close();
	            checkStatement.close();
	        } catch (SQLIntegrityConstraintViolationException ex) {
	            JOptionPane.showMessageDialog(null, "Lỗi: Sân đã được đặt. Vui lòng chọn sân khác hoặc thời gian khác.");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	});	
	    
}	

	
	private void updateTable() {
	    DefaultTableModel model = (DefaultTableModel) bang.getModel();
	    model.setRowCount(0);

	    try {
	        String url = "jdbc:mysql://localhost:3306/quanlysanbong";
	        String user = "root";
	        String password = "11062005";

	        Connection connection = DriverManager.getConnection(url, user, password);
	        String selectQuery = "SELECT * FROM quanlydanhsachdatsan";
	        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

	        ResultSet resultSet = preparedStatement.executeQuery();
	        while (resultSet.next()) {
	            int stt = resultSet.getInt("STT");
	            String maSan = resultSet.getString("maSan");
	            String tenKhachHang = resultSet.getString("tenKhachHang");
	            Date ngayDat = resultSet.getDate("ngayDat");
	            String gioBatDau = resultSet.getString("gioBatDau");
	            String gioKetThuc = resultSet.getString("gioKetThuc");
	            String donGia = resultSet.getString("donGia");
	            String loaiThue = resultSet.getString("loaiThue");

	            model.addRow(new Object[]{stt, maSan, tenKhachHang, ngayDat, gioBatDau, gioKetThuc, donGia, loaiThue});
	        }

	        resultSet.close();
	        preparedStatement.close();
	        connection.close();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

        bang.addMouseListener(new MouseAdapter() {
            int Key = 0;

            @Override
            public void mouseClicked(MouseEvent e) {
                DefaultTableModel model = (DefaultTableModel) bang.getModel();
                int myIndex = bang.getSelectedRow();
                Key = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
                txtmasan.setSelectedItem(model.getValueAt(myIndex, 1).toString());
                txtkhachhang.setText(model.getValueAt(myIndex, 2).toString());
                
                // Corrected code to set the date in JDateChooser
                java.sql.Date ngayDat = (java.sql.Date) model.getValueAt(myIndex, 3);
                txtlich.setDate(new Date(ngayDat.getTime()));
                
                txtbatdau.setSelectedItem(model.getValueAt(myIndex, 4).toString());
                txtkethuc.setSelectedItem(model.getValueAt(myIndex, 5).toString());
                txtgia.setSelectedItem(model.getValueAt(myIndex, 6).toString());
                txtthue.setSelectedItem(model.getValueAt(myIndex, 7).toString());
            }
        });
        
	}
	 
	   private void updateTable1() {
	        try {
	            DefaultTableModel model = (DefaultTableModel) bang.getModel();
	            model.setRowCount(0);  
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysanbong", "root", "11062005");
	            Statement st = con.createStatement();
	            String query = "select * from quanlydanhsachdatsan";
	            ResultSet rs = st.executeQuery(query);

	            while (rs.next()) {
	                String STT = rs.getString(1);
	                String maSan = rs.getString(2);
	                String tenKhachHang = rs.getString(3);
	                String ngayDat = rs.getString(4);
	                String gioBatDau = rs.getString(5);
	                String gioKetThuc = rs.getString(6);
	                String donGia = rs.getString(7);
	                String loaiThue = rs.getString(8);

	                String[] row = {STT, maSan, tenKhachHang, ngayDat, gioBatDau, gioKetThuc, donGia, loaiThue};
	                model.addRow(row);
	            }

	            rs.close();
	            st.close();
	            con.close();

	            if (model.getRowCount() > 0) {
	                bang.setRowSelectionInterval(0, 0);
	                displaySelectedRowData(0);  
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	   private double calculateTotalRevenue() {
		    double totalRevenue = 0.0;
		    DefaultTableModel model = (DefaultTableModel) bang.getModel();

		    for (int i = 0; i < model.getRowCount(); i++) {
		        String donGia = model.getValueAt(i, 6).toString();

		        totalRevenue += Double.parseDouble(donGia);
		    }

		    return totalRevenue;
		}
	   private double calculateTotalRevenueForDate(java.sql.Date selectedDate) {
		    double totalRevenue = 0.0;
		    DefaultTableModel model = (DefaultTableModel) bang.getModel();

		    for (int i = 0; i < model.getRowCount(); i++) {
		        java.sql.Date ngayDat = (java.sql.Date) model.getValueAt(i, 3);

		        if (ngayDat.equals(selectedDate)) {
		            String donGia = model.getValueAt(i, 6).toString();

		            totalRevenue += Double.parseDouble(donGia);
		        }
		    }

		    return totalRevenue;
		}
          
	   private double calculateTotalRevenueForMonthAndYear(int year, int month) {
		    double totalRevenue = 0.0;
		    DefaultTableModel model = (DefaultTableModel) bang.getModel();

		    for (int i = 0; i < model.getRowCount(); i++) {
		        java.sql.Date ngayDat = (java.sql.Date) model.getValueAt(i, 3);

		        Calendar calendar = Calendar.getInstance();
		        calendar.setTime(ngayDat);
		        if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == (month - 1)) {
		            String donGia = model.getValueAt(i, 6).toString();

		            totalRevenue += Double.parseDouble(donGia);
		        }
		    }

		    return totalRevenue;
		}
	   private double calculateTotalRevenueForYear(int year) {
		    double totalRevenue = 0.0;
		    DefaultTableModel model = (DefaultTableModel) bang.getModel();

		    for (int i = 0; i < model.getRowCount(); i++) {
		        java.sql.Date ngayDat = (java.sql.Date) model.getValueAt(i, 3);

		        Calendar calendar = Calendar.getInstance();
		        calendar.setTime(ngayDat);
		        if (calendar.get(Calendar.YEAR) == year) {
		            // Lấy giá trị từ cột đơn giá
		            String donGia = model.getValueAt(i, 6).toString();

		            // Chuyển đổi giá trị đơn giá từ String sang double và cộng vào tổng doanh thu
		            totalRevenue += Double.parseDouble(donGia);
		        }
		    }

		    return totalRevenue;
		}


        
	   
     public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setVisible(true);
		manager.setLocationRelativeTo(null);
		
	}
	}
	

