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
</head>
<body>
<div class="ui-widget">
  <label for="tags">Search: </label>
  <input id="tags">
</div>
</body>
</html>
