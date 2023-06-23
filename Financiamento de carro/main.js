const calculateButton = document.getElementById("calculate");
calculateButton.addEventListener("click", function() {
  const carPrice = document.getElementById("price").value;
  const downPayment = document.getElementById("downPayment").value;
  const loanTerm = document.getElementById("loanTerm").value;
  const interestRate = document.getElementById("interestRate").value;

  const loanAmount = carPrice - downPayment;
  const monthlyInterestRate = (interestRate / 100) / 12;
  const numberOfPayments = loanTerm;
  const monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
  
  const result = document.getElementById("result");
  result.textContent = `O pagamento mensal é de R$${monthlyPayment.toFixed(2)}`;
});