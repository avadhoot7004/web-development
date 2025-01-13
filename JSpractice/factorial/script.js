// const foods = ["Pasta", "Burger", "Samosa", "Pizza"];

// function display() {
//     alert("Foods List is: " +foods);
// }

function fact(n) {

    const user_input = document.getElementById("factorial").value;

    if (user_input < 0) {
        alert("Factorial not defined for negative numbers"); 
        return;
    }
    if (user_input === 0 || user_input === 1) {
        alert("1");
    }
    let result = 1;
    for (let i = 2; i <= user_input; i++) {
        result *= i;
    }
    alert("The factorial of " + user_input + " is: " + result);

}

const result = fact(user_input);
alert("factorial is: "+result);