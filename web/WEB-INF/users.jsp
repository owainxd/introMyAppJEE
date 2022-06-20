<%-- 
    Document   : users
    Created on : Apr 18, 2022, 9:58:57 PM
    Author     : al-am
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div id="topUser" class="container">
            <h1 id="tet">Tous les utilisateurs</h1>
            <br>
            <table class="table shadow-lg p-3 mb-5 bg-body rounded mt-3"">
                <thead class="table-dark">
                    <tr>
                        <td>#Id</td>
                        <td>Nom</td>
                        <td>Prénom</td>
                        <td>Login</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${users}" var="m">
                        <tr>
                            <td>${m.id}</td>
                            <td>${m.nom}</td>
                            <td>${m.prenom}</td>
                            <td>${m.login}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>