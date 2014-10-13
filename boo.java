package com;
import java.util.Date;
public class boo{
	private String name;
	private String title;
	private int authorid;
	private String pub;
	private Date pubdate;
	private double price;
	//change for 1120310114
	public boo(String name,String title,int authorid,String pub,Date pubdate,double price){
		this.name = name;
		this.title = title;
		this.authorid = authorid;
		this.pub = pub;
		this.pubdate = pubdate;
		this.price = price;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}
	public int getAuthorid(){
		return authorid;
	}

	public void setAuthorid(int authorid){
		this.authorid = authorid;
	}

	public String getPub(){
		return pub;
	}

	public void setPub(String pub){
		this.pub = pub;
	}

	public Date getPubdate(){
		return pubdate;
	}

	public void setPubdate(Date pubdate){
		this.pubdate = pubdate;
	}
	public double getPrice(){
		return price;
	}

	public void setPrce(double price){
		this.price = price;
	}
}
