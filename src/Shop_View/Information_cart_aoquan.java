	package Shop_View;
	
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
	import java.awt.Font;
	import javax.swing.JTextField;
	import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
	
class Information_cart_aoquan extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    public Information_cart_aoquan(String productName, String size, int quantity, double price, byte[] imageBytes) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 519, 494);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Thông Tin Đơn Hàng ");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(92, 10, 273, 56);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Tên");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1.setBounds(116, 76, 74, 30);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField.setBounds(217, 76, 200, 30);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Email");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1_1.setBounds(116, 130, 74, 30);
        contentPane.add(lblNewLabel_1_1);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_1.setColumns(10);
        textField_1.setBounds(217, 130, 200, 30);
        contentPane.add(textField_1);

        JLabel lblNewLabel_1_2 = new JLabel("SĐT");
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1_2.setBounds(116, 180, 74, 30);
        contentPane.add(lblNewLabel_1_2);

        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_2.setColumns(10);
        textField_2.setBounds(217, 180, 200, 30);
        contentPane.add(textField_2);

        JLabel lblNewLabel_1_3 = new JLabel("Địa Chỉ");
        lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1_3.setBounds(116, 233, 74, 30);
        contentPane.add(lblNewLabel_1_3);

        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_3.setColumns(10);
        textField_3.setBounds(217, 233, 200, 30);
        contentPane.add(textField_3);

        JButton btnNewButton = new JButton("Xác Nhận");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String name = textField.getText();
                String email = textField_1.getText();
                String sdt = textField_2.getText();
                String diachi = textField_3.getText();

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "11062005")) {
                    System.out.println("Kết nối đến cơ sở dữ liệu thành công!");
                    String query = "INSERT INTO cart_aoquan (productName, size, quantity, price, image, name, email, sdt, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, productName);
                    preparedStatement.setString(2, size);
                    preparedStatement.setInt(3, quantity);
                    preparedStatement.setDouble(4, price);
                    preparedStatement.setBytes(5, imageBytes);
                    preparedStatement.setString(6, name);
                    preparedStatement.setString(7, email);
                    preparedStatement.setString(8, sdt);
                    preparedStatement.setString(9, diachi);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Sản phẩm đã được thêm vào giỏ hàng.");
                    Client_AoQuan mainPanel = new Client_AoQuan();
                    mainPanel.setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi thêm sản phẩm vào giỏ hàng.");
                    System.out.println("Ngoại lệ SQL: " + ex.getMessage());
                }
            }
        });

        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton.setBounds(161, 288, 133, 43);
        contentPane.add(btnNewButton);
    }
}
	
