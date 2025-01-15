package com.sb;

import com.sa.Student;
import com.sa.Student2;

/**
 * @version 1.0
 * @author Students24
 * <br>
 * <h3>科系1 國文</h3>
 * 20250115
 */
public class A extends Student implements Student2{
	
	
	private int chi;
	
	/**
	 * @param chi 國文分數
	 * Ex.<br>
	 * new A("姓名",國文分數);
	 */
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}
	
	/**
	 * 
	 * @return name 取得國文分數
	 */
	public int getChi() {
		return chi;
	}
	
	/**
	 * 
	 * @return name 修改國文分數
	 */
	public void setChi(int chi) {
		this.chi = chi;
	}

	/**
	 * 
	 * @return 顯示國文分數(串接)
	 */
	public String show() {
		return super.show()+"\t國文:"+chi;
	}
	
	/**
	 * 
	 * @return 秀出A的SKILL...
	 */
	@Override
	public void skill() {
		System.out.println("A Skill");
		
	}
	
	
	

}
