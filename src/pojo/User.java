package pojo;

import java.util.Date;
/**
 * 用户类
 * @author leiyangfei
 *
 */
public class User{

	private Integer id; //id 
	private String userCode; //用户编码
	private String userName; //用户名称
	private String userPassword; //用户密码
	private Integer gender;  //性别
	private Date birthday;  //出生日期
	private String phone;   //电话
	private String address; //地址
	private Integer userRole;    //用户角色Id
	private Integer createdBy;   //创建者
	private Date creationDate; //创建时间
	private Integer modifyBy;     //更新者
	private Date modifyDate;   //更新时间
	private String userRoleName;//用户角色名称
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	public Integer getId() {
		return id;
	}
	public String getUserCode() {
		return userCode;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public Integer getGender() {
		return gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public Integer getUserRole() {
		return userRole;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	
}
