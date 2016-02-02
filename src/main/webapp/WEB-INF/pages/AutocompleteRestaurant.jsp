<%@ page import="java.util.List" %>
<%@ page import="com.arcturusx.eatery.domain.BusinessEntity" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.simple.JSONArray" %>
<%--
  Created by IntelliJ IDEA.
  User: prakhash
  Date: 01/02/16
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>jQuery UI Autocomplete - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
    $(function() {
      <%
      List businessLit=(List) request.getAttribute("message");
      JSONObject tmp;
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
<body>
<div class="ui-widget">
  <label for="tags">Search: </label>
  <form id="restaurantform">
    <input type="text" id="tags">
    <input type="submit" value="search">
  </form>

</div>
</body>
</html>
