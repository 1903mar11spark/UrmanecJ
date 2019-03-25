//----------start scripting for the Numbers API functionality -----------------

window.onload = function() {

document.getElementById('fetchNumber').addEventListener('click', getNumberWithFetch)
}; 

const apiUrl = 'http://numbersapi.com/random/trivia?json';  

let state = {
    num: ''
} 

let updateContent = function() {
    document.getElementById('num').innerText = 'Number: ' + state.num; 
    document.getElementById('text').innerText = state.text; 
    let sectionElement = document.getElementById("row3"); 
    sectionElement.setAttribute("style", "padding-bottom: 25px;");
    //sectionElement.setAttribute("style", "padding: red;");
}

function getNumberWithFetch(){
    fetch(apiUrl, {method: "GET", headers:{"Accept":"application/json"}})
    //define behovior for when response returns 
    .then((response) => {
        //return unrwapped promise object for the next chained operation 
        return response.json(); 
    })
    //utilize unwrapped promise as a JS object
    .then((data) => {
        console.log(data); 
        state.num = data.number; 
        state.text = data.text; 
        updateContent(); 
    })
    //what about a problem (if there is one)? 
    .catch((error) => {
        alert('oh no :(')
        console.log();
    })
}

// -------------start scripting for the ascending nav bar ----------------

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







