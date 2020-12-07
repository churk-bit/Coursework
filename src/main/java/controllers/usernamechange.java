package controllers;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import server.Main;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.UUID;

public class usernamechange {

    @POST
    @Path("usernamechange")
    public String updateusername(@FormDataParam("username") String username, @FormDataParam("Password") String Password) {
        try {
            System.out.println("Invoked Users.UpdateUsers/update UserID=" + username);
            PreparedStatement ps = Main.db.prepareStatement("UPDATE Users SET Username = ? WHERE Password = ?");
            ps.setString(1, username);
            ps.setInt(2, Password);
            ps.execute();
            return "{\"OK\": \"Username Updated\"}";
        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
            return "{\"Error\": \"Unable to update username, please see server console for more info.\"}";
        }
    }
}
