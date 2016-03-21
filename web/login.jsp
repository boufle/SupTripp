<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>



    <section class="sub-banner">
        <div class="bg-parallax bg-1"></div>
        <div class="logo-banner text-center">
            <a href="#" title="">
                <img src="images/logo-banner.png" alt="">
            </a>
        </div>
    </section>
    <div class="main">

        <div class="container">
            <div class="main-cn element-page bg-white clearfix">
                <section class="user-profile">
                    <div class="user-form user-signup">
                        <div class="row">
                            <div class="col-md-6">
                                <h2 class="user-profile__title">Sign in</h2>
                                <p>Access your account information and manage your bookings.</p>
                                <form action="/index" method="post">
                                    <div class="field-input">
                                        <input type="text" name="loginInIdBooster" class="input-text" value="IdBooster *">
                                    </div>
                                    <div class="field-input">
                                        <input type="text" name="loginInPassword" class="input-text" value="Password *">
                                    </div>
                                    <div class="field-input">
                                        <button type="submit" class="awe-btn awe-btn-1 awe-btn-medium">Sign in</button>
                                    </div>
                                </form>
                            </div>

                            <div class="col-md-6">
                                <h2 class="user-profile__title">Sign up</h2>
                                <p>Sign up now and receive exclusive offers with huge discounts</p>
                                <form action="/" method="post">
                                    <div class="field-input">
                                        <input type="text" name="idBooster" class="input-text" value="IdBooster *">
                                    </div>
                                    <div class="field-input">
                                        <input type="text" name="firstName" class="input-text" value="First Name *">
                                    </div>
                                    <div class="field-input">
                                        <input type="text" name="lastName" class="input-text" value="Last name *">
                                    </div>
                                    <div class="field-input">
                                        <input type="text" name="email" class="input-text" value="Email *">
                                    </div>
                                    <div class="field-input">
                                        <input type="text" name="campusCity" class="input-text" value="Campus City*">
                                    </div>
                                    <div class="field-input">
                                        <input type="text" name="password" class="input-text" value="Password *">
                                    </div>
                                    <div class="field-input">
                                        <button type="submit" name="submit" class="awe-btn awe-btn-1 awe-btn-medium">Sign up</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
        </div>
    </div>

<%@ include file="footer.jsp" %>