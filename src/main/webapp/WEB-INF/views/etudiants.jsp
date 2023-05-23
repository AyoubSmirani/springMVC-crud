<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()
     %>/resources/css/style.css">
	<title>page2</title>
</head>
<body>



    <div class="wrapper">
  <div class="title">
    <h1>ajouter un etudiant</h1>
  </div>
  <div class="contact-form">
	<f:form action="save2" modelAttribute="etudiant" class="input-fields">
	        <div class="input">
			<label>ID etudiant:<f:hidden path="id"/></label>
			<label>${etudiant.id}</label>
		     </div>
		    
	
			<f:input path="nom" class="input" placeholder="nom"/>
			<f:errors path="nom" cssClass="error"/>
			
			
		
			<f:input path="prenom" class="input" placeholder="prenom"/>
			<f:errors path="prenom" cssClass="error"/>
		
			
		
			<f:input path="classe" class="input" placeholder="classe"/>
			<f:errors path="classe" cssClass="error"/>
		    
			
		
			<input type="submit" value="Save" class="btn" >
	
	</f:form>
	</div>
	</div>

	
	   
	    
	  <div class="table_responsive">
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>nom</th>
          <th>prenom</th>
          <th>class</th>
        </tr>
      </thead>

      <tbody>
        <tr>
        <c:forEach items="${etudiants}" var="e">
          <td>${e.id }</td>
          <td>${e.nom }</td>
          <td>${e.prenom }</td>
          <td>${e.classe }</td>
          <td>
            <span class="action_btn">
              <a href="delete2?id=${e.id }" Onclick="confirme()">remove</a>
              <a  href="edit2/${e.id }">edit</a>
            </span>
          </td>
        </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
	        
           
 
	
	
	
	
<div id="mydiv"">
	<form action="">
	<label>motcle :</label>
	<input type="text" class="input4" value="" >
	<a href="index2?motCle=" class="geturl" Onclick="oky()">rechercher</a>
	</form>
	</div>
	
	
	
	
	
	
	
	
	
	
	
</body>

<script>
var input = document.querySelector(".input4");
    var url  = document.querySelector(".geturl");
    var div = document.querySelector("#mydiv");

url.style.color = "black"
url.style.textDecoration = "none"
div.style.position =" absolute"   
div.style.top = "60%"
div.style.left = "50%"
div.style.transform	="translate(-50%, -50%)"
	function oky(){
    	url.href += input.value;
    }

    function confirme(){
    	 confirm("vous etes sures ?");
    } 


</script>








</html>