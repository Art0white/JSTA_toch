<%--
  Created by IntelliJ IDEA.
  User: Pandoras Box
  Date: 2022/2/20
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="include/header.jsp" %>
<html>
<head>

    <script src="${pageContext.request.contextPath}/res/js/jquery-1.11.3.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>


    <script src="${pageContext.request.contextPath}/res/js/fore/fore_afterSales.js"></script>
    <link href="${pageContext.request.contextPath}/res/css/fore/fore_afterSales.css" rel="stylesheet"/>
    <title>售后服务</title>
</head>

<nav>
    <%@ include file="include/navigator.jsp" %>
</nav>
<body>
<div class="flexbox">
    <div class="chat-box">
        <div class="chat-box-header">
            <h3>售后服务<br /></h3>
            <div class="dd">
                <form action="">
                    <small>商品订单：</small>
                    <button value="123" style="float: right; margin-left: 20px">选择</button>
                    <select class="a_drawer" id="p_id" name="p_id">   <%--form-control--%>
                        <option value="null">请选择</option>
                        <option value="123">123</option>

                        <%--                    <c:forEach items="${.}" var="category">--%>
                        <%--                        <option value="${.}">${.}</option>--%>
                        <%--                    </c:forEach>--%>
                    </select>
                </form>

            </div>
        </div>
        <%--    展示    --%>
        <div id="chat_box_body" class="chat-box-body">
            <div id="chat_messages">
                <div class="profile other-profile">
                    <img src="https://images.unsplash.com/photo-1537396123722-b93d0acd8848?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjE0NTg5fQ&s=efc6e85c24d3cfdd15cd36cb8a2471ed" width="30" height="30" />
                    <span>Other profile</span>
                </div>
                <div class="message other-message">
                    Hello!
                </div>
                <div class="profile my-profile">
                    <span>My profile</span>
                    <img src="https://images.unsplash.com/photo-1534135954997-e58fbd6dbbfc?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjE0NTg5fQ&s=02d536c38d9cfeb4f35f17fdfaa36619" width="30" height="30" />
                </div>
                <div class="message my-message">
                    Hi!
                </div>
                <div class="message my-message">
                    How are you!
                </div>
            </div>
        </div>

        <div id="typing">
            <div><span></span> <span></span> <span></span> <span class="n">Someone</span> is typing...</div>
        </div>
        <%--    输入   --%>
        <div class="chat-box-footer">
            <textarea id="chat_input" placeholder="Enter your message here..."></textarea>
            <button id="send">
                <svg style="width:24px;height:24px" viewBox="0 0 24 24">
                    <path fill="#006ae3" d="M2,21L23,12L2,3V10L17,12L2,14V21Z" />
                </svg>
            </button>
        </div>
    </div>
</div>
</body>

<%--<%@ include file="include/footer.jsp" %>--%>
</html>
