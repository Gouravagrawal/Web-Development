<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Display all Movies</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
     
      body {
        padding-top: 60px;
        padding-bottom: 20px;
      }
      .pretty-table
{
  padding: 50;
  margin: 10;
  border-collapse: collapse;
  border: 1px solid #333;
  font-family: "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
  font-size: 1.5em;
  color: #000;
  background:#FFC7B2 top left repeat-x;
  position:center;
           top:80%;
           left:0%; 
}

.pretty-table caption
{
  caption-side: bottom;
  font-size: 0.9em;
  font-style: italic;
  text-align: right;
  padding: 0.5em 0;
}

.pretty-table th, .pretty-table td
{
  border: 1px dotted #666;
  padding: 0.5em;
  text-align: center;
  color: #632a39;
}

.pretty-table th[scope=col]
{
  color: #000;
  background-color: #FF826C;
  text-transform: uppercase;
  font-size: 0.9em;
  border-bottom: 2px solid #333;
  border-right: 2px solid #333;
}

.pretty-table th+th[scope=col]
{
  color: #fff;
  background-color: #7d98b3;
  border-right: 1px dotted #666;
}

.pretty-table th[scope=row]
{
  background-color: #FF826C;
  border-right: 2px solid #333;
}

.pretty-table tr.alt th, .pretty-table tr.alt td
{
  color: #2a4763;
}
.padd{
padding-top: 250px;
padding-left: 500px;
}
    </style>
   
  </head>

  
<body>
    <div class="navbar navbar-inverse navbar-fixed-top" >
        <div class="container">
                <div class="navbar-header">
                    <button type="button" data-target="#navbarcollapse" data-toggle="collapse" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                   <!--  <a class="navbar-brand" href="#">Project Name</a> -->
                </div>
            <div class="collapse navbar-collapse" id="navbarcollapse">
                <ul class="nav navbar-nav">
                     <li><a href="welcomeCustomer.jsp"><span class="glyphicon glyphicon-home"></span>&nbsp;Home</a></li>
                    <li><a href="logout.htm"><span class="glyphicon glyphicon-home"></span>&nbsp;Logout</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-info-sign"></span>&nbsp;About</a></li>
                    <li><a href="Contact.htm"><span class="glyphicon glyphicon-user"></span>&nbsp;Contact</a></li>
                </ul>
                
            </div>
        </div>
    </div>    
     
          <h2 align ="center">Movie Results </h2>
         
        
  
  <div class="container">
        <form action="placeOrder.htm" method="POST">
        <table border="1" class="pretty-table" align="right" > 
            <col width="50"/>
            <col width="50"/>
                  
 			<c:forEach items="${hm}" var="element"> 

             <tr>
                    
               <td>${element.key}</td>
                <td>${element.value}</td>
                 </tr>
                
                </c:forEach>
                              
                   </table>
                  
            </form>       
           
            </div>
</body>
</html>