<%@ page import="Myclass.People" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 小小勇
  Date: 2022/4/24
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
id1${allpeople.get(0).id}
name1${allpeople.get(0).name}
sex1${allpeople.get(0).sex}
age1${allpeople.get(0).age}<br/>
id2${allpeople.get(1).id}
name2${allpeople.get(1).name}
sex2${allpeople.get(1).sex}
age2${allpeople.get(1).age}
</body>
</html>
