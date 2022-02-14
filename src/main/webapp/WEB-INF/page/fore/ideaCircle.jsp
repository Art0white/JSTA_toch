<%--
  Created by IntelliJ IDEA.
  User: Lovsog
  Date: 2022/2/12
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="include/header.jsp" %>
<html>
<head>
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="${pageContext.request.contextPath}/res/js/jquery-1.11.3.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>

    <link href="${pageContext.request.contextPath}/res/css/fore/fore_idea.css" rel="stylesheet"/>
    <title>创意圈子</title>
    <script type="text/javascript">
        function aa() {
            $(function() {
                var name1 = $("#name1")
                $('#aa').dialog({
                    height:300,
                    width:400,
                    modal:true, //是否使用模式，为true时背景半透明不能修改的效果
                    buttons:{
                        "确认":function () {
                            var bValid = true;
                            if ( bValid ) {
                                alert(name1.val());
                            }

                            $(this).dialog("close");
                        },
                        "取消":function () {
                            $(this).dialog("close");
                        }
                    }
                });
            })
        }
    </script>
</head>

<body>
<nav>
    <%@ include file="include/navigator.jsp" %>
</nav>
<div>
    <div class="idea-line1">

    </div>
    <div class="idea-menu">
        <%--    欢迎词    --%>
        <h1 class="idea-menu-title">欢迎来到创意圈子</h1>
        <%--    发布按钮    --%>
        <input class="primary-btn idea-menu-btn" type="button" onclick="aa()" value="我 有 想 法" />
    </div>

    <%--    卡片表单    --%>
    <div id="aa" title="名称" align="center" style="display: none">
        <form action="" id="nameform">
            <div style="height: 30px">
                <label style="float: left;">创意标题：</label><input style="float: right;" type="text" id="ideaTitle" name="ideaTitle">
            </div>

            <div style="height: 30px">
                <label style="float: left;">创意内容：</label><input style="float: right;" type="text" id="ideaContent" name="ideaContent">
            </div>

            <div style="height: 30px">
                <label style="float: left;">电话：</label><input style="float: right;" type="text" id="ideaTelphone" name="ideaTelphone">
            </div>

            <div style="height: 30px">
                <label style="float: left;">邮箱:</label><input style="float: right;" type="text" id="ideaMail" name="ideaMail">
            </div>
        </form>
    </div>

    <%--    创意标签    --%>
    <div class="blog-card">
        <div class="meta">
            <div class="photo" style="background-image: url(https://storage.googleapis.com/chydlx/codepen/blog-cards/image-1.jpg)"></div>
            <ul class="details">
                <li class="author"><a href="#">Lovsog李沫璇</a></li>
                <li class="date">2022/2/14</li>
            </ul>
        </div>
        <div class="description">
            <h1>我的创意标题</h1>
            <h2>我的创意标题</h2>
            <p>也没什么，测试一下，嘿嘿嘿。</p>
            <p class="read-more">
                <a href="#">Read More</a>
            </p>
        </div>
    <%--    <a href="${pageContext.request.contextPath}"></a>--%>
    </div>
    <div class="blog-card">
        <div class="meta">
            <div class="photo" style="background-image: url(https://storage.googleapis.com/chydlx/codepen/blog-cards/image-1.jpg)"></div>
            <ul class="details">
                <li class="author"><a href="#">Lovsog李沫璇</a></li>
                <li class="date">2022/2/14</li>
            </ul>
        </div>
        <div class="description">
            <h1>我的创意标题</h1>
            <h2>我的创意标题</h2>
            <p>也没什么，测试一下，嘿嘿嘿。</p>
            <p class="read-more">
                <a href="#">Read More</a>
            </p>
        </div>
        <%--    <a href="${pageContext.request.contextPath}"></a>--%>
    </div>
    <div class="blog-card">
        <div class="meta">
            <div class="photo" style="background-image: url(https://storage.googleapis.com/chydlx/codepen/blog-cards/image-1.jpg)"></div>
            <ul class="details">
                <li class="author"><a href="#">Lovsog李沫璇</a></li>
                <li class="date">2022/2/14</li>
            </ul>
        </div>
        <div class="description">
            <h1>我的创意标题</h1>
            <h2>我的创意标题</h2>
            <p>也没什么，测试一下，嘿嘿嘿。</p>
            <p class="read-more">
                <a href="#">Read More</a>
            </p>
        </div>
        <%--    <a href="${pageContext.request.contextPath}"></a>--%>
    </div>
    <div class="blog-card">
        <div class="meta">
            <div class="photo" style="background-image: url(https://storage.googleapis.com/chydlx/codepen/blog-cards/image-1.jpg)"></div>
            <ul class="details">
                <li class="author"><a href="#">Lovsog李沫璇</a></li>
                <li class="date">2022/2/14</li>
            </ul>
        </div>
        <div class="description">
            <h1>我的创意标题</h1>
            <h2>我的创意标题</h2>
            <p>也没什么，测试一下，嘿嘿嘿。</p>
            <p class="read-more">
                <a href="#">Read More</a>
            </p>
        </div>
        <%--    <a href="${pageContext.request.contextPath}"></a>--%>
    </div>
    <div class="blog-card">
        <div class="meta">
            <div class="photo" style="background-image: url(https://storage.googleapis.com/chydlx/codepen/blog-cards/image-1.jpg)"></div>
            <ul class="details">
                <li class="author"><a href="#">Lovsog李沫璇</a></li>
                <li class="date">2022/2/14</li>
            </ul>
        </div>
        <div class="description">
            <h1>我的创意标题</h1>
            <h2>我的创意标题</h2>
            <p>也没什么，测试一下，嘿嘿嘿。</p>
            <p class="read-more">
                <a href="#">Read More</a>
            </p>
        </div>
        <%--    <a href="${pageContext.request.contextPath}"></a>--%>
    </div>

<%@ include file="include/footer.jsp" %>
</body>
</html>
