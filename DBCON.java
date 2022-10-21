import java.sql.*;
public class DBCON
{
    Connection con;
    DBCON()
    {
        try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    //String connectionURL="jdbc:mysql://localhost:3306/soprasteriaDB";
                    //String connectionURL="jdbc:mysql://localhost:3306/laptopdb";
                    String connectionURL="jdbc:mysql://localhost:3306/collegedb";
                    String DBUSER="root";
                    String DBPASS="root";
                    con=DriverManager.getConnection(connectionURL,DBUSER,DBPASS);
                    System.out.println("Connection Success");
                }
                catch(Exception e)
                        {
                        System.out.println("Connection Failed");
                        }
    }
    public static void main(String args[])
    {
        DBCON obj=new DBCON();
    }
}