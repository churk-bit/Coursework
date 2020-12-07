@POST
@Path("login")
public String
UsersLogin(@FormDataParam("Username") String Username, @FormDataParam("Password") String Password) {
    System.out.println("Invoked loginUser() on path users/login");
    try {
        PreparedStatement ps1 = Main.db.prepareStatement("SELECT Password FROM Users WHERE UserName = ?");
        ps1.setString(1, UserName);
        ResultSet loginResults = ps1.executeQuery();
        if (loginResults.next() == true) {
            String correctPassword = loginResults.getString(1)
        }
        if

        }
        }
        }


