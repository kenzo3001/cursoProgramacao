let numero1 = document.getElementById('num1')
let numero2 = document.getElementById('num2')
let operacao = document.getElementById('operação')
let botaoCalcular = document.getElementById('calcule')
let resultadoDiv = document.getElementById('resultado')

botaoCalcular.addEventListener('click', function(){
    let user1 = Number(numero1.value)
    let user2 = Number(numero2.value)
    let op = operator.value
    let resultado

    switch (op) {
        case '+':
            resultado = user1 + user2
            break;
         case '-':
            resultado = user1 - user2
            break;
        case '*':
            resultado = user1 * user2
            break;
        case '/':
            resultado = user1 / user2
            break;
    
        default:
            resultado = 'operação invalida' 
            break;
    }
resultadoDiv.innerHTML = 'o resultado é ' + resultado
})