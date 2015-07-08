<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html xmlns="http://www.w3.org/1999/xhtml">
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Gerenciamento de Salas Cronos</title>
        <!--<link href="login/css/style.login.css" rel="stylesheet" type="text/css" media="screen" />
        <script language="JavaScript" src="login/js/jquery-1.8.2.js" type="text/javascript"></script>-->
        <script type="text/javascript">

            function carregando() {
                $('#loading').css('visibility', 'visible');
                $('.error').css('visibility', 'hidden');
            }

        </script>
        </head>

        <body>
        <div id="login">
          <div class="form">
            <form action="GeradorBoletoHTML" method="post" name="form_login" id="form_login">
              <div class="login">
                <input  type="text" maxlength="40" name="beneficiario" class="beneficiario" value="" />
                <input  type="text" maxlength="40" name="agencia" class="agencia"  value=""/>
                <input  type="text" maxlength="40" name="digito" class="digito"  value=""/>
              </div>
              <input type="submit" class="submit" value="GerarBoleto"/>
            </form>
            
            
          </div>
        </div>
</body>
</html>
