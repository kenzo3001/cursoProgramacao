numero1 = float(input("Digite o primeiro valor: "))
numero2 = float(input("Digite o segundo valor: "))
operacao = input("Digite a operação desejada (+, -, *, /): ")

if operacao == "+":
    resultado = numero1 + numero2
elif operacao == "-":
    resultado = numero1 - numero2
elif operacao == "*":
    resultado = numero1 * numero2
elif operacao == "/":
    if numero2 == 0:
        resultado = "Erro! Divisão por zero não é permitida."
    else:
        resultado = numero1 / numero2
else:
    resultado = "Operação inválida."

print("O resultado da conta é ", resultado)