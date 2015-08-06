<%-- 
    Document   : index
    Created on : Jul 27, 2015, 3:40:52 PM
    Author     : Erick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Gerenciador</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
     
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
       
        <link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />
       
        <link href="css/core.css" rel="stylesheet" type="text/css" />

        
    </head>
    <body class="skin-blue">
       
        <header class="header">
            <a href="index.html" class="logo">
              
                BoletoWeb
            </a>
          
            <nav class="navbar navbar-static-top" role="navigation">
              
                <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Navegação</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>
                <div class="navbar-right">
                    <ul class="nav navbar-nav">
                      
                        <li class="dropdown messages-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-envelope"></i>
                                <span class="label label-success">4</span>
                            </a>
                        </li>
                        
                        <li class="dropdown notifications-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-warning"></i>
                                <span class="label label-warning">10</span>
                            </a>
                        </li>
      
                        <li class="dropdown tasks-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-tasks"></i>
                                <span class="label label-danger">9</span>
                            </a>
                        </li>
                        
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="glyphicon glyphicon-user"></i>
                                <span>Joao dunha <i class="caret"></i></span>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            
            <aside class="left-side sidebar-offcanvas">                
                
                <section class="sidebar">
                    
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="img/avatar3.png" class="img-circle" alt="User Image" />
                        </div>
                        <div class="pull-left info">
                            <p>Bom dia, Joao</p>

                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>
                    
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search..."/>
                            <span class="input-group-btn">
                                <button type='submit' name='seach' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </form>
                    
                    <ul class="sidebar-menu">
                        <li class="active">
                            <a href="index.html">
                                <i class="fa fa-dashboard"></i> <span>Menu</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i class="fa fa-th"></i> <span>menu</span> <small class="badge pull-right bg-green">novo</small>
                            </a>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-bar-chart-o"></i>
                                <span>menu</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href=""><i class="fa fa-angle-double-right"></i> sub</a></li>
                                <li><a href=""><i class="fa fa-angle-double-right"></i> sub</a></li>
                                <li><a href=""><i class="fa fa-angle-double-right"></i> sub</a></li>
                            </ul>
                        </li>
                       
                        <li>
                            <a href="">
                                <i class="fa fa-calendar"></i> <span>menu</span>
                                <small class="badge pull-right bg-red">3</small>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i class="fa fa-envelope"></i> <span>email</span>
                                <small class="badge pull-right bg-yellow">12</small>
                            </a>
                        </li>

                    </ul>
                </section>
               
            </aside>

           
            <aside class="right-side">                
              
                <section class="content-header">

                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">voltar</li>
                    </ol>
                   
                     <div id="login">
                        <div class="form">
                          <form action="CadastroUsuario" method="post" name="form_login" id="form_login">
                            <div class="login">
                              <input  type="text" maxlength="40" name="beneficiario" class="beneficiario" value="" />
                              <input  type="text" maxlength="40" name="agencia" class="agencia"  value=""/>
                              <input  type="text" maxlength="40" name="digito" class="digito"  value=""/>
                              <input  type="text" maxlength="40" name="cpf" class="cpf"  value=""/>
                            </div>
                            <input type="submit" class="submit" value="GerarBoleto"/>
                          </form>


                        </div>
                      </div>
                </section>

                
                <section class="content">


                </section>
            </aside>
        </div>


        <!-- jQuery 2.0.2 -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
       

    </body>
</html>