package model.data;

import java.sql.*;

/*
 * The Single Responsability of this Class is to close:
 * statement, preparedStatements and result sets this 
 * with the sole purpose of making UserDB class
 * easier to read and mantain
 * 
 */
public class DBUtil {

    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void closePreparedStatement(Statement prepStatement) {
        try {
            if (prepStatement != null) {
                prepStatement.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}