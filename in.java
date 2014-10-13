package action;

import com.boo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.util.ArrayList;   
import java.util.List;   
import java.util.Vector;

public class in {
	
 private Connection conn=null;
 private Connection conn1=null;
 private Statement stmt=null;
 private Statement stmt1=null;
 private String driver="com.mysql.jdbc.Driver";
 private String username="root";
 private String password="xx1942557$";
 private String url = "jdbc:mysql://localhost:3306/BookDB";  
 private String sql= "SELECT * FROM Book";
 private String sql1 ="SELECT * FROM Author";
 
 
 public List<boo> find(String name){
	 String id = new String();
	 ArrayList<boo> list = new ArrayList<boo>();
	 
	 try{
		   
		 	Class.forName(driver);

		 }catch(ClassNotFoundException e){
			 e.printStackTrace();   
		 }
			  
	 try{
		   conn=DriverManager.getConnection(url, username, password);
		   if (conn != null)              	  
		       System.out.println("鏁版嵁搴撹繛鎺ユ垚鍔?");  
		   else  
		       System.out.println("鏁版嵁搴撹繛鎺ュけ璐?"); 
	      }catch(SQLException e){
			  e.printStackTrace();
		  }
		  
	 try{		   
		   stmt=conn.createStatement();
		   ResultSet rs = stmt.executeQuery(sql1);
		   while (rs.next()) {  
	    	   
	           if(rs.getString("Name").equals(name))
	        	   id = rs.getString("AuthorID"); 
	           System.out.println(id);	               
	      }
		   
	  try{	    	  
	       conn1=DriverManager.getConnection(url, username, password);	    	    
	     }catch(SQLException e){
	    	 e.printStackTrace();
	     }
	    	  
	  try{	    	   
	       stmt1=conn1.createStatement();
	       ResultSet rs1 = stmt1.executeQuery(sql);
	    	System.out.println("here"); 
	    	   
	        while (rs1.next()) {  
	        	boo book = new boo(rs1.getString("ISBN") , rs1.getString("Title") ,  rs1.getInt("AuthorID"),rs1.getString("Publisher"),rs1.getDate("PublishDate"),rs1.getDouble("price"));
	            if(rs1.getString("AuthorID").equals(id)){
	                System.out.println(rs1.getString("Title"));
	                list.add(book);
	                }	                   
	           }

	         rs1.close();  
	    	  
	      }catch(SQLException e){
	    	   e.printStackTrace(); 
	      }finally{
	    	   if(null!=stmt1)
	    	   {
	    		   try{stmt1.close();}
	    	       catch(SQLException e){e.printStackTrace();}	    	     
	    	   }
	    	   if(null!=conn1){	    	    
	    	    try{conn1.close();
	    	    }
	    	   catch(SQLException e){
	    	     e.printStackTrace();
	    	   }
	       }
	    	 
	    }
	    	  ///////////////////////////////////////////////////
	     rs.close();  
		  
	}catch(SQLException e)
	{
		e.printStackTrace(); 
	}finally{

		 if(null!=stmt)
		 {
			 try{stmt.close();}
		     catch(SQLException e){e.printStackTrace();}		     
		 }
		 if(null!=conn){
		    
		    try{conn.close();}
		    catch(SQLException e){
		     e.printStackTrace();
		     }
		 }
		 
	 }
	 return list;
	 }
 
 public String execute(){
	 in doinser = new in();
	 list = doinser.find(name);
	
		return "success";
	}
 public String name;   
 
 public String getName() {   
     return name;   
 }   

 public void setName(String name) {   
     this.name = name;   
 }   
 
private List<boo> list;   
 
 public List<boo> getList() {   
     return list;   
 }   

 public void setList(List<boo> list) {   
     this.list = list;   
 }   
 /*public static void main(String[] args)
 {
	 System.out.println("hello");
	 student doinser=new student();
  boolean flag =doinser.addStudent();
  if(flag)
  {
   System.out.println("娣诲姞淇℃伅鎴愬姛");
  }
  else{
   System.out.println("娣诲姞淇℃伅澶辫触");
  }
  
 }*/

}
