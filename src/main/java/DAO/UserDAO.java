package DAO;

public class UserDAO {
    //Connect to database
    private final Connection connection;

    public StudentRepo() {
        =DBAccess.getInstance().getConnection();

    }

    //If student exist by email
    public boolean existByEmail(String Email){
        String query ="SELECT id FROM users WHERE email = ?;";

        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString( 1,email);
            ResultSet rs = ps.executeQuery();
            return rs.next();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    //If student exist by phone
    public boolean existByPhone(String phone){
        String query ="SELECT id FROM users WHERE phone = ?;";

        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString( 1,phone);
            ResultSet rs = ps.executeQuery();
            return rs.next();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }


    // If student exist by index number
    public boolean existByIndex(String Index){
        String query ="SELECT id FROM users WHERE index = ?;";

        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString( 1,index);
            ResultSet rs = ps.executeQuery();
            return rs.next();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }


    // insert or create new student

    //get all student

    //get one student by id

    //delete student

    //update student



}
