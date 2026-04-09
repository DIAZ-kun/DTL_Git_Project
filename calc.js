// Get the screen element
const screen = document.getElementById('calc_screen');

// Variable to store the current input string
let currentInput = "";

function takeInput(num) {
    if (num < 0) {
        if (num == -1) {
            currentInput = "";
            screen.innerText = currentInput
        }
    } else {
        currentInput += num;
        screen.innerText = currentInput;
    }
    
}

function performCalc() {
    try {
        currentInput = eval(currentInput).toString();
        screen.innerText = currentInput;
    } catch (e) {
        screen.innerText = "Error";
        currentInput = "";
    }
}