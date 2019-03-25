// -------- only scripting for this page is for the ascending/ descending nav bar ---------

var prevScrollpos = window.pageYOffset;

window.onscroll = function() {

    var currentScrollPos = window.pageYOffset;
    

    if (prevScrollpos - 50 > currentScrollPos) {

        document.getElementById("navBar").style.top = "0";

    } else if (prevScrollpos + 50  < currentScrollPos) {

        document.getElementById("navBar").style.top = "-125px";
    }

    prevScrollpos = currentScrollPos;
}