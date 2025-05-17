package baitapUT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhepNhanUI extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnNhan;

    public PhepNhanUI() {
        setTitle("Chương trình Nhân hai số");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa cửa sổ

        // Tạo các thành phần
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        JLabel lblSo2 = new JLabel("Số thứ hai:");
        JLabel lblKetQua = new JLabel("Kết quả:");

        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        txtKetQua = new JTextField(10);
        txtKetQua.setEditable(false);

        btnNhan = new JButton("Nhân");

        // Xử lý sự kiện khi nhấn nút
        btnNhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double ketQua = so1 * so2;
                    txtKetQua.setText(String.valueOf(ketQua));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(PhepNhanUI.this, "Vui lòng nhập đúng số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Sắp xếp giao diện
        setLayout(new GridLayout(4, 2, 10, 10));
        add(lblSo1); add(txtSo1);
        add(lblSo2); add(txtSo2);
        add(lblKetQua); add(txtKetQua);
        add(new JLabel()); add(btnNhan);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PhepNhanUI().setVisible(true);
        });
    }
}
