package action;
import org.apache.struts2.ServletActionContext; 
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class hello extends ActionSupport{
	private String userName;
	private String password;
	
	public String execute(){
		if(getUserName().equals("lab")&&getPassword().equals("123456")){
			//ActionContext.getContext().getSession().put("name",userName);
			return "success";
		}else{
			return "error";
		}
	}
	
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
}
