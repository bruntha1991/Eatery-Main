<%--
  Created by IntelliJ IDEA.
  User: prakhash
  Date: 01/02/16
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <link rel="icon" href="resources/images/favicon.ico">
  <link rel="shortcut icon" href="resources/images/favicon.ico" />
  <link rel="stylesheet" href="resources/css/stuck.css">
  <link rel="stylesheet" href="resources/css/style.css">
  <link rel="stylesheet" href="resources/css/touchTouch.css">
  <script src="resources/js/jquery.js"></script>
  <script src="resources/js/jquery-migrate-1.1.1.js"></script>
  <script src="resources/js/script.js"></script>
  <script src="resources/js/superfish.js"></script>
  <script src="resources/js/jquery.equalheights.js"></script>
  <script src="resources/js/jquery.mobilemenu.js"></script>
  <script src="resources/js/jquery.easing.1.3.js"></script>
  <script src="resources/js/tmStickUp.js"></script>
  <script src="resources/js/jquery.ui.totop.js"></script>
  <script src="resources/js/touchTouch.jquery.js"></script>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/styles.css">
  <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
  <script src=resources/script.js></script>
  <script>
    $(document).ready(function(){

      $().UItoTop({ easingType: 'easeOutQuart' });
      $('#stuck_container').tmStickUp({});
      $('.gallery .gall_item').touchTouch();

    });
  </script>
  <!--[if lt IE 9]>
  <div style=' clear: both; text-align:center; position: relative;'>
    <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
      <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
    </a>
  </div>
  <script src="resources/js/html5shiv.js"></script>
  <link rel="stylesheet" media="screen" href="resources/css/ie.css">


  <![endif]-->
  <style>
    span.reference{
      position:fixed;
      left:10px;
      bottom:10px;
      font-size:12px;
    }
    span.reference a{
      color:#aaa;
      text-transform:uppercase;
      text-decoration:none;
      text-shadow:1px 1px 1px #000;
      margin-right:30px;
    }
    span.reference a:hover{
      color:#ddd;
    }
    ul.sdt_menu{
      margin-top:150px;
    }
  </style>
</head>
<body class="page1" id="top">
<!--==============================
              header
=================================-->
<header>
  <!--==============================
              Stuck menu
  =================================-->
  <section id="stuck_container">
    <div class="container">
      <div class="row">
        <div class="grid_12" >
          <h1>
            <a href="index.html">
              <img src="resources/images/logo2.gif" alt="Logo alt">
            </a>
          </h1>
        </div>
      </div>
    </div>
  </section>
</header>

<!--=====================
          Content
======================-->
<section class="content"><div class="ic">More Website Templates @ TemplateMonster.com - July 30, 2014!</div>
  <div class="container">
    <div class="row">
      <div class="grid_4" style="margin-top: 50px">
        <div id='cssmenu'>
          <ul>
            <li class='active has-sub'><a href='#'>Aspect</a>
              <ul>
                <li class="has-sub"><a href='#'>Food</a>

                  <ul>
                    <li><a href='#'>Food</a></li>
                    <li><a href='#'>Fooditem</a></li>
                    <li><a href='#'>Fooditem - Taste</a></li>
                    <li><a href='#'>Fooditem - Price</a></li>
                    <li><a href='#'>Fooditem - Quality</a></li>
                    <li><a href='#'>Fooditem - Healthy</a></li>
                    <li><a href='#'>Fooditem - Cooking Level</a></li>
                    <li><a href='#'>Size</a></li>
                    <li><a href='#'>Drink</a></li>
                    <li><a href='#'>Dessert</a></li>
                    <li><a href='#'>Appertizer</a></li>
                  </ul>
                </li>
                <li class="has-sub"><a href='#'>Service</a>
                  <ul>
                    <li><a href='#'>Service</a></li>
                    <li><a href='#'>Staffs</a></li>
                    <li><a href='#'>Staff - Experience</a></li>
                    <li><a href='#'>Staff - Behaviour</a></li>
                    <li><a href='#'>Staff - Availability</a></li>
                    <li><a href='#'>Staff - Appearance</a></li>
                    <li><a href='#'>Open hours</a></li>
                    <li><a href='#'>Menu</a></li>
                    <li><a href='#'>Wifi</a></li>
                    <li><a href='#'>Delivery</a></li>
                    <li><a href='#'>Delivery - Time</a></li>
                  </ul>
                </li>
                <li class="has-sub"><a href='#'>Ambience</a>
                  <ul>
                    <li><a href='#'>Decor</a></li>
                    <li><a href='#'>Furniture</a></li>
                    <li><a href='#'>Environment</a></li>
                    <li><a href='#'>Environment - Size</a></li>
                    <li><a href='#'>Environment - Type</a></li>
                    <li><a href='#'>Entertainment</a></li>
                    <li><a href='#'>Places</a></li>
                    <li><a href='#'>Places - Bar</a></li>
                    <li><a href='#'>Places - Dining Room</a></li>
                    <li><a href='#'>Outside View</a></li>
                    <li><a href='#'>Located Area</a></li>
                  </ul>
                </li>
                <li><a href='#'>Offer/Discount</a></li>
                <li class="has-sub"><a href='#'>Worthiness</a>
                  <ul>
                    <li><a href='#'>Price</a></li>
                    <li><a href='#'>Waiting</a></li>
                  </ul>
                </li>
                <li class="has-sub"><a href='#'>Others</a>
                  <ul>
                    <li><a href='#'>Reservation</a></li>
                    <li><a href='#'>Payment</a></li>
                    <li><a href='#'>Overall Experience</a></li>
                  </ul>
                </li>
              </ul>
            </li>
            <li><a href='#'>Restaurant</a></li>
            <li><a href='#'>Food</a></li>
          </ul>
        </div>

      </div>
      <div class="grid_4" style="margin-top: 50px; color:black">

      </div>
    </div>
  </div>
  </div>


</section>
</body>
</html>
