<%--
  Created by IntelliJ IDEA.
  User: pl
  Date: 2022/4/17
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增</title>
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍新增</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="get" class="form-horizontal">
        <input type="hidden" name="bookID" value="${qBook.bookID}" >
        <div class="form-group">
            <label for="bkname" class="col-sm-2 control-label">书名：</label>
            <div class="col-sm-10 col-xs-4">
                <input type="text" name="bookName" value="${qBook.bookName}" class="form-control" id="bkname" required>
            </div>
        </div>
        <div class="form-group">
            <label for="bksum" class="col-sm-2 control-label">数量：</label>
            <div class="col-sm-10">
                <input type="text" name="bookCounts" value="${qBook.bookCounts}" class="form-control" id="bksum" required>
            </div>
        </div>
        <div class="form-group">
            <label for="bkdetail" class="col-sm-2 control-label" >描述：</label>
            <div class="col-sm-10">
                <%--                <input type="text"  class="form-control" >--%>
                <textarea name="detail" class="form-control"  rows="3" id="bkdetail" >${qBook.detail}</textarea>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-info btn-block">修改</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
