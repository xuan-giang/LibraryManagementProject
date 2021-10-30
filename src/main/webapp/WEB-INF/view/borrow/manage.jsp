<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Quản lý mượn trả</title>
    <%@include file="../include/header.jsp" %>
    <style>
        .table-custom {
            margin-left: 2%;
            margin-right: 2%;
        }
    </style>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="index3.html" class="nav-link">Home</a>
            </li>
        </ul>

        <!-- Right navbar links -->
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" data-widget="fullscreen" href="#" role="button">
                    <i class="fas fa-expand-arrows-alt"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
                    <i class="fas fa-th-large"></i>
                </a>
            </li>
        </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <%@include file="../include/main_slide_bar.jsp" %>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <div class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1 class="m-0">Quản lý mượn trả</h1>
                    </div><!-- /.col -->

                </div><!-- /.row -->
            </div><!-- /.container-fluid -->
        </div>
        <!-- /.content-header -->

        <!-- Form -->
        <!-- /.card-header -->
        <div class="card-body p-0 table-custom">
            <table class="table">
                <thead>
                <tr>
                    <th>Tên sách</th>
                    <th>Người mượn</th>
                    <th>Ngày mượn</th>
                    <th>Ngày hạn trả</th>
                    <th>Tiền cọc</th>

                    <th>Trạng thái</th>
                    <th>Hành động</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list_object}" var="borrow" varStatus="x">
                    <tr>

                        <td>${borrow.book.getName()}</td>
                        <td>${borrow.reader.getName()}</td>
                        <td>${borrow.borrowFrom}</td>
                        <td>${borrow.borrowTo}</td>
<%--                        <td>${borrow.actualReturn}</td>--%>
                        <td>${borrow.deposit}</td>


                            <%--                        <td><img src="<c:url value="/user-photos/${book.imageUrl}"/>" alt="User Image" width="150px" height="100px"></td>--%>
                        <td>
<%--                            <a class="btn btn-warning" href="/book/update?id=${borrow.id}">Sửa</a>--%>
<%--                            <a class="btn btn-danger" href="/book/delete?id=${borrow.id}">Xóa</a>--%>
    <p style="text-align: center;background-color: #ccc;color: red; font-size: 14px; font-weight: bold">Đang mượn</p>
                        </td>
                        <td>
                            <a class="btn btn-info" href="/book/update?id=${borrow.id}">Sửa</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <!-- /.card-body -->
        <!-- /.Form -->
    </div>
    <!-- /.content-wrapper -->


    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
    </aside>
    <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<%@include file="../include/script.jsp" %>
</body>
</html>
