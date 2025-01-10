const cars = ["Toyota", "Ford", "BMW", "Mercedes-Benz", "Honda", "Chevrolet", "Nissan", "Volkswagen", "Hyundai", "Audi", "Kia", "Porsche", "Subaru", "Mazda", "Jaguar", "Lexus", "Fiat", "Renault", "Volvo", "Peugeot", "Tesla", "Acura", "Mitsubishi", "Land Rover", "Jeep"];

document.getElementById("displayEntire").onclick = function displayEntireFunct() {
    document.getElementById("displayArr").innerHTML = cars;
}

document.getElementById("length").onclick = function displayLength() {
    let text = "The length of the array is: "+cars.length;   
    document.getElementById("lengthdisp").innerHTML = text;
}

document.getElementById("ascOrd").onclick = function sortAsc() {
    cars.sort();
    let asort = "Array sorted in sorted order: "+cars;
    document.getElementById("dispSorted").innerHTML = asort;
}

document.getElementById("descOrd").onclick = function sortDesc() {
    cars.sort();
    cars.reverse();
    let asort = "Array sorted in sorted order: "+cars;
    document.getElementById("dispSorted").innerHTML = asort;
}

document.getElementById("loopDisplay").onclick = function displayLoop() {
    let looptxt="";
    for(let i = 0; i < cars.length; i++){
        looptxt += cars[i]+"<br>";
        document.getElementById("loopdisp").innerHTML = looptxt;
    }
    
}