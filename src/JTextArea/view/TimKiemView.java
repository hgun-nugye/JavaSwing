package JTextArea.view;

import JTextArea.controller.TimKiemListener;
import JTextArea.model.TimKiemModel;

import javax.swing.*;
import java.awt.*;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JTextArea jTextArea_vanBan;
    private JTextField jTextField_tuKhoa;
    private JLabel jLabel_ketqua;

    public TimKiemView() throws HeadlessException {
        this.timKiemModel = new TimKiemModel();
        this.init();
    }

    private void init() {
        this.setTitle("Tìm kiếm");
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 20);

        //center
        JLabel jLabel_vanBan = new JLabel("Văn bản");
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100, 100);
        jTextArea_vanBan.setFont(font);

        //footer
        TimKiemListener timKiemListener=new TimKiemListener(this);

        JLabel jLabel_tuKhoa = new JLabel("Từ khóa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);

        JButton jButton_thongKe = new JButton("Thống kê");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(timKiemListener);
        jButton_thongKe.setBackground(Color.BLUE);
        jButton_thongKe.setForeground(Color.WHITE);
        jButton_thongKe.setOpaque(true);
        jButton_thongKe.setBorderPainted(false);

        jLabel_ketqua= new JLabel("Kết quả");
        jLabel_ketqua.setBackground(Color.YELLOW);
        jLabel_ketqua.setOpaque(true);
        jLabel_ketqua.setFont(font);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 10, 20));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketqua);
        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jTextArea_vanBan, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void TimKiem()
    {
        this.timKiemModel.setVanBan((jTextArea_vanBan.getText()));
        this.timKiemModel.setTuKhoa((jTextField_tuKhoa.getText()));
        this.timKiemModel.TimKiem();
        this.jLabel_ketqua.setText(this.timKiemModel.getKetQua());

    }
}
