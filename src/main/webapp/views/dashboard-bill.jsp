<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="../resources/css/dashboard-style.css"/>
    <link
            rel="shortcut icon"
            type="image/x-icon"
            href="../resources/files/pics/logo.png"
    />
    <!-- <script src="./js/dashboard-js.js"></script> -->
    <title>Dashboard</title>
</head>
<body>
<header></header>
<main>
    <section>
        <div class="container">
            <div class="ham-menu">
                <img
                        src="../resources/files/pics/hamburgur.svg"
                        id="btn"
                        alt=""
                        onclick="myFunction()"
                />
            </div>
            <div class="home-button">
                <img
                        src="../resources/files/pics/home.svg"
                        id="btn"
                        alt=""
                        onclick="window.location.href='/user-dashboard'"
                />
            </div>
            <div class="row">
                <div class="column-left" id="column-left">
                    <section>
                        <div class="profile">
                            <div class="container-2">
                                <!-- <div class="bank-name">
                                  <p><span>Nura Bank</span></p>
                                </div> -->
                                <div class="photo">
                                    <div class="img">
                                        <img src="../resources/files/pics/user.png" alt=""/>
                                    </div>
                                </div>
                                <div class="name">
                                    <div class="container-3">
                                        <div class="text">
                                            <p class="hello"><span>Welcome back,</span></p>
                                            <p class="fname"><span><c:out
                                                    value="${user.firstName}  ${user.lastName}"/></span></p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="balance-container">
                            <div class="balance-text">
                                <p><span>Your balance is:</span></p>
                                <p>
                      <span class="money"
                      ><c:out value="${user.account.balance}"/>
                        <span style="color: green; font-size: 50px"
                        >$</span
                        ></span
                      >
                                </p>
                            </div>
                        </div>
                        <div class="account-info">
                            <div class="info-text">
                                <p style="margin-bottom: 10px">
                                    <span style="font-size: 20px">Account Information</span>
                                </p>
                                <p><span>Email: <c:out value="${user.email}"/></span></p>
                            </div>
                        </div>
                    </section>
                </div>
                <div class="column-middle">
                    <section>
                        <div class="transaction">
                            <div class="trans-container">
                                <div class="title">
                                    <p><span>Pay Bill</span></p>
                                </div>
                                <div class="trans-info">
                                    <div class="container">
                                        <form>
                                            <label for="bill">Bill Number</label>
                                            <input type="number" id="bill" name="bill" required/>
                                            <div class="bill-detail">
                                                <p><span>Your Bill's details are:</span></p>
                                                <div class="bill-name-amount">
                                                    <p>
                                                        <span>Bill for: </span>
                                                        <span id="bill-name"> Electricity</span> <br>
                                                        <span>Bill amount:</span>
                                                        <span id="bill-amount">70$</span>
                                                    </p>
                                                </div>
                                            </div>

                                            <button type="submit">Accept and Pay</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
                <div class="column-right">
                    <section>
                        <div class="card">
                            <div class="card-container">
                                <div class="title">
                                    <p><span>Card & Tools</span></p>
                                </div>
                                <div class="card-visual">
                                    <div class="card-pic">
                                        <div class="card-brand">
                                            <p><span>Nura Bank</span></p>
                                        </div>
                                        <div class="chip">
                                            <img src="../resources/files/pics/chip.png" alt=""/>
                                        </div>
                                        <div class="name">
                                            <p><span><c:out value="${user.firstName}  ${user.lastName}"/></span></p>
                                        </div>
                                        <div class="card-num" id="card-number">
                                            <p>
                                                <span><c:out
                                                        value="${fn:substring(user.account.card.cardNumber,0,4)}"/> </span>
                                                <span> <c:out
                                                        value="${fn:substring(user.account.card.cardNumber,4,8)}"/> </span>
                                                <span> <c:out
                                                        value="${fn:substring(user.account.card.cardNumber,8,12)}"/> </span>
                                            </p>
                                        </div>
                                        <div class="card-exp-cvv">
                                            <p>
                            <span style="float: left">exp: 2024/07</span
                            ><span style="float: right">cvv2: 999</span>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                                <div class="tools-container">
                                    <div class="tools-row">
                                        <div class="tools-column">
                                            <div class="option"
                                                 onclick="window.location.href='/user-dashboard-transfer'">
                                                <script>function openPage(pageUrl) {
                                                    window.open(pageUrl);
                                                } </script>

                                                <div class="container">
                                                    <div class="logo">
                                                        <img
                                                                src="../resources/files/pics/transfer.svg"
                                                                alt=""
                                                        />
                                                    </div>
                                                    <div class="text"><p>Transfer</p></div>
                                                </div>
                                            </div>
                                            <div class="option" onclick="window.location.href='/user-dashboard-bill'">
                                                <div class="container">
                                                    <div class="logo">
                                                        <img src="../resources/files/pics/bill.svg" alt="">
                                                    </div>
                                                    <div class="text"><p>Bill</p></div>
                                                </div>
                                            </div>
                                            <div class="option"
                                                 onclick="window.location.href='/user-dashboard-sim'">
                                                <div class="container">
                                                    <div class="logo">
                                                        <img src="../resources/files/pics/simcard.svg" alt="">
                                                    </div>
                                                    <div class="text"><p>Charge Sim</p></div>
                                                </div>
                                            </div>
                                            <div class="option" id="support-bot"
                                                 onclick="openPage('https://t.me/nurabank_bot')">
                                                <script>function openPage(pageUrl) {
                                                    window.open(pageUrl);
                                                } </script>
                                                <div class="container">
                                                    <div class="logo">
                                                        <img src="../resources/files/pics/bot.svg" alt="">
                                                    </div>
                                                    <div class="text"><p>Support Bot</p></div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tools-column">
                                            <div class="option" id="copy-card">
                                                <div class="container">
                                                    <div class="logo">
                                                        <img src="../resources/files/pics/copy.svg" alt="">
                                                    </div>
                                                    <div class="text"><p>Copy Card Number</p></div>
                                                </div>
                                            </div>

                                            <div class="option"
                                                 onclick="window.location.href='/user-dashboard-online-pass'">
                                                <div class="container">
                                                    <div class="logo">
                                                        <img src="../resources/files/pics/password.svg" alt="">
                                                    </div>
                                                    <div class="text"><p>Online Password</p></div>
                                                </div>
                                            </div>
                                            <div class="option"
                                                 onclick="window.location.href='/user-dashboard-disable-account'">
                                                <div class="container">
                                                    <div class="logo">
                                                        <img src="../resources/files/pics/disable.svg" alt="">
                                                    </div>
                                                    <div class="text"><p>Disable Account</p></div>
                                                </div>
                                            </div>
                                            <div class="option" onclick="window.location.href='/user-dashboard-more'">
                                                <div class="container">
                                                    <div class="logo">
                                                        <img src="../resources/files/pics/more.svg" alt="">
                                                    </div>
                                                    <div class="text"><p>More</p></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
    </section>
</main>
<footer></footer>
<script src="../resources/js/dashboard-js.js" defer></script>
</body>
</html>
