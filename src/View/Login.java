package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Shop_tcp.ShopClient;
import View.Loading2;
import View.Manager;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame {
    private JPanel contentPane;
    private JTextField txtDangnhap;
    private JPasswordField txtPassword; // Chuyển thành JPasswordField
    private ShopClient client;

    public Login(ShopClient client) {
        this.client = client;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 868, 687);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Đăng Nhập ");
        lblNewLabel.setBackground(new Color(0, 0, 0));
        lblNewLabel.setForeground(new Color(255, 255, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(348, 125, 194, 56);
        contentPane.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(83, 29, 715, 533);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Man United Shop");
        lblNewLabel_1.setBounds(125, 22, 424, 74);
        panel_1.add(lblNewLabel_1);
        lblNewLabel_1.setForeground(new Color(255, 255, 0));
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\logomu (2).png"));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBackground(new Color(220, 218, 219));
        panel_2.setBounds(39, 272, 651, 65);
        panel_1.add(panel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Mật Khẩu");
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setForeground(Color.BLACK);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_1.setBounds(10, 10, 207, 48);
        panel_2.add(lblNewLabel_2_1);

        txtPassword = new JPasswordField(); // Đổi thành JPasswordField
        txtPassword.setForeground(new Color(255, 0, 0));
        txtPassword.setBounds(227, 10, 414, 48);
        panel_2.add(txtPassword);

        JButton btn_login = new JButton("Đăng Nhập");
        btn_login.setBackground(new Color(255, 0, 0));
        btn_login.setForeground(new Color(255, 255, 0));
        btn_login.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn_login.setBounds(270, 357, 184, 53);
        panel_1.add(btn_login);

        btn_login.addMouseListener(new MouseAdapter() {
            @SuppressWarnings("deprecation")
            @Override
            public void mouseClicked(MouseEvent e) {
                if (txtDangnhap.getText().isEmpty() || txtPassword.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(btn_login, "Enter UserName and PassWord");
                } else if (txtDangnhap.getText().equals("MANUNITEDSHOP") && new String(txtPassword.getPassword()).equals("1234")) {
                    JOptionPane.showMessageDialog(btn_login, "Login successful");
                    dispose();
                    Manager manager = new Manager();
                    manager.setVisible(true);
                    manager.setLocationRelativeTo(null); // Đặt vị trí giữa màn hình
                } else {
                    if (xacthuc1(txtDangnhap.getText(), new String(txtPassword.getPassword()))) {
                        JOptionPane.showMessageDialog(btn_login, "Login successful");
                        dispose();
                        Customer customer= new Customer();
                        customer.setVisible(true);
                        customer.setLocationRelativeTo(null); // Đặt vị trí giữa màn hình
                        customer.setLocation(250, 0);
                    } else {
                        JOptionPane.showMessageDialog(btn_login, "Wrong UserName Or Password");
                        txtDangnhap.setText(null);
                        txtPassword.setText(null);
                    }
                }
            }
        });

        JButton btnRegister = new JButton("Chưa có tài khoản. Vui Lòng Tạo Tài Khoản");
        btnRegister.setBackground(new Color(64, 0, 0));
        btnRegister.setForeground(new Color(0, 255, 0));
        btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnRegister.setBounds(39, 440, 651, 43);
        panel_1.add(btnRegister);
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtDangnhap.getText().isEmpty() || txtPassword.getPassword().length == 0) {
                    JOptionPane.showConfirmDialog(btnRegister,"Confirm if want to Register ","Register Systems", JOptionPane.YES_NO_OPTION);
                    Register register = new Register();
                    dispose();
                    register.setVisible(true);
                    register.setLocation(250, 0);
                }  
                
                
            }
        });


        JPanel panel = new JPanel();
        panel.setBounds(39, 160, 651, 65);
        panel_1.add(panel);
        panel.setBackground(new Color(220, 218, 219));
        panel.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Email hoặc Tài Khoản");
        lblNewLabel_2.setBackground(new Color(249, 193, 189));
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2.setBounds(10, 10, 207, 48);
        panel.add(lblNewLabel_2);

        txtDangnhap = new JTextField();
        txtDangnhap.setForeground(new Color(255, 0, 0));
        txtDangnhap.setBounds(227, 10, 414, 48);
        panel.add(txtDangnhap);
        txtDangnhap.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\0206_hinh-nen-MU-may-tinh12.jpg"));
        lblNewLabel_4.setBounds(0, 0, 715, 533);
        panel_1.add(lblNewLabel_4);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\0206_hinh-nen-MU-may-tinh12.jpg"));
        lblNewLabel_3.setBounds(0, 0, 854, 650);
        contentPane.add(lblNewLabel_3);
    }

    private boolean xacthuc1(String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "11062005");
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
