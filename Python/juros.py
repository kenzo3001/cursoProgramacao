principal = float(input("Digite o valor principal: "))
taxa_de_juros = float(input("Digite a taxa de juros (em porcentagem): "))
tempo_anos = float(input("Digite o tempo em anos: "))

taxa_de_juros_decimal = taxa_de_juros / 100

montante = principal + (principal * taxa_de_juros_decimal * tempo_anos)

print(f"O montante final com juros simples é: R${montante:.2f}")