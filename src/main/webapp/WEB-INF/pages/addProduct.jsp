<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form method="post" action="addProduct" modelAttribute="product">
<label>Enter Product Id: </label>
<s:input path="prodId"/>
<s:errors path="prodId"></s:errors>
<label>Enter Product Name: </label>
<s:input path="prodName"/>
<s:errors path="prodName"></s:errors>
<label>Enter Product Price: </label>
<s:input path="prodPrice"/>
<s:errors path="prodPrice"></s:errors>
<button type="submit">Submit</button>
</s:form>
</body>
</html>