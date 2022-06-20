<%-- 
    Document   : login2
    Created on : Apr 14, 2022, 4:30:17 PM
    Author     : al-am
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script rel="stylesheet" href="style.css"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div id="loginForm" class="container mt-5 col-md-6 offset-md-3">
            <h1>Formulaire de connexion</h1>
            <form class="shadow-lg p-3 mb-5  mt-4 bg-body rounded" action="login"  method="POST"  required>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Login</label>
                    <input type="text" class="form-control" id="login" placeholder="saisie du login" name="login" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" placeholder="saisie du mot de passe" name="password">
                </div>
                <div>
                    <button type="submit" class="btn btn-primary btn-lg btn-block">Se connecter</button>
                    <button type="button" class="btn btn-warning btn-lg" onclick="location.href='inscription'">S'inscrire</button>                   
                </div>                

                <!-- <div class="text-center">
                    <button type="submit" class="btn btn-primary btn-lg">Connexion</button>
                </div> -->
                <div class='mt-4'>
                    <p class="text-danger text-center">${msg}<p>
                </div>
                
            </form>
        </div>
    </body>
</html>
