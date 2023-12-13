package br.tokiodrift.sistemaestacionamento.dao;
import java.sql.*;

public class Conexao {
    
        public static Connection connector(){
            java.sql.Connection conexao = null;
            String driver ="com.mysql.cj.jdbc.Driver";
            String url ="jdbc:mysql://127.0.0.1:3306/estacionamentoTokioDrift";
            String user ="root";
            String senha = "alunoif21";
            
            try{
                Class.forName(driver);
                conexao = DriverManager.getConnection(url,user,senha);
                return conexao;
            }
            catch (Exception e){
                return null;
            }
        }
    
}
