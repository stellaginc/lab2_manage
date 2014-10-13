<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'in.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="in.action" method="post">
    	<table>
    		<tr>
    			<td>name:</td>
    			<td><input type="text" name="name"><td/>
    			<td colspan="">
    				<input type="submit" value="find">&nbsp;&nbsp;
    			</td>
    		</tr>
    		
    		
    	</table>
    	</form>
    	<table align="center"  border="2">        
  
              <tr align="center">  
  
                     <td><b>shuhao</b></td> 
                     <td><b>浣滆€匢D</b></td> 
  					<td><b>涔︾睄鍚嶇О</b></td> 
  					<td><b>鍑虹増绀?/b></td>
  					<td><b>鍑虹増鏃堕棿</b></td>
  					<td><b>浠锋牸</b></td>
                                     
              </tr>                  
  
              <tr align="center">  
  
                  <s:iterator value="list">
				<tr>
					<td>
						<s:property value="name"/>
					</td>
					<td>
						<s:property value="authorid"/>
					</td>
					<td>
						<s:property value="title"/>
					</td>
					<td>
						<s:property value="pub"/>
					</td>
					<td>
						<s:property value="pubdate"/>
					</td>
					<td>
						<s:property value="price"/>
					</td>
					
				</tr>
			</s:iterator>              
  
              </tr>  
       </table>  
  </body>
</html>
