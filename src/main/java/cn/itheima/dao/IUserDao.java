package cn.itheima.dao;

import cn.itheima.domain.User;

import java.util.List;

/**
 * UserDao,持久层接口
 */
public interface IUserDao {

    //查询所有操作
    List<User> findAll();

}
