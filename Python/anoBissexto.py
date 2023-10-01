# Bota o ano ai
ano = int(input("Insira um ano: "))

# Código brabo ai
if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
    print(f"{ano} é um ano bissexto.")
else:
    print(f"{ano} não é um ano bissexto.")