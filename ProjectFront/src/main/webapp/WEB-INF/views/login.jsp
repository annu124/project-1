
<%@include file="header.jsp" %>

<div class="container-fluid" style=" width:100%; height:95vh; repeat:no-repeat; background-image:url('resources/images/fish.jpg') ">
<div class="row">
<div class="col-md-4 col-sm-4 col-xs-12"></div>
<div class="col-md-4 col-sm-4 col-xs-12"> 

<form action="${e}perform_login" method="post" class="form-container">
<h1><center><b>LOGIN</b></center></h1>
  <div class="form-group">
    <label for="email"><span style="color:black;">Username</span> </label>
    <input required="" type="text" class="form-control" id="email" placeholder="Enter username" name="username">
  </div>
    <div class="form-group">
    <label for="password"><span style="color:black;">Password</span> </label>
    <input required="" type="pass" class="form-control" id="pass" placeholder="password" name="password">
  </div>
 
  <button type="submit" class="btn btn-success btn-block">login</button>
</form>

</div></div></div>

<%@include file="footer.jsp" %>
