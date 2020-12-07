function UsersLogin() {

    console.log("Invoked UsersLogin() ");
    let url = "/users/login";
    let formData = new FormData(document.getElementById('LoginForm'));

    fetch(url, {
        method: "POST",
        body: formData,
    }).then(response => {
        return response.json();
    }).then(response => {
        if (response.hasOwnProperty("Error")) {
            alert(JSON.stringify(response));
        } else {
            Cookies.set("SessionToken", response.SessionToken);
            Cookies.set("UserName", response.UserName);
            window.open("homepage.html", "_self");
        }
    });
}