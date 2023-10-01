nota = int(input("Digite sua nota: "))

if 90 <= nota <= 100:
    letra = "A"
elif 80 <= nota < 90:
    letra = "B"
elif 70 <= nota < 80:
    letra = "C"
elif 60 <= nota < 70:
    letra = "D"
else:
    letra = "F"
print(f"Sua nota é {nota} e sua classificação é {letra}")