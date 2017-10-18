package org.tcat.service.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表 对象类
 *
 * @Author Lin 2017年10月17日
 *
 */
public class UserDTO implements Serializable{

	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;
    /**
     * 用户登录账号
     */
    private String account;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户密码
     */
    private String password;
    /**
     * phone
     */
    private String phone;
    /**
     * createdTime
     */
    private Date createdTime;
    /**
     * createdBy
     */
    private Integer createdBy;
    /**
     * updatedBy
     */
    private Integer updatedBy;
    /**
     * updatedTime
     */
    private Date updatedTime;

	/**
	 * 获取 id
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置 id
	 * @param id id
	 * @return this
	 */
	public UserDTO setId(Integer id) {
		this.id = id;
		return this;

	}
	/**
	 * 获取 用户登录账号
	 * @return 用户登录账号
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * 设置 用户登录账号
	 * @param account 用户登录账号
	 * @return this
	 */
	public UserDTO setAccount(String account) {
		this.account = account;
		return this;

	}
	/**
	 * 获取 邮箱
	 * @return 邮箱
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置 邮箱
	 * @param email 邮箱
	 * @return this
	 */
	public UserDTO setEmail(String email) {
		this.email = email;
		return this;

	}
	/**
	 * 获取 用户密码
	 * @return 用户密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置 用户密码
	 * @param password 用户密码
	 * @return this
	 */
	public UserDTO setPassword(String password) {
		this.password = password;
		return this;

	}
	/**
	 * 获取 phone
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置 phone
	 * @param phone phone
	 * @return this
	 */
	public UserDTO setPhone(String phone) {
		this.phone = phone;
		return this;

	}
	/**
	 * 获取 createdTime
	 * @return createdTime
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * 设置 createdTime
	 * @param createdTime createdTime
	 * @return this
	 */
	public UserDTO setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
		return this;

	}
	/**
	 * 获取 createdBy
	 * @return createdBy
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * 设置 createdBy
	 * @param createdBy createdBy
	 * @return this
	 */
	public UserDTO setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
		return this;

	}
	/**
	 * 获取 updatedBy
	 * @return updatedBy
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * 设置 updatedBy
	 * @param updatedBy updatedBy
	 * @return this
	 */
	public UserDTO setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
		return this;

	}
	/**
	 * 获取 updatedTime
	 * @return updatedTime
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * 设置 updatedTime
	 * @param updatedTime updatedTime
	 * @return this
	 */
	public UserDTO setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
		return this;

	}

}
