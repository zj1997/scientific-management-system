package cn.zj.domain;

public class Person {
/* 
 * CREATE TABLE `person` (
  `peron_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `nationality` varchar(50) DEFAULT NULL,
  `education` varchar(50) DEFAULT NULL,
  `department` int(11) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  `wage` double DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `bonus` double DEFAULT NULL,
  `project_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`peron_id`),
  KEY `department` (`department`),
  KEY `project_person` (`project_id`),
  CONSTRAINT `department` FOREIGN KEY (`department`) REFERENCES `department` (`department_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

人员信息：编码、姓名、性别、出生年月日、民族、文化程度、所在部门、
参加工作时间、职称（教授、副教授、讲师、助教、其他）、基本工资、岗位工资、津贴工资；
*/
	
	private Integer  peron_id;
	private String  name;
	private String  gender;
	private String  birthday;
	private String  nationality;
	private String  education;
	private String  department;
	private String  time;
	private String  title;
	private Double  wage;
	private Double  salary;
	private Double  bonus;
	private Integer project_id;
	@Override
	public String toString() {
		return "Person [peron_id=" + peron_id + ", project_id=" + project_id + ", name=" + name + ", gender=" + gender
				+ ", birthday=" + birthday + ", nationality=" + nationality + ", education=" + education
				+ ", department=" + department + ", time=" + time + ", title=" + title + ", wage=" + wage + ", salary="
				+ salary + ", bonus=" + bonus + "]";
	}
	public Integer getPeron_id() {
		return peron_id;
	}
	public void setPeron_id(Integer peron_id) {
		this.peron_id = peron_id;
	}
	public Integer getProject_id() {
		return project_id;
	}
	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getWage() {
		return wage;
	}
	public void setWage(Double wage) {
		this.wage = wage;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getBonus() {
		return bonus;
	}
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	
	
	
}
