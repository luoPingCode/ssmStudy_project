<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pl
  Date: 2022/4/17
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部书籍查询</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍展示------显示所有书籍</small>
                    </h1>
                </div>
            </div>
        </div>
        <nav class="navbar navbar-light bg-light">
            <div class="container-fluid">
                <a href="${pageContext.request.contextPath}/book/toAddBook" class="btn btn-primary" role="button">新增书籍</a>
                <span style="color: red">${msg}</span>
                <form action="${pageContext.request.contextPath}/book/searchBook" method="get" class="d-flex" role="search">
                    <input name="bookName" class="form-control me-2" type="search" placeholder="请输入书籍名称" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">查询</button>
                </form>
            </div>
        </nav>
<%--        <div class="row">--%>
<%--            <div class="col">--%>
<%--                <nav class="navbar navbar-light bg-light">--%>
<%--                    <div class="container-fluid">--%>

<%--                    </div>--%>
<%--                </nav>--%>
<%--            </div>--%>
<%--        </div>--%>
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍描述</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--                书籍从数据库中查询出来，从这个list中遍历出来：foreach--%>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bookID}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                        <td>
                            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toUpdatePage?id=${book.bookID}" role="button">修改</a>
                            &nbsp; | &nbsp;
                            <a class="btn btn-danger" href="${pageContext.request.contextPath}/book/delBook/${book.bookID}" role="button">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
<%--    <div class="row clearfix">--%>
<%--        <div class="col-md-12 column">--%>
<%--            <div class="page-header">--%>
<%--                --%>
<%--            </div>--%>
<%--            <div class="row">--%>
<%--                <div class="col-md-4 column">--%>
<%--                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook" role="button">增加</a>--%>

<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <div class="row clearfix">--%>
<%--        --%>
<%--    </div>--%>
</body>
</html>
