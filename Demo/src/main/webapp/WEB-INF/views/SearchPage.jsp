<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Search Box Example 2 - default placeholder text gets cleared on click</title>
<meta name="ROBOTS" content="NOINDEX, NOFOLLOW" />
<!-- JAVASCRIPT to clear search text when the field is clicked -->
<script type="text/javascript">
window.onload = function(){ 
	//Get submit button
	var submitbutton = document.getElementById("tfq");
	//Add listener to submit button
	if(submitbutton.addEventListener){
		submitbutton.addEventListener("click", function() {
			if (submitbutton.value == 'Search our website'){//Customize this text string to whatever you want
				submitbutton.value = '';
			}
		});
	}
}
</script>
 <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
<!-- CSS styles for standard search box with placeholder text-->
<style type="text/css">
	#tfheader{
		background-color:#c3dfef;
	}
	#tfnewsearch{
		float:center;
		padding:260px;
	}
	.tftextinput2{
	float:center;
		margin: 0;
		padding: 5px 15px;
		font-family: Arial, Helvetica, sans-serif;
		font-size:14px;
		color:#666;
		border:1px solid #0076a3; border-right:0px;
		border-top-left-radius: 5px 5px;
		border-bottom-left-radius: 5px 5px;
	}
	.tfbutton2 {
		margin: 0;
		padding: 5px 7px;
		font-family: Arial, Helvetica, sans-serif;
		font-size:14px;
		font-weight:bold;
		outline: none;
		cursor: pointer;
		text-align: center;
		text-decoration: none;
		color: #ffffff;
		border: solid 1px #0076a3; border-right:0px;
		background: #0095cd;
		background: -webkit-gradient(linear, left top, left bottom, from(#00adee), to(#0078a5));
		background: -moz-linear-gradient(top,  #00adee,  #0078a5);
		border-top-right-radius: 5px 5px;
		border-bottom-right-radius: 5px 5px;
	}
	.tfbutton2:hover {
		text-decoration: none;
		background: #007ead;
		background: -webkit-gradient(linear, left top, left bottom, from(#0095cc), to(#00678e));
		background: -moz-linear-gradient(top,  #0095cc,  #00678e);
	}
	/* Fixes submit button height problem in Firefox */
	.tfbutton2::-moz-focus-inner {
	  border: 0;
	}
	.tfclear{
		clear:both;
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
     
	<!-- HTML for SEARCH BAR -->
	<div id="tfheader">
	  <form id="tfnewsearch" action="displayMovie.htm" method="post">
		
		        <input type="text" id="tfq" class="tftextinput2" name="mname" size="21" maxlength="120" value="Search our website"><input type="submit" value=">" class="tfbutton2">
		</form>
		<div class="tfclear"></div>
	</div>
</body>
</html>

