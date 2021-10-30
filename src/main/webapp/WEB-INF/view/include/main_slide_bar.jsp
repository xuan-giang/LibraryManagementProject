  <%@ page contentType="text/html; charset=UTF-8"%>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">


    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="https://icons-for-free.com/iconfiles/png/512/business+costume+male+man+office+user+icon-1320196264882354682.png" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">Alexander Pierce</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item menu-open">
            <a href="/home" class="nav-link active">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Trang chủ
              </p>
            </a>

          </li>
          <li class="nav-item">
                      <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-edit"></i>
                        <p>
                          Mượn trả sách
                          <i class="fas fa-angle-left right"></i>
                        </p>
                      </a>
                      <ul class="nav nav-treeview">
                        <li class="nav-item">
                          <a href="/borrow/add" class="nav-link">
                            <i class="far fa-circle nav-icon"></i>
                            <p>Nhập mượn</p>
                          </a>
                        </li>
                        <li class="nav-item">
                          <a href="/borrow/addreturn" class="nav-link">
                            <i class="far fa-circle nav-icon"></i>
                            <p>Nhập trả</p>
                          </a>
                        </li>
                        <li class="nav-item">
                          <a href="/borrow/manage" class="nav-link">
                            <i class="far fa-circle nav-icon"></i>
                            <p>Quản lý mượn trả</p>
                          </a>
                        </li>
                      </ul>
                    </li>
          <li class="nav-item">
                      <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-table"></i>
                        <p>
                          Danh mục sách
                          <i class="fas fa-angle-left right"></i>
                        </p>
                      </a>
                      <ul class="nav nav-treeview">
                        <li class="nav-item">
                          <a href="/category/add" class="nav-link">
                            <i class="far fa-circle nav-icon"></i>
                            <p>Thêm mới</p>
                          </a>
                        </li>
                        <li class="nav-item">
                          <a href="/category/view" class="nav-link">
                            <i class="far fa-circle nav-icon"></i>
                            <p>Quản lý</p>
                          </a>
                        </li>
                      </ul>
                    </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-book"></i>
              <p>
                Sách
                <i class="fas fa-angle-left right"></i>
                <span class="badge badge-info right">6</span>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/book/add" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Thêm mới</p>
                </a>
              </li>

              <li class="nav-item">
                <a href="/book/view" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Quản lý</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
                      <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-book-reader"></i>
                        <p>
                          Người đọc
                          <i class="fas fa-angle-left right"></i>
                        </p>
                      </a>
                      <ul class="nav nav-treeview">
                        <li class="nav-item">
                          <a href="/reader/add" class="nav-link">
                            <i class="far fa-circle nav-icon"></i>
                            <p>Thêm mới</p>
                          </a>
                        </li>

                        <li class="nav-item">
                          <a href="/reader/view" class="nav-link">
                            <i class="far fa-circle nav-icon"></i>
                            <p>Quản lý</p>
                          </a>
                        </li>
                      </ul>
                    </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                Thống kê
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="pages/charts/chartjs.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Thống kê danh mục</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/charts/flot.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Thống kê người đọc</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/charts/inline.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Thống kê đầu sách</p>
                </a>
              </li>
            </ul>
          </li>

        </ul>
      </nav>
      <a style="margin-top: 100px" href="/login" class="btn btn-info">Log out</a>
      <!-- /.sidebar-menu -->
    </div>

    <!-- /.sidebar -->
  </aside>
