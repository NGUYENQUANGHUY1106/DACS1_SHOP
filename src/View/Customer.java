	package View;
	
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	
	import com.toedter.calendar.JDateChooser;

import Shop_View.Client_Shop;

import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JComboBox;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.Date;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
	
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.ImageIcon;
	import java.awt.Color;
	
	import javax.swing.ComboBoxModel;
	import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
	
	public class Customer extends JFrame {
	
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField khachang;
		private JDateChooser lich ;
		private Login login;
		private JComboBox masan;
		private JComboBox batdau;
		private JComboBox ketthuc;
		private JComboBox dongia;
		private JComboBox thue;
		private void huySan() {
		    try {
		        String url = "jdbc:mysql://localhost:3306/quanlysanbong";
		        String user = "root";
		        String password = "11062005";

		        Connection connection = DriverManager.getConnection(url, user, password);

		        // Xây dựng câu lệnh SQL để xóa dữ liệu dựa trên thông tin đặt sân
		        String deleteQuery = "DELETE FROM quanlydanhsachdatsan WHERE maSan = ? AND tenKhachHang = ? AND ngayDat = ? AND gioBatDau = ? AND gioKetThuc = ? AND donGia = ? AND loaiThue = ?";
		        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

		        preparedStatement.setString(1, masan.getSelectedItem().toString());
		        preparedStatement.setString(2, khachang.getText());
		        java.sql.Date ngayDat = new java.sql.Date(lich.getDate().getTime());
		        preparedStatement.setDate(3, ngayDat);
		        preparedStatement.setString(4, batdau.getSelectedItem().toString());
		        preparedStatement.setString(5, ketthuc.getSelectedItem().toString());
		        preparedStatement.setString(6, dongia.getSelectedItem().toString());
		        preparedStatement.setString(7, thue.getSelectedItem().toString());

		        // Thực hiện câu lệnh SQL để xóa đặt sân
		        int rowsAffected = preparedStatement.executeUpdate();

		        preparedStatement.close();
		        connection.close();

		        if (rowsAffected > 0) {
		            JOptionPane.showMessageDialog(null, "Hủy sân thành công!");
		        } else {
		            JOptionPane.showMessageDialog(null, "Không tìm thấy đặt sân để hủy.");
		        }

		        // Thêm hàm cập nhật bảng ở đây nếu bạn đã có
		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }
		}
	   
		public Customer() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1179, 660);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel txtmasan = new JLabel("Mã Sân  ");
			txtmasan.setForeground(new Color(226, 237, 14));
			txtmasan.setFont(new Font("Arial", Font.BOLD, 22));
			txtmasan.setBounds(59, 112, 198, 22);
			contentPane.add(txtmasan);
			
			JLabel txtkhachhang = new JLabel("Tên Khách Hàng ");
			txtkhachhang.setForeground(new Color(226, 237, 14));
			txtkhachhang.setFont(new Font("Arial", Font.BOLD, 22));
			txtkhachhang.setBounds(59, 166, 198, 29);
			contentPane.add(txtkhachhang);
			
			JLabel txtgiobatdau = new JLabel("Giờ Bắt Đầu ");
			txtgiobatdau.setForeground(new Color(226, 237, 14));
			txtgiobatdau.setFont(new Font("Arial", Font.BOLD, 22));
			txtgiobatdau.setBounds(59, 295, 198, 29);
			contentPane.add(txtgiobatdau);
			
			JLabel txtgiokethuc = new JLabel("Giờ Kết Thúc ");
			txtgiokethuc.setForeground(new Color(226, 237, 14));
			txtgiokethuc.setFont(new Font("Arial", Font.BOLD, 22));
			txtgiokethuc.setBounds(59, 334, 198, 29);
			contentPane.add(txtgiokethuc);
			
			JLabel txtdongia = new JLabel("Đơn Giá ");
			txtdongia.setForeground(new Color(226, 237, 14));
			txtdongia.setFont(new Font("Arial", Font.BOLD, 22));
			txtdongia.setBounds(59, 381, 198, 29);
			contentPane.add(txtdongia);
			
			JLabel txtloaihue = new JLabel("Loại Thuê ");
			txtloaihue.setForeground(new Color(226, 237, 14));
			txtloaihue.setFont(new Font("Arial", Font.BOLD, 22));
			txtloaihue.setBounds(59, 435, 198, 29);
			contentPane.add(txtloaihue);
			
			 masan = new JComboBox();
			 masan.setFont(new Font("Tahoma", Font.BOLD, 17));
			masan.setModel(new DefaultComboBoxModel(new String[] {"", "Sân 1", "Sân 2", "Sân 3", "Sân 4", "Sân 5", "Sân 6", "Sân 7", "Sân 8", "Sân 9 VIP", "Sân 10 VIP"}));
			masan.setBounds(281, 103, 179, 36);
			contentPane.add(masan);
			
			khachang = new JTextField();
			khachang.setFont(new Font("Tahoma", Font.BOLD, 17));
			khachang.setBounds(281, 163, 179, 36);
			contentPane.add(khachang);
			khachang.setColumns(10);
			
			 batdau = new JComboBox();
			 batdau.setFont(new Font("Tahoma", Font.BOLD, 17));
			batdau.setModel(new DefaultComboBoxModel(new String[] {"", "6H", "7H", "7H30", "8H", "8H30", "9H", "9H30", "10H", "10H30", "13H", "13H30", "14H", "14H30", "15H", "15H30", "16H", "16H30", "17H", "17H30", "18H", "18H30", "19H", "19H30", "20H", "20H30", "21H", "21H30", "22H", "22H30", "23H"}));
			batdau.setBounds(281, 281, 179, 36);
			contentPane.add(batdau);
			
			 ketthuc = new JComboBox();
			 ketthuc.setFont(new Font("Tahoma", Font.BOLD, 17));
			ketthuc.setModel(new DefaultComboBoxModel(new String[] {"", "7H", "7H30", "8H", "8H30", "9H", "9H30", "10H", "10H30", "13H", "13H30", "14H", "14H30", "15H", "15H30", "16H", "16H30", "17H", "17H30", "18H", "18H30", "19H", "19H30", "20H", "20H30", "21H", "21H30", "22H", "22H30", "23H"}));
			ketthuc.setBounds(281, 334, 179, 34);
			contentPane.add(ketthuc);
			
			 dongia = new JComboBox();
			 dongia.setFont(new Font("Tahoma", Font.BOLD, 17));
			dongia.setModel(new DefaultComboBoxModel(new String[] {"", "150000", "200000", "250000", "300000"}));
			dongia.setBounds(281, 380, 179, 41);
			contentPane.add(dongia);
			
			 thue = new JComboBox();
			 thue.setFont(new Font("Tahoma", Font.BOLD, 17));
			thue.setModel(new DefaultComboBoxModel(new String[] {"", "Đặt Trước ", "Trực Tiếp"}));
			thue.setBounds(281, 442, 179, 41);
			contentPane.add(thue);
			
			JButton btnNewButton = new JButton("Sân 1");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnNewButton.setBounds(577, 112, 133, 72);
			contentPane.add(btnNewButton);
			
			JButton btnSn = new JButton("Sân 2");
			btnSn.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSn.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSn.setBounds(720, 112, 133, 72);
			contentPane.add(btnSn);
			
			JButton btnSn_1 = new JButton("Sân 3");
			btnSn_1.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSn_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSn_1.setBounds(869, 112, 133, 72);
			contentPane.add(btnSn_1);
			
			JButton btnSn_2 = new JButton("Sân 4");
			btnSn_2.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSn_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSn_2.setBounds(1012, 112, 133, 72);
			contentPane.add(btnSn_2);
			
			JButton btnSn_3 = new JButton("Sân 5");
			btnSn_3.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSn_3.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSn_3.setBounds(577, 240, 133, 72);
			contentPane.add(btnSn_3);
			
			JButton btnSn_4 = new JButton("Sân 6");
			btnSn_4.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSn_4.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSn_4.setBounds(720, 240, 133, 72);
			contentPane.add(btnSn_4);
			
			JButton btnSn_5 = new JButton("Sân 7");
			btnSn_5.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSn_5.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSn_5.setBounds(869, 240, 133, 72);
			contentPane.add(btnSn_5);
			
			JButton btnSn_6 = new JButton("Sân 8");
			btnSn_6.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSn_6.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSn_6.setBounds(1012, 240, 133, 72);
			contentPane.add(btnSn_6);
			
			JButton btnSnVip = new JButton("Sân 9 VIP");
			btnSnVip.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSnVip.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSnVip.setBounds(577, 359, 276, 72);
			contentPane.add(btnSnVip);
			
			JButton btnSnVip_2 = new JButton("Sân 10 VIP");
			btnSnVip_2.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btnSnVip_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSnVip_2.setBounds(869, 359, 276, 72);
			contentPane.add(btnSnVip_2);
			
			JButton btndatsan = new JButton("Đặt Sân");
			btndatsan.setForeground(new Color(248, 121, 103));
			btndatsan.setBackground(new Color(192, 192, 192));
			btndatsan.setFont(new Font("Tahoma", Font.BOLD, 20));
			btndatsan.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yingfengling-Fl-I-Love-Sports-Soccer.48.png"));
			btndatsan.setBounds(245, 524, 179, 60);
			contentPane.add(btndatsan);
			
			JButton btnNewButton_2 = new JButton("Hủy Sân ");
			btnNewButton_2.setForeground(new Color(248, 121, 103));
			btnNewButton_2.setBackground(new Color(192, 192, 192));
			btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Yohproject-Cute-Cancel.64 (1).png"));
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_2.setBounds(493, 524, 179, 60);
			contentPane.add(btnNewButton_2);
			btnNewButton_2.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        if (JOptionPane.showConfirmDialog(btnNewButton_2, "Xác nhận hủy sân?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			            huySan();
			        }
			    }
			});
			 		
		JButton btnNewButton_3 = new JButton("Đăng Xuất ");
		btnNewButton_3.setForeground(new Color(248, 121, 103));
		btnNewButton_3.setBackground(new Color(192, 192, 192));
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(JOptionPane.showConfirmDialog(btnNewButton_3, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
					{
					dispose();
					login = new Login(null);
					login.setVisible(true);
					setLocationRelativeTo(null);
					}	
					
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
			btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Icons8-Windows-8-Users-Exit.48.png"));
			btnNewButton_3.setBounds(720, 524, 184, 60);
			contentPane.add(btnNewButton_3);
			
			JButton btnNewButton_1 = new JButton("Xóa ");
			btnNewButton_1.setForeground(new Color(248, 121, 103));
			btnNewButton_1.setBackground(new Color(192, 192, 192));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 JFrame resetFrame = new JFrame("Reset");
				        if(JOptionPane.showConfirmDialog(resetFrame, "Bạn có muốn xóa hết dữ liệu liệu đã chọn không","Customer Information",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				        {
				            masan.setSelectedItem("");
				            khachang.setText("");
				            lich.setDate(null);
				            batdau.setSelectedItem("");
				            ketthuc.setSelectedItem("");
				            dongia.setSelectedItem("");
				            thue.setSelectedItem("");
				        }
				}
			});
				
			
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Iconsmind-Outline-Reset.48.png"));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_1.setBounds(939, 524, 150, 60);
			contentPane.add(btnNewButton_1);
	//		
	//		JLabel lblNewLabel_8 = new JLabel("");
	//		lblNewLabel_8.setBounds(416, 240, 130, 36);
	//		contentPane.add(lblNewLabel_8);
			
			lich = new JDateChooser();
			lich.setBackground(new Color(255, 128, 128));
			lich.setBounds(281, 230, 179, 41);
			contentPane.add(lich);
			
			JLabel txtngaydat = new JLabel("Ngày Đặt ");
			txtngaydat.setForeground(new Color(226, 237, 14));
			txtngaydat.setFont(new Font("Arial", Font.BOLD, 22));
			txtngaydat.setBounds(59, 240, 198, 31);
			contentPane.add(txtngaydat);
			
			JButton btnShop = new JButton("Shop");
			btnShop.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Client_Shop client_Shop = new Client_Shop();
					dispose();
					client_Shop.setVisible(true);
					setLocationRelativeTo(null);
					
				}
			});
			btnShop.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\icons8-add-shopping-cart-50 (1).png"));
			btnShop.setForeground(new Color(248, 121, 103));
			btnShop.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnShop.setBackground(Color.LIGHT_GRAY);
			btnShop.setBounds(35, 524, 179, 60);
			contentPane.add(btnShop);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\pngtree-illuminated-soccer-football-stadium-arena-in-3d-render-picture-image_3753112.jpg"));
			lblNewLabel.setBounds(0, 0, 1165, 623);
			contentPane.add(lblNewLabel);
			
			
			
			// ...
			btndatsan.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        try {
			            String url = "jdbc:mysql://localhost:3306/quanlysanbong";
			            String user = "root";
			            String password = "11062005";

			            Connection connection = DriverManager.getConnection(url, user, password);

			            // Kiểm tra xem sân và giờ bắt đầu đã được đặt hay chưa
			            String checkQuery = "SELECT * FROM quanlydanhsachdatsan WHERE maSan = ? AND ngayDat = ? AND gioBatDau = ?";
			            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
			            checkStatement.setString(1, masan.getSelectedItem().toString());
			            java.sql.Date ngayDat = new java.sql.Date(lich.getDate().getTime());
			            checkStatement.setDate(2, ngayDat);
			            checkStatement.setString(3, batdau.getSelectedItem().toString());

			            ResultSet resultSet = checkStatement.executeQuery();

			            if (resultSet.next()) {
			                // Sân và giờ bắt đầu đã được đặt, hiển thị thông báo
			                JOptionPane.showMessageDialog(null, "Lỗi: Sân đã được đặt vào thời gian này. Vui lòng chọn sân khác hoặc thời gian khác.");
			            } else {
			                // Sân và giờ bắt đầu chưa được đặt, tiến hành thêm đặt sân mới
			                String insertQuery = "INSERT INTO quanlydanhsachdatsan (maSan, tenKhachHang, ngayDat, gioBatDau, gioKetThuc, donGia, loaiThue) VALUES (?, ?, ?, ?, ?, ?, ?)";
			                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

			                preparedStatement.setString(1, masan.getSelectedItem().toString());
			                preparedStatement.setString(2, khachang.getText());
			                preparedStatement.setDate(3, ngayDat);
			                preparedStatement.setString(4, batdau.getSelectedItem().toString());
			                preparedStatement.setString(5, ketthuc.getSelectedItem().toString());
			                preparedStatement.setString(6, dongia.getSelectedItem().toString());
			                preparedStatement.setString(7, thue.getSelectedItem().toString());

			                preparedStatement.executeUpdate();

			                preparedStatement.close();
			                connection.close();

			                JOptionPane.showMessageDialog(null, "Đặt sân thành công!");
			            }

			            // Đóng tất cả tài nguyên
			            resultSet.close();
			            checkStatement.close();
			        } catch (SQLIntegrityConstraintViolationException ex) {
			            // Xử lý lỗi khi trùng lặp giá trị STT (có thể hiển thị một thông báo)
			            JOptionPane.showMessageDialog(null, "Lỗi: Sân đã được đặt. Vui lòng chọn sân khác hoặc thời gian khác.");
			        } catch (Exception ex) {
			            ex.printStackTrace();
			        }
			    }
			});

		
		}
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Customer customer = new Customer();
						customer.setVisible(true);
						customer.setLocationRelativeTo(null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
	}
	
	
		
