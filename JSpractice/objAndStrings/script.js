/* 
person = {
    firstName: "Morgan",
    lastName: "Jones",
    fullName: function() {
        return this.firstName + " " + this.lastName;
    }
};

//OR

person = {
    firstName: "Morgan",
    lastName: "Jones",
    age: 45
};
person.fullName = function() {
    return person.firstName + " " + person.lastName;
};*/

//OR

person = {
    firstName: "Morgan",
    lastName: "Jones",
    age: 45
};
person.fullName = function() {
    return this.firstName + " " + this.lastName;
};
document.getElementById("jsobj").onclick = function dispfunct(){
    document.getElementById("print").innerHTML = person.fullName();
}

//,length
function strLen() {
    let text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    let length = text.length;
    document.getElementById("lenstr").innerHTML = "Length of string is: "+length;
}
//substring() 
function strSubstring() {
    let text = "Hello World";
    let result = text.substring(0, 5);
    document.getElementById("substrResult1").innerHTML = "Substring is: " + result;
}

// toLocaleLowerCase() 
function strToLocaleLowerCase() {
    let text = "HELLO WORLD";
    let result = text.toLocaleLowerCase();
    document.getElementById("toLocaleLowerCaseResult").innerHTML = "Lowercase: " + result;
}

// toLocaleUpperCase() 
function strToLocaleUpperCase() {
    let text = "hello world";
    let result = text.toLocaleUpperCase();
    document.getElementById("toLocaleUpperCaseResult").innerHTML = "Uppercase: " + result;
}

// toLowerCase() 
function strToLowerCase() {
    let text = "HELLO WORLD";
    let result = text.toLowerCase();
    document.getElementById("toLowerCaseResult").innerHTML = "Lowercase: " + result;
}

// toString() 
function strToString() {
    let num = 123;
    let result = num.toString();
    document.getElementById("toStringResult").innerHTML = "String representation: " + result;
}

// toUpperCase() 
function strToUpperCase() {
    let text = "hello world";
    let result = text.toUpperCase();
    document.getElementById("toUpperCaseResult").innerHTML = "Uppercase: " + result;
}

// valueOf() 
function strValueOf() {
    let text = new String("Hello");
    let result = text.valueOf();
    document.getElementById("valueOfResult").innerHTML = "Primitive value: " + result;
}


