document.getElementById("alert").onclick = function alertfunct(){
    alert("This is an alert box!");
}
document.getElementById("confirm").onclick = function confirmfunct() {
    var txt;
    if (confirm("Press a button.")){
        txt = "You pressed OK!";
    } else {
        txt = "You pressed cancel!";
    }
    document.getElementById("first").innerHTML = txt;
}
document.getElementById("prompt").onclick = function promptfunct() {
    let txt1;
    let name = prompt("Please enter your name here:","Rick Grimes");
    if (name == null || name =="" || name ==" "){
        txt1 = "User cancelled the prompt.";
    } else {
        txt1 = "Hello "+name+" This is a prompt box input!!";
    }
    document.getElementById("second").innerHTML = txt1;
}