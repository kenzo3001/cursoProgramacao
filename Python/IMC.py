peso_kg = float(input("Digite seu peso em kg: "))
altura_metros = float(input("Digite sua altura em metros: "))

imc = peso_kg / (altura_metros ** 2)

print(f"Seu Índice de Massa Corporal (IMC) é: {imc:.2f}")