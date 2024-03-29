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
    <link rel="stylesheet" href="../resources/css/index-style.css">
    <link
            rel="shortcut icon"
            type="image/x-icon"
            href="../resources/files/pics/logo.png"
    />
    <script src="../resources/js/index-js.js"></script>
    <title>NURA Bank</title>
</head>
<body>
<header id="header">
    <section>
        <div id="brand"><h1>NURA Bank</h1></div>
        <div id="buttons">
            <input
                    type="button"
                    value="Login"
                    onclick="window.location.href='/login'"
            />
            <input
                    type="button"
                    value="Create Account"
                    onclick="window.location.href='/signup'"
            />
        </div>
        <div id="clear"></div>
    </section>
</header>

<main>
    <section id="nura-bank">
        <div class="container">
            <div class="left">
                <h2>Nura bank</h2>
                <p>
                    Nura (new aura) Bank is an online-only bank that provides a range
                    of financial services like checking and savings accounts and other
                    financial products to its clients. Our neo bank provides
                    affordability, convenience, and control of your finances without
                    traditional banking hassles.
                </p>
            </div>
            <div class="right">
                <img src="../resources/files/pics/card2.png" alt="Photo"/>
            </div>
        </div>
    </section>
    <hr id="middle-line"/>
    <section id="producers">
        <h2>Producers</h2>
        <div class="container">
            <div class="row">
                <div class="column">
                    <div class="info">
                        <img
                                class="profile"
                                src="../resources/files/pics/Zeynab.jpg"
                                alt="Person 1"
                        />
                        <p><span id="name">Zaynab Sattarian</span></p>
                        <p><span id="role">Scrum master</span></p>
                        <p id="brief">
                            A computer engineering student of sharif university of
                            technology, 6th semester Is interested in cybersecurity and
                            scrum framework
                        </p>
                        <a href="https://www.linkedin.com/in/zaynabsattarian">
                            <img
                                    src="../resources/files/pics/linkedin.svg"
                                    width="32"
                                    height="32"
                                    alt="LinkedIn"
                            />
                        </a>
                    </div>
                </div>
                <div class="column">
                    <div class="info">
                        <img
                                class="profile"
                                src="../resources/files/pics/Hadiqa.jpg"
                                alt="Person 1"
                        />

                        <p><span id="name">Hadiqa Fatima</span></p>
                        <p><span id="role">Product owner</span></p>

                        <p id="brief">
                            A computer engineering student of sharif university of
                            technology, working as a freelancer. Interested in AI and game
                            development.
                        </p>
                        <a href="https://www.linkedin.com/in/person1/">
                            <img
                                    src="../resources/files/pics/linkedin.svg"
                                    width="32"
                                    height="32"
                                    alt="LinkedIn"
                            />
                        </a>
                    </div>
                </div>
                <div class="column">
                    <div class="info">
                        <img
                                class="profile"
                                src="../resources/files/pics/Arad.jpg"
                                alt="Person 1"
                        />

                        <p><span id="name">Arad Afzali</span></p>
                        <p><span id="role">Developer</span></p>

                        <p id="brief">
                            A computer engineering student of Sharif university who is
                            intrested in web developing, computer networking and operating
                            systems.
                        </p>
                        <a href="https://www.linkedin.com/in/arad-afzali">
                            <img
                                    src="../resources/files/pics/linkedin.svg"
                                    width="32"
                                    height="32"
                                    alt="LinkedIn"
                            />
                        </a>
                    </div>
                </div>
                <div class="column">
                    <div class="info">
                        <img
                                class="profile"
                                src="../resources/files/pics/Sina.jpg"
                                alt="Person 1"
                        />

                        <p><span id="name">Amirsina Rashedi</span></p>
                        <p><span id="role">Developer</span></p>

                        <p id="brief">
                            I have a simple philosophy: Fill what is empty. Empty what is
                            full. Don't always do what you're thinkin. Don't follow your
                            dreams.
                        </p>
                        <a href="http://www.linkedin.com/in/amirsinarashedi">
                            <img
                                    src="../resources/files/pics/linkedin.svg"
                                    width="32"
                                    height="32"
                                    alt="LinkedIn"
                            />
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </section>
</main>

<footer>
    <section id="social-media">
        <div class="container">
            <div class="social-icons">
                <a href="#"
                ><img src="../resources/files/pics/telegram.svg" alt="Telegram"
                /></a>
                <a href="#"
                ><img src="../resources/files/pics/facebook.svg" alt="Facebook"
                /></a>
                <a href="#"><img src="../resources/files/pics/twitter.svg" alt="Twitter"/></a>
                <a href="#"
                ><img src="../resources/files/pics/instagram.svg" alt="Instagram"
                /></a>
            </div>
        </div>
    </section>
</footer>
</body>
</html>
