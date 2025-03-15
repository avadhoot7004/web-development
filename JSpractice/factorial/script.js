// const foods = ["Pasta", "Burger", "Samosa", "Pizza"];

// function display() {
//     alert("Foods List is: " +foods);
// }

function fact() {

    const user_input = document.getElementById("factorial").value;

    if (user_input < 0) {
        alert("Factorial not defined for negative numbers"); 
        return;
    }
    let result = 1;
    
    for (let i = 2; i <= user_input; i++) {
        result *= i;
    }
    alert("The factorial of " + user_input + " is: " + result);

}
