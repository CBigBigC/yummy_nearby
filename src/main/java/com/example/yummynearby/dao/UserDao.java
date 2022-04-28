package com.example.yummynearby.dao;

import com.example.yummynearby.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author watson
 * @date 2022/4/27 7:40 PM
 */
public interface UserDao extends JpaRepository<User, Long> {

    User getUserById(long id);

}
