package Controller;

import View.TelaLogin;
import View.TelaPrincipal;
import Conexao.Conexao;
import com.mycompany.DAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TelaLoginController {
    
    private TelaLogin view;
    
    public TelaLoginController(TelaLogin view) {
        this.view = view;
    }
    
    public void Autenticar() throws SQLException{
        Connection conexao;
        conexao = new Conexao().getConnection();
        UsuarioDAO usdao = new UsuarioDAO(conexao);
        if(view.getTxtLogin().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo login não pode estar vazio");
        }else if(view.getTxtSenha().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo senha não pode estar vazio");
        }else{
            if(usdao.Autenticar(view.getTxtLogin().getText(), view.getTxtSenha().getText())){
                TelaPrincipal tela1 = new TelaPrincipal();
                tela1.setVisible(true);
                view.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
            }
        }
        
    }
}
