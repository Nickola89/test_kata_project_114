package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
        System.out.println("Table is add");
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
        System.out.println("Table is drop");
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User is add");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
        System.out.println("User is remove by ID");
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();

    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
        System.out.println("Table is clean");
    }
}
