
@POST
@Path("usernamechange")
public String updateFood(@FormDataParam("UserID") Integer UserID, @FormDataParam("UserName") String UserName) {
        try {
        System.out.println("Invoked Users.UpdateUsers/update UserID=" + UserID);
        PreparedStatement ps = Main.db.prepareStatement("UPDATE Users SET UserName = ? WHERE UserID = ?" "WHERE Password = ?");
        ps.setString(1, UserName);
        ps.setInt(2, UserID);
        ps.execute();
        return "{\"OK\": \"Users updated\"}";
        } catch (Exception exception) {
        System.out.println("Database error: " + exception.getMessage());
        return "{\"Error\": \"Unable to update item, please see server console for more info.\"}";
        }
        }
