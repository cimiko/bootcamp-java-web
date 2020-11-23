<%-- 
    Document   : register-view
    Created on : Nov 19, 2020, 1:26:39 AM
    Author     : cimiko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Register</title>
        <link rel="stylesheet" href="css/login.css"/>
    </head>
    <body>
        <section>
        <header>
            <nav class="navbar">
                <a class="navbar-brand" href="http://localhost:8080/bootcamp-java-web/">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSRliDdW0n18MCieL74e0JTpjbVCh6F3fAvNw&usqp=CAU"
                        width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
                    CiMiKo
                </a>
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
                        <div class="form-group form-check">
                            <input type="checkbox" class="form-check-input">
                            <label class="form-check-label" for="exampleCheck1">Saya menyatakan tunduk pada kebijakan yang dibuat.</label>
                        </div>
                        <button type="submit" class="btn btn-primary w-75">Register</button>
                      </form>
                </div>
            </div>
        </main>
    </section>
    </body>
    <scipt>
        function validateUserNameAsEmailAddress(){
        
        }
        
        function validatePassword(){
        
        }
    </scipt>
</html>
