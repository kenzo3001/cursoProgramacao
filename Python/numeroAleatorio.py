import random

numero_secreto = random.randint(1, 100)

tentativas = 0

print("Seja Bem vindo!!")
print("Estou pensando em um número de 1 a 100, tente adivinhar ")

while True:
    try:
        palpite = int(input("Lança seu melhor chute:"))
        tentativas += 1

        if palpite < 1 or palpite > 100:
            print("Você entendeu o que é para fazer? tente novamente")
        elif palpite < numero_secreto:
            print("Chuta mais alto")
        elif palpite > numero_secreto:
            print("Foi muito alto, chuta baixo")
        else:
            print(f"Boa família! Você acertou o número {numero_secreto} em {tentativas} tentativas.")

            if tentativas <= 5:
                print("Caralho!!! Você é foda demais!")
            elif tentativas <= 30:
                print("Errando que se aprende, boa!")
            else:
                print("É...já vi melhores, mas valeu a tentativa")

            break
    except ValueError:
        print("Por favor, digite um número válido.")