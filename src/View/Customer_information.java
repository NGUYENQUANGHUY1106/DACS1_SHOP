package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;

import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class Customer_information extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusername;
	private JTextField txtphonenumber;
	private JTextField txtemail;
	private Manager datSanHuySan;
	private static final String username = "root";
	private static final String password = "11062005";
	private static final String dataConn = "jdbc:mysql://localhost:3306/shop";	
	Connection sqlConn = null ;
	PreparedStatement pst = null;
	ResultSet rs = null ;
	int q,i,STT,customer ;
	private JTable table;
	private JPasswordField txtpasswordField;
	
	
	public Customer_information (Manager datSanHuySan)
	{
		this.datSanHuySan = datSanHuySan;
	}

	/**
	 * Launch the application.
	 */
	private void updateSTT() {
	    DefaultTableModel recordTable = (DefaultTableModel) table.getModel();
	    for (int i = 0; i < recordTable.getRowCount(); i++) {
	        recordTable.setValueAt(i + 1, i, 0); 
	    }
	}

	public Customer_information() {
		this.init();
		 upDateDB ();
	}
		  private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(84, 171, 134));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1129, 653);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel nenthongtinkhachhang = new JPanel();
		nenthongtinkhachhang.setBackground(new Color(121, 167, 208));
		nenthongtinkhachhang.setBounds(0, 0, 1129, 109);
		panel.add(nenthongtinkhachhang);
		nenthongtinkhachhang.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 1109, 87);
		nenthongtinkhachhang.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Information");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 43));
		lblNewLabel.setBounds(283, 10, 574, 61);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(69, 184, 138));
		panel_2.setBounds(828, 119, 291, 524);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 10, 271, 504);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton add = new JButton("Add New Data");		
		add.setFont(new Font("Tahoma", Font.BOLD, 20));
		add.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Pictogrammers-Material-Account-multiple-plus-outline.48.png"));
		add.setBounds(10, 10, 251, 68);
		panel_3.add(add);
		add.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            sqlConn = DriverManager.getConnection(dataConn, username, password);
		       
		            if (txtusername.getText().isEmpty() || txtphonenumber.getText().isEmpty() || 
		                txtemail.getText().isEmpty() || txtpasswordField.getText().isEmpty()) {
		                JOptionPane.showMessageDialog(null, "Vui Lòng Nhập Đầy Đủ Thông Tin.", "Error", JOptionPane.ERROR_MESSAGE);
		                return; 
		            }

		            pst = sqlConn.prepareStatement("insert into tk_khachhang(Ten_tk, `Số Điện Thoại`, email, password) values(?,?,?,?)");


		            pst.setString(1, txtusername.getText());
		            pst.setInt(2, Integer.parseInt(txtphonenumber.getText()));
		            pst.setString(3, txtemail.getText());
		            pst.setString(4, txtpasswordField.getText());

		            pst.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Added customers successfully!");
		            upDateDB();
		        } catch (ClassNotFoundException ex) {
		            java.util.logging.Logger.getLogger(Customer_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (SQLException ex) {
		            java.util.logging.Logger.getLogger(Customer_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		    }
		});

		
		JButton chinhsua = new JButton("Edit ");
		chinhsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		chinhsua.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Custom-Icon-Design-Flatastic-3-Document-edit.32.png"));
		chinhsua.setBounds(10, 88, 251, 79);
		panel_3.add(chinhsua);
		chinhsua.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            int selectedRow = table.getSelectedRow();

		            if (selectedRow != -1) { // Kiểm tra xem có hàng được chọn hay không
		                if (JOptionPane.showConfirmDialog(null, "Confirm if you want to Update", "Customer Information", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		                    Class.forName("com.mysql.cj.jdbc.Driver");
		                    sqlConn = DriverManager.getConnection(dataConn, username, password);
		                    pst = sqlConn.prepareStatement("UPDATE tk_khachhang SET Ten_tk = ?, `Số Điện Thoại` = ?, email = ?, password = ? WHERE `Mã KH` = ?");


		                   pst.setString(1, txtusername.getText());
		                    pst.setInt(2, Integer.parseInt(txtphonenumber.getText()));
		                    pst.setString(3, txtemail.getText());
		                    pst.setString(4, String.valueOf(txtpasswordField.getPassword()));

		                    // Lấy giá trị của cột STT từ model, không phải từ table
		                    int sttValue = (int) table.getModel().getValueAt(selectedRow, 0);

		                    pst.setInt(5, sttValue);
		                    pst.executeUpdate();
		                    JOptionPane.showMessageDialog(null, "Successfully updated record!");
		                    upDateDB();
		                }
		            } else {
		                JOptionPane.showMessageDialog(null, "Please select a row to update.");
		            }
		        } catch (ClassNotFoundException | SQLException ex) {
		            ex.printStackTrace();
		        }
		    }
		});

		
		 
		
		JButton reset = new JButton("Reset");		
		reset.setFont(new Font("Tahoma", Font.BOLD, 28));
		reset.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Iconsmind-Outline-Reset.48.png"));
		reset.setBounds(10, 177, 251, 73);
		panel_3.add(reset);
		reset.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JFrame resetFrame = new JFrame("Reset");
		        if(JOptionPane.showConfirmDialog(resetFrame, "Confirm if you want to reset","Customer Information",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		        {
		            txtusername.setText("");
		            txtphonenumber.setText("");
		            txtemail.setText("");
		            txtpasswordField.setText("");
		        }
		    }
		});
		
		JButton timkiem = new JButton("Search");
		timkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String timkiemPhoneNumber = JOptionPane.showInputDialog("Please enter the PhoneNumber to search");
				if (timkiemPhoneNumber != null) {
				    DefaultTableModel model = (DefaultTableModel) table.getModel();
				    boolean found = false;
				    for (int i = 0; i < model.getRowCount(); i++) {
				        String phoneNumber = model.getValueAt(i, 2).toString(); // This is PhoneNumber
				        if (phoneNumber.equals(timkiemPhoneNumber)) {
				            table.setRowSelectionInterval(i, i);
				            found = true;
				            break;
				        }
				    }
				    if (found) {
				        JOptionPane.showMessageDialog(rootPane, "PhoneNumber found " + timkiemPhoneNumber);
				    } else {
				        JOptionPane.showMessageDialog(rootPane, "PhoneNumber not found " + timkiemPhoneNumber);
				    }
				} else {
				    JOptionPane.showMessageDialog(rootPane, "Please enter the PhoneNumber to search");
				}

		    
		    }	
		});
			

		timkiem.setFont(new Font("Tahoma", Font.BOLD, 23));
		timkiem.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Iconleak-Atrous-Search.32.png"));
		timkiem.setBounds(10, 260, 251, 73);
		panel_3.add(timkiem);
		
		JButton xoa = new JButton("Delete");		
		xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    DefaultTableModel recordTable = (DefaultTableModel) table.getModel();
				    int selectedRows = table.getSelectedRow();
				    JFrame deleteFrame = new JFrame("Reset");

				    try {
				        if (selectedRows >= 0 && selectedRows < recordTable.getRowCount() && recordTable.getColumnCount() > 0) {
				            if (JOptionPane.showConfirmDialog(deleteFrame, "Confirm if you want to Delete", "Customer Information", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				                int STT = (int) recordTable.getValueAt(selectedRows, 0);

				                Class.forName("com.mysql.cj.jdbc.Driver");
				                sqlConn = DriverManager.getConnection(dataConn, username, password);
				                
				                sqlConn.setAutoCommit(false);

				                pst = sqlConn.prepareStatement("DELETE FROM tk_khachhang WHERE `Mã KH` = ?");
				                pst.setInt(1, STT);
				                pst.executeUpdate();

				                
				                sqlConn.commit();
				                sqlConn.setAutoCommit(true);

				                recordTable.removeRow(selectedRows);

				                JOptionPane.showMessageDialog(null, "Customer has been successfully deleted!");
				                

				                txtusername.setText("");
				                txtphonenumber.setText("");
				                txtemail.setText("");
				                txtpasswordField.setText("");
				            }
				        } else {
				            // Xử lý trường hợp không có cột hoặc chỉ số hàng không hợp lệ
				            JOptionPane.showMessageDialog(null, "Invalid selection or no columns in the table.", "Error", JOptionPane.ERROR_MESSAGE);
				        }
				    } catch (ClassNotFoundException | SQLException ex) {
				        // Rollback nếu có lỗi
				        try {
				            if (sqlConn != null) {
				                sqlConn.rollback();
				                sqlConn.setAutoCommit(true);
				            }
				        } catch (SQLException rollbackEx) {
				            rollbackEx.printStackTrace();
				        }
				        ex.printStackTrace();
				    }
				}


		});

		
		xoa.setFont(new Font("Tahoma", Font.BOLD, 24));
		xoa.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Oxygen-Icons.org-Oxygen-Actions-application-exit.32.png"));
		xoa.setBounds(10, 343, 251, 77);
		panel_3.add(xoa);
		
		JButton thoat = new JButton("Exit");
		thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFrame exitFrame = new JFrame("Exit");
			if(JOptionPane.showConfirmDialog(exitFrame, "Confirm if you want to exit","Customer Information",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			{
				dispose();
				Manager datSanHuySan = new Manager();
				datSanHuySan.setVisible(true);
				setLocationRelativeTo(null);
			}
			
			}
		});
		
		thoat.setFont(new Font("Tahoma", Font.BOLD, 23));
		thoat.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\Icons8-Windows-8-Users-Exit.32.png"));
		thoat.setBounds(10, 430, 251, 64);
		panel_3.add(thoat);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(69, 184, 138));
		panel_4.setBounds(10, 119, 808, 524);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 10, 788, 504);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel username = new JLabel("UserName");
		username.setFont(new Font("Dialog", Font.BOLD, 24));
		username.setBounds(63, 22, 159, 41);
		panel_5.add(username);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtusername.setBounds(232, 22, 494, 51);
		panel_5.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel phone = new JLabel("PhoneNumber");
		phone.setFont(new Font("Tahoma", Font.BOLD, 22));
		phone.setBounds(63, 96, 176, 29);
		panel_5.add(phone);
		
		txtphonenumber = new JTextField();
		txtphonenumber.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtphonenumber.setBounds(232, 96, 494, 51);
		panel_5.add(txtphonenumber);
		txtphonenumber.setColumns(10);
		
		JLabel email = new JLabel("Email");
		email.setFont(new Font("Tahoma", Font.BOLD, 26));
		email.setBounds(63, 177, 159, 29);
		panel_5.add(email);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtemail.setBounds(232, 173, 494, 51);
		panel_5.add(txtemail);
		txtemail.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(184, 236, 176));
		panel_6.setForeground(new Color(0, 0, 0));
		panel_6.setBounds(0, 326, 788, 178);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setBounds(10, 10, 768, 168);
		panel_6.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    displaySelectedRowData(selectedRow);
                }
            }
        });

        updateTable(); // Cập nhật bảng khi khung được khởi tạo
    
		table.setForeground(new Color(119, 202, 242));
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 KH", "UserName", "PhoneNumber", "Email", "Password"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(210);
		table.getColumnModel().getColumn(2).setPreferredWidth(77);
		table.getColumnModel().getColumn(3).setPreferredWidth(247);
		table.getColumnModel().getColumn(4).setPreferredWidth(73);
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setBounds(63, 261, 140, 28);
		panel_5.add(lblNewLabel_1);
		
		txtpasswordField = new JPasswordField();
		txtpasswordField.setBounds(232, 254, 494, 51);
		panel_5.add(txtpasswordField);
				

	}
	

	public void upDateDB ()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			sqlConn =  DriverManager.getConnection(dataConn,username,password);
			pst =  sqlConn.prepareStatement("select * from tk_khachhang ");
			
			rs = pst.executeQuery();
			ResultSetMetaData stData = rs.getMetaData();
			
			DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
			 RecordTable.setRowCount(0);
			 
			 while(rs.next())
			 {
				 Vector columnData = new Vector();
				 
				 for(i =1;i<=stData.getColumnCount();i++)
				 {
					 columnData.add(rs.getInt("Mã KH"));
					 columnData.add(rs.getString("Ten_tk"));
					 columnData.add(rs.getInt("Số Điện Thoại"));
					 columnData.add(rs.getString("email"));
					 columnData.add (rs.getString("password"));
					 
				 }
				 RecordTable.addRow(columnData);
			 }
		
			} catch (Exception ex) 
		{
			JOptionPane.showMessageDialog(null, ex);
		}		  		

	}
	 private void updateTable() {
	        DefaultTableModel model = (DefaultTableModel) table.getModel();
	        model.setRowCount(0);

	        try {
	            String url = "jdbc:mysql://localhost:3306/shop";
	            String user = "root";
	            String password = "11062005";

	            Connection connection = DriverManager.getConnection(url, user, password);
	            String selectQuery = "SELECT * FROM tk_khachhang";
	            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

	            ResultSet resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	                int stt = resultSet.getInt("Mã KH");
	                String tenKh = resultSet.getString("Ten_tk");
	                String SDT = resultSet.getString("Số Điện Thoại");
	                String email = resultSet.getString("email");
	                String Password = resultSet.getString("password");

	                model.addRow(new Object[]{stt, tenKh, SDT, email,Password});
	            }

	            resultSet.close();
	            preparedStatement.close();
	            connection.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	 }


	 private void displaySelectedRowData(int selectedRow) {
		    DefaultTableModel model = (DefaultTableModel) table.getModel();

		    if (selectedRow >= 0 && selectedRow < model.getRowCount()) {
		        int stt = (int) model.getValueAt(selectedRow, 0);
		        String userName = (String) model.getValueAt(selectedRow, 1);
		        String phoneNumber = model.getValueAt(selectedRow, 2).toString(); // Chuyển về kiểu String
		        String email = (String) model.getValueAt(selectedRow, 3);
		        String PassWord = model.getValueAt(selectedRow, 4).toString();
		        // Chuyển về kiểu String

		        // Hiển thị giá trị trên các JTextField
		        txtusername.setText(userName);
		        txtphonenumber.setText(phoneNumber);
		        txtemail.setText(email);
		        txtpasswordField.setText(PassWord);
		    } else {
		        // Xử lý trường hợp không có dòng nào được chọn
		        System.err.println("No row selected");
		    }
		}

	}




