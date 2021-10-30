<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Danh sách sách</title>
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
                        <h1 class="m-0">Danh sách sách</h1>
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
                    <th style="width: 20px">ID</th>
                    <th>Tên sách</th>
                    <th>Nhà xuất bản</th>
                    <th>Tác giả</th>
                    <th>Số lượng sách</th>
                    <th>Danh mục</th>
                    <th>Ảnh bìa</th>
                    <th>Hành động</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list_object}" var="book" varStatus="x">
                    <tr>

                        <td>${book.idBook}</td>
                        <td>${book.name}</td>
                        <td>${book.publisher}</td>
                        <td>${book.author}</td>
                        <td>${book.quantity}</td>
                        <td>${book.category.getName()}</td>
                        <td>
                            <img src="/resources/dist/img/user-photos/${book.imageUrl}" alt="Book Image" width="80px" height="120px">
                        </td>
<%--                        <td><img src="<c:url value="/user-photos/${book.imageUrl}"/>" alt="User Image" width="150px" height="100px"></td>--%>
                        <td>
                            <a class="btn btn-warning" href="/book/update?id=${book.id}">Sửa</a>
                            <a class="btn btn-danger" href="/book/delete?id=${book.id}">Xóa</a>
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
