<%-- 
    Document   : change-password-view
    Created on : Nov 19, 2020, 6:04:25 AM
    Author     : cimiko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Change Password</title>
        <link rel="stylesheet" href="css/login.css"/>
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
                                <small><a class="dropdown-item" href="#">Change Password</a></small>
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
    
                <div class="login">
                    <form action="register" method="POST">
                        <div class="form-group">
                          <label for="username">Username</label>
                          <input type="text" class="form-control w-75" name="name">
                          <small id="emailHelp" class="form-text text-muted">Membuat Id berarti User tunduk kepada semua peraturan yang ada.</small>
                        </div>
                        <div class="form-group">
                          <label for="password">Password</label>
                          <input type="password" class="form-control w-75" name="password">
                        </div>
                        <button type="submit" class="btn btn-primary w-75">Change Password</button>
                      </form>
                </div>
            </div>
        </main>
    </section>
    </body>
</html>
