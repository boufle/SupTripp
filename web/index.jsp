<%@ include file="header.jsp" %>

    <section class="banner">
        <div class="bg-parallax bg-1"></div>
        <div class="container">
            <div class="logo-banner text-center">
                <a href="#" title="">
                    <img src="images/logo-banner.png" alt="">
                </a>
            </div>
            <div class="banner-cn">
                <ul class="tabs-cat text-center row">
                    <li class="cate-item col-xs-2 active">
                        <a data-toggle="tab" href="#form-tour" title=""><span>TRIP</span><img src="images/icon-vacation.png" alt=""></a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="form-cn form-flight tab-pane active" id="form-flight">
                        <h2>Where would you like to go?</h2>
                        <div class="form-search clearfix">
                            <form action="/loginIn" method="post">
                                <div class="form-field field-from">
                                    <label for="flight-from"><span>From:</span></label>
                                    <input type="text" name="flightfrom" id="flight-from" class="field-input">
                                </div>
                                <div class="form-field field-to">
                                    <label for="flight-to"><span>To :</span></label>
                                    <input type="text" id="flight-to" class="field-input">
                                </div>
                                <div class="form-field field-date">
                                    <input type="text" class="field-input calendar-input" placeholder="Departing">
                                </div>
                                <div class="form-field field-date">
                                    <input type="text" class="field-input calendar-input" placeholder="Returning">
                                </div>
                                <div class="form-submit">
                                    <button type="submit" class="awe-btn awe-btn-medium awe-search">Search</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

<%@ include file="footer.jsp" %>