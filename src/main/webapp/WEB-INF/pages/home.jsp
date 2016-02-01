<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <meta name = "format-detection" content = "telephone=no" />
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
      <div class="grid_4">
        <div class="banner">
          <div class="gall_block">
            <img src="resources/images/page1_img1.jpg" alt="">
            <div class="bann_capt ">
              <div class="maxheight">
                <img src="resources/images/icon3.png" alt="">
                <div class="bann_title">Restaurant</div>
                <a href="/result">Find Now</a>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="grid_4">
        <div class="banner">
          <div class="gall_block">
            <div class="bann_capt  bn__1">
              <div class="maxheight">
                <img src="resources/images/icon2.png" alt="">
                <div class="bann_title">Aspect</div>
                <a href="/result">Find Now</a>
              </div>
            </div>
            <img src="resources/images/page1_img2.jpg" alt="">
          </div>
        </div>
      </div>
      <div class="grid_4">
        <div class="banner ">
          <div class="gall_block">
            <img src="resources/images/page1_img3.jpg" alt="">
            <div class="bann_capt  bn__2">
              <div class="maxheight">
                <img src="resources/images/icon1.png" alt="">
                <div class="bann_title">Food</div>
                <a href="/result">Find Now</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>
