package Shop_View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Client_AoQuan extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private ImageIcon[] images;
    private int currentImageIndex = 0;
    private JLabel lblSlideshow;
    

    
    public Client_AoQuan() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1056, 755);
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

        JLabel toatl_shop = new JLabel("0");
        toatl_shop.setBackground(new Color(255, 0, 0));
        toatl_shop.setFont(new Font("Tahoma", Font.PLAIN, 20));
        toatl_shop.setHorizontalAlignment(SwingConstants.CENTER);
        toatl_shop.setForeground(new Color(0, 0, 0));
        toatl_shop.setBounds(835, 0, 50, 35);
        panel.add(toatl_shop);

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
                clientQuanAoFrame.setVisible(true);
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
                dispose();
                clientBongDaFrame.setVisible(true);
                setLocationRelativeTo(null);
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
            }
        });

        JLabel lblNewLabel_9 = new JLabel("HOTLINE :0344413346");
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
        btnNewButton.setBackground(Color.RED); 
        btnNewButton.setOpaque(true); 
        btnNewButton.setBorderPainted(false); 
        btnNewButton.setContentAreaFilled(true); 
        panel.add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_Giay clientGiayFrame = new Client_Giay();
                clientGiayFrame.setVisible(true);
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
        btnNewButton_2.setForeground(new Color(0, 0, 0));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton_2.setOpaque(true);
        btnNewButton_2.setContentAreaFilled(true);
        btnNewButton_2.setBorderPainted(false);
        btnNewButton_2.setBackground(new Color(255, 255, 0));
        btnNewButton_2.setBounds(10, 186, 234, 49);
        panel.add(btnNewButton_2);
        
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_AoQuan clientQuanAoFrame = new Client_AoQuan();
                dispose();
                clientQuanAoFrame.setVisible(true);
            }
        });

	        JButton btnNewButton_3 = new JButton("Bóng đá");
	        btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        btnNewButton_3.setForeground(new Color(255, 255, 255));
	        btnNewButton_3.setOpaque(true);
	        btnNewButton_3.setContentAreaFilled(true);
	        btnNewButton_3.setBorderPainted(false);
	        btnNewButton_3.setBackground(Color.RED);
	        btnNewButton_3.setBounds(10, 239, 234, 49);
	        panel.add(btnNewButton_3);
        
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client_BongDa clientBongDaFrame = new Client_BongDa();
                dispose();
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
                
                JPanel panel_mu = new JPanel();
                panel_mu.setLayout(null);
                panel_mu.setBackground(Color.WHITE);
                panel_mu.setBounds(254, 372, 211, 261);
                panel.add(panel_mu);
                
                JLabel lblNewLabel_11_1 = new JLabel("");
                lblNewLabel_11_1.setBounds(94, 5, 45, 13);
                panel_mu.add(lblNewLabel_11_1);
                
	                JLabel imghat = new JLabel("");
	                imghat.setHorizontalAlignment(SwingConstants.CENTER);
	                imghat.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\manchester-united-1968-european-cup-final-shirt_ss4_p-12013859-u-sdw4gbfar9u7wefygp3x-v-e64a303c0b85 (2).png"));
	                imghat.setBounds(10, 5, 193, 169);
	                panel_mu.add(imghat);
	                
	                JLabel namehat = new JLabel("Áo gió");
	                namehat.setHorizontalAlignment(SwingConstants.CENTER);
	                namehat.setBounds(43, 167, 127, 22);
	                panel_mu.add(namehat);
	                
	                JCheckBox chckbxNewCheckBox_3 = new JCheckBox("S");
	                chckbxNewCheckBox_3.setBounds(14, 189, 36, 21);
	                panel_mu.add(chckbxNewCheckBox_3);
	                
	                JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("L");
	                chckbxNewCheckBox_1_1.setBounds(113, 189, 36, 21);
	                panel_mu.add(chckbxNewCheckBox_1_1);
	                
	                JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("XL");
	                chckbxNewCheckBox_2_2.setBounds(158, 189, 45, 21);
	                panel_mu.add(chckbxNewCheckBox_2_2);
	                
	                JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("M");
	                chckbxNewCheckBox_2_1_1.setBounds(66, 189, 36, 21);
	                panel_mu.add(chckbxNewCheckBox_2_1_1);
	                
	                ButtonGroup group1 = new ButtonGroup();
	                group1.add(chckbxNewCheckBox_3);
	                group1.add(chckbxNewCheckBox_1_1);
	                group1.add(chckbxNewCheckBox_2_2);
	                group1.add(chckbxNewCheckBox_2_1_1);
	                
	                JLabel lblNewLabel_15_1 = new JLabel("500.000đ");
	                lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_15_1.setBounds(56, 216, 107, 13);
	                panel_mu.add(lblNewLabel_15_1);
	                
	                JButton btnNewButton_4_2 = new JButton("THÊM GIỎ HÀNG");
	                btnNewButton_4_2.setBackground(Color.RED);
	                btnNewButton_4_2.setBounds(10, 230, 139, 21);
	                panel_mu.add(btnNewButton_4_2);
	
	                JComboBox comboBox_1 = new JComboBox();
	                comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
	                comboBox_1.setBounds(160, 230, 43, 21);
	                panel_mu.add(comboBox_1);
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
	                        String productName = namehat.getText();
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
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\manchester-united-1968-european-cup-final-shirt_ss4_p-12013859-u-sdw4gbfar9u7wefygp3x-v-e64a303c0b85 (2).png";
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
	                        Information_cart_aoquan infoCartFrame = new Information_cart_aoquan(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });

	                
	                JPanel panelao = new JPanel();
	                panelao.setLayout(null);
	                panelao.setBackground(Color.WHITE);
	                panelao.setBounds(485, 372, 211, 261);
	                panel.add(panelao);
	                
	                JLabel lblNewLabel_11_1_1 = new JLabel("");
	                lblNewLabel_11_1_1.setBounds(94, 5, 45, 13);
	                panelao.add(lblNewLabel_11_1_1);
	                
	                JLabel img_ao = new JLabel("");
	                img_ao.setHorizontalAlignment(SwingConstants.CENTER);
	                img_ao.setIcon(new ImageIcon("C:\\Users\\nguye\\eclipse-workspace\\DACS1_SHOP\\img\\manchester-united-adidas-future-icons-3-stripe-full-zip-hoodie-black-mens_ss4_p-13338708+u-xtev92ut504kj3eowu51+v-9d9da1311cd14107997a5e1504d660f0 (1).png"));
	                img_ao.setBounds(10, 5, 193, 169);
	                panelao.add(img_ao);
	                
	                JLabel lblNewLabel_12_1_1 = new JLabel("Áo Traning");
	                lblNewLabel_12_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_12_1_1.setBounds(50, 170, 127, 22);
	                panelao.add(lblNewLabel_12_1_1);
	                
	                JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("S");
	                chckbxNewCheckBox_3_1.setBounds(14, 189, 36, 21);
	                panelao.add(chckbxNewCheckBox_3_1);
	                
	                JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("L");
	                chckbxNewCheckBox_1_1_1.setBounds(113, 189, 36, 21);
	                panelao.add(chckbxNewCheckBox_1_1_1);
	                
	                JCheckBox chckbxNewCheckBox_2_2_1 = new JCheckBox("XL");
	                chckbxNewCheckBox_2_2_1.setBounds(158, 189, 45, 21);
	                panelao.add(chckbxNewCheckBox_2_2_1);
	                
	                JCheckBox chckbxNewCheckBox_2_1_1_1 = new JCheckBox("M");
	                chckbxNewCheckBox_2_1_1_1.setBounds(66, 189, 36, 21);
	                panelao.add(chckbxNewCheckBox_2_1_1_1);
	                
	                ButtonGroup group2 = new ButtonGroup();
	                group2.add(chckbxNewCheckBox_3_1);
	                group2.add(chckbxNewCheckBox_1_1_1);
	                group2.add(chckbxNewCheckBox_2_2_1);
	                group2.add(chckbxNewCheckBox_2_1_1_1);
	                
	                JLabel lblNewLabel_15_1_1 = new JLabel("1.200.000đ");
	                lblNewLabel_15_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_15_1_1.setBounds(56, 216, 107, 13);
	                panelao.add(lblNewLabel_15_1_1);
	                
	                JComboBox comboBox_2 = new JComboBox();
	                comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
	                comboBox_2.setBounds(160, 230, 43, 21);
	                panelao.add(comboBox_2);
	                
	                JButton btnNewButton_4_2_1 = new JButton("THÊM GIỎ HÀNG");
	                btnNewButton_4_2_1.setBackground(Color.RED);
	                btnNewButton_4_2_1.setBounds(14, 230, 139, 21);
	                panelao.add(btnNewButton_4_2_1);
	                
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
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\eclipse-workspace\\\\DACS1_SHOP\\\\img\\\\manchester-united-adidas-future-icons-3-stripe-full-zip-hoodie-black-mens_ss4_p-13338708+u-xtev92ut504kj3eowu51+v-9d9da1311cd14107997a5e1504d660f0 (1).png";
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
	                        Information_cart_aoquan infoCartFrame = new Information_cart_aoquan(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });

	                
	                
	                
	                JPanel panelao2 = new JPanel();
	                panelao2.setLayout(null);
	                panelao2.setBackground(Color.WHITE);
	                panelao2.setBounds(723, 372, 211, 261);
	                panel.add(panelao2);
	                
	                JLabel lblNewLabel_11_1_2 = new JLabel("");
	                lblNewLabel_11_1_2.setBounds(94, 5, 45, 13);
	                panelao2.add(lblNewLabel_11_1_2);
	                
	                JLabel lblNewLabel_10_1_2 = new JLabel("");
	                lblNewLabel_10_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_10_1_2.setIcon(new ImageIcon("C:\\Users\\nguye\\eclipse-workspace\\DACS1_SHOP\\img\\manchester-united-adidas-home-shirt-2023-24-long-sleeve-with-martial-9-printing_ss5_p-14404782+u-bbzsfutmwqa3xqtt80rx+v-zg6ffrtqjll3ic9bxtxy (1) (2).png"));
	                lblNewLabel_10_1_2.setBounds(10, 5, 193, 169);
	                panelao2.add(lblNewLabel_10_1_2);
	                
	                JLabel lblNewLabel_12_1_2 = new JLabel("Áo Martial");
	                lblNewLabel_12_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_12_1_2.setBounds(48, 172, 127, 22);
	                panelao2.add(lblNewLabel_12_1_2);
	                
	                JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("S");
	                chckbxNewCheckBox_3_2.setBounds(14, 189, 36, 21);
	                panelao2.add(chckbxNewCheckBox_3_2);
	                
	                JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("L");
	                chckbxNewCheckBox_1_1_2.setBounds(113, 189, 36, 21);
	                panelao2.add(chckbxNewCheckBox_1_1_2);
	                
	                JCheckBox chckbxNewCheckBox_2_2_2 = new JCheckBox("XL");
	                chckbxNewCheckBox_2_2_2.setBounds(158, 189, 45, 21);
	                panelao2.add(chckbxNewCheckBox_2_2_2);
	                
	                JCheckBox chckbxNewCheckBox_2_1_1_2 = new JCheckBox("M");
	                chckbxNewCheckBox_2_1_1_2.setBounds(66, 189, 36, 21);
	                panelao2.add(chckbxNewCheckBox_2_1_1_2);
	                
	                ButtonGroup group3 = new ButtonGroup();
	                group3.add(chckbxNewCheckBox_3_2);
	                group3.add(chckbxNewCheckBox_1_1_2);
	                group3.add(chckbxNewCheckBox_2_2_2);
	                group3.add(chckbxNewCheckBox_2_1_1_2);
	                
	                JLabel lblNewLabel_15_1_2 = new JLabel("1.300.000đ");
	                lblNewLabel_15_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_15_1_2.setBounds(56, 216, 107, 13);
	                panelao2.add(lblNewLabel_15_1_2);
	                
	                JButton btnNewButton_4_2_2 = new JButton("THÊM GIỎ HÀNG");
	                btnNewButton_4_2_2.setBackground(Color.RED);
	                btnNewButton_4_2_2.setBounds(14, 230, 139, 21);
	                panelao2.add(btnNewButton_4_2_2);
	                
	                JComboBox comboBox_3 = new JComboBox();
	                comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
	                comboBox_3.setBounds(160, 230, 43, 21);
	                panelao2.add(comboBox_3);
	                 
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
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\eclipse-workspace\\\\DACS1_SHOP\\\\img\\\\manchester-united-adidas-home-shirt-2023-24-long-sleeve-with-martial-9-printing_ss5_p-14404782+u-bbzsfutmwqa3xqtt80rx+v-zg6ffrtqjll3ic9bxtxy (1) (2).png";
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
	                        Information_cart_aoquan infoCartFrame = new Information_cart_aoquan(productName, size, quantity, price, imageBytes);
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
	                
	                JPanel panelao3 = new JPanel();
	                panelao3.setLayout(null);
	                panelao3.setBackground(Color.WHITE);
	                panelao3.setBounds(21, 724, 211, 261);
	                panel.add(panelao3);
	                
	                JLabel lblNewLabel_11_1_3 = new JLabel("");
	                lblNewLabel_11_1_3.setBounds(94, 5, 45, 13);
	                panelao3.add(lblNewLabel_11_1_3);
	                
	                JLabel lblNewLabel_10_1_3 = new JLabel("");
	                lblNewLabel_10_1_3.setIcon(new ImageIcon("C:\\Users\\nguye\\eclipse-workspace\\DACS1_SHOP\\img\\manchester-united-adidas-staff-polo-grey_ss5_p-14402787+u-oywqlk9fx6xncthvblyx+v-5yxfwpweukmgosnrfhuh (1).png"));
	                lblNewLabel_10_1_3.setBounds(10, 5, 193, 169);
	                panelao3.add(lblNewLabel_10_1_3);
	                
	                JLabel lblNewLabel_12_1_3 = new JLabel("Áo Polo");
	                lblNewLabel_12_1_3.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_12_1_3.setBounds(34, 171, 127, 22);
	                panelao3.add(lblNewLabel_12_1_3);
	                
	                JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("S");
	                chckbxNewCheckBox_3_3.setBounds(14, 189, 36, 21);
	                panelao3.add(chckbxNewCheckBox_3_3);
	                
	                JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("L");
	                chckbxNewCheckBox_1_1_3.setBounds(113, 189, 36, 21);
	                panelao3.add(chckbxNewCheckBox_1_1_3);
	                
	                JCheckBox chckbxNewCheckBox_2_2_3 = new JCheckBox("XL");
	                chckbxNewCheckBox_2_2_3.setBounds(158, 189, 45, 21);
	                panelao3.add(chckbxNewCheckBox_2_2_3);
	                
	                JCheckBox chckbxNewCheckBox_2_1_1_3 = new JCheckBox("M");
	                chckbxNewCheckBox_2_1_1_3.setBounds(66, 189, 36, 21);
	                panelao3.add(chckbxNewCheckBox_2_1_1_3);
	                
	                ButtonGroup group4 = new ButtonGroup();
	                group4.add(chckbxNewCheckBox_3_3);
	                group4.add(chckbxNewCheckBox_1_1_3);
	                group4.add(chckbxNewCheckBox_2_2_3);
	                group4.add(chckbxNewCheckBox_2_1_1_3);
	                
	                JLabel lblNewLabel_15_1_3 = new JLabel("1.300.599đ");
	                lblNewLabel_15_1_3.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_15_1_3.setBounds(56, 216, 107, 13);
	                panelao3.add(lblNewLabel_15_1_3);
	                
	                JButton btnNewButton_4_2_3 = new JButton("THÊM GIỎ HÀNG");
	                btnNewButton_4_2_3.setBackground(Color.RED);
	                btnNewButton_4_2_3.setBounds(10, 230, 139, 21);
	                panelao3.add(btnNewButton_4_2_3);
	                
	                JComboBox comboBox_1_1 = new JComboBox();
	                comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
	                comboBox_1_1.setBounds(160, 230, 43, 21);
	                panelao3.add(comboBox_1_1);
 
	                
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
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\eclipse-workspace\\\\DACS1_SHOP\\\\img\\\\manchester-united-adidas-staff-polo-grey_ss5_p-14402787+u-oywqlk9fx6xncthvblyx+v-5yxfwpweukmgosnrfhuh (1).png";
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
	                        Information_cart_aoquan infoCartFrame = new Information_cart_aoquan(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
	                JPanel panelao4 = new JPanel();
	                panelao4.setLayout(null);
	                panelao4.setBackground(Color.WHITE);
	                panelao4.setBounds(276, 724, 211, 261);
	                panel.add(panelao4);
	                
	                JLabel lblNewLabel_11_1_4 = new JLabel("");
	                lblNewLabel_11_1_4.setBounds(94, 5, 45, 13);
	                panelao4.add(lblNewLabel_11_1_4);
	                
	                JLabel lblNewLabel_10_1_4 = new JLabel("");
	                lblNewLabel_10_1_4.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_10_1_4.setIcon(new ImageIcon("C:\\Users\\nguye\\eclipse-workspace\\DACS1_SHOP\\img\\manchester-united-adidas-training-presentation-jacket-green_ss5_p-200616832+u-xpyudpsn08mectcsmbpy+v-chkllps25kfm9ldqqtoo (1).png"));
	                lblNewLabel_10_1_4.setBounds(10, 5, 193, 169);
	                panelao4.add(lblNewLabel_10_1_4);
	                
	                JLabel lblNewLabel_12_1_4 = new JLabel("Áo Khoác ");
	                lblNewLabel_12_1_4.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_12_1_4.setBounds(42, 172, 127, 22);
	                panelao4.add(lblNewLabel_12_1_4);
	                
	                JCheckBox chckbxNewCheckBox_3_4 = new JCheckBox("S");
	                chckbxNewCheckBox_3_4.setBounds(14, 189, 36, 21);
	                panelao4.add(chckbxNewCheckBox_3_4);
	                
	                JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("L");
	                chckbxNewCheckBox_1_1_4.setBounds(113, 189, 36, 21);
	                panelao4.add(chckbxNewCheckBox_1_1_4);
	                
	                JCheckBox chckbxNewCheckBox_2_2_4 = new JCheckBox("XL");
	                chckbxNewCheckBox_2_2_4.setBounds(158, 189, 45, 21);
	                panelao4.add(chckbxNewCheckBox_2_2_4);
	                
	                JCheckBox chckbxNewCheckBox_2_1_1_4 = new JCheckBox("M");
	                chckbxNewCheckBox_2_1_1_4.setBounds(66, 189, 36, 21);
	                panelao4.add(chckbxNewCheckBox_2_1_1_4);
	                
	                ButtonGroup group5 = new ButtonGroup();
	                group5.add(chckbxNewCheckBox_3_4);
	                group5.add(chckbxNewCheckBox_1_1_4);
	                group5.add(chckbxNewCheckBox_2_2_4);
	                group5.add(chckbxNewCheckBox_2_1_1_4);
	                
	                JLabel lblNewLabel_15_1_4 = new JLabel("1.785.00đ");
	                lblNewLabel_15_1_4.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_15_1_4.setBounds(56, 216, 107, 13);
	                panelao4.add(lblNewLabel_15_1_4);
	                
	                JButton btnNewButton_4_2_4 = new JButton("THÊM GIỎ HÀNG");
	                btnNewButton_4_2_4.setBackground(Color.RED);
	                btnNewButton_4_2_4.setBounds(10, 230, 139, 21);
	                panelao4.add(btnNewButton_4_2_4);
	                
	                JComboBox comboBox_1_2 = new JComboBox();
	                comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
	                comboBox_1_2.setBounds(160, 230, 43, 21);
	                panelao4.add(comboBox_1_2);
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
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\eclipse-workspace\\\\DACS1_SHOP\\\\img\\\\manchester-united-adidas-training-presentation-jacket-green_ss5_p-200616832+u-xpyudpsn08mectcsmbpy+v-chkllps25kfm9ldqqtoo (1).png";
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
	                        Information_cart_aoquan infoCartFrame = new Information_cart_aoquan(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
	                
	                
	                JPanel panelao5 = new JPanel();
	                panelao5.setLayout(null);
	                panelao5.setBackground(Color.WHITE);
	                panelao5.setBounds(507, 724, 211, 261);
	                panel.add(panelao5);
	                
	                JLabel lblNewLabel_11_1_5 = new JLabel("");
	                lblNewLabel_11_1_5.setBounds(94, 5, 45, 13);
	                panelao5.add(lblNewLabel_11_1_5);
	                
	                JLabel lblNewLabel_10_1_5 = new JLabel("");
	                lblNewLabel_10_1_5.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_10_1_5.setIcon(new ImageIcon("C:\\Users\\nguye\\eclipse-workspace\\DACS1_SHOP\\img\\manchester-united-adidas-training-t-shirt-green_ss5_p-200616845+u-0gakqwep3rkb99ylvjjj+v-evkfc6prml7mth2h1pno (1) (2).png"));
	                lblNewLabel_10_1_5.setBounds(10, 5, 193, 169);
	                panelao5.add(lblNewLabel_10_1_5);
	                
	                JLabel lblNewLabel_12_1_5 = new JLabel("Áo Thun");
	                lblNewLabel_12_1_5.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_12_1_5.setBounds(34, 171, 127, 22);
	                panelao5.add(lblNewLabel_12_1_5);
	                
	                JCheckBox chckbxNewCheckBox_3_5 = new JCheckBox("S");
	                chckbxNewCheckBox_3_5.setBounds(14, 189, 36, 21);
	                panelao5.add(chckbxNewCheckBox_3_5);
	                
	                JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("L");
	                chckbxNewCheckBox_1_1_5.setBounds(113, 189, 36, 21);
	                panelao5.add(chckbxNewCheckBox_1_1_5);
	                
	                JCheckBox chckbxNewCheckBox_2_2_5 = new JCheckBox("XL");
	                chckbxNewCheckBox_2_2_5.setBounds(158, 189, 45, 21);
	                panelao5.add(chckbxNewCheckBox_2_2_5);
	                
	                JCheckBox chckbxNewCheckBox_2_1_1_5 = new JCheckBox("M");
	                chckbxNewCheckBox_2_1_1_5.setBounds(66, 189, 36, 21);
	                panelao5.add(chckbxNewCheckBox_2_1_1_5);
	                
	                ButtonGroup group6 = new ButtonGroup();
	                group6.add(chckbxNewCheckBox_3_5);
	                group6.add(chckbxNewCheckBox_1_1_5);
	                group6.add(chckbxNewCheckBox_2_2_5);
	                group6.add(chckbxNewCheckBox_2_1_1_5);
	                
	                JLabel lblNewLabel_15_1_5 = new JLabel("782.000đ");
	                lblNewLabel_15_1_5.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_15_1_5.setBounds(56, 216, 107, 13);
	                panelao5.add(lblNewLabel_15_1_5);
	                
	                JButton btnNewButton_4_2_5 = new JButton("THÊM GIỎ HÀNG");
	                btnNewButton_4_2_5.setBackground(Color.RED);
	                btnNewButton_4_2_5.setBounds(10, 230, 139, 21);
	                panelao5.add(btnNewButton_4_2_5);
	                
	                JComboBox comboBox_1_3 = new JComboBox();
	                comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
	                comboBox_1_3.setBounds(160, 230, 43, 21);
	                panelao5.add(comboBox_1_3);
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
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\eclipse-workspace\\\\DACS1_SHOP\\\\img\\\\manchester-united-adidas-training-t-shirt-green_ss5_p-200616845+u-0gakqwep3rkb99ylvjjj+v-evkfc6prml7mth2h1pno (1) (2).png";
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
	                        Information_cart_aoquan infoCartFrame = new Information_cart_aoquan(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
	                
	                JPanel panelao6 = new JPanel();
	                panelao6.setLayout(null);
	                panelao6.setBackground(Color.WHITE);
	                panelao6.setBounds(745, 724, 211, 261);
	                panel.add(panelao6);
	                
	                JLabel lblNewLabel_11_1_6 = new JLabel("");
	                lblNewLabel_11_1_6.setBounds(94, 5, 45, 13);
	                panelao6.add(lblNewLabel_11_1_6);
	                
	                JLabel lblNewLabel_10_1_6 = new JLabel("");
	                lblNewLabel_10_1_6.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\manchester-united-x-adidas-originals-88-90-shorts-blue_ss4_p-13355009+u-hoa355j4n9d1sql587aa+v-384e7bca73524f6aa1c8b0767b08cbcb (1) (2).png"));
	                lblNewLabel_10_1_6.setBounds(10, 5, 193, 169);
	                panelao6.add(lblNewLabel_10_1_6);
	                
	                JLabel lblNewLabel_12_1_6 = new JLabel("Quần Short");
	                lblNewLabel_12_1_6.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_12_1_6.setBounds(44, 172, 127, 22);
	                panelao6.add(lblNewLabel_12_1_6);
	                
	                JCheckBox chckbxNewCheckBox_3_6 = new JCheckBox("S");
	                chckbxNewCheckBox_3_6.setBounds(14, 189, 36, 21);
	                panelao6.add(chckbxNewCheckBox_3_6);
	                
	                JCheckBox chckbxNewCheckBox_1_1_6 = new JCheckBox("L");
	                chckbxNewCheckBox_1_1_6.setBounds(113, 189, 36, 21);
	                panelao6.add(chckbxNewCheckBox_1_1_6);
	                
	                JCheckBox chckbxNewCheckBox_2_2_6 = new JCheckBox("XL");
	                chckbxNewCheckBox_2_2_6.setBounds(158, 189, 45, 21);
	                panelao6.add(chckbxNewCheckBox_2_2_6);
	                
	                JCheckBox chckbxNewCheckBox_2_1_1_6 = new JCheckBox("M");
	                chckbxNewCheckBox_2_1_1_6.setBounds(66, 189, 36, 21);
	                panelao6.add(chckbxNewCheckBox_2_1_1_6);
	                
	                ButtonGroup group7 = new ButtonGroup();
	                group7.add(chckbxNewCheckBox_3_6);
	                group7.add(chckbxNewCheckBox_1_1_6);
	                group7.add(chckbxNewCheckBox_2_2_6);
	                group7.add(chckbxNewCheckBox_2_1_1_6);
	                
	                JLabel lblNewLabel_15_1_6 = new JLabel("500.000");
	                lblNewLabel_15_1_6.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_15_1_6.setBounds(56, 216, 107, 13);
	                panelao6.add(lblNewLabel_15_1_6);
	                
	                JButton btnNewButton_4_2_6 = new JButton("THÊM GIỎ HÀNG");
	                btnNewButton_4_2_6.setBackground(Color.RED);
	                btnNewButton_4_2_6.setBounds(10, 230, 139, 21);
	                panelao6.add(btnNewButton_4_2_6);
	                
	                JComboBox comboBox_1_4 = new JComboBox();
	                comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
	                comboBox_1_4.setBounds(160, 230, 43, 21);
	                panelao6.add(comboBox_1_4);
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
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\manchester-united-x-adidas-originals-88-90-shorts-blue_ss4_p-13355009+u-hoa355j4n9d1sql587aa+v-384e7bca73524f6aa1c8b0767b08cbcb (1) (2).png";
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
	                        Information_cart_aoquan infoCartFrame = new Information_cart_aoquan(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
	                JPanel panel_6 = new JPanel();
	                panel_6.setBackground(new Color(255, 0, 0));
	                panel_6.setBounds(77, 655, 182, 49);
	                panel.add(panel_6);
	                panel_6.setLayout(null);
	                
	                JLabel lblNewLabel_16 = new JLabel("Áo Quần Bóng Đá ");
	                lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 17));
	                lblNewLabel_16.setForeground(new Color(255, 255, 255));
	                lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_16.setBounds(0, 5, 182, 44);
	                panel_6.add(lblNewLabel_16);
	                
	                JPanel panelmainoo = new JPanel();
	                panelmainoo.setLayout(null);
	                panelmainoo.setBackground(Color.WHITE);
	                panelmainoo.setBounds(10, 372, 211, 261);
	                panel.add(panelmainoo);
	                
	                JLabel lblNewLabel_11_1_7 = new JLabel("");
	                lblNewLabel_11_1_7.setBounds(94, 5, 45, 13);
	                panelmainoo.add(lblNewLabel_11_1_7);
	                
	                JLabel imgmainoo = new JLabel("");
	                imgmainoo.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\manchester-united-adidas-home-shirt-2023-24-kids-with-mainoo-37-printing_ss5_p-14404822+u-f5jtqd16oywdz03oobwm+v-kombjxufvqanrbzrbvsn (2).jpg"));
	                imgmainoo.setBounds(10, 5, 193, 169);
	                panelmainoo.add(imgmainoo);
	                
	                JLabel aomainoo = new JLabel("Áo Mainoo");
	                aomainoo.setHorizontalAlignment(SwingConstants.CENTER);
	                aomainoo.setBounds(44, 170, 127, 22);
	                panelmainoo.add(aomainoo);
	                
	                
	                JCheckBox chckbxNewCheckBox_3_7 = new JCheckBox("S");
	                chckbxNewCheckBox_3_7.setBounds(14, 189, 36, 21);
	                panelmainoo.add(chckbxNewCheckBox_3_7);
	                
	                JCheckBox chckbxNewCheckBox_1_1_7 = new JCheckBox("L");
	                chckbxNewCheckBox_1_1_7.setBounds(113, 189, 36, 21);
	                panelmainoo.add(chckbxNewCheckBox_1_1_7);
	                
	                JCheckBox chckbxNewCheckBox_2_2_7 = new JCheckBox("XL");
	                chckbxNewCheckBox_2_2_7.setBounds(158, 189, 45, 21);
	                panelmainoo.add(chckbxNewCheckBox_2_2_7);
	                
	                JCheckBox chckbxNewCheckBox_2_1_1_7 = new JCheckBox("M");
	                chckbxNewCheckBox_2_1_1_7.setBounds(66, 189, 36, 21);
	                panelmainoo.add(chckbxNewCheckBox_2_1_1_7);
	                
	                ButtonGroup group8 = new ButtonGroup();
	                group8.add(chckbxNewCheckBox_3_7);
	                group8.add(chckbxNewCheckBox_1_1_7);
	                group8.add(chckbxNewCheckBox_2_2_7);
	                group8.add(chckbxNewCheckBox_2_1_1_7);
	                
	                JLabel lblNewLabel_15_1_7 = new JLabel("1.999.999đ");
	                lblNewLabel_15_1_7.setHorizontalAlignment(SwingConstants.CENTER);
	                lblNewLabel_15_1_7.setBounds(56, 216, 107, 13);
	                panelmainoo.add(lblNewLabel_15_1_7);
	                
	                JButton btnNewButton_4_2_7 = new JButton("THÊM GIỎ HÀNG");
	                btnNewButton_4_2_7.setBackground(Color.RED);
	                btnNewButton_4_2_7.setBounds(10, 230, 139, 21);
	                panelmainoo.add(btnNewButton_4_2_7);
	                
	                JComboBox comboBox_1_5 = new JComboBox();
	                comboBox_1_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
	                comboBox_1_5.setBounds(160, 230, 43, 21);
	                panelmainoo.add(comboBox_1_5);
	                
	                JButton btnNewButton_4_3_1_1_1 = new JButton("Chat");
	                btnNewButton_4_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	                btnNewButton_4_3_1_1_1.setBackground(new Color(0, 255, 128));
	                btnNewButton_4_3_1_1_1.setBounds(875, 17, 127, 45);
	                panel.add(btnNewButton_4_3_1_1_1);
	               	                
  // tính toán giá tiền của sản phẩm
	                String initialPriceText5 = lblNewLabel_15_1_7.getText().replace(".", "").replace(",", "").replace("đ", "").trim();
	                int basePrice5 = Integer.parseInt(initialPriceText5);
	                comboBox_1_5.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        int quantity = Integer.parseInt((String) comboBox_1_5.getSelectedItem());
	                        int totalPrice = basePrice5 * quantity;
	                        lblNewLabel_15_1_7.setText(String.format("%,dđ", totalPrice).replace(",", "."));
	                    }
	                });

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
	                        String productName = aomainoo.getText();
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
	                        String defaultImagePath = "C:\\\\Users\\\\nguye\\\\Downloads\\\\manchester-united-adidas-home-shirt-2023-24-kids-with-mainoo-37-printing_ss5_p-14404822+u-f5jtqd16oywdz03oobwm+v-kombjxufvqanrbzrbvsn (2).jpg";
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
	                        Information_cart_aoquan infoCartFrame = new Information_cart_aoquan(productName, size, quantity, price, imageBytes);
	                        infoCartFrame.setVisible(true);
	                        dispose();
	                    }
	           });
    }
}
