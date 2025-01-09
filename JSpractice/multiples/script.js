/*var num = 10; 

var result = "";

    for (var i = 1; i <= 10; i++) 
    {
        result += num + " x " + i + " = " + (num * i) + "<br>";
        document.write(result);
        result = "";
    }*/
//function that runs after button click
function generateTable() {
    var userInput = document.getElementById("userInput").value;
    var result = "";
    for (var i = 1; i <= 10; i++) {
            result += userInput + " x " + i + " = " + (userInput * i) + "<br>";
        }
        document.write(result);     
}

//Attaching an event listener to button
const genbutton = document.getElementById('generateButton');
genbutton.addEventListener("click", generateTable);