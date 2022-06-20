<%-- 
    Document   : inscription
    Created on : Apr 15, 2022, 11:10:12 AM
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
        <div class="container mt-5 col-md-6 offset-md-3">
            <h1>Formulaire d'inscription</h1>
            <form class="shadow-lg p-3 mb-5 bg-body rounded" action='inscription' method="POST">
                <div class="mb-3">
                    <label for="frmNom" class="form-label">Nom</label>
                    <input type="text" class="form-control" id="frmNom" placeholder="Votre nom" required name="nom">
                </div>
                <div class="mb-3">
                    <label for="frmPrenom" class="form-label">Prénom</label>
                    <input type="text" class="form-control" id="frmPrenom" placeholder="Votre prénom" required name="prenom">
                </div>
                <div class="mb-3">
                    <label for="frmLogin" class="form-label">Login</label>
                    <input type="text" class="form-control" id="frmLogin" placeholder="Votre login" required name="login">
                </div>
                <div class="mb-3">
                    <label for="frmPassword" class="form-label">Password</label>
                    <input type="text" class="form-control" id="frmPassword" placeholder="Votre mot de passe" required name="password">
                </div>
                 <button type="submit" class="btn btn-primary">S'inscrire</button>
            </form>
        </div>
    </body>
</html>