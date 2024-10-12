package view.ui_custom;

import javax.swing.*;
import java.awt.*;

public class CircleLabel extends JLabel {

    public CircleLabel(String text) {
        super(text);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setPreferredSize(new Dimension(100, 100)); // Đặt kích thước cho hình tròn
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Tạo đối tượng Graphics2D để tùy chỉnh vẽ
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ hình tròn với màu nền
        g2d.setColor(Color.CYAN); // Màu nền của hình tròn
        g2d.fillOval(0, 0, getWidth(), getHeight()); // Vẽ hình tròn

        // Vẽ viền của hình tròn (nếu muốn)
        g2d.setColor(Color.BLACK);
        g2d.drawOval(0, 0, getWidth() - 1, getHeight() - 1); // Vẽ viền hình tròn

        // Vẽ văn bản trong hình tròn
        g2d.setColor(Color.BLACK);
        super.paintComponent(g);
    }
    
    @Override
    public void setText(String text) {
        super.setText(text);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
    }

    @Override
    public void paintAll(Graphics g) {
        super.paintAll(g);
    }
    
    @Override
    public void repaint(long tm, int x, int y, int width, int height) {
        super.repaint(tm, x, y, width, height);
    }
    
}