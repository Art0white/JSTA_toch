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
                var name1 = $("#ideaTitle")
                $('#aa').dialog({
                    height:600,
                    width:500,
                    modal:true, //是否使用模式，为true时背景半透明不能修改的效果
                    buttons:{
                        // "确认":function () {
                        //
                        //     var bValid = true;
                        //     if ( bValid ) {
                        //         // location.reload();
                        //         alert(name1.val());
                        //     }
                        //
                        //     $(this).dialog("close");
                        // },
                        "取消":function () {
                            $(this).dialog("close");
                        }
                    }
                });
            })
        }

        function bb() {
            $(function() {
                var name2 = $("#name2")
                $('#bb').dialog({
                    height:600,
                    width:1000,
                    modal:true //是否使用模式，为true时背景半透明不能修改的效果
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
    <div id="aa" title="创意" align="center" style="display: none">
        <form role="form" action="${pageContext.request.contextPath}/newIdea/addIdea" id="ideaForm" method="post" enctype="multipart/form-data">
            <div style="height: 30px">
                <label style="float: left;">创意标题：</label><input style="float: right; width: 280px;" type="text" id="ideaTitle" name="ideaTitle">
            </div>

            <div style="height: 240px;">
                <label style="float: left;">创意内容：</label><textarea type="text" style="float: right; height: 240px; width: 284px; resize: none;" rows="10" cols="30" id="ideaContent" name="ideaContent"></textarea>
            </div>

            <div style="height: 30px;">
                <label style="float: left;">图片(上传一张)：</label><input style="float: right; width: 284px;" type="file" accept="image/*" id="ideaPictureSrc" name="ideaPictureSrc">
            </div>

            <div style="height: 30px">
                <label style="float: left;">电话：</label><input style="float: right; width: 280px;" type="text" id="ideaTelphone" name="ideaTelphone">
            </div>

            <div style="height: 30px">
                <label style="float: left;">邮箱:</label><input style="float: right; width: 280px;" type="text" id="ideaMail" name="ideaMail">
            </div>

            <button type="submit">确认</button>
        </form>
    </div>

    <div>
        <%--    创意标签    --%>
        <c:forEach var="n" items="${requestScope.newIdea}" varStatus="i">
            <div class="blog-card">
                <div class="meta">
                    <div class="photo" style="background-image: url(https://storage.googleapis.com/chydlx/codepen/blog-cards/image-1.jpg)"></div>
                    <ul class="details">
                        <li class="author"><a href="#">${n.userId}</a></li>
                        <li class="date">${n.createDate}</li>
                    </ul>
                </div>
                <div class="description">
                    <h1>${n.ideaTitle}</h1>
                    <h2>${n.ideaTitle}</h2>
                    <p>${n.ideaContent}</p>
                    <p class="read-more">
                        <a href="#" onclick="bb(1)">Read More</a>
                    </p>
                </div>

                    <%--    Read me    --%>
                <div id="bb" align="center" style="display: none" class="blog-card-read">
                        <%--    左图    --%>
                    <div class="read-left">
                            <%--                <img src="${pageContext.request.contextPath}/res/images/fore/WebsiteImage/T1MQ1cXhtiXXXXXXXX-78-120.png">--%>
                        <img src="${n.ideaPictureSrc}">
                    </div>
                        <%--    右文字    --%>
                    <div class="read-right">
                        <div class="read-right-title">
                            <h3>${n.ideaTitle}</h3>
                        </div>
                        <div class="read-right-info">
                            <h5>${n.userId}  ${n.createDate}</h5>
                        </div>
                        <div class="read-right-text">
                            <p>${n.ideaContent}</p>
                        </div>
                        <div class="read-right-lx">
                            <p>电话：${n.ideaTelphone}</p>
                            <p>邮箱：${n.ideaMail}</p>
                        </div>
                    </div>
                </div>
                    <%--    <a href="${pageContext.request.contextPath}"></a>--%>
            </div>
        </c:forEach>
    </div>


<%@ include file="include/footer.jsp" %>
</body>
</html>
