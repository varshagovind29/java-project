<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="NewFile.css">
</head>

<body style="background-color: lightyellow">

	<div class="h1"  style=font-size:170%;>
	<h1 style="color:green" align="center" >Banking Loan Application</h1>
	</div>	
  <form:form action="saveBankLoanAppDto" modelAttribute="BankLoanAppDto">
  <div class="a1" align="left">
   <label>FullName <form:input path="fullName"/></label> 
    </div>

<div align="center" class="a2" >

   <label>FathersName    <form:input path="fathersName"  /> </label>
   </div>
   
   <div class="a3"  align="right">
   <span >Gender</span><br><input type="radio" name="gender" id="male" >
<label for="m" >Male</label><input type="radio"name="gender" id="f">
<label for="f">Female</label> <input type="radio" name="gender" id="o">
<label for="o">Others</label><br>
</div>

<div class="a4" align="left">
    Date of Birth <input type="date" name="dateOfBirth" path="dateOfBirth"><br>
    </div>
    <div class="a5" align="center">
    Address  <form:input path="address" /><br>
    </div>
    
    <div class="a6" align="right">
    PhoneNumber  <form:input path="phoneNumber" />
    <br></div>
    
    <div class="a7" align="left">
    Email  <form:input path="email" /><br><br></div>
    <div class="a8" align="center">
    PanNumber  <form:input path="panNumber" /><br>
    </div>
    
    <div class="a9" align="right">
    BankAccountNumber  <form:input path="bankAccountNumber" /><br>
    </div>
    
    <div class="a10" align="left">
    BankName  <form:input path="bankName" /><br><br>
    </div>
    
   <div class="b1"align="center">
  Type Of Loan  <form:select path="typeOfLoan">
  <form:option value="sel">------select-------</form:option>
  <form:option value="Durable">Durable</form:option>
   <form:option value="Vehicle">Vehicle</form:option>
   <form:option value="Business">Business</form:option>
   </form:select><br>
   </div>
   <div class="b2" align="right">
   Amount Of Loan  <form:input path="amountOfLoan"/><br>
   </div> 
   
   <div class="b3" align="left">
   Tenure Of Re-payment  <form:select path="TenureOfRepayment">
   
  <form:option value="sel">------select-------</form:option>
  <form:option  value="12 Months">12 Months</form:option>
  <form:option value="24 Months">24 Months</form:option>
  <form:option value="36 Months">36 Months</form:option>
  <form:option value="48 Months">48 Months</form:option>
  <form:option value="60 Months">60 Months</form:option>
   </form:select><br>
   </div>
   
  <br><br><br>
   
          <div class="b4" align="center">
     		<form:button>Apply Here</form:button>
     		</div>

		</form:form>
		  <br>

	

	<h2 align="center">
		<a href="home.jsp">Back to Home</a>
	</h2>
</body>
</html>