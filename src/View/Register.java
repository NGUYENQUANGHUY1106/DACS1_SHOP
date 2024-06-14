package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import View.Login;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusername1;
	private JTextField txtPhoneNmuber1;
	private JTextField txtEmail1;
	private JTextField textpasswordField;

	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 684);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(205, 64, 597, 523);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\logomu (2).png"));
		lblNewLabel.setBounds(243, 10, 97, 53);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Đăng Kí Tài Khoản");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(199, 58, 209, 71);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tên Tài Khoản:");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(105, 157, 139, 37);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Số Điện Thoại:");
		lblNewLabel_3.setForeground(new Color(255, 255, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(105, 223, 139, 37);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setForeground(new Color(255, 255, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(105, 295, 139, 36);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password:");
		lblNewLabel_5.setForeground(new Color(255, 255, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_5.setBounds(105, 357, 139, 37);
		panel.add(lblNewLabel_5);
		
		txtusername1 = new JTextField();
		txtusername1.setBounds(262, 161, 259, 37);
		panel.add(txtusername1);
		txtusername1.setColumns(10);
		
		txtPhoneNmuber1 = new JTextField();
		txtPhoneNmuber1.setColumns(10);
		txtPhoneNmuber1.setBounds(262, 223, 259, 37);
		panel.add(txtPhoneNmuber1);
		
		txtEmail1 = new JTextField();
		txtEmail1.setColumns(10);
		txtEmail1.setBounds(262, 295, 259, 37);
		panel.add(txtEmail1);
		
		textpasswordField = new JPasswordField();
		textpasswordField.setColumns(10);
		textpasswordField.setBounds(262, 357, 259, 37);
		panel.add(textpasswordField);
		
		JButton btn_dktaikhoan = new JButton("Đăng Kí Tài Khoản");
		btn_dktaikhoan.setBackground(new Color(255, 0, 0));
		btn_dktaikhoan.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn_dktaikhoan.setBounds(241, 422, 228, 37);
		panel.add(btn_dktaikhoan);
		
		btn_dktaikhoan.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            if (txtusername1.getText().isEmpty() || txtPhoneNmuber1.getText().isEmpty() || txtEmail1.getText().isEmpty() ||
                new String(((JPasswordField) textpasswordField).getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui Lòng Không Để Trống Thông Tin ");
            } else {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "11062005");
                
                String checkPhoneQuery = "SELECT * FROM tk_khachhang WHERE `Số Điện Thoại`=?";
                PreparedStatement checkPhoneStmt = con.prepareStatement(checkPhoneQuery);
                checkPhoneStmt.setString(1, txtPhoneNmuber1.getText());
                ResultSet rs = checkPhoneStmt.executeQuery();
                
                if (rs.next()) {
                    JOptionPane.showMessageDialog(btn_dktaikhoan, "Số điện thoại đã được sử dụng");
                } else {
                    String query = "insert into tk_khachhang (ten_tk, `Số Điện Thoại`, email, password) values(?,?,?,?)";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, txtusername1.getText());
                    ps.setString(2, txtPhoneNmuber1.getText());
                    ps.setString(3, txtEmail1.getText());
                    ps.setString(4, new String(((JPasswordField) textpasswordField).getPassword()));
                    
                    int i = ps.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(btn_dktaikhoan, "Đã đăng kí tài khoản thành công");
                        dispose();
                        Login login = new Login(null);
                        login.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(btn_dktaikhoan, "Lỗi khi đăng ký tài khoản");
                    }
                    ps.close();
                }
                
                rs.close();
                checkPhoneStmt.close();
                con.close();
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
});


		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\nguye\\eclipse-workspace\\DACS1_SHOP\\img\\pngtree-blue-smoke-flame-football-close-up-advertising-background-picture-image_2402074.jpg"));
		lblNewLabel_6.setBounds(0, 0, 597, 523);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\nguye\\eclipse-workspace\\DACS1_SHOP\\img\\pngtree-blue-smoke-flame-football-close-up-advertising-background-picture-image_2402074.jpg"));
		lblNewLabel_7.setBounds(0, 0, 962, 647);
		contentPane.add(lblNewLabel_7);
	}
	
    private boolean authenticate1(String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanglysanbong", "root", "11062005");
            String query = "SELECT * FROM tk_khachhang WHERE ten_tk=? AND password=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            boolean authenticated = rs.next();

            rs.close();
            ps.close();
            con.close();

            return authenticated;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
       

}
}
