<%-- 
    Document   : home
    Created on : Apr 14, 2022, 3:41:52 PM
    Author     : al-am
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="container mt-5">
            <h1>Bonjour Mr/Mme: ${sessionScope.user.login}</h1>
            <h3>Id: ${sessionScope.user.id}</h3>
            <h3>Nom: ${sessionScope.user.nom}</h3>
            <h3>Prénom: ${sessionScope.user.prenom}</h3>
            <!-- <%= session.getAttribute("user") %>  -->
        </div>
        
    </body>
</html>