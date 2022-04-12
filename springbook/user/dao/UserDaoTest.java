package springbook.user.dao;

import java.sql.SQLException;

public class UserDaoTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       User user = new User();
        UserDao userDao = new DaoFactory().userDao();

        user.setPassword("4");
        user.setId("4");
        user.setName("4");
        userDao.add(user);
        System.out.println(user.getId() + "입력 완료");
        User user2 = userDao.get(user.getId());
        System.out.println(user2.getId() + "조회 완료");
    }
}
