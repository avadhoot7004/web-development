//function for finding largest number of 3 nos
function findlargest() {
    var userInput1 = document.getElementById("input1").value;
    var userInput2 = document.getElementById("input2").value;
    var userInput3 = document.getElementById("input3").value;
    
    var largest = 0;
    
    if (userInput1 >= userInput2 && userInput1 >= userInput3) {
        largest = userInput1;
    } else if (userInput2 >= userInput1 && userInput2 >= userInput3) {
        largest = userInput2;
    } else {
        largest = userInput3;
    }

    //writing output with innerHTML
    document.getElementById("output").innerHTML = largest;
}

//function runs after pressing clear
function clearoutput() {
    document.getElementById("output").value = "";
    document.getElementById("input1").value = "";
    document.getElementById("input2").value = "";
    document.getElementById("input3").value = "";
}

//Attaching an event listener to button
const genbutton = document.getElementById('largestnum');
genbutton.addEventListener("click", findlargest);

//Attaching an event listener to button
const clrbut = document.getElementById('clearscr');
clrbut.addEventListener("click", clearoutput);