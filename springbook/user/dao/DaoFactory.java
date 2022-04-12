package springbook.user.dao;


public class DaoFactory {
    public UserDao userDao(){
        //여기서 connectionmaker 설정해주고 userDao 반환
        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
        //return new userDao(new DConnectionMaker());
    }
}
