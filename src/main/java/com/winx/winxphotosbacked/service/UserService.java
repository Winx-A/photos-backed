package com.winx.winxphotosbacked.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.winx.winxphotosbacked.model.dto.user.UserQueryRequest;
import com.winx.winxphotosbacked.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.winx.winxphotosbacked.model.vo.LoginUserVO;
import com.winx.winxphotosbacked.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author Serendipity
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-12-18 23:01:59
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 确认密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 获取加密密码
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取脱敏后的登录用户信息
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取脱敏后的用户信息
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏后的用户信息（列表）
     * @param userList
     * @return
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 用户注销
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取查询条件
     * @param userQueryRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 是否为管理员
     *
     * @param user
     * @return
     */
    boolean isAdmin(User user);

}
