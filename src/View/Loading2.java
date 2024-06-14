package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class Loading2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public JProgressBar progressBar;

    public Loading2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 787, 705);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\15f78822-0c98-4901-b7f7-b09b3d0a8bd3 (1).gif"));
        lblNewLabel.setBounds(0, 0, 773, 630);
        contentPane.add(lblNewLabel);

        progressBar = new JProgressBar();
        progressBar.setEnabled(false);
        progressBar.setStringPainted(true);
        progressBar.setBounds(10, 647, 763, 21);
        contentPane.add(progressBar);

        // Thực hiện công việc nền trong SwingWorker
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    for (int x = 0; x <= 100; x++) {
                        publish(x);
                        Thread.sleep(50);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int latestValue = chunks.get(chunks.size() - 1);
                progressBar.setValue(latestValue);
            }

            @Override
            protected void done() {
                // Mở giao diện Customer khi công việc nền hoàn tất
                Customer customer = new Customer();
                customer.setVisible(true);
                dispose(); // Đóng Loading2
            }
        };

        // Bắt đầu SwingWorker
        worker.execute();
    }
}
