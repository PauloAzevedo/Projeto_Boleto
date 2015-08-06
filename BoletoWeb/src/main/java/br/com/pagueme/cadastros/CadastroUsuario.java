/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.cadastros;


import br.com.pagueme.beans.Endereco;
import br.com.pagueme.beans.Usuario;
import br.com.pagueme.conexao.TransactionManager;
import br.com.pagueme.daos.DaoEndereco;
import br.com.pagueme.daos.DaoUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class CadastroUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String nomeCompleto = request.getParameter("nomeCompleto");
            String cpf = request.getParameter("cpf");
            String senha = request.getParameter("senha");
            String usuarioLogin = request.getParameter("usuario");            
            
            Endereco endereco = new Endereco();
            endereco.setLogradouro("Av das Empresas, 555");
            endereco.setBairro("Bairro Grande");
            endereco.setCep("01234-555");
            endereco.setCidade("São Paulo");
            endereco.setUf("SP");
            
            Usuario usuario = new Usuario();
            usuario.setCnpjCPF("05.426.528.24");
            usuario.setNomeCompleto("Fulano da Silva");
            usuario.setSenha("asdiuqwueo");
            usuario.setUsuario("paulovulture@hotmail.com");
            usuario.setEndereco(endereco);
            
           if(cadastrarUsuario(usuario, endereco)){
               System.out.println("OK");
           }else{
               System.out.println("Fail");
           }
            

//            Endereco enderecoBeneficiario = Endereco.novoEndereco()
//                    .comLogradouro("Av das Empresas, 555")
//                    .comBairro("Bairro Grande")
//                    .comCep("01234-555")
//                    .comCidade("São Paulo")
//                    .comUf("SP");

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean cadastrarUsuario(Usuario usuario, Endereco endereco) {
        TransactionManager.beginTransaction();
        try {
            DaoUsuario uDao = new DaoUsuario();
            DaoEndereco eDao = new DaoEndereco();

             
            eDao.persistir(endereco);
            uDao.persistir(usuario);
          
            TransactionManager.commit();
            
        } catch (Exception e){
            System.out.println(e);
        }

            
        
        return true;
    }

}
