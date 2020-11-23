<%-- 
    Document   : login-success-view
    Created on : Nov 18, 2020, 8:41:20 PM
    Author     : cimiko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>${userName}</title>
        <link rel="stylesheet" href="css/login.css"/>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <section>
        <header>
            <nav class="navbar navbar-expand-lg">
                <a class="navbar-brand" href="http://localhost:8080/bootcamp-java-web/">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSRliDdW0n18MCieL74e0JTpjbVCh6F3fAvNw&usqp=CAU"
                        width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
                    CiMiKo
                </a>
                
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Welcome ${userName}!</a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <small><a class="dropdown-item" href="#">Profile</a></small>
                                <small><a class="dropdown-item" href="http://localhost:8080/bootcamp-java-web/changePassword">Change Password</a></small>
                                <small><a class="dropdown-item" href="#">Logout</a></small>
                            </div>
                        </li>
                    </ul>
                </div>
                
                <!--<a class="nav-link justify-content-end" href="#">Welcome ${userName}!</a>-->
            </nav>
        </header>

        <main>
            <div class="container loginPage">
                <video autoplay muted loop id="myVideo">
                    <source src="video/TechnologyBG.mp4" type="video/mp4">
                </video>
                
                <div class="head">
                    <div class="jumbotron">
                        <video autoplay muted loop id="jumbotronBG">
                            <source src="video/Flyngbird.mp4" type="video/mp4">
                        </video>
                        <h1 class="display-4">Welcome To My First Page Java!</h1>
                        <p class="lead">This is a example for java program with Servlet.</p>
                        <hr class="my-4">
                        <p>Click this button for open <span>Servlet Example</span>.</p>
                        <a class="btn btn-primary btn-lg"
                            href="http://localhost:8080/bootcamp-java-web/person?id=1&name=hartono" role="button">Servlet
                            Example</a>
                    </div>
                </div>
            </div>
        </main>
    </section>
    </body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
    integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
    crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
    integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
    crossorigin="anonymous"></script>
</html>
