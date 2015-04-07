package model.data;

import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

//Singleton pattern to make sure only 1 instance of CPool is created
public class ConnectionPool {
	
	//Recursive call on ConnectionPool
    private static ConnectionPool ctnPool   = null;
    private static DataSource dataSource = null;

  //Notice private constructor that creates instance of connection pool
    private ConnectionPool() { 
        try {
            InitialContext ic = new InitialContext();
            //lookup param must match the context.xml <Resource name="jdbc/schema-name">
            dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/schema-name");
            
        } catch (NamingException e) {
            System.out.println(e);
        }
    }

    public static synchronized ConnectionPool getInstance() {
        if (ctnPool == null) {
            ctnPool = new ConnectionPool();
        }
        return ctnPool;
    }

    //getConnection Object
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    //to close the Connection
    public void freeConnection(Connection ctn) {
        try {
            ctn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}