const counter = document.getElementById('counter');
const aumentar = document.getElementById('aumentar');
const diminuir = document.getElementById('diminuir');
const resetarButton = document.getElementById('reset');

let count = 0;

function updateCounter() {
  counter.textContent = count;
}

aumentar.addEventListener('click', function() {
  count++;
  updateCounter();
});

diminuir.addEventListener('click', function() {
  if (count > 0) {
    count--;
    updateCounter();
  }
});

resetarButton.addEventListener('click', function() {
  count = 0;
  updateCounter();
});
