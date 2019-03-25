//----------start scripting for the World Bank API functionality -----------------

window.onload = function() {
document.getElementById('fetchBank').addEventListener('click', getBankWithFetch)
}; 

const apiUrl2 = 'http://api.worldbank.org/v2/topic?format=json'; 

let state2 = {
    topics: null 
} 

let updateContent2 = function() {
    document.getElementById('topicsHeader').innerText = 'Topics'; 
    
    //state2.topics[1].value; 
    
    for (i = 0; i < state2.topics.length; i++) {
        let item = document.createElement("li"); 
        item.innerText = state2.topics[i].value;  
        document.getElementById("ul").appendChild(item); 
    } 

    document.getElementById('BankSpanTwo').innerText = 'Choose a topic to see more.';

    let inputField = document.createElement("INPUT");
    inputField.setAttribute("type", "text");   
    inputField.setAttribute("name", "selection");   
    document.getElementById("bankAPISection").appendChild(inputField); 
   
    let sectionElement = document.getElementById("row3"); 
    sectionElement.setAttribute("style", "padding-bottom: 25px;");

    //document.getElementById('topicsHeader').innerText = 'Topics';
}

function getBankWithFetch(){
    fetch(apiUrl2, {method: "GET", headers:{"Accept":"application/json"}})
    //define behovior for when response returns 
    .then((response) => {
        //return unrwapped promise object for the next chained operation 
        return response.json(); 
    })
    //utilize unwrapped promise as a JS object
    .then((data) => {
        console.log(data);
        //console.log(data[1][8].sourceNote);    
        state2.topics = data[1];   
        updateContent2(); 
        
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

