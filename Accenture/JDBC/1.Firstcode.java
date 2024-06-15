import java.sql.*;
public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";

    private static final String username = "root";

    private static final String password = "Catchmeifyoucan";

    public static void main(String[] args) {
      //loading and registering driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        //connection
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Catchmeifyoucan");
            Statement statement = connection.createStatement();
            String query = "select * from students";
            ResultSet resultset = statement.executeQuery(query);
            while (resultset.next()){
                int id = resultset.getInt("id");
                String name = resultset.getString("name");
                int age = resultset.getInt("age");
                double marks = resultset.getDouble("marks");
                System.out.println("ID " + id);
                System.out.println("Name "+name);
                System.out.println("Age "+age);
                System.out.println("Marks "+ marks);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
