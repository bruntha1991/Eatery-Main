<%@ page import="java.util.List" %>
<%@ page import="com.arcturusx.eatery.domain.BusinessEntity" %>
<%@ page import="com.arcturusx.eatery.domain.CompositeScoreEntity" %>
<html>
<body>
<h1>Composite Scores</h1>
<table>
  <tr>
    <td>Aspect Id</td>
    <td>Composite Scores</td>
  </tr>
  <%
    List resList= (List) request.getAttribute("message");
    for (int i=resList.size()-1;i>=resList.size()-5&& i>0;i--) {
      CompositeScoreEntity compositeScoreEntity=(CompositeScoreEntity) resList.get(i);
  %>
  <tr>
    <td><%out.println(compositeScoreEntity.getAspectId());%></td>
    <td><%out.println(compositeScoreEntity.getCompositeScore());%></td>
  </tr>
  <%}%>
</table>


</body>
</html>