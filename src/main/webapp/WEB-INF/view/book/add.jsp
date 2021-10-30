<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Thêm sách mới</title>
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
            <h1 class="m-0">Thêm sách mới</h1>
          </div><!-- /.col -->

        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Form -->
    <div class="form-custom">
      <form:form action="/book/save" modelAttribute="book"  method="POST" enctype="multipart/form-data">
<%--        <div class="form-group" style="display: none">--%>
<%--          <label for="id">Id</label>--%>
<%--          <form:input type="text" path="id" class="form-control" id="id" placeholder="Nhập mã sách"></form:input>--%>
<%--        </div>--%>

        <div class="form-group">
          <label for="idBook">Mã sách</label>
          <form:input type="text" path="idBook" class="form-control" id="idBook" placeholder="Nhập mã sách mới"></form:input>
        </div>
        <div class="form-group">
          <label for="nameBook">Tên sách</label>
          <form:input type="text" path="name" class="form-control" id="nameBook" placeholder="Nhập tiêu đề sách"></form:input>
        </div>
        <div class="form-group">
          <label for="publisherBook">Nhà xuất bản</label>
          <form:input type="text" path="publisher" class="form-control" id="publisherBook" placeholder="Nhập tên nhà xuất bản"></form:input>
        </div>
        <div class="form-group">
          <label for="authorBook">Tác giả</label>
          <form:input type="text" path="author" class="form-control" id="authorBook" placeholder="Nhập tên tác giả"></form:input>
        </div>
        <div class="form-group">
          <label for="quantitylBook">Số lượng</label>
          <form:input type="text" path="quantity" class="form-control" id="quantitylBook" placeholder="Nhập số lượng sách"></form:input>
        </div>
        <div class="form-group">
          <label for="categoryBook">Mã danh mục</label>
          <form:input type="text" path="category" class="form-control" id="categoryBook" placeholder="Nhập mã danh mục sách"></form:input>
        </div>
        <div class="form-group">
          <label for="imageBook">Ảnh bìa sách</label>
          <form:input type="file" path="imageUrl" class="form-control" id="imageBook" />
        </div>
        <button type="submit" class="btn btn-primary">Thêm sách mới</button>
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
