frase = input("Digite uma frase: ")

caracteres = {'letras': 0, 'numeros': 0, 'espacos': 0, 'especiais': 0}

for caracter in frase:
    if caracter.isalpha():
        caracteres['letras'] += 1
    elif caracter.isdigit():
        caracteres['numeros'] += 1
    elif caracter.isspace():
        caracteres['espacos'] += 1
    else:
        caracteres['especiais'] += 1

print("Total de letras:", caracteres['letras'])
print("Total de números:", caracteres['numeros'])
print("Total de espaços:", caracteres['espacos'])
print("Total de caracteres especiais:", caracteres['especiais'])