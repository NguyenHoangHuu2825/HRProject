
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class test {
    public static void main(String[] args) {
        // Tạo cấu hình Hibernate từ hibernate.cfg.xml

        // Tạo phiên làm việc (session) với cơ sở dữ liệu
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        
        try {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            // Tạo một đối tượng User và lưu vào cơ sở dữ liệu
            User user = new User();
            user.setName("John Doe");
            user.setEmail("john@example.com");
            session.save(user); // Lưu đối tượng user vào DB

            // Hoàn thành transaction
            transaction.commit();

            // In ra thông báo
            System.out.println("User đã được thêm thành công!");

            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
            User retrievedUser = session.get(User.class, user.getId());
            System.out.println("Dữ liệu lấy ra từ DB:");
            System.out.println("ID: " + retrievedUser.getId() + ", Name: " + retrievedUser.getName() + ", Email: " + retrievedUser.getEmail());

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            // Đóng phiên làm việc
            session.close();
        }
    }
}
