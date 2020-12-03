
@POST
@Path("passwordchange")
public String updateFood(@FormDataParam("UserID") Integer UserID, @FormDataParam("Password") String Password) {
        try {
        System.out.println("Invoked Users.UpdateUsers/update UserID=" + UserID);
        PreparedStatement ps = Main.db.prepareStatement("UPDATE Users SET Password = ? WHERE UserID = ?" "WHERE Password = ?");
        ps.setString(1, Password);
        ps.setInt(2, UserID);
        ps.execute();
        return "{\"OK\": \"Password Updated\"}";
        } catch (Exception exception) {
        System.out.println("Database error: " + exception.getMessage());
        return "{\"Error\": \"Unable to update password, please see server console for more info.\"}";
        }
        }

