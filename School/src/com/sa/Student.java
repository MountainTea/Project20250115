package com.sa;


/**
 * @version 1.0
 * @author Students24
 * <br>
 * <h3>學生表1</h3>
 * 20250115
 */
public class Student {
	
	
	private String name;

	/**
	 * @param name 新增學員姓名
	 * Ex.<br>
	 * new Student("姓名");
	 */
	public Student(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * 
	 * @return name 取得姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return name 修改姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return 秀出姓名...
	 */
	public String show()
	{
		return "名:"+name;
	}
	

}
