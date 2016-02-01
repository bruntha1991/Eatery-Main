<!DOCTYPE html>
<html lang="en">
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
  <script src="resources/script.js"></script>
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
            <a href="resources/index.html">
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
                <li><a href='#'>Food</a></li>
                <li><a href='#'>Service</a></li>
                <li><a href='#'>Ambience</a></li>
                <li><a href='#'>Offer/Discount</a></li>
                <li><a href='#'>Worthiness</a></li>
                <li><a href='#'>Others</a></li>
              </ul>
            </li>
            <li><a href='#'>Restaurant</a></li>
            <li><a href='#'>Food</a></li>
          </ul>
        </div>

      </div>
      <div class="grid_4" style="margin-top: 50px; color:black">
        <select>
          <option value="Food">Food</option>
          <option value="Fooditem">Fooditem</option>
          <option value="Taste">Taste</option>
          <option value="Price">Price</option>
          <option value="Quality">Quality</option>
          <option value="Healthy">Healthy</option>
          <option value="CookingLevel">Cooking Level</option>
          <option value="Size">Size</option>
          <option value="Drink">Drink</option>
          <option value="Dessert">Dessert</option>
          <option value="Appertizer">Appertizer</option>
        </select>
      </div>
    </div>
  </div>
  </div>


</section>

<script>


  function getRequiredId(cell, comid) {

    "use strict";
    // get the form values
    var value = cell.innerHTML;
    var comid = comid;

    event.preventDefault();
    $.ajax({

      type: "POST",
      url: "update-potential-client",
      data: "comid=" + comid + "&value=" + value,
      success: function (response) {
        // we have the response
        $('#info').html(response);
        $('#comid').val('');
        $('#value').val('');
      },
      error: function (e) {
        alert('Error: ' + e + comid + "  " + value);
      }
    });

  }
  </script>
</body>
</html>
