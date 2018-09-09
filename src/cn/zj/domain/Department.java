package cn.zj.domain;

public class Department {
/*
 * CREATE TABLE `department` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_name` varchar(50) DEFAULT NULL,
  `role_man` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `postcode` int(11) DEFAULT NULL,
  `telephone` int(11) DEFAULT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
部门信息：部门编号、部门名称、负责人、地址、邮编、联系电话；
*/
	
	private Integer department_id;
	private String d_name;
	private String role_man;
	private String address;
	private Integer postcode;
	private Integer telephone;
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getRole_man() {
		return role_man;
	}
	public void setRole_man(String role_man) {
		this.role_man = role_man;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPostcode() {
		return postcode;
	}
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", d_name=" + d_name + ", role_man=" + role_man
				+ ", address=" + address + ", postcode=" + postcode + ", telephone=" + telephone + "]";
	}
	
}
