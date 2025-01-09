function checkEvenOdd() {
    var isEven = "Number is even.";
    var userInput = document.getElementById("input").value;
    if (userInput < 0){
        isEven = "Number is negative please enter positive number.";
    } else if (userInput % 2 == 0) {
        isEven = "Number is even.";
    } else if (userInput == 0){
        isEven = "Number is even.";
    } else {
        isEven = "Number is odd."
    }
    //displaying using innerHTML
    document.getElementById("output").innerHTML = isEven;
}

const checkbut = document.getElementById('checkButton');
checkbut.addEventListener("click", checkEvenOdd);