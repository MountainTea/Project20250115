package com.sb;

import com.sa.Student;
import com.sa.Student2;

/**
 * @version 1.0
 * @author Students24
 * <br>
 * <h3>科系1 英文</h3>
 * 20250115
 */
public class B extends Student implements Student2{
	
	private int eng;

	/**
	 * @param eng 英文分數
	 * Ex.<br>
	 * new A("姓名",英文分數);
	 */
	public B(String name,int eng) {
		super(name);
		this.eng=eng;	
	}
	
	/**
	 * 
	 * @return name 取得英文分數
	 */
	public int getEng() {
		return eng;
	}

	/**
	 * 
	 * @return name 修改英文分數
	 */
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	/**
	 * 
	 * @return 顯示英文分數(串接)
	 */
	public String show() {
		return super.show()+"\t英文:"+eng;
	}
	
	/**
	 * 
	 * @return 秀出B的SKILL...
	 */
	@Override
	public void skill() {
		System.out.println("B Skill");
		
	}

}

	
