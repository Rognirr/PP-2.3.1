package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User getById(Long id);

    void update(User user);

    void delete(Long id);

    List<User> allUsers();
}
