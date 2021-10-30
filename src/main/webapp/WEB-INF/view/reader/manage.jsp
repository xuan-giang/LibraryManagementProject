<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Danh sách người đọc</title>
    <%@include file="../include/header.jsp" %>
    <style>
        .table-custom {
            margin-left: 10%;
            margin-right: 10%;
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
                        <h1 class="m-0">Danh sách người đọc</h1>
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
                    <th>Họ tên</th>
                    <th>Giới tính</th>
                    <th>Số điện thoại</th>
                    <th>Email</th>
                    <th>Địa chỉ</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list_object}" var="reader" varStatus="x">
                    <tr>
                        <td>${reader.idReader}</td>
                        <td>${reader.name}</td>
                        <td>${reader.gender}</td>
                        <td>${reader.phone}</td>
                        <td>${reader.email}</td>
                        <td>${reader.address}</td>
                        <td>
                            <a class="btn btn-info" href="/reader/update?id=${reader.id}">Sửa</a>
                            <a class="btn btn-danger" href="/reader/delete?id=${reader.id}">Xóa</a>
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
