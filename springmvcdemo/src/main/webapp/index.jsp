<%--
  Created by IntelliJ IDEA.
  User: 夜空中划过的流星
  Date: 2021/9/10, 0010
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎来到首页
<br>
<a href="/hello/world">点击跳转</a>

<form action="/param/test1" method="post">
    用户名:<input name="username" type="text"><br>
    密码：<input name="password" type="password">
    <input type="submit" value="提交">


</form>

<form action="/param/test2" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    地址：<input type="text" name="address"><br>
    爱好：<input type="text" name="hobbies">
             <input type="text" name="hobbies">
             <input type="text" name="hobbies"><br>
    车名称：<input type="text" name="Car.carName">
    车价格：<input type="text" name="Car.carPrice"><br>
    车库：
    第一辆车名称：<input type="text" name="carList[0].carName">
    第一辆车价格：<input type="text" name="carList[0].carPrice"><br>
    第二辆车名称：<input type="text" name="carList[1].carName">
    第二辆车价格：<input type="text" name="carList[1].carPrice"><br>
    <input type="submit" value="提交">



</form>


</body>
</html>
