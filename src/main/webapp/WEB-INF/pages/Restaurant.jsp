<%@ page import="java.util.List" %>
<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="com.arcturusx.eatery.domain.BusinessEntity" %>
<%@ page import="com.arcturusx.eatery.domain.AspectEntity" %>
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
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
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
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src=resources/script.js></script>
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <script>
    $(function() {
      <%
      List businessLit=(List) request.getAttribute("message");
      String listString="[";
      for (int i=0;i<businessLit.size()-1;i++){
      BusinessEntity businessEntity=(BusinessEntity) businessLit.get(i);
      listString+="\"";
      listString+=businessEntity.getName().toString()+"\",";
      }
      BusinessEntity businessEntity=(BusinessEntity) businessLit.get(businessLit.size()-1);
      listString+="\"";
      listString+=businessEntity.getName().toString()+"\"]";

      %>
      <%--var availableTags = <%=listString%>--%>
      $( "#tags" ).autocomplete({
        source: <%=listString%>
      });
    });

  </script>
  <script>
    $(function() {
      <%
      List aspectList=(List) request.getAttribute("message1");
      String listString1="[";
      for (int i=0;i<aspectList.size()-1;i++){
      AspectEntity aspectEntity=(AspectEntity) aspectList.get(i);
      listString1+="\"";
      listString1+=aspectEntity.getAspectName().toString()+"\",";
      }
      AspectEntity aspectEntity=(AspectEntity) aspectList.get(aspectList.size()-1);
      listString1+="\"";
      listString1+=aspectEntity.getAspectName().toString()+"\"]";

      %>
      <%--var availableTags = <%=listString%>--%>
      $( "#tags1" ).autocomplete({
        source: <%=listString1%>
      });
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
            <li ><a href='Main'>Aspect</a>
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
            <li><a href='Restaurants'>Restaurant</a></li>
            <li><a href='food-list'>Food</a></li>
          </ul>
        </div>
      </div>
      <div class="grid_6" style="margin-top: 50px; color:black"><div class="ui-widget">
        <label for="tags" style="font-size: 15px; font-weight: bold;">Search: </label>
        </br>
        <form id="restaurantform" action="best-restaurants-and-aspect">
          <div class="grid_2"><input type="text" id="tags"></div>
          <div class="grid_2" style="padding-left: 20px"><input type="text" id="tags1" ></div>
          <div class="grid_1" style="padding-left: 20px; padding-top: 1px"><input type="submit" class="btn-style" value="search"></div>
        </form>

        <div id="ajaxResponse" style="padding-top: 50px">


        </div>
      </div>

      </div>
    </div>
  </div>
  </div>
</section>

<script type='text/javascript'>
  $("#restaurantform").submit(function(event) {

    event.preventDefault();
    var $form = $( this ),
            url = $form.attr( 'action' );
    var posting = $.post( url, { resname: $('#tags').val(), aspectname: $('#tags1').val() } );

    posting.done(function( response ) {

      $("#ajaxResponse").empty();

      var divs=response.split("##");
      $("#ajaxResponse").append("</br>")

      $("#ajaxResponse").append('<table>');
      $("#ajaxResponse").append('<tr><td width="20px">'+'\t'+'</td><td style="width: 350px">'+'<tr style="font-size: 15px; font-weight: bold;"><td>'+"Restaurants"+'</td><td width="80px">'+'\t'+'</td><td>'+"Score"+'</td></tr><tr style="height: 15px"></tr>');

      for (var i=0; (i < divs.length-1) && (i<5); i++){
        var divs1=divs[i].split("*")
        $("#ajaxResponse").append('<tr><td>'+"<img src='resources/images/"+divs1[0]+".jpg'>"+'</td><td style="width: 400px; padding-top: 22px; padding-left: 15px">'+divs1[0]+ '</td><td class ="bar"> <li style="width: '+divs1[1]*80+'px">'+ parseInt(divs1[1]*1000)/1000+'</li></td></tr><tr style="height: 15px"></tr>');

      }
      $("#ajaxResponse").append('</table>');
    });
  });
</script>
</body>
</html>