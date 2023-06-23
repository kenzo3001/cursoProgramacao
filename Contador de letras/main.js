const textInput = document.getElementById('text-input');
const countButton = document.getElementById('button');
const result = document.getElementById('resultado');

function countLetters() {
  const text = textInput.value;
  const count = text.length;
  result.textContent = `O texto contem ${count} letras!`;
}

countButton.addEventListener('click', countLetters);
