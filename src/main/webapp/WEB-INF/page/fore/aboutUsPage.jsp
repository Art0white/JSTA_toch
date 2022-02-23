<%--
  Created by IntelliJ IDEA.
  User: Pandoras Box
  Date: 2022/2/21
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="include/header.jsp" %>
<html>
<head>

    <title>关于我们</title>
</head>

<nav>
    <%@ include file="include/navigator.jsp" %>
</nav>

<body>
<div id="title" class="slide header">
    <script src="${pageContext.request.contextPath}/res/js/jquery-1.11.3.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>

    <link href="${pageContext.request.contextPath}/res/css/fore/fore_aboutUsPage.css" rel="stylesheet"/>
    <h1>架上添安-安防产品领导者</h1>
</div>

<div id="slide1" class="slide">
    <div class="title nu-left">
        <h1>第一部分</h1>
        <p>第一部分内容</p>
    </div>
</div>

<div id="slide2" class="slide">
    <div class="title nu-right">
        <h1>第二部分</h1>
        <p>第二部分内容</p>
    </div>
    <img src="${pageContext.request.contextPath}/res/images/fore/WebsiteImage/c1.JPG">
    <img src="${pageContext.request.contextPath}/res/images/fore/WebsiteImage/c2.JPG">
</div>

<div id="slide3" class="slide">
    <div class="title nu-left">
        <h1>第三部分</h1>
        <p>第三部分内容</p>
    </div>
</div>

<div id="slide4" class="slide header">
    <h1>谢谢访问</h1>

</div>

</body>
</html>
