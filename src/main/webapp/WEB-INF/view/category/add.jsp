<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Thêm danh mục</title>
   <%@include file="../include/header.jsp" %>
  <style>
      .form-custom {
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
            <h1 class="m-0">Thêm mới danh mục</h1>
          </div><!-- /.col -->

        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Form -->
    <div class="form-custom">
        <form:form action="/category/save" modelAttribute="category"  method="POST">
              <div class="form-group" style="display: none">
                <label for="id">Id</label>
                <form:input type="text" path="id" class="form-control" id="id" placeholder="Nhập mã danh mục"></form:input>
              </div>

              <div class="form-group">
                <label for="idSach">Mã danh mục</label>
                <form:input type="text" path="idSach" class="form-control" id="idSach" placeholder="Nhập mã danh mục"></form:input>
              </div>
              <div class="form-group">
                <label for="nameCategory">Tên danh mục</label>
                <form:input type="text" path="name" class="form-control" id="nameCategory" placeholder="Nhập tên danh mục"></form:input>
              </div>
              <button type="submit" class="btn btn-primary">Thêm danh mục</button>
            </form:form>
    </div>
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
