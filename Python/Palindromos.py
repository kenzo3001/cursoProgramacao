palavra = input("Insira uma palavra: ")

palavra = palavra.replace(" ", "").lower()

if palavra == palavra[::-1]:
    print(f"{palavra} é um palíndromo.")
else:
    print(f"{palavra} não é um palíndromo.")