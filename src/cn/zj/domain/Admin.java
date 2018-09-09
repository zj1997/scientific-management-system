package cn.zj.domain;

public class Admin {

	private Integer id;
	private Integer account;
	private String name;
	private Integer telephone;
	private String password;
	
	public Integer getAccount() {
		return account;
	}
	public void setAccount(Integer account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", account=" + account + ", name=" + name + ", telephone=" + telephone
				+ ", password=" + password + "]";
	}
    
}
