package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Roma", "Chernikov", (byte) 20);
        userDaoJDBC.saveUser("Sanya", "Chernikov1", (byte) 10);
        userDaoJDBC.saveUser("Ro5", "Sulov", (byte) 90);
        userDaoJDBC.saveUser("Tom", "Bazuka", (byte) 66);

        userDaoJDBC.getAllUsers();
        userDaoJDBC.removeUserById(1);
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
