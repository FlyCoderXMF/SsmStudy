<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookId" value="${Qbook.bookId}">
        书籍名称：<input type="text" name="bookName" value="${Qbook.bookName}"><br><br><br>
        书籍数量：<input type="text" name="counts" value="${Qbook.counts}"><br><br><br>
        书籍详情：<input type="text" name="detail" value="${Qbook.detail}"><br><br><br>
        <input type="submit" value="修改">
    </form>

</div>
</body>
</html>
