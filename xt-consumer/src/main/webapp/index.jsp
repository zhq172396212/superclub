
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <script type="text/javascript" src="static/jquery.min.js"></script>
    <script>
        function demo() {
            $.ajax({
                url:"blog/find",
                type:"post",
                dataType:"json",
                success:function(data){
                    console.log(data)
                }
            })
        }
    </script>
</head>
<body>
    <a href="javascript:demo()">test</a>
</body>
</html>
