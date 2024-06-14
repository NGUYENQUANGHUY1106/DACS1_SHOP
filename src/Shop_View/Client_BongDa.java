package Shop_View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Client_BongDa extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private ImageIcon[] images;
    private int currentImageIndex = 0;
    private JLabel lblSlideshow;


    public Client_BongDa() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1056, 748);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 3000, 3000);
        panel.setLayout(null);

        // Add the panel to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 10, 1042, 1207);
        contentPane.add(scrollPane);

        // Set preferred size for panel to ensure scroll bars appear
        panel.setPreferredSize(new Dimension(993, 1500)); // Change height as needed

        images = new ImageIcon[]{
            new ImageIcon("C:\\Users\\nguye\\Downloads\\giay-manchester-united-adidas-stretford-1968-shoes-s79508-bnwt-box-20211030054430-665309 (1).jpg"),
            new ImageIcon("C:\\Users\\nguye\\Downloads\\ZA_2324KitLaunch_411698065523971_large (1)")
        };

        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_8.setIcon(images[currentImageIndex]);
        lblNewLabel_8.setBounds(254, 133, 737, 206);
        panel.add(lblNewLabel_8);

        // Timer to switch images
        Timer timer = new Timer(3000, new ActionListener() { // Switch every 3 seconds
            @Override
            public void actionPerformed(ActionEvent e) {
                currentImageIndex = (currentImageIndex + 1) % images.length;
                lblNewLabel_8.setIcon(images[currentImageIndex]);
            }
        });
        timer.start();

        JLabel lblNewLabel_2 = new JLabel("Man United Sports");
        lblNewLabel_2.setForeground(new Color(255, 0, 0));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 24));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(54, 4, 234, 58);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setBounds(611, 13, 37, 49);
        panel.add(lblNewLabel_3);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 7));
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\icons8-search-50 (1) (1).png"));

        textField = new JTextField();
        textField.setBounds(293, 13, 308, 45);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\icons8-shopping-cart-52.png"));
        lblNewLabel_4.setBounds(799, 13, 66, 49);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("0");
        lblNewLabel_5.setBackground(new Color(255, 0, 0));
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setForeground(new Color(0, 0, 0));
        lblNewLabel_5.setBounds(835, 0, 50, 35);
        panel.add(lblNewLabel_5);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 0, 0));
        panel_2.setBounds(0, 72, 991, 58);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel = new JLabel("DANH MỤC SẢN PHẨM");
        lblNewLabel.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        		Client_Shop client_Shop = new Client_Shop();
        		client_Shop.setVisible(true);
        		client_Shop.setLocation(250, 0);
        		setLocationRelativeTo(null);
        	}
        });
        lblNewLabel.setBackground(new Color(252, 47, 3));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(63, 0, 191, 58);
        panel_2.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-tiles-48.png"));
        lblNewLabel_1.setBounds(10, 0, 52, 58);
        panel_2.add(lblNewLabel_1);

        JButton btnNewButton_4_1 = new JButton("Giày");
        btnNewButton_4_1.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_4_1.setOpaque(true);
        btnNewButton_4_1.setContentAreaFilled(true);
        btnNewButton_4_1.setBorderPainted(false);
        btnNewButton_4_1.setBackground(Color.RED);
        btnNewButton_4_1.setBounds(295, 0, 118, 58);
        panel_2.add(btnNewButton_4_1);
        
        btnNewButton_4_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_Shop clientGiayFrame = new Client_Shop();
                dispose();
                clientGiayFrame.setVisible(true);
                setLocationRelativeTo(null);
            }
        });

        JButton btnNewButton_4_1_1 = new JButton("Quần áo");
        btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_1_1.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1_1.setOpaque(true);
        btnNewButton_4_1_1.setContentAreaFilled(true);
        btnNewButton_4_1_1.setBorderPainted(false);
        btnNewButton_4_1_1.setBackground(Color.RED);
        btnNewButton_4_1_1.setBounds(422, 0, 130, 58);
        panel_2.add(btnNewButton_4_1_1);
        
        btnNewButton_4_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_AoQuan clientQuanAoFrame = new Client_AoQuan();
                dispose();
                clientQuanAoFrame.setVisible(true);
                setLocationRelativeTo(null);
            }
        });

        // Add the button to the panel
        

        JButton btnNewButton_4_1_2 = new JButton("Bóng đá");
        btnNewButton_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_1_2.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1_2.setOpaque(true);
        btnNewButton_4_1_2.setContentAreaFilled(true);
        btnNewButton_4_1_2.setBorderPainted(false);
        btnNewButton_4_1_2.setBackground(Color.RED);
        btnNewButton_4_1_2.setBounds(551, 0, 130, 58);
        panel_2.add(btnNewButton_4_1_2);
        
        btnNewButton_4_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_BongDa clientBongDaFrame = new Client_BongDa();
                clientBongDaFrame.setVisible(true);
            }
        });

        JButton btnNewButton_4_1_3 = new JButton("Phụ kiện");
        btnNewButton_4_1_3.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_1_3.setOpaque(true);
        btnNewButton_4_1_3.setContentAreaFilled(true);
        btnNewButton_4_1_3.setBorderPainted(false);
        btnNewButton_4_1_3.setBackground(Color.RED);
        btnNewButton_4_1_3.setBounds(684, 0, 130, 58);
        panel_2.add(btnNewButton_4_1_3);
        
        btnNewButton_4_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_PhuKien clientPhuKienFrame = new Client_PhuKien();
                dispose();
                clientPhuKienFrame.setVisible(true);
                setLocationRelativeTo(null);
            }
        });

        JLabel lblNewLabel_9 = new JLabel("HOTLINE :0905169648");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_9.setForeground(new Color(255, 255, 255));
        lblNewLabel_9.setBounds(790, 2, 201, 58);
        panel_2.add(lblNewLabel_9);

        JLabel lblNewLabel_7 = new JLabel("");
        lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\logomu (2).png"));
        lblNewLabel_7.setBounds(21, 4, 66, 58);
        panel.add(lblNewLabel_7);

        JButton btnNewButton = new JButton("Giày");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton.setBounds(10, 133, 234, 49);
        btnNewButton.setBackground(Color.RED); // Set background color to red
        btnNewButton.setOpaque(true); // Ensure the button is opaque
        btnNewButton.setBorderPainted(false); // Optional: remove border
        btnNewButton.setContentAreaFilled(true); // Ensure the button fills the content area
        panel.add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_Giay clientGiayFrame = new Client_Giay();
                dispose();
                clientGiayFrame.setVisible(true);
                setLocationRelativeTo(null);
            }
        });

        JButton btnNewButton_1 = new JButton("Phụ kiện");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setOpaque(true);
        btnNewButton_1.setContentAreaFilled(true);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setBackground(Color.RED);
        btnNewButton_1.setBounds(10, 291, 234, 49);
        panel.add(btnNewButton_1);
        
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_PhuKien clientPhuKienFrame = new Client_PhuKien();
                dispose();
                clientPhuKienFrame.setVisible(true);
                setLocationRelativeTo(null);
            }
        });

        JButton btnNewButton_2 = new JButton("Quần áo");
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_2.setOpaque(true);
        btnNewButton_2.setContentAreaFilled(true);
        btnNewButton_2.setBorderPainted(false);
        btnNewButton_2.setBackground(new Color(255, 0, 0));
        btnNewButton_2.setBounds(10, 186, 234, 49);
        panel.add(btnNewButton_2);
        
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_AoQuan clientQuanAoFrame = new Client_AoQuan();
                dispose();
                clientQuanAoFrame.setVisible(true);
                setLocationRelativeTo(null);
            }
        });

        JButton btnNewButton_3 = new JButton("Bóng đá");
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton_3.setForeground(new Color(0, 0, 0));
        btnNewButton_3.setOpaque(true);
        btnNewButton_3.setContentAreaFilled(true);
        btnNewButton_3.setBorderPainted(false);
        btnNewButton_3.setBackground(new Color(255, 255, 0));
        btnNewButton_3.setBounds(10, 239, 234, 49);
        panel.add(btnNewButton_3);
        
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_BongDa clientBongDaFrame = new Client_BongDa();
                clientBongDaFrame.setVisible(true);
            }
        });
                
                // Create a ButtonGroup and add the checkboxes to it
                ButtonGroup group = new ButtonGroup();
                
                JButton btnNewButton_5 = new JButton("Giỏ Hàng");
                btnNewButton_5.setBackground(new Color(255, 0, 0));
                btnNewButton_5.setForeground(new Color(255, 255, 255));
                btnNewButton_5.setBounds(684, 17, 105, 45);
                panel.add(btnNewButton_5);
                
                JPanel panel_1_1 = new JPanel();
                panel_1_1.setLayout(null);
                panel_1_1.setBackground(Color.WHITE);
                panel_1_1.setBounds(254, 372, 211, 261);
                panel.add(panel_1_1);
                
                JLabel lblNewLabel_11_1 = new JLabel("");
                lblNewLabel_11_1.setBounds(94, 5, 45, 13);
                panel_1_1.add(lblNewLabel_11_1);
                
                JLabel lblNewLabel_10_1 = new JLabel("");
                lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_10_1.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\images (1) (1).jpg"));
                lblNewLabel_10_1.setBounds(10, 5, 193, 169);
                panel_1_1.add(lblNewLabel_10_1);
                
                JLabel lblNewLabel_12_1 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1.setBounds(56, 172, 127, 22);
                panel_1_1.add(lblNewLabel_12_1);
                
                JCheckBox chckbxNewCheckBox_3 = new JCheckBox("S");
                chckbxNewCheckBox_3.setBounds(14, 189, 36, 21);
                panel_1_1.add(chckbxNewCheckBox_3);
                
                JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("L");
                chckbxNewCheckBox_1_1.setBounds(113, 189, 36, 21);
                panel_1_1.add(chckbxNewCheckBox_1_1);
                
                JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2.setBounds(158, 189, 45, 21);
                panel_1_1.add(chckbxNewCheckBox_2_2);
                
                JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1.setBounds(66, 189, 36, 21);
                panel_1_1.add(chckbxNewCheckBox_2_1_1);
                
                ButtonGroup group1 = new ButtonGroup();
                group1.add(chckbxNewCheckBox_3);
                group1.add(chckbxNewCheckBox_1_1);
                group1.add(chckbxNewCheckBox_2_2);
                group1.add(chckbxNewCheckBox_2_1_1);
                
                JLabel lblNewLabel_15_1 = new JLabel("1.999.999đ");
                lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1.setBounds(56, 216, 107, 13);
                panel_1_1.add(lblNewLabel_15_1);
                
                JButton btnNewButton_4_2 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2.setBackground(Color.RED);
                btnNewButton_4_2.setBounds(10, 230, 139, 21);
                panel_1_1.add(btnNewButton_4_2);
                
                JComboBox comboBox_1 = new JComboBox();
                comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1.setBounds(160, 230, 43, 21);
                panel_1_1.add(comboBox_1);
                // tính toán giá tiền của sản phẩm
                String initialPriceText_5 = lblNewLabel_15_1.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
                int basePrice1_5 = Integer.parseInt(initialPriceText_5);
                comboBox_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int quantity = Integer.parseInt((String) comboBox_1.getSelectedItem());

                        int totalPrice = basePrice1_5 * quantity;

                        lblNewLabel_15_1.setText(String.format("%,dđ", totalPrice).replace(",", "."));
                    }
                });

// kiểm tra xem người dùng chọn size chưa 
	                btnNewButton_4_2.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        if (!chckbxNewCheckBox_3.isSelected() && !chckbxNewCheckBox_1_1.isSelected() &&
	                                !chckbxNewCheckBox_2_2.isSelected() && !chckbxNewCheckBox_2_1_1.isSelected()) {
	                            Component frame = null;
	                            JOptionPane.showMessageDialog(frame, "Vui lòng chọn size trước khi thêm vào giỏ hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                            return;
	                        }

	                        // Thu thập thông tin sản phẩm
	                        String productName = lblNewLabel_12_1.getText();
	                        String size = "";
	                        if (chckbxNewCheckBox_3.isSelected()) {
	                            size = "S";
	                        } else if (chckbxNewCheckBox_1_1.isSelected()) {
	                            size = "M";
	                        } else if (chckbxNewCheckBox_2_2.isSelected()) {
	                            size = "L";
	                        } else if (chckbxNewCheckBox_2_1_1.isSelected()) {
	                            size = "XL";
	                        }

	                        int quantity = Integer.parseInt((String) comboBox_1.getSelectedItem());
	                        String priceText = lblNewLabel_15_1.getText().replace("đ", "").replace(".", "").trim();
	                        double price = Double.parseDouble(priceText);

	                        byte[] imageBytes = null;
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\images (1) (1).jpg";
	                        try {
	                            BufferedImage image = ImageIO.read(new File(defaultImagePath));
	                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                            ImageIO.write(image, "jpg", baos);
	                            baos.flush();
	                            imageBytes = baos.toByteArray();
	                            baos.close();
	                        } catch (IOException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc hình ảnh.");
	                            return;
	                        }

	                        // Hiển thị frame Information_cart
	                        Information_cart_bongda infoCartFrame = new Information_cart_bongda(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
                
                
                JPanel panel_1_1_1 = new JPanel();
                panel_1_1_1.setLayout(null);
                panel_1_1_1.setBackground(Color.WHITE);
                panel_1_1_1.setBounds(532, 372, 211, 261);
                panel.add(panel_1_1_1);
                
                JLabel lblNewLabel_11_1_1 = new JLabel("");
                lblNewLabel_11_1_1.setBounds(94, 5, 45, 13);
                panel_1_1_1.add(lblNewLabel_11_1_1);
                
                JLabel lblNewLabel_10_1_1 = new JLabel("");
                lblNewLabel_10_1_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_10_1_1.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\tải xuống (4) (1).png"));
                lblNewLabel_10_1_1.setBounds(10, 5, 193, 169);
                panel_1_1_1.add(lblNewLabel_10_1_1);
                
                JLabel lblNewLabel_12_1_1 = new JLabel("Bóng Man united");
                lblNewLabel_12_1_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_1.setBounds(56, 172, 127, 22);
                panel_1_1_1.add(lblNewLabel_12_1_1);
                
                JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("S");
                chckbxNewCheckBox_3_1.setBounds(14, 189, 36, 21);
                panel_1_1_1.add(chckbxNewCheckBox_3_1);
                
                JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_1.setBounds(113, 189, 36, 21);
                panel_1_1_1.add(chckbxNewCheckBox_1_1_1);
                
                JCheckBox chckbxNewCheckBox_2_2_1 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_1.setBounds(158, 189, 45, 21);
                panel_1_1_1.add(chckbxNewCheckBox_2_2_1);
                
                JCheckBox chckbxNewCheckBox_2_1_1_1 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_1.setBounds(66, 189, 36, 21);
                panel_1_1_1.add(chckbxNewCheckBox_2_1_1_1);
                
                ButtonGroup group2 = new ButtonGroup();
                group2.add(chckbxNewCheckBox_3_1);
                group2.add(chckbxNewCheckBox_1_1_1);
                group2.add(chckbxNewCheckBox_2_2_1);
                group2.add(chckbxNewCheckBox_2_1_1_1);
                
                JLabel lblNewLabel_15_1_1 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_1.setBounds(56, 216, 107, 13);
                panel_1_1_1.add(lblNewLabel_15_1_1);
                
                JButton btnNewButton_4_2_1 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_1.setBackground(Color.RED);
                btnNewButton_4_2_1.setBounds(14, 230, 139, 21);
                panel_1_1_1.add(btnNewButton_4_2_1);
                
                JComboBox comboBox_2 = new JComboBox();
                comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_2.setBounds(160, 230, 43, 21);
                panel_1_1_1.add(comboBox_2);
                
                // tính toán giá tiền của sản phẩm
                String initialPriceText_4 = lblNewLabel_15_1_1.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
                int basePrice1_4 = Integer.parseInt(initialPriceText_4);
                comboBox_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int quantity = Integer.parseInt((String) comboBox_2.getSelectedItem());

                        int totalPrice = basePrice1_4 * quantity;

                        lblNewLabel_15_1_1.setText(String.format("%,dđ", totalPrice).replace(",", "."));
                    }
                });

// kiểm tra xem người dùng chọn size chưa 

	                btnNewButton_4_2_1.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        if (!chckbxNewCheckBox_3_1.isSelected() && !chckbxNewCheckBox_1_1_1.isSelected() &&
	                                !chckbxNewCheckBox_2_2_1.isSelected() && !chckbxNewCheckBox_2_1_1_1.isSelected()) {
	                            Component frame = null;
	                            JOptionPane.showMessageDialog(frame, "Vui lòng chọn size trước khi thêm vào giỏ hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                            return;
	                        }

	                        // Thu thập thông tin sản phẩm
	                        String productName = lblNewLabel_12_1_1.getText();
	                        String size = "";
	                        if (chckbxNewCheckBox_3_1.isSelected()) {
	                            size = "S";
	                        } else if (chckbxNewCheckBox_1_1_1.isSelected()) {
	                            size = "M";
	                        } else if (chckbxNewCheckBox_2_2_1.isSelected()) {
	                            size = "L";
	                        } else if (chckbxNewCheckBox_2_1_1_1.isSelected()) {
	                            size = "XL";
	                        }

	                        int quantity = Integer.parseInt((String) comboBox_2.getSelectedItem());
	                        String priceText = lblNewLabel_15_1_1.getText().replace("đ", "").replace(".", "").trim();
	                        double price = Double.parseDouble(priceText);

	                        byte[] imageBytes = null;
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\tải xuống (4) (1).png";
	                        try {
	                            BufferedImage image = ImageIO.read(new File(defaultImagePath));
	                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                            ImageIO.write(image, "jpg", baos);
	                            baos.flush();
	                            imageBytes = baos.toByteArray();
	                            baos.close();
	                        } catch (IOException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc hình ảnh.");
	                            return;
	                        }

	                        // Hiển thị frame Information_cart
	                        Information_cart_bongda infoCartFrame = new Information_cart_bongda(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
                
                
                JPanel panel_1_1_2 = new JPanel();
                panel_1_1_2.setLayout(null);
                panel_1_1_2.setBackground(Color.WHITE);
                panel_1_1_2.setBounds(780, 372, 211, 261);
                panel.add(panel_1_1_2);
                
                JLabel lblNewLabel_11_1_2 = new JLabel("");
                lblNewLabel_11_1_2.setBounds(94, 5, 45, 13);
                panel_1_1_2.add(lblNewLabel_11_1_2);
                
                JLabel lblNewLabel_10_1_2 = new JLabel("");
                lblNewLabel_10_1_2.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\tải xuống (5) (1).jpg"));
                lblNewLabel_10_1_2.setBounds(10, 5, 193, 169);
                panel_1_1_2.add(lblNewLabel_10_1_2);
                
                JLabel lblNewLabel_12_1_2 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_2.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_2.setBounds(56, 172, 127, 22);
                panel_1_1_2.add(lblNewLabel_12_1_2);
                
                JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("S");
                chckbxNewCheckBox_3_2.setBounds(14, 189, 36, 21);
                panel_1_1_2.add(chckbxNewCheckBox_3_2);
                
                JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_2.setBounds(113, 189, 36, 21);
                panel_1_1_2.add(chckbxNewCheckBox_1_1_2);
                
                JCheckBox chckbxNewCheckBox_2_2_2 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_2.setBounds(158, 189, 45, 21);
                panel_1_1_2.add(chckbxNewCheckBox_2_2_2);
                
                JCheckBox chckbxNewCheckBox_2_1_1_2 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_2.setBounds(66, 189, 36, 21);
                panel_1_1_2.add(chckbxNewCheckBox_2_1_1_2);
                
                ButtonGroup group3 = new ButtonGroup();
                group3.add(chckbxNewCheckBox_3_2);
                group3.add(chckbxNewCheckBox_1_1_2);
                group3.add(chckbxNewCheckBox_2_2_2);
                group3.add(chckbxNewCheckBox_2_1_1_2);
                
                JLabel lblNewLabel_15_1_2 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_2.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_2.setBounds(56, 216, 107, 13);
                panel_1_1_2.add(lblNewLabel_15_1_2);
                
                JButton btnNewButton_4_2_2 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_2.setBackground(Color.RED);
                btnNewButton_4_2_2.setBounds(14, 230, 139, 21);
                panel_1_1_2.add(btnNewButton_4_2_2);
                
                JComboBox comboBox_3 = new JComboBox();
                comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_3.setBounds(160, 230, 43, 21);
                panel_1_1_2.add(comboBox_3);
                
                // tính toán giá tiền của sản phẩm
                String initialPriceText_3 = lblNewLabel_15_1_2.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
                int basePrice1_3 = Integer.parseInt(initialPriceText_3);
                comboBox_3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int quantity = Integer.parseInt((String) comboBox_3.getSelectedItem());

                        int totalPrice = basePrice1_3 * quantity;

                        lblNewLabel_15_1_2.setText(String.format("%,dđ", totalPrice).replace(",", "."));
                    }
                });

// kiểm tra xem người dùng chọn size chưa 
	                btnNewButton_4_2_2.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        if (!chckbxNewCheckBox_3_2.isSelected() && !chckbxNewCheckBox_1_1_2.isSelected() &&
	                                !chckbxNewCheckBox_2_2_2.isSelected() && !chckbxNewCheckBox_2_1_1_2.isSelected()) {
	                            Component frame = null;
	                            JOptionPane.showMessageDialog(frame, "Vui lòng chọn size trước khi thêm vào giỏ hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                            return;
	                        }

	                        // Thu thập thông tin sản phẩm
	                        String productName = lblNewLabel_12_1_2.getText();
	                        String size = "";
	                        if (chckbxNewCheckBox_3_2.isSelected()) {
	                            size = "S";
	                        } else if (chckbxNewCheckBox_1_1_2.isSelected()) {
	                            size = "M";
	                        } else if (chckbxNewCheckBox_2_2_2.isSelected()) {
	                            size = "L";
	                        } else if (chckbxNewCheckBox_2_1_1_2.isSelected()) {
	                            size = "XL";
	                        }

	                        int quantity = Integer.parseInt((String) comboBox_3.getSelectedItem());
	                        String priceText = lblNewLabel_15_1_2.getText().replace("đ", "").replace(".", "").trim();
	                        double price = Double.parseDouble(priceText);

	                        byte[] imageBytes = null;
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\tải xuống (5) (1).jpg";
	                        try {
	                            BufferedImage image = ImageIO.read(new File(defaultImagePath));
	                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                            ImageIO.write(image, "jpg", baos);
	                            baos.flush();
	                            imageBytes = baos.toByteArray();
	                            baos.close();
	                        } catch (IOException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc hình ảnh.");
	                            return;
	                        }

	                        // Hiển thị frame Information_cart
	                        Information_cart_bongda infoCartFrame = new Information_cart_bongda(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
                
                JPanel panel_4 = new JPanel();
                panel_4.setBackground(new Color(255, 0, 0));
                panel_4.setBounds(21, 655, 55, 49);
                panel.add(panel_4);
                panel_4.setLayout(null);
                
                JLabel lblNewLabel_6 = new JLabel("");
                lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\Header-Logo1500994616801 (1) (2).png"));
                lblNewLabel_6.setBounds(0, 5, 55, 40);
                panel_4.add(lblNewLabel_6);
                
                JPanel panel_5 = new JPanel();
                panel_5.setBackground(new Color(255, 0, 0));
                panel_5.setBounds(77, 655, 906, 4);
                panel.add(panel_5);
                
                JPanel panel_1_1_3 = new JPanel();
                panel_1_1_3.setLayout(null);
                panel_1_1_3.setBackground(Color.WHITE);
                panel_1_1_3.setBounds(21, 724, 211, 261);
                panel.add(panel_1_1_3);
                
                JLabel lblNewLabel_11_1_3 = new JLabel("");
                lblNewLabel_11_1_3.setBounds(94, 5, 45, 13);
                panel_1_1_3.add(lblNewLabel_11_1_3);
                
                JLabel lblNewLabel_10_1_3 = new JLabel("");
                lblNewLabel_10_1_3.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\tải xuống (2) (1).png"));
                lblNewLabel_10_1_3.setBounds(10, 5, 193, 169);
                panel_1_1_3.add(lblNewLabel_10_1_3);
                
                JLabel lblNewLabel_12_1_3 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_3.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_3.setBounds(56, 172, 127, 22);
                panel_1_1_3.add(lblNewLabel_12_1_3);
                
                JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("S");
                chckbxNewCheckBox_3_3.setBounds(14, 189, 36, 21);
                panel_1_1_3.add(chckbxNewCheckBox_3_3);
                
                JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_3.setBounds(113, 189, 36, 21);
                panel_1_1_3.add(chckbxNewCheckBox_1_1_3);
                
                JCheckBox chckbxNewCheckBox_2_2_3 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_3.setBounds(158, 189, 45, 21);
                panel_1_1_3.add(chckbxNewCheckBox_2_2_3);
                
                JCheckBox chckbxNewCheckBox_2_1_1_3 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_3.setBounds(66, 189, 36, 21);
                panel_1_1_3.add(chckbxNewCheckBox_2_1_1_3);
                
                ButtonGroup group4 = new ButtonGroup();
                group4.add(chckbxNewCheckBox_3_3);
                group4.add(chckbxNewCheckBox_1_1_3);
                group4.add(chckbxNewCheckBox_2_2_3);
                group4.add(chckbxNewCheckBox_2_1_1_3);
                
                JLabel lblNewLabel_15_1_3 = new JLabel("1.555.999đ");
                lblNewLabel_15_1_3.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_3.setBounds(56, 216, 107, 13);
                panel_1_1_3.add(lblNewLabel_15_1_3);
                
                JButton btnNewButton_4_2_3 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_3.setBackground(Color.RED);
                btnNewButton_4_2_3.setBounds(10, 230, 139, 21);
                panel_1_1_3.add(btnNewButton_4_2_3);
                
                JComboBox comboBox_1_1 = new JComboBox();
                comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_1.setBounds(160, 230, 43, 21);
                panel_1_1_3.add(comboBox_1_1);
                // tính toán giá tiền của sản phẩm
                String initialPriceText1 = lblNewLabel_15_1_3.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
                int basePrice1 = Integer.parseInt(initialPriceText1);
                comboBox_1_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int quantity = Integer.parseInt((String) comboBox_1_1.getSelectedItem());

                        int totalPrice = basePrice1 * quantity;

                        lblNewLabel_15_1_3.setText(String.format("%,dđ", totalPrice).replace(",", "."));
                    }
                });

// kiểm tra xem người dùng chọn size chưa 
	                btnNewButton_4_2_3.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        if (!chckbxNewCheckBox_3_3.isSelected() && !chckbxNewCheckBox_1_1_3.isSelected() &&
	                                !chckbxNewCheckBox_2_2_3.isSelected() && !chckbxNewCheckBox_2_1_1_3.isSelected()) {
	                            Component frame = null;
	                            JOptionPane.showMessageDialog(frame, "Vui lòng chọn size trước khi thêm vào giỏ hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                            return;
	                        }

	                        // Thu thập thông tin sản phẩm
	                        String productName = lblNewLabel_12_1_3.getText();
	                        String size = "";
	                        if (chckbxNewCheckBox_3_3.isSelected()) {
	                            size = "S";
	                        } else if (chckbxNewCheckBox_1_1_3.isSelected()) {
	                            size = "M";
	                        } else if (chckbxNewCheckBox_2_2_3.isSelected()) {
	                            size = "L";
	                        } else if (chckbxNewCheckBox_2_1_1_3.isSelected()) {
	                            size = "XL";
	                        }

	                        int quantity = Integer.parseInt((String) comboBox_1_1.getSelectedItem());
	                        String priceText = lblNewLabel_15_1_3.getText().replace("đ", "").replace(".", "").trim();
	                        double price = Double.parseDouble(priceText);

	                        byte[] imageBytes = null;
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\tải xuống (2) (1).png";
	                        try {
	                            BufferedImage image = ImageIO.read(new File(defaultImagePath));
	                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                            ImageIO.write(image, "jpg", baos);
	                            baos.flush();
	                            imageBytes = baos.toByteArray();
	                            baos.close();
	                        } catch (IOException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc hình ảnh.");
	                            return;
	                        }

	                        // Hiển thị frame Information_cart
	                        Information_cart_bongda infoCartFrame = new Information_cart_bongda(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
                
                JPanel panel_1_1_4 = new JPanel();
                panel_1_1_4.setLayout(null);
                panel_1_1_4.setBackground(Color.WHITE);
                panel_1_1_4.setBounds(276, 724, 211, 261);
                panel.add(panel_1_1_4);
                
                JLabel lblNewLabel_11_1_4 = new JLabel("");
                lblNewLabel_11_1_4.setBounds(94, 5, 45, 13);
                panel_1_1_4.add(lblNewLabel_11_1_4);
                
                JLabel lblNewLabel_10_1_4 = new JLabel("");
                lblNewLabel_10_1_4.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\manchester-united-crest-signature-football-size-5_ss5_p-13375386+u-1yuxlh1crrqspj134apa+v-jvunkmbtj8kucoyqcxyp (1) (1).png"));
                lblNewLabel_10_1_4.setBounds(10, 5, 193, 169);
                panel_1_1_4.add(lblNewLabel_10_1_4);
                
                JLabel lblNewLabel_12_1_4 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_4.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_4.setBounds(56, 172, 127, 22);
                panel_1_1_4.add(lblNewLabel_12_1_4);
                
                JCheckBox chckbxNewCheckBox_3_4 = new JCheckBox("S");
                chckbxNewCheckBox_3_4.setBounds(14, 189, 36, 21);
                panel_1_1_4.add(chckbxNewCheckBox_3_4);
                
                JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_4.setBounds(113, 189, 36, 21);
                panel_1_1_4.add(chckbxNewCheckBox_1_1_4);
                
                JCheckBox chckbxNewCheckBox_2_2_4 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_4.setBounds(158, 189, 45, 21);
                panel_1_1_4.add(chckbxNewCheckBox_2_2_4);
                
                JCheckBox chckbxNewCheckBox_2_1_1_4 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_4.setBounds(66, 189, 36, 21);
                panel_1_1_4.add(chckbxNewCheckBox_2_1_1_4);
                
                ButtonGroup group5 = new ButtonGroup();
                group5.add(chckbxNewCheckBox_3_4);
                group5.add(chckbxNewCheckBox_1_1_4);
                group5.add(chckbxNewCheckBox_2_2_4);
                group5.add(chckbxNewCheckBox_2_1_1_4);
                
                JLabel lblNewLabel_15_1_4 = new JLabel("2.999.999đ");
                lblNewLabel_15_1_4.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_4.setBounds(56, 216, 107, 13);
                panel_1_1_4.add(lblNewLabel_15_1_4);
                
                JButton btnNewButton_4_2_4 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_4.setBackground(Color.RED);
                btnNewButton_4_2_4.setBounds(10, 230, 139, 21);
                panel_1_1_4.add(btnNewButton_4_2_4);
                
                JComboBox comboBox_1_2 = new JComboBox();
                comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_2.setBounds(160, 230, 43, 21);
                panel_1_1_4.add(comboBox_1_2);
 // tính toán giá tiền của sản phẩm
                String initialPriceText2 = lblNewLabel_15_1_4.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
                int basePrice2 = Integer.parseInt(initialPriceText2);
                comboBox_1_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int quantity = Integer.parseInt((String) comboBox_1_2.getSelectedItem());

                        int totalPrice = basePrice2 * quantity;

                        lblNewLabel_15_1_4.setText(String.format("%,dđ", totalPrice).replace(",", "."));
                    }
                });

	// kiểm tra xem người dùng chọn size chưa 
	                btnNewButton_4_2_4.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        if (!chckbxNewCheckBox_3_4.isSelected() && !chckbxNewCheckBox_1_1_4.isSelected() &&
	                                !chckbxNewCheckBox_2_2_4.isSelected() && !chckbxNewCheckBox_2_1_1_4.isSelected()) {
	                            Component frame = null;
	                            JOptionPane.showMessageDialog(frame, "Vui lòng chọn size trước khi thêm vào giỏ hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                            return;
	                        }

	                        // Thu thập thông tin sản phẩm
	                        String productName = lblNewLabel_12_1_4.getText();
	                        String size = "";
	                        if (chckbxNewCheckBox_3_4.isSelected()) {
	                            size = "S";
	                        } else if (chckbxNewCheckBox_1_1_4.isSelected()) {
	                            size = "M";
	                        } else if (chckbxNewCheckBox_2_2_4.isSelected()) {
	                            size = "L";
	                        } else if (chckbxNewCheckBox_2_1_1_4.isSelected()) {
	                            size = "XL";
	                        }

	                        int quantity = Integer.parseInt((String) comboBox_1_2.getSelectedItem());
	                        String priceText = lblNewLabel_15_1_4.getText().replace("đ", "").replace(".", "").trim();
	                        double price = Double.parseDouble(priceText);

	                        byte[] imageBytes = null;
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\manchester-united-crest-signature-football-size-5_ss5_p-13375386+u-1yuxlh1crrqspj134apa+v-jvunkmbtj8kucoyqcxyp (1) (1).png";
	                        try {
	                            BufferedImage image = ImageIO.read(new File(defaultImagePath));
	                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                            ImageIO.write(image, "jpg", baos);
	                            baos.flush();
	                            imageBytes = baos.toByteArray();
	                            baos.close();
	                        } catch (IOException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc hình ảnh.");
	                            return;
	                        }

	                        // Hiển thị frame Information_cart
	                        Information_cart_bongda infoCartFrame = new Information_cart_bongda(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
	                
	                
                JPanel panel_1_1_5 = new JPanel();
                panel_1_1_5.setLayout(null);
                panel_1_1_5.setBackground(Color.WHITE);
                panel_1_1_5.setBounds(507, 724, 211, 261);
                panel.add(panel_1_1_5);
                
                JLabel lblNewLabel_11_1_5 = new JLabel("");
                lblNewLabel_11_1_5.setBounds(94, 5, 45, 13);
                panel_1_1_5.add(lblNewLabel_11_1_5);
                
                JLabel lblNewLabel_10_1_5 = new JLabel("");
                lblNewLabel_10_1_5.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\manchester-united-adidas-third-club-football-white_ss4_p-13385004+u-3ejzrpc9cdkh06yey8sz+v-a8165eadd43044429006dea073793997 (1).png"));
                lblNewLabel_10_1_5.setBounds(10, 5, 193, 169);
                panel_1_1_5.add(lblNewLabel_10_1_5);
                
                JLabel lblNewLabel_12_1_5 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_5.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_5.setBounds(56, 172, 127, 22);
                panel_1_1_5.add(lblNewLabel_12_1_5);
                
                JCheckBox chckbxNewCheckBox_3_5 = new JCheckBox("S");
                chckbxNewCheckBox_3_5.setBounds(14, 189, 36, 21);
                panel_1_1_5.add(chckbxNewCheckBox_3_5);
                
                JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_5.setBounds(113, 189, 36, 21);
                panel_1_1_5.add(chckbxNewCheckBox_1_1_5);
                
                JCheckBox chckbxNewCheckBox_2_2_5 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_5.setBounds(158, 189, 45, 21);
                panel_1_1_5.add(chckbxNewCheckBox_2_2_5);
                
                JCheckBox chckbxNewCheckBox_2_1_1_5 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_5.setBounds(66, 189, 36, 21);
                panel_1_1_5.add(chckbxNewCheckBox_2_1_1_5);
                
                ButtonGroup group6 = new ButtonGroup();
                group6.add(chckbxNewCheckBox_3_5);
                group6.add(chckbxNewCheckBox_1_1_5);
                group6.add(chckbxNewCheckBox_2_2_5);
                group6.add(chckbxNewCheckBox_2_1_1_5);
                
                JLabel lblNewLabel_15_1_5 = new JLabel("1.789.999đ");
                lblNewLabel_15_1_5.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_5.setBounds(56, 216, 107, 13);
                panel_1_1_5.add(lblNewLabel_15_1_5);
                
                JButton btnNewButton_4_2_5 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_5.setBackground(Color.RED);
                btnNewButton_4_2_5.setBounds(10, 230, 139, 21);
                panel_1_1_5.add(btnNewButton_4_2_5);
                
                JComboBox comboBox_1_3 = new JComboBox();
                comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_3.setBounds(160, 230, 43, 21);
                panel_1_1_5.add(comboBox_1_3);
                
  // tính toán giá tiền của sản phẩm
                String initialPriceText3 = lblNewLabel_15_1_5.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
                int basePrice3 = Integer.parseInt(initialPriceText3);
                comboBox_1_3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int quantity = Integer.parseInt((String) comboBox_1_3.getSelectedItem());

                        int totalPrice = basePrice3 * quantity;

                        lblNewLabel_15_1_5.setText(String.format("%,dđ", totalPrice).replace(",", "."));
                    }
                });

	// kiểm tra xem người dùng chọn size chưa 
	                btnNewButton_4_2_5.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        if (!chckbxNewCheckBox_3_5.isSelected() && !chckbxNewCheckBox_1_1_5.isSelected() &&
	                                !chckbxNewCheckBox_2_2_5.isSelected() && !chckbxNewCheckBox_2_1_1_5.isSelected()) {
	                            Component frame = null;
	                            JOptionPane.showMessageDialog(frame, "Vui lòng chọn size trước khi thêm vào giỏ hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                            return;
	                        }

	                        // Thu thập thông tin sản phẩm
	                        String productName = lblNewLabel_12_1_5.getText();
	                        String size = "";
	                        if (chckbxNewCheckBox_3_5.isSelected()) {
	                            size = "S";
	                        } else if (chckbxNewCheckBox_1_1_5.isSelected()) {
	                            size = "M";
	                        } else if (chckbxNewCheckBox_2_2_5.isSelected()) {
	                            size = "L";
	                        } else if (chckbxNewCheckBox_2_1_1_5.isSelected()) {
	                            size = "XL";
	                        }

	                        int quantity = Integer.parseInt((String) comboBox_1_3.getSelectedItem());
	                        String priceText = lblNewLabel_15_1_5.getText().replace("đ", "").replace(".", "").trim();
	                        double price = Double.parseDouble(priceText);

	                        byte[] imageBytes = null;
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\manchester-united-adidas-third-club-football-white_ss4_p-13385004+u-3ejzrpc9cdkh06yey8sz+v-a8165eadd43044429006dea073793997 (1).png";
	                        try {
	                            BufferedImage image = ImageIO.read(new File(defaultImagePath));
	                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                            ImageIO.write(image, "jpg", baos);
	                            baos.flush();
	                            imageBytes = baos.toByteArray();
	                            baos.close();
	                        } catch (IOException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc hình ảnh.");
	                            return;
	                        }

	                        // Hiển thị frame Information_cart
	                        Information_cart_bongda infoCartFrame = new Information_cart_bongda(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });

                
                
                JPanel panel_1_1_6 = new JPanel();
                panel_1_1_6.setLayout(null);
                panel_1_1_6.setBackground(Color.WHITE);
                panel_1_1_6.setBounds(745, 724, 211, 261);
                panel.add(panel_1_1_6);
                
                JLabel lblNewLabel_11_1_6 = new JLabel("");
                lblNewLabel_11_1_6.setBounds(94, 5, 45, 13);
                panel_1_1_6.add(lblNewLabel_11_1_6);
                
                JLabel lblNewLabel_10_1_6 = new JLabel("");
                lblNewLabel_10_1_6.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_10_1_6.setIcon(new ImageIcon("C:\\Users\\nguye\\eclipse-workspace\\DACS1_SHOP\\img\\manchester-united-heritage-football-size-5_ss4_p-11994949-u-61e6cby8ri7rbp4e70q3-v-0a5c8daf39f64900b (1).png"));
                lblNewLabel_10_1_6.setBounds(10, 5, 193, 169);
                panel_1_1_6.add(lblNewLabel_10_1_6);
                
                JLabel lblNewLabel_12_1_6 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_6.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_6.setBounds(56, 172, 127, 22);
                panel_1_1_6.add(lblNewLabel_12_1_6);
                
                JCheckBox chckbxNewCheckBox_3_6 = new JCheckBox("S");
                chckbxNewCheckBox_3_6.setBounds(14, 189, 36, 21);
                panel_1_1_6.add(chckbxNewCheckBox_3_6);
                
                JCheckBox chckbxNewCheckBox_1_1_6 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_6.setBounds(113, 189, 36, 21);
                panel_1_1_6.add(chckbxNewCheckBox_1_1_6);
                
                JCheckBox chckbxNewCheckBox_2_2_6 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_6.setBounds(158, 189, 45, 21);
                panel_1_1_6.add(chckbxNewCheckBox_2_2_6);
                
                JCheckBox chckbxNewCheckBox_2_1_1_6 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_6.setBounds(66, 189, 36, 21);
                panel_1_1_6.add(chckbxNewCheckBox_2_1_1_6);
                
                ButtonGroup group7 = new ButtonGroup();
                group7.add(chckbxNewCheckBox_3_6);
                group7.add(chckbxNewCheckBox_1_1_6);
                group7.add(chckbxNewCheckBox_2_2_6);
                group7.add(chckbxNewCheckBox_2_1_1_6);
                
                JLabel lblNewLabel_15_1_6 = new JLabel("1.751.999đ");
                lblNewLabel_15_1_6.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_6.setBounds(56, 216, 107, 13);
                panel_1_1_6.add(lblNewLabel_15_1_6);
                
                JButton btnNewButton_4_2_6 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_6.setBackground(Color.RED);
                btnNewButton_4_2_6.setBounds(10, 230, 139, 21);
                panel_1_1_6.add(btnNewButton_4_2_6);
                
                JComboBox comboBox_1_4 = new JComboBox();
                comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_4.setBounds(160, 230, 43, 21);
                panel_1_1_6.add(comboBox_1_4);
                
                // tính toán giá tiền của sản phẩm
                String initialPriceText4 = lblNewLabel_15_1_6.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
                int basePrice4 = Integer.parseInt(initialPriceText4);
                comboBox_1_4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int quantity = Integer.parseInt((String) comboBox_1_4.getSelectedItem());

                        int totalPrice = basePrice4 * quantity;

                        lblNewLabel_15_1_6.setText(String.format("%,dđ", totalPrice).replace(",", "."));
                    }
                });

	// kiểm tra xem người dùng chọn size chưa 
 btnNewButton_4_2_6.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        if (!chckbxNewCheckBox_3_6.isSelected() && !chckbxNewCheckBox_1_1_6.isSelected() &&
	                                !chckbxNewCheckBox_2_2_6.isSelected() && !chckbxNewCheckBox_2_1_1_6.isSelected()) {
	                            Component frame = null;
	                            JOptionPane.showMessageDialog(frame, "Vui lòng chọn size trước khi thêm vào giỏ hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                            return;
	                        }

	                        // Thu thập thông tin sản phẩm
	                        String productName = lblNewLabel_12_1_6.getText();
	                        String size = "";
	                        if (chckbxNewCheckBox_3_6.isSelected()) {
	                            size = "S";
	                        } else if (chckbxNewCheckBox_1_1_6.isSelected()) {
	                            size = "M";
	                        } else if (chckbxNewCheckBox_2_2_6.isSelected()) {
	                            size = "L";
	                        } else if (chckbxNewCheckBox_2_1_1_6.isSelected()) {
	                            size = "XL";
	                        }

	                        int quantity = Integer.parseInt((String) comboBox_1_4.getSelectedItem());
	                        String priceText = lblNewLabel_15_1_6.getText().replace("đ", "").replace(".", "").trim();
	                        double price = Double.parseDouble(priceText);

	                        byte[] imageBytes = null;
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\eclipse-workspace\\\\DACS1_SHOP\\\\img\\\\manchester-united-heritage-football-size-5_ss4_p-11994949-u-61e6cby8ri7rbp4e70q3-v-0a5c8daf39f64900b (1).png";
	                        try {
	                            BufferedImage image = ImageIO.read(new File(defaultImagePath));
	                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                            ImageIO.write(image, "jpg", baos);
	                            baos.flush();
	                            imageBytes = baos.toByteArray();
	                            baos.close();
	                        } catch (IOException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc hình ảnh.");
	                            return;
	                        }

	                        // Hiển thị frame Information_cart
	                        Information_cart_bongda infoCartFrame = new Information_cart_bongda(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
	               
                JPanel panel_6 = new JPanel();
                panel_6.setBackground(new Color(255, 0, 0));
                panel_6.setBounds(77, 655, 182, 49);
                panel.add(panel_6);
                panel_6.setLayout(null);
                
                JLabel lblNewLabel_16 = new JLabel("Bóng Đá");
                lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 17));
                lblNewLabel_16.setForeground(new Color(255, 255, 255));
                lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_16.setBounds(0, 5, 182, 44);
                panel_6.add(lblNewLabel_16);
                
                JPanel panel_1_1_7 = new JPanel();
                panel_1_1_7.setLayout(null);
                panel_1_1_7.setBackground(Color.WHITE);
                panel_1_1_7.setBounds(10, 372, 211, 261);
                panel.add(panel_1_1_7);
                
                JLabel lblNewLabel_11_1_7 = new JLabel("");
                lblNewLabel_11_1_7.setBounds(94, 5, 45, 13);
                panel_1_1_7.add(lblNewLabel_11_1_7);
                
                JLabel lblNewLabel_10_1_7 = new JLabel("");
                lblNewLabel_10_1_7.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Bong_Manchester_United_Club_DJo_GH0061 (1).png"));
                lblNewLabel_10_1_7.setBounds(10, 5, 193, 169);
                panel_1_1_7.add(lblNewLabel_10_1_7);
                
                JLabel lblNewLabel_12_1_7 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_7.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_7.setBounds(56, 172, 127, 22);
                panel_1_1_7.add(lblNewLabel_12_1_7);
                
                JCheckBox chckbxNewCheckBox_3_7 = new JCheckBox("S");
                chckbxNewCheckBox_3_7.setBounds(14, 189, 36, 21);
                panel_1_1_7.add(chckbxNewCheckBox_3_7);
                
                JCheckBox chckbxNewCheckBox_1_1_7 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_7.setBounds(113, 189, 36, 21);
                panel_1_1_7.add(chckbxNewCheckBox_1_1_7);
                
                JCheckBox chckbxNewCheckBox_2_2_7 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_7.setBounds(158, 189, 45, 21);
                panel_1_1_7.add(chckbxNewCheckBox_2_2_7);
                
                JCheckBox chckbxNewCheckBox_2_1_1_7 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_7.setBounds(66, 189, 36, 21);
                panel_1_1_7.add(chckbxNewCheckBox_2_1_1_7);
                
                ButtonGroup group8 = new ButtonGroup();
                group8.add(chckbxNewCheckBox_3_7);
                group8.add(chckbxNewCheckBox_1_1_7);
                group8.add(chckbxNewCheckBox_2_2_7);
                group8.add(chckbxNewCheckBox_2_1_1_7);
                
                JLabel lblNewLabel_15_1_7 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_7.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_7.setBounds(56, 216, 107, 13);
                panel_1_1_7.add(lblNewLabel_15_1_7);
                
                JButton btnNewButton_4_2_7 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_7.setBackground(Color.RED);
                btnNewButton_4_2_7.setBounds(10, 230, 139, 21);
                panel_1_1_7.add(btnNewButton_4_2_7);
                
                JComboBox comboBox_1_5 = new JComboBox();
                comboBox_1_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_5.setBounds(160, 230, 43, 21);
                panel_1_1_7.add(comboBox_1_5);
                
             // tính toán giá tiền của sản phẩm
                String initialPriceText = lblNewLabel_15_1_7.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
                int basePrice = Integer.parseInt(initialPriceText);
                comboBox_1_5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int quantity = Integer.parseInt((String) comboBox_1_5.getSelectedItem());

                        int totalPrice = basePrice * quantity;

                        lblNewLabel_15_1_7.setText(String.format("%,dđ", totalPrice).replace(",", "."));
                    }
                });

// kiểm tra xem người dùng chọn size chưa 
	                btnNewButton_4_2_7.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        if (!chckbxNewCheckBox_3_7.isSelected() && !chckbxNewCheckBox_1_1_7.isSelected() &&
	                                !chckbxNewCheckBox_2_2_7.isSelected() && !chckbxNewCheckBox_2_1_1_7.isSelected()) {
	                            Component frame = null;
	                            JOptionPane.showMessageDialog(frame, "Vui lòng chọn size trước khi thêm vào giỏ hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                            return;
	                        }

	                        // Thu thập thông tin sản phẩm
	                        String productName = lblNewLabel_12_1_7.getText();
	                        String size = "";
	                        if (chckbxNewCheckBox_3_7.isSelected()) {
	                            size = "S";
	                        } else if (chckbxNewCheckBox_1_1_7.isSelected()) {
	                            size = "M";
	                        } else if (chckbxNewCheckBox_2_2_7.isSelected()) {
	                            size = "L";
	                        } else if (chckbxNewCheckBox_2_1_1_7.isSelected()) {
	                            size = "XL";
	                        }

	                        int quantity = Integer.parseInt((String) comboBox_1_5.getSelectedItem());
	                        String priceText = lblNewLabel_15_1_7.getText().replace("đ", "").replace(".", "").trim();
	                        double price = Double.parseDouble(priceText);

	                        byte[] imageBytes = null;
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\Bong_Manchester_United_Club_DJo_GH0061 (1).png";
	                        try {
	                            BufferedImage image = ImageIO.read(new File(defaultImagePath));
	                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                            ImageIO.write(image, "jpg", baos);
	                            baos.flush();
	                            imageBytes = baos.toByteArray();
	                            baos.close();
	                        } catch (IOException ex) {
	                            ex.printStackTrace();
	                            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc hình ảnh.");
	                            return;
	                        }

	                        // Hiển thị frame Information_cart
	                        Information_cart_bongda infoCartFrame = new Information_cart_bongda(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
    }
}