<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="../resources/css/create-style.css"/>
    <link
            rel="shortcut icon"
            type="image/x-icon"
            href="../resources/files/pics/logo.png"
    />
    <script src="../resources/js/create-js.js"></script>
    <title>Create Account</title>
</head>
<body>
<header>
    <h1 onclick="window.location.href='/'">Nura bank</h1>
</header>
<main>
    <section>
        <div class="container">
            <div class="create">
                <p class="title"><span>Create your Account</span></p>
                <form action="/signup" method="post">
                    <div class="column">
                        <label for="fname">First Name</label>
                        <input type="text" id="fname" name="fname" required/>
                        <label for="phone">Phone Number</label>
                        <input
                                type="tel"
                                id="phone"
                                name="phone"
                                pattern="[0-9]{4}[0-9]{3}[0-9]{4}"
                                placeholder="0999-888-7766"
                                required
                        />
                        <label for="username">Username</label>
                        <input type="text" id="username" name="username" required/>
                        <label for="password">Password</label>
                        <input type="password" id="password" name="password" required/>
                        <label for="reppassword">Repeat Password</label>
                        <input
                                type="password"
                                id="reppassword"
                                name="reppassword"
                                required
                        />
                    </div>
                    <div class="column">
                        <label for="lname">Last Name</label>
                        <input type="text" id="lname" name="lname" required/>
                        <label for="email">Email Address</label>
                        <input type="email" id="email" name="email"/>
                        <label for="dateOfBirth">Age</label>
                        <input
                                type="date"
                                id="dateOfBirth"
                                name="dateOfBirth"
                                min="1900-01-01"
                                max="2005-01-01"
                                required
                        />
                        <label for="id">ID Number</label>
                        <input type="text" id="id" name="id" required/>
                        <label for="idpic">ID Picture</label>
                        <input type="file" id="idpic" name="idpic"/>
                    </div>
                    <div class="button">
                        <button type="submit">Create Account</button>
                    </div>
                </form>

                <p class="login">
              <span
              >Already have an Account?
                <a href="/login">Click here to login</a></span
              >
                </p>
            </div>
        </div>
    </section>
</main>
</body>
</html>
