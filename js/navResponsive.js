// JS for nav

function myFunction() {
    var x = document.getElementById("myNav");
    if (x.className === "nav-container") {
        x.className += " responsive";
    } else {
        x.className = "nav-container";
    }
}

